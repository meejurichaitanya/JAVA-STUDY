import java.util.ArrayList;
import java.util.Arrays;

public class Practice_2 {
    public static void main(String[] args) {
        int[] arr={7,6,5,4,3,2,1};
        //sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
        quicksort(arr,0,arr.length-1);
        System.out.println("reversed array:");
       System.out.println(Arrays.toString(arr));
       String str ="abc";
       System.out.println("Subsets by taking list in function body:");
       System.out.println(find_subset("",str));
       ArrayList<String> ans =new ArrayList<>();
       System.out.println("Subsets taking list as an argument:");
       find_subsets_2("",str,ans);
       System.out.println(ans);
       System.out.println("Permutations:");
       System.out.println(permutations("",str));
       System.out.println("Permutations taking list as an argument");
       ArrayList<String> list =new ArrayList<>();
       permutations2("",str,list);
       System.out.println(list);
       System.out.println("Subsets for an array using iteration");
       int[] nums={1,2,3};
       System.out.println(Iteration_subsets(nums));
       System.out.println("Subsets when you have duplicates:");
       int[] nums2={2,1,2};
       System.out.println(Subsets_for_duplicates(nums2));



    }
    //two sum when the given array is sorted
    public int[] twoSum(int[] nums, int target) {
        sort(nums,0,nums.length);
        //after we have sorted the array just check find the numbers that can add the target element through a simple binary search.
        for(int i=0;i<nums.length;i++){
            int search = binarysearch(nums, target-nums[i]);
            if(search != -1){
                return new int[]{i,search};
            }


        }
        return new int[]{-1,-1};
    }

//merge sort
    static void sort(int[] arr, int start, int end){
        if(end-start==1){
            return;
        }
        int mid =start+(end-start)/2;
        sort(arr,start,mid);
        sort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr, int start, int mid, int end ){
        int[] mix=new int[end-start];
        int i=start;
        int j=mid;
        int index=0;
        while(i<mid&&j<end){
            if(arr[i]<arr[j]){
                mix[index]=arr[i];
                i++;
            }else {
                mix[index]=arr[j];
                j++;
            }
            index++;
        }
        while(i<mid){
            mix[index]=arr[i];
            i++;
            index++;
        }
        while(j<end){
            mix[index]=arr[j];
            j++;
            index++;
        }
        //By far now all the elements are added to the mixed array i mean temporary array.
        //so what we are gonna do is to just add those mixed array values to the original array starting from start.
        for(int k=0;k<mix.length;k++){
            arr[start+k]=mix[k];
        }
    }
    //Binary Search
    static int binarysearch(int[] nums, int target){
        int start=0;
        int end =nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target<nums[mid]){
                end = mid-1;
            }start = mid+1;
        }
        return -1;
    }
    //Quick sort
    static void quicksort(int[] arr,int low, int high){
           if (low>=high){
               return;
           }
           int start =low;
           int end =high;
           int mid=start+(end-start)/2;
           int pivot =arr[mid];
           while(start<=end){

               while(arr[start]<pivot){
                   start++;
               }
               while(arr[end]>pivot){
                   end--;
               }
               //when this condition breaks swap them only when start end bot crossed each other
               if (start<=end){
                   int temp=arr[start];
                   arr[start]=arr[end];
                   arr[end]=temp;
                   start++;
                   end--;
               }
           }
           quicksort(arr,low,end);
           quicksort(arr,start,high);
    }
    //Finding the subsets
    static ArrayList<String> find_subset(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> right=find_subset(p,up.substring(1));
        ArrayList<String> left=find_subset(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }
    //subsets finding taking list in the parameter.
    static void find_subsets_2(String p, String up,ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return;

        }
        char ch = up.charAt(0);

         find_subsets_2(p + ch, up.substring(1),list);
        find_subsets_2(p, up.substring(1),list);
    }
    //permutations returning arraylist by taking list in the function call
    static ArrayList<String> permutations(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            //finding before elements for adding characters
            String first =p.substring(0,i);
            String second=p.substring(i,p.length());
            ans.addAll(permutations(first+ch+second,up.substring(1)));
        }
        return ans;
    }
    //permutations taking list in the argument
    static void permutations2(String p, String up,ArrayList<String> ans){
        if (up.isEmpty()){
            ans.add(p);
            return;

        }
        char ch =up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            //finding before elements for adding characters
            String first =p.substring(0,i);
            String second=p.substring(i,p.length());
            permutations2(second+ch+first,up.substring(1),ans);
        }

    }
    static ArrayList<ArrayList<Integer>> Iteration_subsets(int[] arr){
        //initially arraylist is empty with only one empty sub-list.
        ArrayList<ArrayList<Integer>> outerlist= new ArrayList<>();
        outerlist.add(new ArrayList<>());
        for (int num : arr){
            int n = outerlist.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> innerlist=new ArrayList<>(outerlist.get(i));
                innerlist.add(num);
                outerlist.add(innerlist);
            }

        }
        return outerlist;

    }
    static ArrayList<ArrayList<Integer>> Subsets_for_duplicates(int[] nums){
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> outer_list =new ArrayList<>();
        outer_list.add(new ArrayList<>());
        int start=0;
        int end =0;
        for (int i = 0; i < nums.length ; i++) {
            start =0;
            if (i>0&&nums[i]==nums[i-1]){
             start=end+1;
            }
            end=outer_list.size()-1;
            int n =outer_list.size();
            for (int j = start; j <n ; j++) {
                ArrayList<Integer> inner_list=new ArrayList<>(outer_list.get(j));
                inner_list.add(i);
                outer_list.add(inner_list);

            }
        }
        return outer_list;

    }
}

