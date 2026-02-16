class Solution {
    public int[] searchRange(int[] arr, int target) {
        // int[] ans={-1,-1};
        // int start = search(nums,target,true);
        // int end=search(nums,target,false);
        // ans[0]=start;
        // ans[1]=end;
        // return ans;
        int low = 0;
         int high = arr.length - 1;
         int[] ans = new int[2];
       
         //find the first occurence;
        int pos = -1;
        int posE = -1;
         while(low <= high){
             int mid = (low + high ) / 2;
             if(arr[mid] == target) {
                 pos = mid;
                 high = mid - 1;
             }
             else if(arr[mid] < target){
                low  = mid +1;
             }
             else{
                 high = mid - 1;
             }

         }
        int low1 = 0;
        int high1 = arr.length - 1;
       
        //find the last occurence;


        while(low1 <= high1){
            int mid = (low1 + high1 ) / 2;
            if(arr[mid] == target) {
                posE = mid;
                low1 = mid + 1;
            }
            else if(arr[mid] < target){
                low1  = mid +1;
            }
            else{
                high1 = mid - 1;
            }

        }
        ans[0] = pos;
        ans[1] = posE;
        return ans;
        
    }
    // int search(int[] nums,int target,boolean index)
    // {
    //     int ans=-1;
    //     int start=0;
    //     int end=nums.length-1;
    //     while(start<=end)
    //     {
    //         int mid=start +(end-start)/2;
    //         if(target<nums[mid])
    //         {
    //             end=mid-1;
    //         }
    //         else if(target>nums[mid])
    //         {
    //             start=mid+1;

    //         }
    //         else
    //         {
    //             ans=mid;
    //             if(index==true)
    //             {
    //                 end=mid-1;
    //             }
    //             else
    //             {
    //                 start=mid+1;
    //             }
    //         }
    //     }
    //     return ans;
    // }
}