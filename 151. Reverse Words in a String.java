//151. Reverse Words in a String
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        String output="";
       for (int i = arr.length - 1; i > 0; i--) {
            
            output += arr[i] + " ";
        }
         return output+arr[0];
    }
}
