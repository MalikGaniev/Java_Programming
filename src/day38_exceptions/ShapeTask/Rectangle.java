package day38_exceptions.ShapeTask;

public class Rectangle {
    private int width;
    private int lenght;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width<=0){
            throw new InvalidShapeException("Invalid width "+width);
        }
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        if(width<=0){
            throw new InvalidShapeException("Invalid lenght"+lenght);
        }
        this.lenght = lenght;
    }

    public Rectangle(int width, int lenght) {
        setWidth(width);
        setLenght(lenght);
    }
}
