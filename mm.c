#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main(){
    int nums[8]={3,5,2,3};
    int numssize=4;
   int res = pinmpairsum(nums,numssize);
    printf("%d\n",res);
}
    int cmp(int *a, int *b){
    return *a-*b;
}
int pinmpairsum(int *nums, int numsSize){
    int res = 0;
    qsort(nums, numsSize, sizeof(int),cmp);
    for (int i = 0; i < numsSize / 2; ++i) { 
    res = fmax(res, nums[i] + nums[numsSize - 1 - i]);
    }
    return res;
}
// 作者：LeetCode-Solution
// 链接：https://leetcode.cn/problems/minimize-maximum-pair-sum-in-array/solution/shu-zu-zhong-zui-da-shu-dui-he-de-zui-xi-cvll/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。