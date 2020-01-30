/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        String reversedString = "";
        if(s!=null)
        {
            String words[] = s.split(" ");


            for (int i = 0; i < words.length; i++) {
                if (i == words.length - 1)
                    reversedString = words[i] + reversedString;
                else
                    reversedString = " " + words[i] + reversedString;
            }
        }
        return reversedString;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {
       String cap;
        String name[]= s.split("");
        if(name.length<3)

        return null;

        else {
            cap = s.substring(0, 1).toUpperCase() + s.substring(1);
        }

        return  cap;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        int highestFreq = 0;
        char mostFreqChar = ' ';
        for (int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            int c = 0;
            for (int j = s.indexOf(x); j != -1; j = s.indexOf(x, j + 1))

            {
                c++;

            }
            if (c > highestFreq)

            {
                highestFreq = c;
                mostFreqChar = x;

            }

        }
        return String.valueOf(mostFreqChar);
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
        int decimal= Integer.parseInt(s,2);
        return decimal;

    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
