package BasicQuestions;
//Decial to binary conversion

public class DecToBin {
    public static void main(String Args[]){
        int n=10;
        int pow=0;
        int binNum=0;
        while(n>0){
            int lastDigit=n%2;
            binNum+=lastDigit*Math.pow(10,pow);
            pow++;
            n/=2;

        }
        System.out.println("The binary number is: "+binNum);
    }
}
