import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
    int id;
    String name;
    int age;
    String gender;
    String dept;
    int year;
    double ptd;
  Student(int id,String name, int age,String gender,String dept, int year,double ptd)
  {
      this.id=id;
      this.name=name;
      this.age=age;
      this.gender=gender;
      this.dept=dept;
      this.year=year;
      this.ptd=ptd;
  }
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age + '\'' +
//                ",dept=" + dept +
//                '}';
//    }

//    static void help(ArrayList<Student> list)
//
//    {
//        ArrayList<Student> ans=list.stream()
//                .filter(itr ->list.dept).collect(Collectors.toList());
//
//    }
    public String getdept()
    {
        return this.dept ;
    }
    public String getname()
    {
        return this.name;
    }
    public int getyear()
    {
        return this.year;
    }
    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEngDepartment() {
        return dept;
    }

    public void setEngDepartment(String engDepartment) {
        this.dept = engDepartment;
    }

    public int getYearOfenrollment() {
        return year;
    }

    public void setYearOfenrollment(int yearOfenrollment) {
        this.year = yearOfenrollment;
    }

    public double getPerTillDate() {
        return ptd;
    }

    public void setPerTillDate(double perTillDate) {
        ptd = perTillDate;
    }

    public static void Task2(ArrayList<Student> studentList)
    {
        //2. Get the names of all students who have enrolled after 2018
        studentList.stream().filter(x -> x.getYearOfenrollment()>2018).map(x -> x.getname()).forEach(x -> System.out.println(x));
    }
    public static void Task3(ArrayList<Student> studentList)
    {
        //3. Get the details of all male student in the computer sci department?
        studentList.stream().filter(x -> x.getEngDepartment().equals("Computer Science") && x.getGender().equals("Male")).map(x -> x.getname()).forEach(x -> System.out.println(x));
    }
    public static void Task4(ArrayList<Student> studentList)
    {
        //4. How many male and female student are there ?
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }
    public static void Task5(ArrayList<Student> studentList)
    {
        //5. What is the average age of male and female students?
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge))));
    }
    public static void Task6(ArrayList<Student> studentList)
    {
        //6.    Get the details of highest student having highest percentage ?
        Double highestPerc=studentList.stream().map(x->x.getPerTillDate()).max(Double::compare).get();
        System.out.println(highestPerc);
        studentList.stream().filter(x->x.getPerTillDate()==highestPerc).map(x-> Arrays.asList(x.getId(),x.getname(),x.getAge(),x.getGender(),x.getEngDepartment(),x.getYearOfenrollment())).forEach(x-> System.out.println(x));
    }
    public static void Task7(ArrayList<Student> studentList)
    {
        //7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
        System.out.println( studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting())));

    }
    public static void Task8(ArrayList<Student> studentList)
    {
        //    8. What is the average percentage achieved in each department?
        System.out.println( studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate))));
    }
    public static void Task9(ArrayList<Student> studentList)
    {
        //   9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
        System.out.println(studentList.stream().filter(x->x.getEngDepartment()=="Electronic"&&x.getGender().equals("Male")).collect(Collectors.minBy(Comparator.comparing(Student::getAge))));
    }
    public static void Task10(ArrayList<Student> studentList)
    {
        //    10.How many male and female students are there in the computer science department?
        System.out.println(studentList.stream().filter(x->x.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }


  public static void main(String[] args) {
      ArrayList<Student> list = new ArrayList<>();
      list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));

      list.add(new Student(122, "Paul Niksui", 18, "Male", "Mec", 2016, 50.2));
      list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
      list.add(new Student(144, "Murali Gowda", 18, "Male","Electrical",2018, 80.00));
      list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
      list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
      list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
      list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
      list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
      list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
      list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
     list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
      list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
      list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
      list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
      list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric" , 2019, 72.4));
      list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

//      System.out.println(list.toString());
//      for(int i=0;i< list.size();i++) {
//          System.out.println(list.get(i).dept);
//      }
//      ArrayList<Student> ans=list.stream()
//               .filter(itr ->list.getdept(itr)).collect(Collectors.toList());
//     help(list);

      // TASK 1 STARTED FROM HERE
      List<String> ans = list.stream().map(Student::getdept).distinct().collect(Collectors.toList());
      System.out.println(ans);
      // TASK 1 Completed

      // TASK 2 STARTED FROM HERE
//      List<String> ans = list.stream().map(Student::getname)
//              .distinct()
//              .map(Student ::getyear)
//              .distinct().collect(Collectors.toList());
      Task2(list);
      Task3(list);
      Task4(list);
      Task5(list);
      Task6(list);
      Task7(list);
      Task8(list);
      Task9(list);
      Task10(list);







  }



}
