package stacksAndQueues;

public class Solution {
    static public boolean canCross(int[] stones) {
        
        boolean canJump = true;
        
        if(stones[0] != 0 || stones[1] != 1){
            return false;
        }
        
        int maxJump = 2;
        int minJump = 0;
        int midJump = 1;
        
        for(int i = 1 ; i < stones.length - 1; i++){
        
            int diff = stones[i+1] - stones[i];
            System.out.println();
            System.out.print("Difference : " + diff + " ");
            System.out.print("Max Jump : " + maxJump + " ");
            System.out.print("Min Jump : " + minJump + " ");
            System.out.println("Mid Jump : " + midJump );
            //&& (diff >= minJump) && (diff == midJump)
            if((diff == maxJump) || (diff == midJump) || (diff == minJump)){
                System.out.println("Current " + diff);
            	midJump = diff;
                minJump = midJump-1;
                maxJump = midJump + 1;
            } else {
                return false;
            }
        
            
            
        }
        return true;
    }
    
    public static void main(String args[]){
    	//int array[] = {0,1,3,5,6,8,12,17};
    	//int array[] = {0,1,2,3,4,8,9,11};
    	//int array[] = {0,1,3,6,10,13,15,16,19,21,25};
    	int array[] = {0,1,3,6,10, 13, 15, 18};
    	
    	System.out.println(canCross(array));
    }
}
