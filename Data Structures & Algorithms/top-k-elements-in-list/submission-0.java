class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)-> b[1]-a[1]);
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        map.forEach((key, value)->{ q.add(new int[]{key, value});});
        int[] ans = new int[k];
        for(int i =0; i<k ; i++){
            int[] v= q.poll();
          ans[i]= v[0];
        }
        return ans;
    }
}
