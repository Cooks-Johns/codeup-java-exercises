public class ControlFlowExercises {
    public static void main(String[] args){

        //-------=============          A


        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
//-------=============          B
//        int doWhile = 0;
//        do{
//            System.out.println(doWhile);
//            doWhile +=2 ;
//        } while (doWhile <= 100);


////-------=============           5's from 100 to -10.
        int downHill = 100;
        do{
            System.out.println(downHill);
            downHill = downHill - 5;
        } while (downHill >= -10);

        //-------=============       2, and displays the number squared on each line while the number is less than 1,000,000.


//        int j = 2;
//        do {
//            System.out.println(j);
//            j *= j;
//        } while (j <= 1000000);

        for(int j = 5; j <= 15; j++) {
            System.out.println(j);
        }

        for(long j = 2; j <= 1000000; j*= j) {
            System.out.println(j);
        }

            //-------=============  For





    }




        //
        //refactor the previous two exercises to use a for loop instead




}
