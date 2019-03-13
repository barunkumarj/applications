/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.stringtokens;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author karthick
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        StringTokenizer st = new StringTokenizer(s,("[_\\@!?.', ]"));
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        scan.close();
    }
}
