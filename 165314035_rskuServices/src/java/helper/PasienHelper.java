/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Pasien;
import util.HibernateUtil;

/**
 *
 * @author Windows
 */
public class PasienHelper {

    public PasienHelper() {
    }

    public List<Pasien> getAllPasien() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String query = "from Pasien p";
        Query q = session.createQuery(query);
        List<Pasien> list = q.list();
        session.close();
        return list;
    }

    public void addNewPasien(String noRm, String nama, String alamat,
        String nik,Date tanggalLahir, String kelamin) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Pasien pasien = new Pasien(noRm, nama, alamat, nik, tanggalLahir, kelamin);
        session.saveOrUpdate(pasien);
        transaction.commit();
        session.close();
    }
    
    public List<Pasien> cariPasien (String noRm){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String query = "from Pasien p where p.noRm=:noRm";
        Query q = session.createQuery(query);
        q.setParameter("noRm", noRm);
        List<Pasien> list = q.list();
        transaction.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    } 
}
