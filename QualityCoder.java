/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualtiycoder;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author user
 */
public class QualityCoder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Calculate Min ");
        int len = 10;
        int max = 0;
        int min = 1000;
        int[] s = new int[len];
        for (int i = 0; i < s.length; i++) {
            s[i] = in.nextInt();
            if (s[i] < min) {
                min = s[i];
            }

        }
        System.out.println("The min is " + min);
        System.out.print("Calculate max ");
        for (int i = 0; i < s.length; i++) {
            s[i] = in.nextInt();
            if (s[i] > max) {
                max = s[i];
            }
        }
        System.out.println("The max is " + max);

    }
}
