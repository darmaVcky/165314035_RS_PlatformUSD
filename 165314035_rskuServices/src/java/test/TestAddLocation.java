/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.LocationHelper;

/**
 *
 * @author Windows
 */
public class TestAddLocation {
    public static void main(String[] args) {
        LocationHelper local = new LocationHelper();
        local.addNewLocation( -5.351771, 105.283428, "RS DIA");
    }
}
