class Solution {
    public String destCity(List<List<String>> paths) { 
        //using hashmap; time O(n); space O(n)
        if(paths.size() == 1){
            return paths.get(0).get(1);
        }
        HashSet<String> out = new HashSet<String>();
        for(int i=0; i < paths.size(); i++){
            out.add(paths.get(i).get(0)); //add source paths into hashset
        }
        for(int j=0; j < paths.size(); j++){
            if(!out.contains(paths.get(j).get(1))){ //if destination is not in source paths
                return paths.get(j).get(1); //return dest (is last)
            }
        }
        return "Error";
        
        /* brute force; time O(n^2); space O(1)
        if(paths.size() == 1){
            return paths.get(0).get(1);
        }
        boolean sourceFound = false;
        for(int i=0; i<paths.size(); i++){ //outer loop, select destination
            sourceFound = false;
            for(int j=0; j<paths.size(); j++){ //inner loop, iterate sources to find no match
                if(paths.get(i).get(1).equals(paths.get(j).get(0))){ //if dest == source
                    sourceFound = true;
                }
            }
            if (sourceFound == false){
                return paths.get(i).get(1);
            }
        }
        return "Error";*/
    }
}