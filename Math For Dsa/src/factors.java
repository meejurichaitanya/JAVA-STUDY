import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        factors3(36);

    }
    //O(n)
    static void factors(int n){
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
              System.out.println(i);
            }

        }
    }
    //O(root n)
    static void factors2(int n){
        for (int i = 1; i*i<=n ; i++) {
            if (n%i==0){
                if (n/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
            //here it is not giving the sorted order of factors (smallest number,largest number
            //second smallest number, second largest number....)

        }
    }
    //factors in sorted order
    static void factors3(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i*i <=n ; i++) {
            if (n%i==0){
                if (n/i==i){
                    System.out.print(i+" ");
                }else {
                   System.out.print(i+" ");
                   list.add(n/i);
                }
            }

        }
        //we are printing the last number in the list first because we know that first
        //the largest divisors will go into list which means in descending order , we need
        //sorted so we print from smallest element first which is in last of the list.
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");

        }
    }
}
