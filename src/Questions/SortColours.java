package Questions;
//75.
public class SortColours {

        public void sortColors(int[] nums) {
            int n= nums.length;
            for(int i =0; i<n; i++){
                for(int j=1; j<n-i; j++){
                    if(nums[j]< nums[j-1]){
                        int temp= nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1]=temp;
                    }
                }
            }
        }
    }

