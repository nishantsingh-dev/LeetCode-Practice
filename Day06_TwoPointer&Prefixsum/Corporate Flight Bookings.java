Corporate Flight Bookings


Example 1:

Input: bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
Output: [10,55,45,25,25]
Explanation:
Flight labels:        1   2   3   4   5
Booking 1 reserved:  10  10
Booking 2 reserved:      20  20
Booking 3 reserved:      25  25  25  25
Total seats:         10  55  45  25  25
Hence, answer = [10,55,45,25,25]

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];

        for(int[] arr : bookings){

            int left = arr[0]-1;
            int right = arr[1];
            int seats= arr[2];

           //optimization by removing nested loop
           /* for(int i = left ; i < right ; i++){
                ans[i] += arr[2];
            }*/

            //smart way
            ans[left]+=seats;
           
            if(right<n){
                ans[right] -= seats;
            }
        }

        for(int i = 1; i < ans.length ; i++) {
            ans[i] += ans[i-1];
        }

        return ans;
    }
}