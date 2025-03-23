import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate_Subsets {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(subsets_Duplicate(nums));
    }
    static List<List<Integer>> subsets_Duplicate(int[] arr){
        //to create subsets in duplicates first we have to put all the duplicates together
        //if they are not together how can we find a number is duplicate or not it will be so
        //complicated so first we need to sort the array to put the duplicates together
        Arrays.sort(arr);
        /*our first step will be creating a list that can store sub_lists of integer values
         and just add an empty sub list initially.
         */
        List<List<Integer>> outer_list=new ArrayList<>();
        outer_list.add(new ArrayList<Integer>());
        //initially we take start =0 and as well end =0.
        int start =0;
        int end =0;
        //here we are taking normal forloop instead of advanced one like
        for (int i=0;i<arr.length;i++){
            start =0;
            if(i>0&&arr[i]==arr[i-1]){
                //this means when we find a duplicate
                start=end+1;
            }
            end=outer_list.size()-1;
            int n =outer_list.size();
            for (int j = start; j <n ; j++) {
                /*if the element is not duplicate we will take start from zero and take the relevant
                sub-list from the outer-list and we will put the current element in that list.

                BUT WHEN WE FOUND DUPLICATES:we have to just have to copy the new current element, to that
                lists which are created newly in previous level.(I mean which we copied in previous level
                and added element to it) we just only add the duplicate to it.
                 */
                ArrayList<Integer> internal_list =new ArrayList<>(outer_list.get(j));
                //now we got our relevant outer_list now we just have to add element to it.
                //then add the internal_list to outer_list.
                internal_list.add(arr[i]);
                outer_list.add(internal_list);




            }

        }
        return outer_list;

    }
}
