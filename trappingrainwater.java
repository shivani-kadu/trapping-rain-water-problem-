public class trappingrainwater {
      //make a function 
      public static int trappedrainwater(int height[]){
            int  n=height.length;

         //calculate left max boundry -array
         int leftMax[]=new int[ n] ;
          leftMax[0]=height[0];
          for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
          };

         //caclulate right max boundry -array 
         int rightMax[]=new int [n];
         rightMax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
         }


         int trapppedWater=0;
         //loop
         for(int i=0;i<n;i++){
            //water level = min(leftmax boudry ,right max boundry ); 
           int  waterLevel=Math.min(leftMax[i], rightMax[i]);
         

           //water level = min(leftmax boudry ,right max boundry ); 
           trapppedWater+=waterLevel-height[i];
         }
         return trapppedWater;
         
         //trappped water=water level -height[]

      }
      public static void main(String []args){
            int height[]={4,2,0,6,3,2,5};
          System.out.println(trappedrainwater(height));  
      }
      
}
