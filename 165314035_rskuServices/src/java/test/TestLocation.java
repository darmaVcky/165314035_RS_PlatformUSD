/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.LocationHelper;
import java.util.List;
import pojos.Location;

/**
 *
 * @author Windows
 */
public class TestLocation {
    public static void main(String[] args) {
        LocationHelper l = new LocationHelper();
        List<Location> list = l.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getLat());
            System.out.println(list.get(i).getLng());
        }
    }
}
