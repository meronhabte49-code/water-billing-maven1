package com.nwsc.arua;

public class BillingApp {

    public static double calculateBill(double unitsConsumed, double ratePerUnit) {
        return unitsConsumed * ratePerUnit;
    }

    public static void main(String[] args) {
        double units = 150.0;
        double rate = 2500.0; // UGX per unit
        double bill = calculateBill(units, rate);

        System.out.println("NWSC Arua - Water Billing Management System");
        System.out.println("Units consumed: " + units);
        System.out.println("Rate per unit: UGX " + rate);
        System.out.println("Total bill: UGX " + bill);
    }
}
