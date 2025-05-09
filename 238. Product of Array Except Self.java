class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] out=new int[n];
        int ProdR=1;//store left product
        int ProdL=1;//store right product
      //Right product
       for(int i=n-1;i>=0;i--){
            out[i]=ProdR;
            ProdR=ProdR*nums[i];
       }
      //Left Product
       for(int i=0;i<n;i++){
        out[i]=out[i]*ProdL;
        ProdL=ProdL*nums[i];
       }
        return out;
    }
}
