package homework;

public class Pattern {
    public static void main(String[] args){
        // Q1: new rightTriangleStars(5);
        // Q2: new invertedRightTriangleStars(5);
        // Q3: new pyramidStars(5);
        // Q4: new floydsTriangle(5);
        // Q5: new pascalsTriangle(5);
        // Q6: new diamondPattern(5);
        // Q7: new hollowSquareStars(5);
        // Q8: new alphabetPattern(5);
        // Q9: new multiplicationTable(5);
        
    }
}

class rightTriangleStars {
    rightTriangleStars(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class invertedRightTriangleStars {
    invertedRightTriangleStars(int n){
        for(int i = n ; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class pyramidStars {
    pyramidStars(int n){
        for(int i = 1; i<=n; i++){
            // print spaces
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            // print number
            for(int k = 1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

}

class floydsTriangle {
    floydsTriangle(int n){
        int num = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}

class pascalsTriangle {
    pascalsTriangle(int n){
        for(int i = 0; i<n; i++){

            //space loop for rows
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            int num = 1;
            for(int k = 0; k<i ; k++){
                System.out.print(num+" ");
                num = num * (i-k) / (k+1);
            }
            System.out.println();
        }
    }
}

class diamondPattern {
    diamondPattern(int n){
        // Upper half
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for(int i = n-1; i>=1; i--){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class hollowSquareStars {
    hollowSquareStars(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

class alphabetPattern {
    alphabetPattern(int n){
        for(int i = 1; i<=n; i++){
            char ch = 'A';
            for(int j = 1; j<=i; j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}

class multiplicationTable {
    multiplicationTable(int n){

        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=n; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}

