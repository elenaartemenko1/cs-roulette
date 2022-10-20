package money.make.cs.utils;

public class User {
  private String name;
  private String surname;
  private int age;

  private String access;

  public User(String name, String surname, int age, String access){
    this.name=name;
    this.surname=surname;
    this.age=age;
    this.access=access;
  }
 public int getAge (){
    return this.age;

 }
 public String getAccess(){
    return this.access;
 }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}


