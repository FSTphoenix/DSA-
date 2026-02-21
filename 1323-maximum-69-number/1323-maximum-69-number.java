class Solution {
    public int maximum69Number (int num) {
        
        int temp = num;
        int multiplier = 1;
        int changePos = -1;

        
        while(temp > 0) {
            if(temp % 10 == 6) {
                changePos = multiplier;
            }
            temp /= 10;
            multiplier *= 10;
        }

        
        if(changePos != -1) {
            num += 3 * changePos;   
        }

        return num;
    }
}