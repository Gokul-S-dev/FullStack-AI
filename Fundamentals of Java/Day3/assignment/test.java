//package Fundamentals of Java.Day3.assignment;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        // 1-2+3-4+5-6+7-8+9-10
        // number divisible by 3 , multiple by 2

        int N ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        N = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=N;i++){

            if(i%2==0){
                if(i%3==0){
                    sum-=i*2;
                }else{
                    sum-=i;
                }
            }
            else{
                if(i%3==0){
                    sum+=i*2;
                }else{
                    sum+=i;
                }
            }

        }
        System.out.println(sum);
    }
    
}
