class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1}; // creating array to store results
        int testNum = 0; // creating integer to store the number being tested
        int check = 0;
        int test = 0;
        // iterating over each element in the  nums array 
        for(check = 0; check < nums.length; check++){
            testNum = target - nums[check]; // determining the number we need to finding

            // checkin each number in array to see if it matches the testNum
            for(test = check+1; test < nums.length; test++){
                // checking to see if the number is the one we are searching for
                if(nums[test] == testNum){
                    result[0] = test;
                    result[1] = check;
                    break;
                }
                
            }
        }
        return result;
    }
}