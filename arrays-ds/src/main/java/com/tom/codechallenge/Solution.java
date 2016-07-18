package com.tom.codechallenge;

import com.tom.codechallenge.utils.LogReader;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: tomkoptel<br/>
 * Date: 11.07.16<br/>
 * Time: 19:17<br/>
 */
public class Solution {
    public static void main(String[] args) {
        LogReader reader = new LogReader();

        int N = reader.readInt();
        int[] array = reader.readArray(N);


        if (N != array.length) {
            throw new IllegalStateException("The number of values of A should equal to passed array");
        }

        StringBuilder builder = new StringBuilder();
        for (int i = N - 1; i >= 0; i--) {
            builder.append(String.valueOf(array[i]));
            boolean reachedEnd = i == 0;
            if (!reachedEnd) {
                builder.append(" ");
            }
        }

        System.out.println(builder.toString());
    }
}
