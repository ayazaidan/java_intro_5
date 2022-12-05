package projects;

import java.util.Arrays;

public class Project08 {
    // TASK 1
    public static int findClosestDistance(int[] arr){
        int distance = Integer.MAX_VALUE;
        if(arr.length == 1) distance = -1;
        for (int i = 0; i < arr.length ; i++){
            for (int j = i + 1; j < arr.length; j++)
                if (Math.abs(arr[i] - arr[j]) < distance) distance = Math.abs(arr[i] - arr[j]);
        } return distance;
    }

    // TASK 2
    public static int findSingleNumber(int[] arr){
        int findSingle = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] != arr[j] && findSingle != arr[i]) {
                    findSingle = arr[i];
                    break;
                }
        }return findSingle;
    }

    // TASK 3
    public static String findFirstUniqueCharacter(String s){
        String firstChar = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                firstChar += s.charAt(i);
                break;
            }
        }return firstChar;
    }

    // TASK 4
    public static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        int missing = 0;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] != arr[i + 1] - 1) missing = arr[i];
        return missing + 1;
    }


    public static void main(String[] args) {
        System.out.println("\n----------TASK1----------");
        int[] arr0= {4,8,7,15};
        int[] arr1 = {10, -5, 20, 50, 100};
        System.out.println(findClosestDistance(arr0));
        System.out.println(findClosestDistance(arr1));

        System.out.println("\n----------TASK2----------");
        int[] arr_1 = {2};
        int[] arr_2 = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(arr_1));
        System.out.println(findSingleNumber(arr_2));


        System.out.println("\n----------TASK3----------");
        String str = "Hello";
        String str1 = "abc abc d";
        String str2 = "abab";
        System.out.println(findFirstUniqueCharacter(str));
        System.out.println(findFirstUniqueCharacter(str1));
        System.out.println(findFirstUniqueCharacter(str2));

        System.out.println("\n----------TASK4----------");
        int[] nums1 = {2, 4};
        int[] nums2 = {2, 3, 1, 5};
        System.out.println(findMissingNumber(nums1));
        System.out.println(findMissingNumber(nums2));

    }

}




