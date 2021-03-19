package com.schedulingapp;

import com.schedulingapp.misc.Date;
import com.schedulingapp.exceptions.IllegalDateException;

import org.junit.Assert;
import org.junit.Test;

public class DateValidatorTest {
    @Test
    public void dateValidator_validInputTest_day() {
        //
        // Correct values
        //

        // Test lower bounds
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 2;
            int year = 2001;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 2;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 3;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 4;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 5;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 6;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 7;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 8;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 9;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 10;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 11;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 12;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test somewhere in middle of ranges
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 2;
            int year = 2001;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 2;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 3;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 4;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 5;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 6;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 7;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 8;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 9;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 10;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 11;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 12;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test upper bounds
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 2;
            int year = 2001;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 2;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 3;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 4;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 5;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 6;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 7;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 8;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 9;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 10;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 11;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 12;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        //
        // Incorrect values
        //

        // Test lower bounds
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test upper bounds
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void dateValidator_validInputTest_month() {
        //
        // Correct values
        //

        // Test lower bound
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test somewhere in middle of range
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test upper bound
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        //
        // Incorrect values
        //

        // Test lower bound
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test somewhere in middle of range
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test upper bound
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void dateValidator_validInputTest_year() {
        //
        // Correct values
        //

        // Test lower bound
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test somewhere in middle of range
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test upper bound
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        //
        // Incorrect values
        //

        // Test lower bound
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test somewhere in middle of range
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        // Test upper bound
        try {
            int day = 1;
            int month = 1;
            int year = 2000;
            Date date = new Date(day, month, year);
            String expected = String.format("%s/%s/%s", month, day, year);
            Assert.assertEquals(expected, date.toString());
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }
    }

}
