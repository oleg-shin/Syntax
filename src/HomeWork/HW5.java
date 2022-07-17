package HomeWork;

import java.util.ArrayList;

/*





    Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
     */
public class HW5 {
        public static void main(String[] args) {
            /*
            Create an ArrayList that will store 5 names into it.
            Find out whether the given ArrayList is empty or not?
            Check whether the specific name is present in an ArrayList or not?
            Find the size of your arrayList and print all values from that
             */
            ArrayList<String> names = new ArrayList<>();
            names.add("Brad");
            names.add("Mrad");
            names.add("Crad");
            names.add("Drad");
            names.add("Arad");
            System.out.println(names.isEmpty());
            System.out.println(names.contains("Brad"));
            System.out.println(names.size());
            System.out.println(names);

            /*
             Create an arraylist of cars and retrieve all the values using 3 different ways.
             */
            ArrayList<String> cars = new ArrayList<>();
            cars.add("BMW");
            cars.add("Mercedes");
            cars.add("Toyota");
            cars.add("Hyundai");
            System.out.println(cars);
            for(int i = 0; i<cars.size(); i++){
                System.out.println(cars.get(i));
            }
            for(String car:cars){
                System.out.println(car);
            }
            /*
                Create an arrayList of words. Remove every word that ends with “e”.
             */
            ArrayList<String> words = new ArrayList<>();
            words.add("melons");
            words.add("pure");
            words.add("planet");
            words.add("more");
            words.add("sun");
            for(int i=0; i<words.size();i++){
                if(words.get(i).endsWith("e")){
                    words.remove(i);
                }
            }
            System.out.println(words);

            /*
            Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
             */
            ArrayList<String> drinks = new ArrayList<>();
            drinks.add("cola");
            drinks.add("fanta");
            drinks.add("sprite");
            drinks.add("water");
            drinks.add("ice tea");

            for(int i=0; i<drinks.size(); i++){
                if(drinks.get(i).contains("a")|| drinks.get(i).contains("e")){
                    drinks.set(i, "water");
                }
            }
            System.out.println(drinks);
        }
}
