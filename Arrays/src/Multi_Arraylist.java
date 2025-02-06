import java.util.ArrayList;
import java.util.Scanner;

public class Multi_Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      ArrayList<ArrayList<Integer>>  nums =new ArrayList<>(8);
      //initialisation:
        for (int i = 0; i < 2; i++) {
            nums.add(new ArrayList<>());

        }

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j <3 ; j++) {
                nums.get(i).add(input.nextInt());

            }System.out.println(nums);

        }//System.out.println(nums);
    }
}
