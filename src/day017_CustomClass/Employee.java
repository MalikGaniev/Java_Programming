package day017_CustomClass;

public class Employee {
    public String name;
    public int age;
    public String jobTitle;
    public double salary;
    public String id;
    public char gender;

    public void setInfo(String name, int age, String jobTitle, double salary, String id,char gender) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.gender=gender;
    }// set all the attributes of the employee objects at once



    public String toString() {// use to avoid getting hashcode when we print employee object
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", gender= "+gender+ '\''+
                '}';
    }

    public void Work(){//its gonna display name of that employee object only
        System.out.println(name+" is working ");
    }
}


