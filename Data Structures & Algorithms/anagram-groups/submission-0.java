class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i =0; i<strs.length; i++){
            int[] val= new int[26];
            for(int j =0; j<strs[i].length(); j++){
                val[strs[i].charAt(j) -'a']++;
            }
            String Key = Arrays.toString(val);
            if(!map.containsKey(Key))map.put(Key, new ArrayList<>());
             map.get(Key).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
}
