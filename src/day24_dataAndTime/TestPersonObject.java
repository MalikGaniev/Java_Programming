package day24_dataAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {
    public static void main(String[] args) {
        Person[]people={new Person(),new Person(),new Person(),new Person()};
        people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Michael",'M', LocalDate.of(1990,3,28));
        people[2].setInfo("Malik",'M', LocalDate.of(2003,2,4));
        people[3].setInfo("Ilya",'M', LocalDate.of(2002,7,25));
        ArrayList<Person>teamList=new ArrayList<>();
teamList.addAll(Arrays.asList(people));


        for (Person each : teamList) {
            System.out.println(each.name + " : "+each.dateOfBirth);
        }
        System.out.println("------------------------------------------------");
        // remove all person objects that has the age greater than 55
        teamList.removeIf(p -> p.age > 55 );
        System.out.println(teamList);
    }
}
