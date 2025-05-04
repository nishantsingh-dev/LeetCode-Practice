class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> lMinHeap = new PriorityQueue<>();

        for(int n : nums){
        lMinHeap.offer(n);
        if(lMinHeap.size()>k){
            lMinHeap.poll();
        }

        }
        return lMinHeap.peek();
    }
}