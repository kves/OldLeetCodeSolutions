package com.company;
//https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int y = x;


        while (x != 0){
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }

        if (y<0) rev *= -1;
        if (rev == y) return  true;
        else return false;


    }
}
