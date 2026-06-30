package BasicQuestions;
public class Prime{
    public static boolean isPrime(int n){
        
        if(n<=1){
            return false;
        }
        else{
            for (int i=2;i<Math.sqrt(n);i++){
                if(n%2==0){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int n1=10;
        int n2=1;
        int n3=3;
        System.out.println(n1 +"is"+ isPrime(n1));
        System.out.println(n2 +"is"+ isPrime(n2));
        System.out.println(n3 +"is"+ isPrime(n3));
    }
}