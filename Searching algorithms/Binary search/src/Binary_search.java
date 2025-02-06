import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("enter array elements:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the element you want to search:");
        int target = input.nextInt();
        System.out.println(Bsearch(arr,target));
    }
    static int Bsearch(int[]arr,int search){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==search){
                return mid;
            } else if (search<arr[mid]) {
                end=mid-1;

            }else start=mid+1;
        }
        return -1;
    }
}
