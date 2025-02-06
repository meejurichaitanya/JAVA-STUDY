import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/richest-customer-wealth/
public class Richest_customer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] accouts=new int[3][3];
        for (int i=0;i<accouts.length;i++){
            for (int j = 0; j < accouts[i].length; j++) {
                accouts[i][j]=input.nextInt();
            }

        }


        for (int[] i :accouts) {
            System.out.println(Arrays.toString(i));

        }
        System.out.println(Arrays.toString(maximumWealth(accouts)));
    }
     static int[] maximumWealth(int[][] accounts) {
        int max=0;

        int maxrow=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int rowsum =0;
            for(int j=0;j<accounts[i].length;j++){
                rowsum=rowsum+accounts[i][j];
            }
            if(rowsum>max){
                max=rowsum;
                maxrow=i;
            }
        }return new int[]{max,maxrow};


     }
}
