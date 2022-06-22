package com.syntax.class21;

public class Task1 {
}
class userClass{
    String name;
    String mobileNumber;

    public userClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class userInfo extends userClass{
    String userAddress;
    public userInfo(String name, String mobileNumber, String userAddress){
        super(name, mobileNumber);
        this.userAddress = userAddress;
    }
    void printInfo(){
        System.out.println("Name " + name + " Mobile number " + mobileNumber + " User address " + userAddress);
    }


}