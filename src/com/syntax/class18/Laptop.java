package com.syntax.class18;

public class Laptop {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;

    public Laptop() {
        System.out.println("Basic construction is happening...");
    }
    public Laptop(String make) {
        this.make = make;
    }
    public Laptop(String make, String model) {
        // this.make = make;
        this(make);
        this.model = model;
    }
    public Laptop(String make, String model, String storage) {
        /*
        this.make = make;
         this.model = model;*/
        this(make, model);
        this.storage = storage;
    }
    public Laptop(String make, String model, String storage, String memory) {
        /*
        this.make = make;
        this.model = model;
        this.storage = storage;*/
        this(make, model, storage);
        this.memory = memory;
    }
    public Laptop(String make, String model, String storage, String memory, double screenSize) {
       /*
        this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;*/
        this(make, model, storage, memory);
        this.screenSize = screenSize;
    }


    // this() - calls the constructors of a class inside other constructors
    //why we use it --> it help us reuse already written constructors contains same code
    //why we want to create multiple constructor in the first place--> we want to give end user flexibility that he
    //can create the objects of our class in may different ways
    public static void main(String[] args) {
        Laptop apple = new Laptop("Apple","M1Pro 14", "512","16", 14.1);
    }
}
