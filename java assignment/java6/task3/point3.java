package task3;

public class point3 {

    public point3(String string) {

        System.out.println(string);
    }

    public static void main(String[] args) {
        //create array of object
        point3 arr[]=new point3[3];

        //assign object to the array
        arr[0]=new point3("Shiva");
        arr[1]=new point3("om");
        arr[2]=new point3("tri");

        //display object data
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
