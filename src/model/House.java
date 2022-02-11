package src.model;

import java.math.BigDecimal;

/**
 * @author anilakdemir
 */
public abstract class House {

    private BigDecimal price;
    private int numberOfHall;
    private int numberOfRoom;
    private double area;

    public House () {

    }


    public BigDecimal getPrice () {
        return price;
    }

    public void setPrice (BigDecimal price) {
        this.price = price;
    }

    public int getNumberOfHall () {
        return numberOfHall;
    }

    public void setNumberOfHall (int numberOfHall) {
        this.numberOfHall = numberOfHall;
    }

    public int getNumberOfRoom () {
        return numberOfRoom;
    }

    public void setNumberOfRoom (int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public double getArea () {
        return area;
    }

    public void setArea (double area) {
        this.area = area;
    }
}
