/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.AntrianHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class TestAddAntrean {
    public static void main(String[] args) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = format.parse("20181115");
            AntrianHelper antre = new AntrianHelper();
            antre.addNewAntrian(date, "007", "Bernad", "Minggir", "Klinik Kulit dan Kelamin");
        } catch (Exception e) {
            Logger.getLogger(TestAddAntrean.class.getName()).log(Level.SEVERE, null, e);
        }
    }
   
}
