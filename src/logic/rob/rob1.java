package logic.rob;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。
 * 同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * 打家劫舍2
 */
public class rob1 {
    public static int rob(int[] nums) {
        int length = nums.length;
        if(nums == null || length == 0)
            return 0;
        if(length == 1)
            return nums[0];
        if(length == 2)
            return Math.max(nums[0],nums[1]);

        int[] dp1 = new int[length-1];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < length-1; i++)
            dp1[i] = Math.max(dp1[i-2] + nums[i], dp1[i-1]);

        int[] dp2 = new int[length];
        dp2[0] = 0;
        dp2[1] =  Math.max(nums[1],0);
        for(int i = 2; i < length; i++)
            dp2[i] = Math.max(dp2[i-2] + nums[i], dp2[i-1]);

        return Math.max( dp1[length-2], dp2[length-1]);


    }

    public static void main(String[] args) {
        int[] array = {2,3,2};
        System.out.println( rob(array));

    }
}
