package com.company;

public class Ch_24_BreakContinue {
    public static void main(String[] args) {
       /* for(int i=0;i<=5;i++){
            System.out.println(i);
            if(i==3) {
                System.out.println("ending the loop");
                break;
            }
          }

        int i=0;
        while( i<=5){
            System.out.println(i);

            if(i==2)
            break;
            i++;
            }
        */
        //Continue statement: use in loop to continue loop
        //continue statement will send compliler to loop again to check condition;;
        int i=0;
        while(i<=5){
              i++;
            if(i==2) {
                continue;
            }
            System.out.println(i);

        }


    }

}
