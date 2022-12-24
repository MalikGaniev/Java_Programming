package day27_accessModifiers;

public class InstanceIntializationBlock {
    public String name;
    public int age;
/*
    {
        name="James";
        age=20;
    }
*/
    public InstanceIntializationBlock(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        /*
        InstanceIntializationBlock obj1=new InstanceIntializationBlock();

        InstanceIntializationBlock obj2=new InstanceIntializationBlock();
        System.out.println(obj1.name);
        System.out.println(obj2.name);*/
        InstanceIntializationBlock obj=new InstanceIntializationBlock("James",25);

        InstanceIntializationBlock obj2=new InstanceIntializationBlock("Aaron",28);

        System.out.println(obj.name);
        System.out.println(obj2.name);

    }

}
