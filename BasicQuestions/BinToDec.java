package BasicQuestions;
//binary to decimal conversion
public class BinToDec {
    public static void main(String args[]){
        int n=10;
        int pow=0;
        int decNum=0;
        while(n>0){
            int lastDigit=n%10;
            decNum+=lastDigit*Math.pow(2,pow);
            pow++;
            n/=10;

        }
        System.out.println("The decimal number is: "+decNum);
    }
}
