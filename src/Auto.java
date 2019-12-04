

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Objects;
/***********************************************************************************************************************
 * CIS 162 Project 4
 * Auto class that creates the information for each of the autos
 *
 * @author Keilani Bailey and Shayla Hinkley
 * @version Project 4: December 4th, 2019
 **********************************************************************************************************************/
public abstract class
Auto implements Serializable {

    private static final long serialVersionUID = 1L;
    protected GregorianCalendar boughtOn;
    protected String autoName;
    protected double boughtPrice;
    protected double soldPrice;
    protected String trim;

    public Auto() {
    }

    public abstract double getBoughtSoldCost(GregorianCalendar SoldDate, double SoldCost);

    public Auto(GregorianCalendar boughtOn, String autoName, double boughtPrice, String trim) {
        this.boughtOn = boughtOn;
        this.autoName = autoName;
        this.boughtPrice = boughtPrice;
        this.trim = trim;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public GregorianCalendar getBoughtOn() {
        return boughtOn;
    }

    public void setBoughtOn(GregorianCalendar boughtOn) {
        this.boughtOn = boughtOn;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }
}