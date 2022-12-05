package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework11 {

    // Task 1
    public static String noSpace(String str) {
        return str.replaceAll(" ", "");
    }

    //Task 2
    public static String replaceFirstLast(String str) {
        String str2 = "";
        str2 = str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        return str2;
    }

    // Task 3
    public static boolean hasVowel(String str) {
        boolean hasVowel = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') hasVowel = true;}
        return hasVowel;
    }

    //Task 4
    public static void checkAge(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year of birth");
        int year = scan.nextInt(); scan.nextLine();
        if(2022 - year >= 16 && 2022 - year < 100) System.out.println("AGE IS ALLOWED");
        else if (2022 - year < 16 && 2022 - year >= 0) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS NOT VALID");
    }

    //Task 5
    public static int averageOfEdges(int a, int b, int c){
        int average = (Math.max(Math.max(a,b),c) + Math.min(Math.min(a,b),c)) / 2;
        return average;
    }

    //Task 6
    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a")) arr[i] = arr[i].replaceAll(arr[i],"###");
        }return arr;
    }

    //Task 7
    public static int[] no3or5(int[] arr){
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 15 == 0) a[i] = 101;
            else if (arr[i] % 3 == 0) a[i] = 100;
            else if (arr[i] % 5 == 0) a[i] = 99;
            else a[i] = arr[i];
        }return a;
    }

    // Task 8
    public static int countPrimes(int[] arr){
        int countPrime = 0;
        for (int i : arr) {
            if(i / 2 !=0 && i / 3 !=0 && i / 5 !=0 && i / 7 !=0 && i >= 0) countPrime++;
        }return countPrime;
    }



    public static void main(String[] args) {

        System.out.println("\n ----------TASK1----------");
        String str = " Tech Global  ";
        System.out.println(noSpace(str));

        System.out.println("\n ----------TASK2----------");
        String str1 = "Tech Global";
        System.out.println(replaceFirstLast(str1));

        System.out.println("\n ----------TASK3----------");
        String str_ = "Java";
        System.out.println(hasVowel(str_));

        System.out.println("\n ----------TASK5----------");
        System.out.println(averageOfEdges(10,13,20));
        System.out.println(averageOfEdges(0,0,0));

        System.out.println("\n ----------TASK6----------");
        String[] arr = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(arr)));

        System.out.println("\n ----------TASK7----------");
        int[] nums = {7, 14, 11, 23, 17};
        System.out.println(Arrays.toString(no3or5(nums)));

        System.out.println("\n ----------TASK8----------");
        int[] nums_ = {-10, -3, 0, 1};
        System.out.println(countPrimes(nums_));    }



}




