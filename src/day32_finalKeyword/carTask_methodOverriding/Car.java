package day32_finalKeyword.carTask_methodOverriding;

public class Car {
    private String make,model,color;
    private double price;
    public static int numberOfWheels;
    public static boolean hasBattery;
    private int year;

    public Car( String model, String color, double price, int year) {
     setMake(getClass().getSimpleName());//setting the class name to the make of the car
     setModel(model);
     setColor(color);
     setPrice(price);
     setYear(year);
    }
static {
        numberOfWheels=4;
        hasBattery=true;
}
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){//if argument is negative or zero
            System.out.println("Invalid price: "+price);
            System.exit(1);//exit the program
        }
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<1){//if argument is negative or zero
            System.err.println("Invalid year: "+year);
            System.exit(1);//exit the program
        }
        this.year = year;
    }

public void start(){
    System.out.println("Press the break first and twist the key to ignition to start "+make+" "+make);
}

    @Override
    public String toString() {
        return make+"" +
                " model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", price=" + getColor() +
                ", year=" + getYear() +
                ", number of wheels=" + numberOfWheels +
                ", has battery=" + hasBattery +
                '}';
    }
}

/*
1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)
            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero
            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name
            Methods:
                start(): "Press the brake and twist the key to ignition"
                toString()
 */
