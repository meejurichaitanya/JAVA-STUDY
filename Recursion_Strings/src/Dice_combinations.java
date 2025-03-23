import java.util.ArrayList;

public class Dice_combinations {
    public static void main(String[] args) {
        int target=4;
        System.out.println(dice_combinations("",target));
    }
    static ArrayList<String> dice_combinations(String p,int target){
        ArrayList<String> ans =new ArrayList<>();
        if (target==0){
            ans.add(p);
            System.out.println("hi");
            return ans;
        }
        for (int i = 1; i <=target ; i++) {
            ans.addAll(dice_combinations(p+i,target-i));
        }
        return ans;
    }
}
