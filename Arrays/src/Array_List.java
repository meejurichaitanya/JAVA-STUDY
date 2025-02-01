import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums= new ArrayList<>();
        for (int i=0;i<5;i++){
             nums.add(input.nextInt());
        }
        nums.add(9);
        System.out.println(nums);
        System.out.println(nums.contains(1));
        nums.add(7);
        nums.remove(0);
        nums.set(5,7);
        nums.get(3);
        System.out.println(nums);


    }
}
