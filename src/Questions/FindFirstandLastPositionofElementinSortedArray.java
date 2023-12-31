package Questions;
//34.https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FindFirstandLastPositionofElementinSortedArray {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans={-1,-1};
            ans[0] = search(nums,target,true);
            if(ans[0]!=-1){
                ans[1] = search(nums,target,false);
            }

            return ans;
        }

        public static int search(int[] nums, int target,boolean firstindex){
            int start=0;
            int end=nums.length-1;
            int ans=-1;
            while(start<=end){
                int mid= start+ (end-start) /2;
                if(nums[mid]>target){
                    end=mid-1;
                } else if (nums[mid]<target) {
                    start=mid+1;
                } else {
                    ans=mid;
                    if(firstindex){
                        end=mid-1;
                    }
                    else {
                        start=mid+1;
                    }
                }
            }
            return ans;
        }
    }
}
