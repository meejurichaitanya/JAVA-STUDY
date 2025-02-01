public class Search_array {
    public static void main(String[] args) {
        int[]  numbers={1,2,3,3,4,4,22,4};
        System.out.println(numbers);

       System.out.println( search_element(numbers,3));

    }
    static int search_element(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        } return -1;
    }
}