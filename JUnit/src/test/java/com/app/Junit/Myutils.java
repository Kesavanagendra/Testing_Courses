package com.app.Junit;

public class Myutils {

	public static boolean isPalindrome(String inputText){
        int i = inputText.length()-1;
        int j=0;
        while(i > j) {
            if(inputText.charAt(i) != inputText.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
