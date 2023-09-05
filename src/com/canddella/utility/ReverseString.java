package com.canddella.utility;

public class ReverseString {

    public static void main(String[] args) {
        String str = "12345";
        System.out.println(str);
    
        System.out.println(reverse(str));
    }

    private static String reverse(String in) {
//        if (in == null)
//            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = in.length() - 1; i >= 0; i--) {
            stringBuilder.append(in.charAt(i));
        }

        return stringBuilder.toString();
    }
}
