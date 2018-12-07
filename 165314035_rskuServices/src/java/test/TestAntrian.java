/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.AntrianHelper;
import java.util.List;
import pojos.Antrian;

/**
 *
 * @author Windows
 */
public class TestAntrian {
    public static void main(String[] args) {
        AntrianHelper antre = new AntrianHelper();
        List<Antrian> list = antre.getAntrian();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getNoRm());
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getAlamat());
            System.out.println(list.get(i).getNamaKlinik());
            System.out.println(list.get(i).getTanggal());
        }
    }
}
