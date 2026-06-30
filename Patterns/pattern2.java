package Patterns;

public class pattern2 {
    public static void main(String args[]){
        /*Printing the below pattern
        *****
        ****
        ***
        **
        *
         */

        int n=5;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
