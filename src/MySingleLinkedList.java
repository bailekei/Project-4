import javafx.scene.chart.ScatterChart;

import java.io.Serializable;

/***********************************************************************************************************************
 * CIS 162 Project 4
 * Class that controls the Linklist that is used within the GUI
 *
 * @author Keilani Bailey and Shayla Hinkley
 * @version Project 4: December 4th, 2019
 **********************************************************************************************************************/
public class MySingleLinkedList implements Serializable
{
    /** the top of the link list (beginning) */
    private Node top;

    /** the tail of the link list (ending) */
    private Node tail;

    /** the size of the linked list*/
    public int size;

    /*******************************************************************************************************************
     * Constructor method that creates a linked list
     ******************************************************************************************************************/
    public MySingleLinkedList() {
        top = null;
        size = 0;
    }

    /*******************************************************************************************************************
     * Method that returns the size of the linked list
     *
     * @return size - an integer that represents the size of the linked list
     ******************************************************************************************************************/
    public int size() {
        return size;
    }

    /*******************************************************************************************************************
     * Method that clears the linked list
     ******************************************************************************************************************/
    public void clear() {
        top = null;
        size = 0;
    }

    /*******************************************************************************************************************
     * Method that adds an element to the linked list
     *
     * @param s - type Auto; the auto that is being added to the linked list
     ******************************************************************************************************************/
    public void add(Auto s) {
        size++;
        Node temp  = new Node(null, top);
                //= new Node(null, top);


        // if the list is empty just add
        if (top == null) {
            top = new Node(s, null);
            System.out.println("Testing");
            return;
        }

       while(moveToNext(temp.getNext(), s)) {
           temp = temp.getNext();
       }
       if(temp.getNext() == null) {
           temp.setNext(new Node(s, null));
       }
        else if(temp.getNext() == top) {
           top = new Node(s, top);
       }
       else if(temp.getNext() != null) {
           Node temp2 = new Node(s, temp.getNext());
           temp.setNext(temp2);
       }

       System.out.println(size);

            //if the list is not empty
//        }else {
//
//            //check the top first, if is car
//            if(temp.getData() instanceof Car ) {
//
//                //then check the type of s, which you want to add
//                //if s is car, then compare the date
//                if(s instanceof Car){
//
//                    //if the top is after s, just add to the top
//                    if (temp.getData().getBoughtOn().after(s.getBoughtOn())) {
//                        temp = new Node(s, temp);
//                        System.out.println("yeet");
//                        top = temp;
//                        return;
//
//                        //else use while loop to loop through the list, then add
//                    }else{
//                        System.out.println("rrrr");
//
//                        while(temp.getNext() != null && ((!temp.getNext().getData().getBoughtOn().after(s.getBoughtOn())) || !(temp.getNext().getData().getBoughtOn().compareTo(s.getBoughtOn()) == 0))){
//                            temp = temp.getNext();
////                            temp = top;
////                            Node newAutoNode = new Node(s, temp);
////                            temp = newAutoNode;
//                            System.out.println("qqqqq");
//                            return;
//                        }
//
//                        //means this is not the last one
//                        if(temp.getNext() != null) {
//                            temp = new Node(s, temp);
//                            top =  temp;
//                        }
//
//                            //this is the last one
//                        else {
//                            System.out.println("only");
//                            temp.setNext(new Node(s, null));
//                        }
//                        return;
//                    }
//
//                    //if the type of s is truck, just use the while loop to loop through car
//                }else{
//                    System.out.println("Else Test");
//                    while(temp.getNext() != null && top.getNext().getData() instanceof Car ){
//                        temp = temp.getNext();
//                    }
//
//                    //if current is not tail, then tail is truck
//                    if(temp.getNext() != null){
//                        System.out.println("If Test");
//
//                        //now it is truck
//                        temp = temp.getNext();
//
//                        //same process to compare date with the cars
//                        if (temp.getData().getBoughtOn().after(s.getBoughtOn())) {
//                            System.out.println("if Test 2");
//                            temp = new Node(s, temp);
//                            return;
//                        }else{
//                            System.out.println("Else Test2");
//                            while(!temp.getNext().getData().getBoughtOn().after(s.getBoughtOn())){
//                                temp = temp.getNext();
//                            }
//                            temp = new Node(s, temp);
//                            return;
//                        }
//                    }
//
//                    //else there is no truck on the list, just add into tail
//                    else{
//                        temp.setNext(new Node(s, null));
//                    }
//                }
//            }
//            System.out.println("The end");
//        }
    }

    public boolean moveToNext(Node temp, Auto s) {

        if(temp == null) {
            return false;
        }
        if(temp.getData() instanceof Car && s instanceof Truck) {
           return true;
        }
        if(temp.getData() instanceof Truck && s instanceof Car) {
            return false;
        }

        //case that the date that you are inserting is after or the same as the temporary date
        if(temp.getData().getBoughtOn().before(s.getBoughtOn())) {
            return true;
        }
        System.out.println("Error when moving to next");
        return false;

    }

    /*******************************************************************************************************************
     * Method that removes an element from the linked list
     ******************************************************************************************************************/
    public Auto remove(int index) {
//
        return null;
    }

    /*******************************************************************************************************************
     * Method that gets data from a certain index in the list
     *
     * @return type Auto - the data of the auto
     ******************************************************************************************************************/
    public Auto get(int index) {
        Node current = top;
        int count = 0;

        //throw exceptions if the index is out of bounds
       if(index < 0 || index >= size()){
           throw new IndexOutOfBoundsException();
       }

       //using correct index
       if(index < size()-1) {
          while(current != null) {
          if(count == index) {
              break;
          }
          count++;
          current = current.getNext();

          }
          ;
       }

        return(current.getData());
    }

    /*******************************************************************************************************************
     * Method that creates a string out of the information
     ******************************************************************************************************************/
    public String toString() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.getNext());
            temp = temp.getNext();
        }
        return null;
    }

}