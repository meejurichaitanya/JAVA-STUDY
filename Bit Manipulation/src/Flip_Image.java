import java.util.Arrays;

public class Flip_Image {
    public static void main(String[] args) {
         int[][] image={
                {1,0,1},
                {0,0,1},
                {1,1,1}
         };
      System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            for(int i=0;i<=(row.length-1)/2;i++){
                int temp=row[i]^1;
                row[i]=row[row.length-1-i]^1;
                row[row.length-1-i]=temp;
            }
        }
        return image;
    }
}
