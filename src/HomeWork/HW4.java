package HomeWork;
    /*
    Create Registration Class in which you would have variables as email,
    userName and password that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods
    and in each method separately pass values to set users email,
    username and password.
    Requirements:
    Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
     */
public class HW4 {
    public static void main(String[] args) {

    }
}
class Registration{
    private String email;
    private String userName;
    private String password;
    void validEmail(String email){
        if(email.endsWith("@yahoo.com")){
            this.email = email;
        } else {
            System.out.println("invalid email");
        }
    }
    void validUserName(String userName){
        if(userName.isEmpty()){
            System.out.println("Please enter username");
        } else {
            this.userName = userName;
        }
    }
    void validPassword(String password){
        if(password.isEmpty()){
            System.out.println("Please enter password");
        } else {
            this.password = password;
        }
    }
}