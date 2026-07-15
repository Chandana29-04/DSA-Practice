package Arrays;
//Container with most water leetcode poblem
public class ContainerWithMostWater {
    public static int MaximunWater(int height[]){
        int start=0;
        int end=height.length-1;
        int maxWater=0;

        while(start<end){
            int h=Math.min(height[start],height[end]);//height
            int w=end-start;//width
            int currWater=h*w;//current water level
            maxWater=Math.max(currWater,maxWater);

            if(height[start]<height[end]){
                start++;

            }else{
                end--;
            }
        }   
        return maxWater;
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.err.println("maximun water container can store is  "+MaximunWater(height));
    }
}
