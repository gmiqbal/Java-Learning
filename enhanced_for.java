public class enhanced_for {
    public static void main(String[] args) {
        int nums[] = new int[4];

        nums[0] = 4;
        nums[1] = 7;
        nums[2] = 1;
        nums[3] = 2;

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
