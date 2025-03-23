public class Linear_search {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,6,7,8};
        int target=10;
        System.out.println(search2(nums,target,0));

    }

    //for checking if the array is present in the array or not
    static boolean search2(int[] arr, int target, int index){
        if (index==arr.length){
            return false;
        }
        return arr[index]==target||search2(arr,target,index+1);
    }



//my approach for finding the element in the array

    static int search(int[] arr,int target){
        return helperFind(arr,target,0);
    }
    static int helperFind(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }else return helperFind(arr,target,index+1);
    }

    //if we want to search from last
    static int helperFind_last(int[] arr,int target,int index){
        if(index<0){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }else return helperFind_last(arr,target,index-1);
    }

}
