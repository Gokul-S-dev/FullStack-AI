package homework;

public class A_solution {
    public static void main(String[] args) {
        Numbers_Analyzer sol = new Numbers_Analyzer(5);
        sol.evenOrOdd();
        sol.posOrNeg();
        sol.factorial();

    }
}

class Numbers_Analyzer{
    int n;
    Numbers_Analyzer(int n){
        this.n = n;
    }
  
    void evenOrOdd(){
        if (n % 2 == 0){
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }

    void posOrNeg(){
        if (n > 0){
            System.out.println(n + " is positive.");
        } else if(n < 0){
            System.out.println(n + " is negative.");
        } else {
            System.out.println(n + " is zero.");
        }
    }

    void factorial(){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact*=i;
        }
        System.out.println(n + "! = " + fact);
    }
}
