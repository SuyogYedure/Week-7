class Student{
  int rollno;
  String name;
  String dept;

public void setName(String name){
  this.name = name;
  }
public String getName(){
    return name;
  }
public void setRollno(int rollno){
  this.rollno = rollno;
}
public int getRollno(){
  return rollno;
}
public void setDept(String dept){
  this.dept = dept;
}
public String getDept(){
  return dept;
}
}
class StudentDemo{
  public static void main(String args[]){
    Student s1 = new Student();
    s1.setName("Suyog");
    s1.setRollno(1254);
    s1.setDept("Mech");
    System.out.println(s1.getName());
    System.out.println(s1.getRollno());
    System.out.println(s1.getDept());
  }
}