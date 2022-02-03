package assignment11;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class hashmaps {
    private void help(String filenm)
    {
        try {
            FileReader file=new FileReader(filenm);
            BufferedReader reader=new BufferedReader(file);
            String line=reader.readLine();

            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<line.length();i++)
            {
                if(map.containsKey(line.charAt(i)))
                {
                    int v=map.get(line.charAt(i));
                    v=v+1;
                    map.put(line.charAt(i),v);
                }
                else
                {
                    map.put(line.charAt(i),1);
                }
            }
            for (Character ss : map.keySet()) {

                    System.out.println("Character: "+ss);
                    System.out.println("No. of occurences: "+map.get(ss));

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







    public static void main(String[] args)
    {
        hashmaps obj=new hashmaps();
        Scanner sc=new Scanner(System.in);
        obj.help(sc.nextLine());

    }
}
