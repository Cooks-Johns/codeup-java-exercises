//import java.util.Scanner;
//
//public class Person {
//
//        private String name;
//
//        public Person(String name){
//            this.name = name;
//        }
//
//
//// returns the person's name
//
//        public String getName(){
//            return this.name;
//        }
//
//
//    // changes the name property to the passed value
//
//
//    public void setName(String name){
//        this.name = name;
//
//
//        }
//
//
//
//    public void greeting(String name) {
//        this.name = name + " Whats Up?! ";
//    }
//
//
//// prints a message to the console using the person's name
//
//        public void sayHello(String name) {
//            this.name = name + " looking Great today!!!";
//
//        }
//
//
//        /////////--------=============================---------------->
//
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome Enter Your Name ");
//            String newUser = sc.next();
//
//
//
//
//
//            Person John = new Person("John");
//            Person Lisa = new Person("Lisa");
//
//
//
//            System.out.println("New user");
//
//
//
//            System.out.println("Hello " + John.getName());
//            System.out.println("Heeey! " + Lisa.getName());
//
//            System.out.print(newUser);
////            John.setName("");
//
////        String newName = John.nextInt();
////        System.out.println(John);
//
//
////         System.out.println("So what are we going to do now " + John.);
////
////         Lisa.setName("");
////
//
//
//
//sc.close();
//
//
//
//
//
//
//         //------=========  part2
//
////        Person person1 = new Person("john");
////        Person person2 = new Person("John");
////        System.out.println(person1.getName().equals(person2.getName()));
////        System.out.println(person1 == person2);
//
////        Person person1 = new Person("John");
////        Person person2 = person1;
////        System.out.println((person1 == person2));
//
////          Person person1 = new Person("John");
////          Person person2 = person1;
////          System.out.println(person1.getName());
////          System.out.println(person2.hetName());
////          person2.setName("Jane");
////          System.out.println(person1.getName());
////          System.out.println(person2.getName());
//
//
//        }
//
//
//}



//============---------------> Notes

public class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public String getName(){  // method's signature
        return name;

    }

    public void setName(String name) {
        if (name.isEmpty()) System.out.println("That is invalid!");
        this.name = name;

    }
    public void sayHello() {
        System.out.printf("hello %s!%n", name);
//        this.name = "Heyy, how are you doing today  " + name + ". Nice shoes!";

    }



// psvm create a main method
    public static void main(String[] args) {

    Person person = new Person("John");
        Person Lisa = new Person("Lisaa");
        System.out.println(person.getName());
        person.setName("Big John");
        person.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));  // returns true
        System.out.println(person1 == person2);  ///  returns false you cannot use == to compaire objects

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);





    }

}