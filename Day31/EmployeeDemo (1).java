class Employee{
  String name;
  int id;
  double salary;

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return id;
  }
  public void setSalary(double salary){
    this.salary = salary;
  }
  public double getSalary(){
    return salary;
  }
}
class EmployeeDemo{
  public static void main(String args[]){
    Employee e = new Employee();
    e.setName("XYZ");
    e.setId(100);
    e.setSalary(100000);
    System.out.println(e.getName());
    System.out.println(e.getId());
    System.out.println(e.getSalary());
  }
}