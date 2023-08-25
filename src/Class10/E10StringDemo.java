package Class10;

public class E10StringDemo {
    public static void main(String[] args) {
        String userName = ("amin123");
        String passWord = ("Abc12345");
        String confirmationPassWord=("Abc12345");
        if (userName.isEmpty() || passWord.isEmpty()) {
            System.out.println("user name or password can not be empty?!");
        } else if (passWord.length()<8) {
            System.out.println("password is too short");
        } else if (passWord.contains(userName)) {
            System.out.println("password can not contain the username");
    } else if (!passWord.equals(confirmationPassWord)) {
            System.out.println("password is not match");
            
        }else {
            System.out.println("your username and password has been created");
        }

    }
}


