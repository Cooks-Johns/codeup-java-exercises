


public class Fibonacci {


    public static void main(String[] args) {
    }

        public static long fib ( int number){


            if (number < 1) {
// This would be better with an exception

                System.out.print("Enter a number greater than or equal too 1 ");
                return -1;
            }
            if (number == 1) {
                return 1;
            }
            if (number == 2) {
                return 1;
            }
            return fib(number - 2) + fib(number - 1);
        }
    }

