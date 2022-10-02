class mmao{
  public static void main(String[] args){
    int[] nums = new int[]{1,2,3,1};
    int a = Solution.rob(nums);
    System.out.println(a);
  }
  class Solution {
    public static int rob(int[] nums) {
        int N = nums.length;
        int[] a = new int[100];
        int[] b = new int[100];
        if(N == 1){
            return nums[0];
        }
        if(N == 3){
            return Math.max(Math.max(nums[0],nums[2]),nums[1]);
        }
        a[0] = 0;
        a[1] = nums[0];
        b[0] = 0;
        b[1] = nums[1];
        for(int i=2;i<=N;i++){
            b[i] = Math.max(b[i-1],b[i-2]+nums[i-1]);
        }
        for(int j=2;j<N;j++){
            a[j] = Math.max(a[j-1],a[j-2]+nums[j-1]);
        }
        return Math.max(a[N-1], b[N]);
    }
}
}