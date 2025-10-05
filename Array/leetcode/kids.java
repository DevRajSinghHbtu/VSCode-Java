class Solution {
    public static void main(String[] args) {
       int [] candies = {12, 1, 12};
       int extraCandies = 10;
        int max = linear(candies);
        boolean arr[] = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                arr[i] = true;
            } else {
                arr[i] = false;
            }
        }
        System.out.println(arr);
    }

    static int linear(int[] candies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        return max;
    }

}