package tag.DP.easy;

/**
 * @author zrfan
 * @date 2020/02/02.
 */
public class LeetCode_198 {

  /**
   * 动态规划
   *  找出规律
   *  转为 dp[i-2]+nums[i] 与 dp[i-1] max
   *
   *  [1,3,2,1] ---> 4
   *
   *  注意数组越界情况 判断length==0 和 length==1的情况
   * @param nums
   * @return
   */

  public int rob(int[] nums) {

    if(nums.length == 0){
      return 0;
    }

    if(nums.length == 1){
      return nums[0];
    }

    int length = nums.length;
    int[] dp = new int[length];
    dp[0] = nums[0];
    dp[1] = Math.max(dp[0], nums[1]);

    for(int i=2;i<length;i++){
      dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
    }

    return dp[length-1];

  }
}
