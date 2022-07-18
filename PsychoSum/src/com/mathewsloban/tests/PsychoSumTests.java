package com.mathewsloban.tests;

import com.mathewsloban.PsychoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PsychoSumTests {

    @Test
    public void RealAddition() {
        System.out.println("****** Real addition ******");
        assertEquals(13, PsychoSum.add(2, 11));
        assertEquals(1, PsychoSum.add(0, 1));
        assertEquals(0, PsychoSum.add(0, 0));
    }


    @Test
    public void SillyAdditon() {
        System.out.println("****** Silly addition******");
        assertEquals(214, PsychoSum.add(16, 18));
        assertEquals(515, PsychoSum.add(26, 39));
        assertEquals(1103, PsychoSum.add(122, 81));
    }

}

