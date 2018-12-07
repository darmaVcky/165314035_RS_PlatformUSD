/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.KlinikHelper;
import java.util.List;
import pojos.Klinik;
import service.KlinikResource;

/**
 *
 * @author Windows
 */
public class TestKlinik {
    public static void main(String[] args) {
        KlinikHelper kh = new KlinikHelper();
        List<Klinik> list = kh.getKlinik();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIdKlinik());
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getSpesialis());
        }
    }
}
