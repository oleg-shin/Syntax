package com.syntax.class18;

public class HW {

    /*
		 * Create a method that will accept an array as parameters and will return a sum
		 * of all elements from that array. Method should be visibly only within same
		 * package and accessible by the creating an instance of the class.
		 */

		protected int sum (int[] array){
			int sum1=0;
			for(int a=0;a<array.length; a++){
				sum1+=array[a];
			}
			return sum1;
		}

		/* Create a method that will take a String as a parameter and returns reversed String.
		 * Method should be available to all classes within your project and accessible
		 * by class name.
		 */
		public StringBuilder reveresed(String str){
			StringBuilder a = new StringBuilder();
			return a.reverse();}
		/* Create a method that will accept a String as a parameter and
		 * return a new String that consist only of vowels. Method should be available
		 * inside the class only where it was declared and executed by calling it is
		 * name.
		 */
		private String vowels(String str1){

			return str1.replaceAll("[^aeuioe]","");

		}
		/* Write a java class that will have a constructor: one with parameters and
		 * second without any parameters. Create a separate Test class where you will
		 * execute both of the constructors 1 by 1.
		 */
		HW(){

		}
		HW(int x){

		}
		 /* Write a java Class Students that
		 * have a constructor which takes students name and 3 subject grades. Inside
		 * your class also have a method to Calculate Average Grade. Test Student class
		 * for 5 different students with different marks. Your program should print an
		 * average mark of each students name.
		 */
		/*double g1Marks;
    double g2Marks;
    double g3Marks;
    String name;
    Students(String name, double grade1Marks,double grade2Marks,double grade3Marks){
        g1Marks = grade1Marks;
        g2Marks = grade1Marks;
        g3Marks = grade1Marks;
        this.name = name;
    }
    public void calculateAvgGrade(){
        double avgGrade = (this.g1Marks + this.g2Marks + this.g3Marks)/3;
        System.out.println(name + avgGrade);
    }
		 /* NOTE: please use different names for
		 * instance and local variables.
		 */
		 /* Write a java class that have 4 constructors with 4 different access levels of
		 * constructors(private,public,default,protected) and create 4 objects of this
		 * class: 1 - inside same class; 2 - from outside the class; 3 - from different
		 * class inside different package and observe result.
		 */

		 /* Write program that have
		 * static constructor and observe result.
		 */
		 /* Write a Student class that have instance variables name and address. Create a
		 * constructor that will initialize those variables. Print name & address of
		 * given student using displayInfo method.
		 */
		 /* Write Book class that will have
		 * instance variables and 2 Constructors.
		 */
		 /* While creating an object make sure:
		 * Instance variables are being initialized Both Constructors are being executed
		 */

}
