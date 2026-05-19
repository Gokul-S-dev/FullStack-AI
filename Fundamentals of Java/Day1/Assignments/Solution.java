public class Solution {
    public static void main(String args[]){
        // SwapTwoNumbers swap = new SwapTwoNumbers();
        // int a = 10;
        // int b = 20;
        // System.out.println("Before Swapping: a = " + a + " b = " + b);
        // swap.Swap(a, b);

        ThreeLargestNumbers find3 = new ThreeLargestNumbers();
        find3.find(10,5,15);

    }

}
class SwapTwoNumbers {
    
    void Swap(int a, int b){
        a = a+b;
        b = a-b;
        a =a-b;
        System.out.println("After Swapping: a = " + a + " b = " + b);
    }

}

class ThreeLargestNumbers{
    void find(int a ,int b, int c){
        if(a > b && a > c){
            System.out.println("a is the largest number "+a);
        }
        else if( b > a && b > c){
            System.out.println("b is the largest number "+b);
        }
        else{
            System.out.println("c is the largest number "+c);
        }
    }
}
class EbBill{

}
class ReverseNumber{

}
class bitwiseOddEven{
    void check(int n){
        if((n & 1) == 0){
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
}
class compountInterest{

}
class conversionseconds{

}
class isLeapYear{
    void check(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}