package com.syntax.class25;

public interface IP65 {
    // private String make = "LG"; interface can only have public
    // in interface public, static final all the fields are default - no need to write
    String make = "LG";
    void wash();
}
interface FastChrgeAble{
    void charging();
}
interface FiveG{
    void speed();
}
class S21Ultra implements FastChrgeAble, FiveG, IP65{
    public void wash(){
        System.out.println("You can wash");
    }
    public void charging(){
        System.out.println("Support fast charging");
    }
    public void speed(){
        System.out.println("");
    }

}
