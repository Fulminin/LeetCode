import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int currCount = 0;
        for(int point = 0; point < s.length(); point++){
            currCount++;
            for(int check = point + 1; check < s.length(); check++){
                if(s.charAt(check) == s.charAt(point)){
                    if(maxLength <= currCount){
                        maxLength = currCount;
                    }
                    currCount = 0;
                    break;
                }
                else{
                    currCount++;
                }
            }
        }
        return maxLength;
    }
}

// needto try different approch