package com.syntax.class23;

public  class Animal {

    Animal(){
        System.out.println("Parent");
    }
     /*final*/ void eat(){ // with final keyword nobody can reuse it
        System.out.println("All the animals eat");
    }
}

class Panda extends Animal{
    // no one can inherit from Animal class because it is declared final

    void eat(){ // with final keyword nobody can reuse it
        System.out.println("All the animals eat");
    }
    Panda(){
        System.out.println("Child");
    }
}
class Tester{
    public static void main(String[] args) {

        new Panda();
    }
}