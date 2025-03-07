public class Find_ApowerB {
    public static void main(String[] args) {
        int base =2;
        int power =5;
        int ans =1;
        while (power>0){
            if ((power&1)==1){
                ans=ans*base;
            }
            power=power>>1;
            base=base*base;
        }
        System.out.println(ans);
    }
}
