package HomeWork;
        /*
        Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
        Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
        Test your code.
        */
public class HW1 implements Shape {
    public int calculateArea(int lenght, int width){
        return lenght*width;
    }
    public int calculatePerimeter(int lenght, int width){
        return (lenght+width)*2 ;
    }

    public static void main(String[] args) {
        HW1 a = new HW1();
        System.out.println("Are is " + a.calculateArea(15,20));
        System.out.println("Perimeter is " + a.calculatePerimeter(15, 20));
    }

}
interface Shape{
    int calculateArea(int lenght, int width);
    int calculatePerimeter(int lenght, int width);
}
