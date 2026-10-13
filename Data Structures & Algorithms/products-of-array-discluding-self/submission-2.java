class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=1;
        int suffix[]=new int[n];
        int s=1;
        suffix[n-1]=1;
        int answer[]=new int[n];
        for (int i=1;i<n;i++){
            prefix[i]=nums[i-1]*prefix[i-1];
        }
        for(int j=n-2;j>=0;j--){
            suffix[j]=nums[j+1]*s;
            s=s*nums[j+1];
        }
        for(int k=0;k<n;k++){
            answer[k]=prefix[k]*suffix[k];
        }
        return answer;
    }
}  
