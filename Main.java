public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        (new Solution()).rotate(nums, 3);
    }
}

class Solution{
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int count = gcd(k, len);
        for(int start = 0; start < count; start++){
            int current = start;
            int prev = nums[current];
            do{
                int next = (current + k) % len;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
            }while(current != start);
        }

    }

    private int gcd(int x, int y) {
        return y > 0 ? gcd(y, x%y) : x;
    }


}
