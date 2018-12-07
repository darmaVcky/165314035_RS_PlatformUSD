/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.DokterHelper;
import java.util.List;
import pojos.Dokter;

/**
 *
 * @author Windows
 */
public class TestDokter {
    public static void main(String[] args) {
        DokterHelper spe = new DokterHelper();
        List<Dokter> list = spe.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getSpesialis());
        }
    }
}
