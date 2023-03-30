import java.util.Scanner;
class Fivestudents {
  Scanner s=new Scanner(System.in);
  Object students[]=new Object[5];
  
  public void setStudentDetails() {
    for(int i=0;i<students.length;i++) {
      Student student=new Student();
      System.out.println("Enter RollNo");
      student.setRollno(s.nextInt());
      System.out.println("Enter Name");
      student.setName(s.next());
      System.out.println("Enter Dept");
      student.setDept(s.next());
      students[i]=student;
    }
  }
  public void getStudentDetails() {
    for(int i=0;i<students.length;i++) {
      Student std=(Student)students[i];
      System.out.println("Student "+(i+1)+" details");
      System.out.println("Student Name: "+std.getName());
      System.out.println("Student Email: "+std.getDept());
      System.out.println("Student ID: "+std.getRollno());
    }
  }
}
  class StudentDetails{
  public static void main(String args[]) {
    Fivestudents obj=new Fivestudents();
    obj.setStudentDetails();
    obj.getStudentDetails();
  }
}