/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.DokterHelper;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.Dokter;
/**
 *
 * @author Windows
 */
public class TestAddDokter {
    public static void main(String[] args) {
        try {
            DokterHelper dokter = new DokterHelper();
            dokter.addNewDoctor("Frans", "Kelamin");
//            Dokter doctor = new Dokter("Frans", "Kelamin");
//            doctor.getId();
        } catch (Exception ex) {
            Logger.getLogger(TestAddDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
