package com.syntax.class18;

class test {
    String alphabetical(String str) {
        String newstr = "";
        int temp = 0;
        char[] charArray = str.toCharArray();
        for (int a = 1; a < str.length(); a++) {
            for (int b = a-1; b <=a ; b++) {
                if (str.charAt(a)<str.charAt(b)) {
                    newstr=newstr + charArray[b];
                }
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.alphabetical("hello"));
    }

}


