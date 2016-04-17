package com.example.android.simplemetalcalculator;

/**
 * Created by Miho on 17.04.2016.
 */
public class Metals {
    final static double CARBON_STEEL = 7.85;
    final static double STAINLESS_STEEL = 7.90;
    final static double CAST_IRON = 7.20;
    final static double ALUMINIUM = 2.70;
    final static double MAGNESIUM = 1.74;
    final static double TITANIUM = 4.50;
    final static double COOPER = 8.96;
    final static double BRASS = 8.45;
    final static double BRONZE = 8.20;
    final static double ZINC = 7.13;
    final static double TIN = 7.29;
    final static double LEAD = 11.34;
    private double item;

    public double density(int selectedId) {
        switch (selectedId) {
            case 0:
                item = CARBON_STEEL;
                break;
            case 1:
                item = STAINLESS_STEEL;
                break;
            case 2:
                item = CAST_IRON;
                break;
            case 3:
                item = ALUMINIUM;
                break;
            case 4:
                item = MAGNESIUM;
                break;
            case 5:
                item = TITANIUM;
                break;
            case 6:
                item = COOPER;
                break;
            case 7:
                item = BRASS;
                break;
            case 8:
                item = BRONZE;
                break;
            case 9:
                item = ZINC;
                break;
            case 10:
                item = TIN;
                break;
            case 11:
                item = LEAD;
                break;

        }return item;

    }
}


