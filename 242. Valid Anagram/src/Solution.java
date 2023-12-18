class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i =0; i<s.length(); i++){
            count[s.charAt(i)- 'a']++;
        }
        for(int j =0; j<s.length(); j++){
            count[t.charAt(j)- 'a']--;
        }
        for(int k =0; k<count.length; k++){
            if(count[k] != 0){
                return false;
            }
        }
        return true;
    }
}