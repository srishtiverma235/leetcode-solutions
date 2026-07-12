class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean[]visited=new boolean[nums.length];
        backtrack(0,nums,visited,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int index,int[]nums,boolean[] visited,List<Integer>current,List<List<Integer>>ans){
        if(current.size()==nums.length){
            ans.add(new ArrayList<>(current)) ;
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i])
            continue;
            current.add(nums[i]);
            visited[i]=true;
            backtrack(i,nums,visited,current,ans);
            current.remove(current.size()-1);
            visited[i]=false;
            
        }
    }
}