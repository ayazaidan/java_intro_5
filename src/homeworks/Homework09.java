package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Homework09 {
        public static void main(String[] args) {

                         System.out.println("=====TASK 1 =====\n");
            int[] numbers = {-8, 56, 7, 8, 65};
            int count = 0;
            for (int i = 0; i < numbers.length ; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if ((numbers[i] == numbers[j]) && count == 0) {
                        count++;
                        System.out.println(numbers[i]);
                    }
                }
            }
            if (count == 0){
                System.out.println("There is no duplicates");
            }

                            System.out.println("\n=====TASK 2 =====\n");
            String[] words = {"Z", "abc", "z", "123", "#" };
            int count_ = 0;
            for (int i = 0; i < words.length ; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if ((words[i].equalsIgnoreCase(words[j])) && count_ == 0) {
                        count_++;
                        System.out.println(words[i]);
                    }
                }
            }
            if (count_ == 0){
                System.out.println("There is no duplicates");
            }

                                System.out.println("\n=====TASK 3 =====\n");

            int[] nums = {0, -4, -7, 0, 5, 10, 45, -7, 0};
            List<Integer> duplicatedNumbers = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (!duplicatedNumbers.contains(nums[i]) && nums[i] == nums[j])
                        duplicatedNumbers.add(nums[i]);
                }
            }
            if (duplicatedNumbers.size() == 0) System.out.println("There is no duplicates");
            else {
                for (int i = 0; i < duplicatedNumbers.size(); i++) {
                    System.out.println(duplicatedNumbers.get(i));
                }
            }

                                     System.out.println("\n=====TASK 4 =====\n");

            String[] word = {"python", "foo", "bar", "java", "123" };

            List<String> duplicatedWords = new ArrayList<>();

            for (int i = 0; i < word.length; i++) {
                for (int j = i + 1; j < word.length; j++) {
                    if(word[i].equalsIgnoreCase(word[j]) && !duplicatedWords.contains(word[i].toUpperCase())){
                        duplicatedWords.add(word[i]);
                    }
                }
            }
            if (duplicatedWords.size() == 0){
                System.out.println("There is no duplicates");
            }
            else for (int i = 0; i < duplicatedWords.size(); i++) {
                System.out.println(duplicatedWords.get(i));
            }

                                      System.out.println("\n=====TASK 6 =====\n");

            String[] words5 = {"java", "python", "ruby"};

            List<String> wordsReverse = new ArrayList<>();
            for (int i = words5.length-1; i >= 0; i--) {
                wordsReverse.add(words5[i]);
            }
            System.out.println(wordsReverse);

                                      System.out.println("\n=====TASK 6 =====\n");
            String str = "Java is fun";
            String[] strArr = str.split(" ");
            String reversedWords = "";

            for (String s : strArr) {
                for (int i = s.length()-1; i >= 0 ; i--) {
                    reversedWords += s.charAt(i);
                }
                reversedWords += " ";
            }
            System.out.println(reversedWords);
        }
    }

