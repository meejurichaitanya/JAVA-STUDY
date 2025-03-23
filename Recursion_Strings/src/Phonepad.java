import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
        String str ="12";
        combinations_Of_dialpad("",str);
        System.out.println(combinations_return("",str));
        System.out.println(combinations_count("",str));

    }
    static void combinations_Of_dialpad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        /*we are extracting the integer value of the current digit from the string
        given , by subtracting the ascii value of character '0' from the current character
        number ascii value .
        -->char 0="48" in Ascii values
        -->char 1="49" in Ascii values....
         */

        int digit=up.charAt(0)-'0';
        /*after extracting the digit , what we have to do is just take a loop and
        iterate through the range of characters that the digit hold in the dail_pad.
         EXAMPLE: 1-->abc|2-->def|3-->ghi|4-->jkl|5-->mno|6-->pqr|7-->stu|8-->vwx|9-->yz

        you can see for every digit the range of the characters are from digit-1*3 to digit*3
          for digit 1= [digits-1*3 to digits*3]--> this range is exclusive .
          how can we get the character using digits range?
          char ch = a+range means:
              for digit 1-->range is from 0 to 3==0,1,2
                to get character we can do a+0=a|a+1=b|a+2=c..

         */
        for (int i = (digit-1)*3; i <(digit*3) ; i++) {
            char ch =(char)('a'+i);
            if (ch=='a'+26){
                break;
            }
            //this will give you char value .
            //if you have abc , you can add a and b and c as processed in different
            //recursive calls.
            combinations_Of_dialpad(p+ch,up.substring(1));

        }

    }
    static ArrayList<String> combinations_return(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        //first step is to convert the character digit to int digit.
        int digit =up.charAt(0)-'0';
        //next step is to iterate a loop for the digit range
        //why we are multiplying with 3 , because every number in dialpad the range is starting
        //with a number that is multiple of 3.
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit-1)*3; i <(digit*3) ; i++) {
            char ch =(char)('a'+i);
            if (ch=='a'+26){
                break;
            }
            ans.addAll(combinations_return(p+ch,up.substring(1)));

        }
        return ans;

    }
    static int combinations_count(String p, String up){
        if (up.isEmpty()){
            return 1;

        }
        int digit =up.charAt(0)-'0';
        int count =0;
        for (int i = (digit-1)*3; i <(digit*3) ; i++) {
            char ch =(char)('a'+i);
            if (ch=='a'+26){
                break;
            }
            count=count+combinations_count(p+ch,up.substring(1));

        }
        return count;

    }
}
