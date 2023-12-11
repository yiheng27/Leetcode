class Solution {
    public int findSpecialInteger(int[] arr) {
        int appear = arr.length/4;
        int integer = 0;
        for(int i=0; i<arr.length; i++){
            
            if (integer != arr[i]){ //if different integer
                integer = arr[i];
                //System.out.println(integer);
                if ( (i+appear) < arr.length){ //check 25% is within arr
                    if (arr[i+appear] == integer){ //check if >25%
                        return integer;
                    }

                }
                else{ //out of bounds, no 25%
                    return -1;
                }
            }
            else{ //same integer, go next
                continue;
            }
        }
        return -1;
    }
}
