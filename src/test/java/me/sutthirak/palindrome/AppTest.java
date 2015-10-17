package me.sutthirak.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void getPalindromeTest(){
        String word = "abcdccde";
        Assert.assertEquals("dccd",App.getPalindrome(word));
    }

    @Test
    public void twoPairTest(){
        String word = "abcdccdefghiihgfd";
        Assert.assertEquals("fghiihgf",App.getPalindrome(word));
    }

    @Test
    public void evenAndOddTest(){
        String word = "abcdadcdeedaca";
        Assert.assertEquals("cdadc",App.getPalindrome(word));
    }

    @Test
    public void targetTest(){
        String word = "abcababtbatabtcddc";
        Assert.assertEquals("tbatabt",App.getPalindrome(word));
    }
}
