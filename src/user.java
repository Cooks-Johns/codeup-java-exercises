public class user {


    public String userName;
    public String email;
    public String password;
    public boolean isAdmin;


    public user(String email, String userName, String password, boolean isAdmin){
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.isAdmin = false;
    }


    protected static int numberOfUsers = 0;

    public static int getNumberOfUsers() {
        return numberOfUsers;
    }
    public user() {
        numberOfUsers++;

    }

    // Constructor is the function called on objects




}
