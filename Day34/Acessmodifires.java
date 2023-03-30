class Data{
  private String name;

  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
}
public class Acessmodifires{
  public static void main(String args[]){
    Data obj = new Data();
    obj.setName("bitLabs");
    System.out.println(obj.getName());
  }
}