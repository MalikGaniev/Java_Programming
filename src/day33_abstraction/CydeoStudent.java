package day33_abstraction;

import day32_finalKeyword.Person.Person;

import java.time.LocalDate;

public final class CydeoStudent extends Person {
    private  final String id;
    private String batchName;
    private int batchNumber;
    private static  final String programingLanguage;
    static {
        programingLanguage="Java";
    }

    public CydeoStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if(getAge()<18){
            System.err.println("Cydeo student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
       setBatchName(batchName);
       setBatchNumber(batchNumber);
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if(!(batchName.equalsIgnoreCase("Zero to Hero")||batchName.equalsIgnoreCase("Alumni Dev"))){
            System.err.println("Invalid batch name: "+batchName);
            System.exit(1);
        }
        this.batchName = batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<1){
            System.err.println("Invalid batch number: "+batchNumber+"\n"+"Batch number can not be less than zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+programingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking "+programingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }

    @Override
    public String toString() {
        return super.toString()+
                ", id ="+id+
                ", batchName= "+batchName+
                ", Batch number= "+batchNumber;
    }
}


/*
1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)
			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative
			Override the eat() & drink() methods and include the programmingLanguage variable in methods body
			Override the toString Method and include the id, batchName, batchNumber variables
 */
