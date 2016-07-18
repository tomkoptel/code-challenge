package com.tom.codechallenge;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: tomkoptel<br/>
 * Date: 17.07.16<br/>
 * Time: 10:12<br/>
 */
public class SolutionTest {
    private final static int[][] BASIC_DATA = new int[][]{
            new int[]{1, 1, 1, 0, 0, 0},
            new int[]{0, 1, 0, 0, 0, 0},
            new int[]{1, 1, 1, 0, 0, 0},
            new int[]{0, 0, 2, 4, 4, 0},
            new int[]{0, 0, 0, 2, 0, 0},
            new int[]{0, 0, 1, 2, 4, 0}
    };


    @Test
    public void should_pass_basic_test() throws Exception {
        Solution solution = new Solution(BASIC_DATA);
        int result = solution.solve();
        assertTrue(result == 19);
    }
}