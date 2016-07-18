package com.tom.codechallenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: tomkoptel<br/>
 * Date: 17.07.16<br/>
 * Time: 10:06<br/>
 */
public class Solution {
    private final int[][] data;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        Solution solution = new Solution(arr);
        int result = solution.solve();
        System.out.println(result);
    }

    public Solution(int[][] data) {
        this.data = data;
    }

    public int solve() {
        int rowNum = data.length;
        int colNum = data[0].length;

        int maxNum = (rowNum - 2) * (colNum - 2);
        int[] max = new int[maxNum];

        int h = 0;
        for (int rowIndex = 0; rowIndex < rowNum - 2; rowIndex++) {
            for (int colIndex = 0; colIndex < colNum - 2; colIndex++) {
                max[h] =
                        data[rowIndex][colIndex] + data[rowIndex][colIndex + 1] + data[rowIndex][colIndex + 2] +
                        data[rowIndex + 1][colIndex + 1] +
                        data[rowIndex + 2][colIndex] + data[rowIndex + 2][colIndex + 1] + data[rowIndex + 2][colIndex + 2];
                h++;
            }
        }
        Arrays.sort(max);
        return max[maxNum - 1];
    }
}
