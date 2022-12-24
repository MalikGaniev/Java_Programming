package day25_constructor;

public class ConstructorIntro {
    public ConstructorIntro(){
        System.out.println("object is created by using default constructor");
    }
  public ConstructorIntro(int a){
      System.out.println("object is created by using default constructor");
  }
    public void add(){}
    public static void main(String[] args) {
      ConstructorIntro obj=new ConstructorIntro(10);
      ConstructorIntro obj2=new ConstructorIntro();
     // ConstructorIntro obj3=new ConstructorIntro("Java");
    }
}
