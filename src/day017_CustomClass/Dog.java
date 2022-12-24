package day017_CustomClass;

public class Dog {
    public String name; // instance variable
    public String breed;
    public String size;
    public String color;
    public int age;
//"Max",   "husky",     "M",     4,  "small",  "White"
    public void setInfo(String name,String breed,char gender,int age,String size,String color){
        this.name=name;//This keyword is used for calling instance variable name
       this.breed=breed;
       this.gender=gender;
       this.age=age;
       this.size=size;
       this.color=color;
        // this method can help us to set all information of the dog at once


    }

  public char gender;

    public void eat(){
        System.out.println(name+" is eating");
    }
public void drink(){
    System.out.println(name+" is drinking water");
}

    public String
    toString() {//to avoid getting hashcodes when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}





