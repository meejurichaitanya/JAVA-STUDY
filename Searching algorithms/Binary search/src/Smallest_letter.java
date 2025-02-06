public class Smallest_letter {
    public static void main(String[] args) {
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        char[] arr={'c','f','j'};
       System.out.println( nextGreatestLetter(arr,'a'));
    }
    //my approach,here we've to check if target>=mid,therefore even target==mid we can move start=mid+1
    static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end =letters.length-1;
        if(target>=letters[letters.length-1]){
            return letters[0];
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>=letters[mid]){
                start=mid+1;
            }else end=mid-1;
        }
        return letters[start];

    }
    //kunal's and some better approach
    //here we does'nt use additional(target<=),we check if target<mid first.
    public char nextGreatestLetter1(char[] letters, char target) {
        int start =0;
        int end =letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else start=mid+1;
        }
        return letters[start%letters.length];

    }
}
