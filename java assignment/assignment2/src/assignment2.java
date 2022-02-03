import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        boolean arr[]=new boolean[26];
        int k = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') {
                k = str.charAt(i) - 'a';
            }
            arr[k] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (arr[i] == false)
                flag = 0;
        }

        if (flag == 1)
            System.out.println("The input string contain all the characters ");
        else
            System.out.print("The input string does not contain all the characters  ");
    }//s
}
