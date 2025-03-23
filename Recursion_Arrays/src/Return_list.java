import java.util.ArrayList;

public class Return_list {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,3,4,5};
        int target=4;
        ArrayList<Integer> list = new ArrayList<>();
       ArrayList<Integer> ans =find_all_indices(arr,target,0,list);
       System.out.println(ans);
       System.out.println(list);

    }
    static ArrayList<Integer> find_all_indices(int[] arr,int target,int index,ArrayList<Integer> list){
        if (index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return find_all_indices(arr, target, index+1, list);
    }
}
