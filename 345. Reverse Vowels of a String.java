//345. Reverse Vowels of a String
class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        String vowels="aeiouAEIOU";
        while(i<j)
        {
            while(i<j && vowels.indexOf(arr[i])==-1)
            {
                i++;
            }
            while(i<j && vowels.indexOf(arr[j])==-1)
            {
                j--;
            }
            
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
         String output=new String(arr);
            return output;
    }
}
