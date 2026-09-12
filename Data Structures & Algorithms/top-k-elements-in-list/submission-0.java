/*1. Count frequencies using HashMap. 
2. Create buckets (size = n + 1). 
3. Put each number into its frequency bucket. 
4. Create result array. 
5. Traverse buckets from back (highest frequency). 
6. Stop after collecting k numbers.*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];

        for(int i=0;i<freq.length;i++){
            freq[i]= new ArrayList<>();
        }

        for(int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for (int i=freq.length-1;i>0&& index <k; i--){
            for(int n:freq[i]){
                res[index++]=n;
                if(index==k){
                    return res;
                }
            }
        }
        return res;
    }
}
