package com.tom.codechallenge.utils;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: tomkoptel<br/>
 * Date: 11.07.16<br/>
 * Time: 19:17<br/>
 */
public class LogReader {

    public LogReader() {
    }

    public int[] readArray(int n) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        return arr;
    }

    public int readInt() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        in.nextLine();
        return i;
    }

    public String readString() {
        Scanner in = new Scanner(System.in);
        try {
            return in.nextLine();
        } finally {
            in.close();
        }
    }
}