import java.util.ArrayList;

public class Add_lists {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,2,4,2};
        int target=2;
        ArrayList<Integer> ans =find_indices(arr,target,0);
        System.out.println(ans);

    }
    /*
    without passing list in the argument how to return the list , we know if we
    create list in body, it mean it will create the list in every function call
    Then How to do it?
     */
    //this was not that optimized than previous because it creates a new arraylist
    //in every function call, so most of the times previous approach is preferred.
    //But we can see problems of this type so we are learning this concept
    static ArrayList<Integer> find_indices(int[] arr, int target, int index ){
        ArrayList<Integer> list = new ArrayList<>();
        if (index== arr.length){
            return list;
        }
        //this will add the answer in this functions list only ,if and only the
        //answer is available.
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=find_indices(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
