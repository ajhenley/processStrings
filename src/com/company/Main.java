package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // first 3 char - city
    // next 3 char - job classification
    // next char - gender
    // next 2 char - race
        // last 5 char - random number
        // MIACONFBL34567

        String idnumber = "MIACONFBL34567";

        for (int i = idnumber.length() - 1; i >= 0; i--)
        {
            System.out.println("" + idnumber.charAt(i));
        }

        String city = getIdPart(idnumber, 0, 2);
        String jobClass = getIdPart(idnumber, 3, 5);
        String gender = getIdPart(idnumber, 6, 6);
        String race = getIdPart(idnumber, 7, 8);
        String strNumber = getIdPart(idnumber, 9, 13);
        int intNumber = Integer.parseInt(strNumber);
        System.out.println("City working in: " + city);
        System.out.println("Job Class in: " + jobClass);
        System.out.println("Gender: " + gender);
        System.out.println("Race: " + race);
        System.out.println(String.valueOf(intNumber));
    }

    static String getIdPart(String str, int start, int end)
    {
        String temp = "";
        for (int i = start; i <= end; i++)
        {
            temp = temp + str.charAt(i);
        }
        return temp;
    }
}
