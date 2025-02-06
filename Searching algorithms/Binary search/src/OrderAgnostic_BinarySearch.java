import java.util.Scanner;

public class OrderAgnostic_BinarySearch {
    public static void main(String[] args) {
        int[] arr ={-8,-5,-3,-1,1,2,3,5,12,22,23,34,42};
        int[] arr1={9,8,7,6,5,4,3,2,1};
        Scanner input = new Scanner(System.in);
        /*System.out.print("enter a number:");
        int target=input.nextInt(); */
        int target;
        System.out.println(binary_search(arr1,10));

    }
    static int binary_search(int[] arr,int search){
        int start =0;
        int end =arr.length-1;
        boolean isAsc=arr[end]>arr[start];

        while (start<=end){
            int mid = start + (end-start)/2;
            if(search==arr[mid]){
                return mid;
            } else if (isAsc) {   //ascending order
                if(search<arr[mid]){
                    end=mid-1;
                }else start=mid+1;


            }else     //statements for descending order
                if (search<arr[mid]){
                    start=mid+1;
                }else end=mid-1;
        }
        return -1;//if the element is not found return -1;
    }
}