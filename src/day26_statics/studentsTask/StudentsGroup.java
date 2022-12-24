package day26_statics.studentsTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {//StudentGroup HAS A Student
    public String groupName;
    public int groupId;
    public ArrayList<Student>students=new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
    }public void addStudent(Student student){//Takes one student object and adds it to the arrayList of students
        students.add(student);
    }//takes one student object,and adds it to the arrayList of student
    public void addStudent(String name,int age,char gender,String id){
        //Takes,name,age,gender,id of student,creates student object
        Student student=new Student(name,age,gender,id);
        students.add(student);
    } //takes name,age,gender,id of student info creates students
    public void removeStudent(String id){
        students.removeIf(p->p.id.equals(id));

    }//takes the id and then removes the student object with the special
public void addStudent(Student[]students){
        this.students.addAll(Arrays.asList(students));
}//
    //takes one array of students and adds the array of students to the arrayList of student
    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */