//use file related methods
import java.io.File;
//use to take inputs
import java.util.Scanner;
import java.io.*;
public class shiva {
    private void searchfilefolder()
    {

        // address of files or folder where to search in
        File file = new File("C:\\Users\\hp\\Desktop\\check");
        //string to store the name of the file
        String str;
        Scanner sc = new Scanner(System.in);
        // do while is used to run the program again and again

        do{
            int flag =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            //take input
            str =sc.nextLine();
            //list of file is stored in string
            String[] files = file.list();

            //continous check each file or folder
            for (String string : files){
                //check the name of file present or not and store in boolean str1
                Boolean str1 = str.equals(string);
                // str1 is true than print the following
                if (str1){
                    flag = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath()+"\\"+str);
                }
            }
            //if file not found
            if(flag == 0)
            {
                System.out.println("File not find :check and Re-enter the name of the file.");
            }
        } while(true);
    }


    public static void main(String[] args){
        //object is created
        shiva temp =new shiva();
        //calling function
    1    temp.searchfilefolder();
    }
}
