import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class MySingleLinkedListTest {

    private Car car1;
    private Car car2;
    private Car car3;
    private Truck truck1;
    private Truck truck2;
    private Truck truck3;

    MySingleLinkedList list = new MySingleLinkedList ();

    @Before
    public void createList() {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        GregorianCalendar temp1 = new GregorianCalendar();
        GregorianCalendar temp2 = new GregorianCalendar();
        GregorianCalendar temp3 = new GregorianCalendar();
        GregorianCalendar temp4 = new GregorianCalendar();
        GregorianCalendar temp5 = new GregorianCalendar();
        GregorianCalendar temp6 = new GregorianCalendar();

        try {
            Date d1 = df.parse("3/20/2019");
            temp1.setTime(d1);
            Date d2 = df.parse("4/20/2019");
            temp2.setTime(d2);
            Date d3 = df.parse("12/20/2018");
            temp3.setTime(d3);
            Date d4 = df.parse("1/20/2019");
            temp4.setTime(d4);
            Date d5 = df.parse("1/20/2010");
            temp5.setTime(d5);
            Date d6 = df.parse("1/20/2020");
            temp6.setTime(d6);


            Car Car1 = new Car (temp1, "Outback", 18000,"LX", false);
            Car Car2 = new Car (temp2, "Chevy", 11000,"EX", false);
            Car Car3 = new Car (temp3, "Focus", 19000,"EX", true);
            Truck Truck1 = new Truck(temp4,"F150",12000,"LX",false);
            Truck Truck2 = new Truck(temp5,"F250",42000,"LX",false);
            Truck Truck3 = new Truck(temp1,"F350",2000,"EX",true);

            list.add(Car1);
            list.add(Car2);
            list.add(Car3);
            list.add(Truck1);
            list.add(Truck2);
            list.add(Truck3);


        } catch (ParseException e) {
            throw new RuntimeException("Error in testing, creation of list");
        }

    }


    @Test
    // here is the very small example to use.
    public void size() {
        assertEquals(6, list.size());
        createList();
        assertEquals(12, list.size());
//        list.remove(0);
//        assertEquals(11,list.size());
//        list.remove(10);
//        assertEquals(10, list.size());
//        list.remove(9);
//        assertEquals(9, list.size());
//        list.remove(0);
//        assertEquals(8, list.size());
//        list.remove(0);
//        assertEquals(7, list.size());
//        list.remove(3);
//        list.remove(4);
//        list.remove(1);
//        list.remove(1);
//        list.remove(0);
//        list.remove(0);
//        list.remove(0);
//        assertEquals(0, list.size());


    }

    @Test
    public void clear() {
        list.clear();
        assertEquals(list.size(), 0);
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        GregorianCalendar temp1 = new GregorianCalendar();
        try {
            Date d1 = df.parse("3/20/2019");
            temp1.setTime(d1);
            Car Car1 = new Car(temp1, "Outback", 18000, "LX", false);
            list.add(Car1);
        }catch(ParseException e) {
            throw new RuntimeException("Error adding to list");
        }
        assertEquals(list.get(0).getAutoName(), "Outback");
    }

    @Test
    public void add() {

        list.clear();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        GregorianCalendar temp1 = new GregorianCalendar();
        GregorianCalendar temp2 = new GregorianCalendar();

        try {
            Date d1 = df.parse("3/20/2019");
            temp1.setTime(d1);
            Date d2 = df.parse("4/20/2019");
            temp2.setTime(d2);

            //creating car and truck
            Car Car1 = new Car(temp1, "Outback", 18000, "LX", false);
            Truck Truck1 = new Truck(temp2, "Shayla", 18000, "LX", false);

            //adding car
            list.add(Car1);
            list.add(Truck1);

        } catch (ParseException ex) {
            throw new RuntimeException("Error adding to list");
        }

    }

    @Test
    public void reOrderList() {
    }

    @Test
    public void remove() {

        list.clear();

        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        GregorianCalendar temp1 = new GregorianCalendar();
        GregorianCalendar temp2 = new GregorianCalendar();
        GregorianCalendar temp3 = new GregorianCalendar();
        GregorianCalendar temp4 = new GregorianCalendar();
        GregorianCalendar temp5 = new GregorianCalendar();
        GregorianCalendar temp6 = new GregorianCalendar();
        try {
            Date d1 = df.parse("3/20/2019");
            temp1.setTime(d1);
            Date d2 = df.parse("4/20/2019");
            temp2.setTime(d2);
            Date d3 = df.parse("12/20/2018");
            temp3.setTime(d3);
            Date d4 = df.parse("1/20/2019");
            temp4.setTime(d4);
            Date d5 = df.parse("1/20/2010");
            temp5.setTime(d5);
            Date d6 = df.parse("1/20/2020");
            temp6.setTime(d6);


            Car Car1 = new Car (temp1, "Outback", 18000,"LX", false);
            Car Car2 = new Car (temp2, "Chevy", 11000,"EX", false);
            Car Car3 = new Car (temp3, "Focus", 19000,"EX", true);
            Truck Truck1 = new Truck(temp4,"F150",12000,"LX",false);
            Truck Truck2 = new Truck(temp5,"F250",42000,"LX",false);
            Truck Truck3 = new Truck(temp1,"F350",2000,"EX",true);

            list.add(Car1);
            list.add(Car2);
            list.add(Car3);
            list.add(Truck1);
            list.add(Truck2);
            list.add(Truck3);


        } catch (ParseException e) {
            throw new RuntimeException("Error in testing, creation of list");
        }
        //testing the remove from the first of the list
        Auto temp = list.get(1);
        list.remove(0);
        assertEquals(list.get(0), temp);

        //testing removing anywhere in the list
        Auto x = list.get(3);
        list.remove(2);
        assertEquals(list.get(2), x);



    }

    /*******************************************************************************************************************
     * Method that tests the remove method in the middle of the list
     ******************************************************************************************************************/
    @Test
    public void remove1(){

        list.clear();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        GregorianCalendar temp1 = new GregorianCalendar();
        GregorianCalendar temp2 = new GregorianCalendar();
        GregorianCalendar temp3 = new GregorianCalendar();
        GregorianCalendar temp4 = new GregorianCalendar();
        GregorianCalendar temp5 = new GregorianCalendar();
        GregorianCalendar temp6 = new GregorianCalendar();
        try {
            Date d1 = df.parse("3/20/2019");
            temp1.setTime(d1);
            Date d2 = df.parse("4/20/2019");
            temp2.setTime(d2);
            Date d3 = df.parse("12/20/2018");
            temp3.setTime(d3);
            Date d4 = df.parse("1/20/2019");
            temp4.setTime(d4);
            Date d5 = df.parse("1/20/2010");
            temp5.setTime(d5);
            Date d6 = df.parse("1/20/2020");
            temp6.setTime(d6);


            Car Car1 = new Car (temp1, "Outback", 18000,"LX", false);
            Car Car2 = new Car (temp2, "Chevy", 11000,"EX", false);
            Car Car3 = new Car (temp3, "Focus", 19000,"EX", true);
            Truck Truck1 = new Truck(temp4,"F150",12000,"LX",false);
            Truck Truck2 = new Truck(temp5,"F250",42000,"LX",false);
            Truck Truck3 = new Truck(temp1,"F350",2000,"EX",true);

            list.add(Car1);
            list.add(Car2);
            list.add(Car3);
            list.add(Truck1);
            list.add(Truck2);
            list.add(Truck3);


        } catch (ParseException e) {
            throw new RuntimeException("Error in testing, creation of list");
        }

        //testing removing anywhere in the list
        Auto x = list.get(3);
        list.remove(2);
        assertEquals(list.get(2), x);

    }

    /*******************************************************************************************************************
     * Method that tests the remove method of the linked list at the end of the list
     ******************************************************************************************************************/
    @Test
    public void remove2() {

        list.clear();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        GregorianCalendar temp1 = new GregorianCalendar();
        GregorianCalendar temp2 = new GregorianCalendar();
        GregorianCalendar temp3 = new GregorianCalendar();
        GregorianCalendar temp4 = new GregorianCalendar();
        GregorianCalendar temp5 = new GregorianCalendar();
        GregorianCalendar temp6 = new GregorianCalendar();
        try {
            Date d1 = df.parse("3/20/2019");
            temp1.setTime(d1);
            Date d2 = df.parse("4/20/2019");
            temp2.setTime(d2);
            Date d3 = df.parse("12/20/2018");
            temp3.setTime(d3);
            Date d4 = df.parse("1/20/2019");
            temp4.setTime(d4);
            Date d5 = df.parse("1/20/2010");
            temp5.setTime(d5);
            Date d6 = df.parse("1/20/2020");
            temp6.setTime(d6);


            Car Car1 = new Car (temp1, "Outback", 18000,"LX", false);
            Car Car2 = new Car (temp2, "Chevy", 11000,"EX", false);
            Car Car3 = new Car (temp3, "Focus", 19000,"EX", true);
            Truck Truck1 = new Truck(temp4,"F150",12000,"LX",false);
            Truck Truck2 = new Truck(temp5,"F250",42000,"LX",false);
            Truck Truck3 = new Truck(temp1,"F350",2000,"EX",true);

            list.add(Car1);
            list.add(Car2);
            list.add(Car3);
            list.add(Truck1);
            list.add(Truck2);
            list.add(Truck3);


        } catch (ParseException e) {
            throw new RuntimeException("Error in testing, creation of list");
        }

        //testing removing from the end of the list and making it null
        list.remove(6);
        assertEquals(list.get(6), null);
    }

    @Test
    public void get() {
        list.clear();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        GregorianCalendar temp1 = new GregorianCalendar();
        GregorianCalendar temp2 = new GregorianCalendar();
        GregorianCalendar temp3 = new GregorianCalendar();
        GregorianCalendar temp4 = new GregorianCalendar();
        try {
            Date d1 = df.parse("3/20/2019");
            temp1.setTime(d1);
            Date d2 = df.parse("4/20/2019");
            temp2.setTime(d2);
            Date d3 = df.parse("3/20/2019");
            temp3.setTime(d3);
            Date d4 = df.parse("4/20/2019");
            temp4.setTime(d4);


            Car Car1 = new Car (temp1, "Outback", 18000,"LX", false);
            Car Car2 = new Car (temp2, "Chevy", 11000,"EX", false);
            Car Car3 = new Car (temp3, "Outback", 18000,"LX", false);
            Car Car4 = new Car (temp4, "Chevy", 11000,"EX", false);
            list.add(Car1);
            list.add(Car2);


            assertEquals(list.get(0).getAutoName(), Car3.getAutoName());
            assertEquals(list.get(1).getAutoName(), "Chevy");



        } catch (ParseException ex) {

        }

    }

    @Test
    public void display() {
    }
}