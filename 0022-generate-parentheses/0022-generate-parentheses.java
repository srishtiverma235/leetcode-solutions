class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        backtrack(0,0,n,new StringBuilder(),ans);
        return ans;
        
    }
    private void backtrack(int open,int close,int n,StringBuilder current,List<String>ans){
        if(current.length()==2*n){
            ans.add(current.toString());
            return;
        }
        if(open<n){
            current.append('(');
            backtrack(open+1,close,n,current,ans);
            current.deleteCharAt(current.length()-1);
        }
        if(open>close){
            current.append(')');
            backtrack(open,close+1,n,current,ans);
            current.deleteCharAt(current.length()-1);
        }
    }
}