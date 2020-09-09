package Lab2;
import java.lang.*;
public class book {
    private double R;
    private String color;
    public book(double R, String color) {
        this.R = R;
        this.color = color;
    }
    public book(double R) {
        this.R = R;
    }
    public double getR() {
        return R;
    }
    public void setR(double R) {
        this.R = R;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Book{"+
                "R = "+R+
                ", color = '"+color+'\''+
                '}';
    }
}
