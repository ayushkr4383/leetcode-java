class Solution {
    public int maxArea(int[] height) {
        int i, j, n;
        int maxArea = 0;
        int max=0;
        n = height.length;
        int area=0;
        i = 0;j= n-1;
        while(i<j){
                if(height[i]<height[j]){
                    area = height[i]*(j-i);
                    i++;
                    
                    }
                else{
                    area = height[j]*(j-i); 
                    j--;
                    }
            if(maxArea<area){
                    maxArea = area;
                }
               
                
            }
        return maxArea;
    }
}