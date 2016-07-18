package com.tom.codechallenge;

import java.util.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: tomkoptel<br/>
 * Date: 12.07.16<br/>
 * Time: 20:23<br/>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        BinNum num = new BinNum(N);
        System.out.println(num.printOneConsequenceNumber());
    }

    static class BinNum {
        private final Deque<Integer> binaryList = new LinkedList<Integer>();

        BinNum(int N) {
            parse(N);
        }

        private void parse(int n) {
            if (n == 0) {
                return;
            }
            int mod = n % 2;
            int division = n / 2;
            binaryList.push(mod == 0 ? 0 : 1);
            parse(division);
        }

        public int printOneConsequenceNumber() {
            List<Integer> consequences = new ArrayList<Integer>();

            int max = 0;
            int size = binaryList.size();
            Integer[] binnaries = toArray(binaryList);

            for (int i = 0; i < size; i++) {
                boolean reachedEnd = (i == size - 1);
                int binNum = binnaries[i];
                boolean isOne = (binNum == 1);

                if (isOne) {
                    max++;
                } else {
                    consequences.add(max);
                    max = 0;
                }

                if (reachedEnd) {
                    consequences.add(max);
                }
            }

            Collections.sort(consequences);
            int lastIndex = consequences.size() - 1;

            return consequences.get(lastIndex);
        }

        @Override
        public String toString() {
            return Arrays.toString(toArray(binaryList));
        }

        static Integer[] toArray(Collection<Integer> list) {
            Integer[] array = new Integer[list.size()];
            list.toArray(array);
            return array;
        }
    }
}
