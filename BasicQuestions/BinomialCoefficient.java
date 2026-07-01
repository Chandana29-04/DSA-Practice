package BasicQuestions;

public class BinomialCoefficient{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int f=n*fnm1;
        return f;
    }
    public static int binomial(int n_fact,int r_fact,int n_r_fact){
        return n_fact/(r_fact*n_r_fact);
    }
    public static void main(String args[]){
        int n=5;
        int r=2;
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_r_fact=factorial(n-r);
        System.out.println("The binomial coefficient of "+n+" and "+r+" is: "+binomial(n_fact,r_fact,n_r_fact));
    }
}