/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import helper.PasienHelper;
import java.util.List;
import pojos.Pasien;

/**
 *
 * @author Windows
 */
public class TestPasien {
    public static void main(String[] args) {
        PasienHelper pasien = new PasienHelper();
        List<Pasien> list = pasien.getAllPasien();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json+"\n");
    }
}
