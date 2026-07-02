package Patterns;

/*Printing inverted rotated half-pyramid patter
    *
   **
  ***
 ****
*****

 */
public class InvertedRotated {
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
