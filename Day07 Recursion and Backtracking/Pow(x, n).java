Pow(x, n)

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000


class Solution {
    public double myPow(double x, long n) {
        if(n==0){
            return 1;
        }

        if(n<0){ x = 1/x; n= -n;}

        double half= myPow(x, n/2);

        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
}