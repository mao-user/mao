import java.util.Arrays; //排序，求数组中所有数字在数组中有多少个数比其小的数组
public class maomao {
    public static void main(String[] args) {
        int[] mao = new int[]{8,1,2,2,3};
        int[] ans = minPairSum(mao);
        for (int h=0;h<mao.length;h++){
            System.out.println(ans[h]);
        }
    }
    public static int[] minPairSum(int[] nums) {
        int n=nums.length;
        int[] ret = new int[n];
        int[] ans = new int[n];
        int m=0;
        for(int i=0;i<n;i++){
            ret[i]=nums[i];
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (ret[i]==nums[j]){
                ans[m]=j;
                m++;
                break;
                }
            }
        }
        return ans;
    }
}