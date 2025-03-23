import java.util.ArrayList;

public class Find_all_the_indices {
    public static void main(String[] args) {
        int[] arr={1,23,2,45,2};
        find_indices(arr,2,0);
        System.out.println(list);

    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void find_indices(int[] arr, int target,int index){
        if (index==arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        find_indices(arr, target, index+1);
    }
}
