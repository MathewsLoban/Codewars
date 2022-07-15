package com.mathewsloban.tests;

import com.mathewsloban.Solution;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }

}
