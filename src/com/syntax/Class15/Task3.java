package com.syntax.Class15;

public class Task3 {
    void printIsPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String reversedStr = stringBuilder.toString();
        if(str.equals(reversedStr)){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.printIsPalindrome("dad");
    }
}
