package com.nwsc.arua;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BillingAppTest {

    @Test
    public void testCalculateBill() {
        double result = BillingApp.calculateBill(100.0, 2500.0);
        assertEquals(250000.0, result, 0.001);
    }
}
