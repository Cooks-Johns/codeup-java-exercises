public class UserApplication {
    public static void main(String[] args){
        System.out.println("Welcome to the HR application");
        System.out.println("Currently . we have " + user.getNumberOfUsers() + " of users.");



        user Luis = new user("email", "password", "userName", true );

        user Erik = new user("email", "password","userName", false);

        System.out.println(Luis.userName + "ths is the email " + Luis.email);


        System.out.println("We now have " + user.getNumberOfUsers() + " in this application.");


    }
}
