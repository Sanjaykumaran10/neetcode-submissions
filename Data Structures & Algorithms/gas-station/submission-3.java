class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int min=Integer.MAX_VALUE;
        int b=0;
        int idx=0;
        for(int i=0;i<gas.length;i++){
            b=b+gas[i]-cost[i];
            if(b<min){
                min=b;
                idx=i;
            }
        }
        if(b<0){
            return -1;
        }
        return (idx+1)%gas.length;
    }
}
