package com.syntax.class19;

public class Task6 {
    private Task6(){
        System.out.println("private");
    }
    Task6(String name){
        System.out.println("default");
    }
    public Task6(int num){
        System.out.println("public");
    }
    protected Task6(boolean flag){
        System.out.println("protected");
    }
}
