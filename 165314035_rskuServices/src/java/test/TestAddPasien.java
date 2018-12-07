/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.PasienHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class TestAddPasien {

    public static void main(String[] args) throws ParseException {

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = format.parse("19740124");
            String noRm = "123457";
            PasienHelper test = new PasienHelper();
            test.addNewPasien(noRm,"Dina","Malang",noRm,date,"perempuan");
        } catch (Exception ex) {
            Logger.getLogger(TestAddPasien.class.getName()).log(Level.SEVERE,null,ex);
        }
       
    }
}
