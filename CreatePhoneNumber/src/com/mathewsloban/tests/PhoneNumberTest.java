package com.mathewsloban.tests;

import com.mathewsloban.PhoneNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneNumberTest {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber3(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber4(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}

