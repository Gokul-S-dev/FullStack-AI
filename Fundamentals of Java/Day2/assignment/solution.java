import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Q1: new print_N_Numbers(n);
        // Q2: new sum_N_Numbers(n);
        // Q3: new multiply_table(n);
        // Q4: new starTriangle(n);
        // Q5: new reverseStarTriangle(n);
        // Q6: new numbersPattern(n);
        // Q7: new FloydsTriangle(n);
        
        int[] arr = {1, 2, 3, 4, 5};
        // Q8: new findLargest(arr);
        // Q9: new reverseArray(arr);
        // Q10: new oddEven(arr);

        // Bonus Challenge Problems
        // Q11: new isPalindromeChecker(n);
        // Q12: new arraySum(arr);
        // Q13: new primeChecker(n);
    }
}

class print_N_Numbers {
    print_N_Numbers(int n){
        for (int i = 1; i<=n; i++){
            System.out.print(i + " ");
        }
    }
}

class sum_N_Numbers {
    sum_N_Numbers(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}

class multiply_table {
    multiply_table(int n){
        for(int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}

class starTriangle {
    starTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class reverseStarTriangle {
    reverseStarTriangle(int n){
        for(int i = n ;i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class numbersPattern {
    numbersPattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class FloydsTriangle {
    FloydsTriangle(int n){
        int sum = 1;
        for(int i = 1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(sum++ + " ");
            }
            System.out.println();
        }
    }
}

class findLargest{
    findLargest(int[] arr){
        int n = arr.length;
        System.out.println("Largest element in the array is: " + arr[n-1]);
    }
}

class reverseArray {
    reverseArray(int[] arr){
        int n = arr.length;
        for(int i = n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}

class oddEven {
    oddEven(int[] arr){
        for(int i:arr){
            if(i%2==0){
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}


// Bonus Challenge Problems
class isPalindromeChecker {
    isPalindromeChecker( int n){
        int original = n;
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if(original == reverse){
            System.out.println("is a palindrome number");
        }
        else {
            System.out.println("Ohhh not a palindrome number");
        }
    }
}

class arraySum {
    arraySum(int[] arr){
        int sum =0;
        for(int i:arr){
            sum += i;
        }
        System.out.println("Sum of the array is: " + sum);
    }
}

class primeChecker {
    primeChecker(int n){
        if(n <=1){
            System.out.println("Not a prime number");
            return;
        }
        int count = 0;
        for(int i =2 ; i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 1){
            System.out.println("is a prime number");
        }
        else {
            System.out.println("Ohhh not a prime number");
        }
    }
}