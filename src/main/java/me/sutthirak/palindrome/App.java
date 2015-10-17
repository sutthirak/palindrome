package me.sutthirak.palindrome;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String... args) {
        String result = getPalindrome(args[0]);
        System.out.println("Palindrome is "+result);
    }

    public static String getPalindrome(String text){

        List<String> PalindromeList = new ArrayList<>();

        for(int i =0;i<text.length();i++){
            for(int j = i+1;j<text.length();j++){
                if(text.charAt(j) == text.charAt(i)){
                    String token = text.substring(i,j+1);
                    if(token.length() % 2 == 0){
                        if(isValidEvenLength(token)){
                            PalindromeList.add(token);
                        }
                    }else {
                        if(isValidOddLength(token)){
                            PalindromeList.add(token);
                        }
                    }

                }
            }
        }

        return PalindromeList.stream()
                .sorted((s1, s2) ->  (s1.length() > s2.length()) ? -1 : 1).findFirst().get();

    }


    private static Boolean isValidEvenLength(String text){

        for(int i = 0;i<text.length();i++){
            if(text.charAt(i) != text.charAt((text.length()-1)-i)){
                return false;
            }
        }

        return true;
    }

    private static Boolean isValidOddLength(String text){

        for(int i = 0;i<text.length();i++){
            if(i != Math.ceil(text.length() / 2)) {
                if (text.charAt(i) != text.charAt((text.length() - 1) - i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
