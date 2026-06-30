package Patterns;
public class HalfPyramid {
    /*
    1
    12
    123
    1234
     */
    public static void main(String[] args) {
        int n=4;
        for(int line=1;line<=n;line++){
            for(int j=1;j<=line;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
