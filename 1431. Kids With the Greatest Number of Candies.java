//1431. Kids With the Greatest Number of Candies
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies=0;
         // Find out the greatest number of candies among all the kids.
        for(int candy:candies){
            maxCandies=Math.max(candy,maxCandies);
        }
          // For each kid, check if they will have greatest number of candies
        // among all the kids.
        List<Boolean> output=new ArrayList<>();
        for(int candy:candies){
            output.add(candy+extraCandies>=maxCandies);
        }
        return output;
    }
}
