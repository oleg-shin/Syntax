package com.syntax.class18;

class test {
    String alphabetical(String str) {


        char b = str.charAt(0);
        String newstr = "" + str.charAt(0);

        for (int a = 1; a < str.length(); a++) {
            if(b<str.charAt(a)){
                newstr += str.charAt(a);

            }
            b=str.charAt(a);
        }
        return newstr;
    }

    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.alphabetical("hello"));
        System.out.println(t.alphabetical("software"));
        System.out.println(t.alphabetical("language"));
    }

}




