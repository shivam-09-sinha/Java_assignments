import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ping {

    public static void ping(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));


            String s = "";
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String ip_address;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        ip_address = sc.nextLine();
        ping("ping: " + ip_address);
    }
}
