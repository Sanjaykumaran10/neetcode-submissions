class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int candidate=0;
        int tg=0;
        int cg=0;
        for(int i=0;i<gas.length;i++){
            int c=gas[i]-cost[i];
            tg+=c;
            cg+=c;
            if(cg<0){
                candidate=i+1;
                cg=0;
            }
        }
        if(tg>=0){
            return candidate;
        }
        else{
            return -1;
        }
    }
}
