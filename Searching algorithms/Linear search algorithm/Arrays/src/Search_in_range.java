import java.util.Scanner;

public class Search_in_range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,565,6,762,33,224,44};
        System.out.print("enter the index of range start:");
        int start = input.nextInt();
        System.out.print("enter the index pf range end:");
        int end= input.nextInt();
        System.out.print("enter the number you want to search:");
        int search=input.nextInt();
        System.out.println(search_range(arr,start,end,search));

    }
    static int search_range(int[]arr,int start,int end,int search){
        for (int i =start; i <=end ; i++) {
            if(arr[i]==search){
                return i;
            }

        }return -1;
    }
}
