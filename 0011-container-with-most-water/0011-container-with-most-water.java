class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int maxArea=0;
       while(left<right){
        int width=right-left;
        int currHeight=Math.min(height[right],height[left]);
        int area=width*currHeight;
        maxArea=Math.max(maxArea,area);
        if (height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
       }
     return maxArea;
        
    }
    
}