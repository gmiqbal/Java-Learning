public class tudiarray {
    public static void main(String a[]) {
        int nums[][] = new int[3][4];

        for (int i = 0; i < nums.length; i++)

        {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // for (int i = 0; i < nums.length; i++)

        // {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }

        // enhanced for loop

        for (int n[] : nums) {
            for (int m : n) {
                System.out.println(m + " ");
            }
            System.out.println();
        }

    }
}
