package com.stm.demo6;

public class ZigZagConversion {
    public static void main(String[] args) {
        String str = "LEETCODEISHIRING";
        String res = convert(str, 3);
        System.out.println(res);
    }

    private static String convert(String s, int numRows) {
        int length = s.length();
        int n = (length % (2 * numRows - 2) == 0)? length / numRows : length /numRows + 1;
        for (int i = length; i < (2 * numRows - 2) * n; i++) {
            s = s + " ";
        }
        char[][] matrix = new char[numRows][n * (numRows - 1)];
        for(int k = 0; k < n; k++) {
            for(int j = (numRows - 1) * k; j < (numRows - 1) * (k + 1); j++) {
                if(j % (numRows - 1) == 0) {
                    for(int i = 0; i < numRows; i++) {
                        // if ((numRows - 1) * 2 * k + i >= length) break;
                        matrix[i][j] = s.charAt((numRows - 1) * 2 * k + i);
                    }
                }else {
                    matrix[numRows - j + (numRows - 1) * k - 1][j] = s.charAt((2 * numRows - 2) * k + numRows - 1 + (k == 0 ? j : j % ((numRows - 1) * k)));
                }
            }                
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRows; i++) {
            for (int j = 0; j < n * (numRows - 1); j++) {
                if(matrix[i][j] == '\0' || matrix[i][j] == ' ') {
                    continue;
                }
                sb.append(matrix[i][j]);
            }
        }
        return sb.toString();
    }
}