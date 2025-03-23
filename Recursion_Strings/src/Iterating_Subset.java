import java.util.ArrayList;
import java.util.List;

public class Iterating_Subset {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        /*
        our aim is to find the subsets for the given array.
         */
       System.out.println( find_subsets(nums));

    }
    static List<List<Integer>> find_subsets(int[] arr){
        //first we have to create an outer_list to store our subsets
        List<List<Integer>> outerlist =new ArrayList<>();
        //add an empty subset to it initially
        outerlist.add(new ArrayList<Integer>());
        for(int num: arr){
            //we will take the size as similar to the outer list ,because we want to
            //add the current element to the copied subset.
            int n =outerlist.size();
            for (int i = 0; i <n ; i++) {
                //here we will copy the ith subset/sublist from the main outer list
                ArrayList<Integer> internal =new ArrayList<>(outerlist.get(i));
                //after copying the ith subset we can now add the num in the subset.
                internal.add(num);
                //now after adding the num to the copied subset we have to add to the
                //the main/outer list .
                outerlist.add(internal);

            }

        }
        return outerlist;

    }
}
