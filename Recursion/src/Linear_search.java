public class Linear_search {
    public static void main(String[] args) {
        int[] arr={1,3,34,55,33,1,76,87};
        int target=76;
       int ans= search(arr,target,0);
       System.out.println(ans);

    }
    static int search(int[] arr, int target,int check){
        if (check>arr.length){
            return -1;
        }
        if (arr[check]==target){
            return check;
        }
        return search(arr,target,check+1);
    }
}
