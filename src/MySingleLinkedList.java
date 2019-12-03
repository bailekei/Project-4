import java.io.Serializable;

public class MySingleLinkedList implements Serializable
{
    private Node top;
    private Node tail;
    public int size;

    public MySingleLinkedList() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void clear () {
        top = null;
        size = 0;
    }
    public void add(Auto s) {

        //  Order is: (First) List all Cars in bought by date order
        //  followed by (second) List all Trucks in bought by order.
        size++;
        Node temp = top;

        // no list just add
        if (top == null) {
//            top.setData(s);
//            top.setNext(null);
            top = new Node(s, null);
            return;
        }else {
            //check the top first, if is car
            if(top.getData() instanceof Car ) {
                //then check the type of s, which you want to add
                //if s is car, then compare the date
                if(s instanceof Car){
                    //if the top is after s, just add to the top
                    if (top.getData().getBoughtOn().after(s.getBoughtOn())) {
                        top = new Node(s, temp);
                        return;
                        //else use while loop to loop through the list, then add
                    }else{
                        while(top.getNext() != null && !top.getNext().getData().getBoughtOn().after(s.getBoughtOn()) ){
                            top = top.getNext();
                            temp = top;
                        }
                        //means this is not the last one
                        if(top.getNext() != null)
                            top = new Node(s, temp);
                            //this is the last one
                        else
                            top.setNext(new Node(s, null));
                        return;
                    }
                    //if the type of s is truck, just use the while loop to loop through car
                }else{
                    while(top.getNext() != null && top.getNext().getData() instanceof Car ){
                        top = top.getNext();
                        temp = top;
                    }
                    //if current is not tail, then tail is truck
                    if(top.getNext() != null){
                        //now it is truck
                        top = top.getNext();
                        temp = top;
                        //same process to compare date with the cars
                        if (top.getData().getBoughtOn().after(s.getBoughtOn())) {
                            top = new Node(s, temp);
                            return;
                        }else{

                            while(!top.getNext().getData().getBoughtOn().after(s.getBoughtOn())){
                                top = top.getNext();
                                temp = top;
                            }
                            top = new Node(s, temp);
                            return;
                        }}
                    //else there is no truck on the list, just add into tail
                    else{
                        top.setNext(new Node(s, null));
                    }
                }
            }
        }
    }

/*
    public void add(Auto s) {

        //  Order is: (First) List all Cars in bought by date order
        //  followed by (second) List all Trucks in bought by order.
        Node temp = new Node(s,null);
        size++;
        // no list just add
        if (top == null) {
//            top.setData(s);
//            top.setNext(null);
            top = temp;
            return;
        }else {
            //check the top first, if is car
            if(top.getData() instanceof Car) {
                //then check the type of s, which you want to add
                //if s is car, then compare the date
                if(s instanceof Car){
                    //if the top is after s, just add to the top
                if (top.getData().getBoughtOn().after(s.getBoughtOn())) {
                    top = new Node(s, temp);
                    return;
                    //else use while loop to loop through the list, then add
                }
                else{
                    while(top.getNext() != null && !temp.getNext().getData().getBoughtOn().after(s.getBoughtOn())){
                        System.out.println("1");
                        temp=top;
                        top = top.getNext();
//                        temp = top;
                    }
//                    //means this is not the last one
                    if(top.getNext() != null)
                    top = new Node(s, temp);
                    //this is the last one
                    else
                        top.setNext(new Node(s, null));
                    return;
                }
                //if the type of s is truck, just use the while loop to loop through car
                }else{
                    while(top.getNext() != null && top.getNext().getData() instanceof Car){
                        System.out.println("2");
                        top.setNext(temp);
                    }
                   //if current is not tail, then tail is truck
                    if(top.getNext() != null){
                        //now it is truck
                    temp = top.getNext();
//                    temp = top;
                    //same process to compare date with the cars
                    if (top.getData().getBoughtOn().after(s.getBoughtOn())) {
//                        top = new Node(s, temp);
                        top = temp;
                        temp = new Node(s,temp);
                        return;
                    }else{

                        while(!top.getNext().getData().getBoughtOn().after(s.getBoughtOn())){
                            System.out.println("3");
                            temp = top.getNext();
//                            temp = top;
                        }
                        top = new Node(s, temp);
                        return;
                    }}
                    //else there is no truck on the list, just add into tail
                    else{
                        top.setNext(new Node(s, null));
                    }
                }
            }
            System.out.println("Finish");
        }

//        //iterate thru list until we find the spot
//        while (temp.getNext() != null) {
//            if (temp.getNext().data.getBoughtOn().after(s.getBoughtOn())) {
//                Node newAutoNode = new Node(s, temp.next);
//                temp.next=newAutoNode;
//                return;
//            }
//            temp = temp.next;
//        }
//        Node newAutoNode = new Node(s, temp.next);
//        temp.next=newAutoNode;
//        return;
    }
*/

    /*
    public void add(Auto s) {
        Node temp = new Node(s, null);
        size++;

        if(top == null){
            top = temp;
            return;
        }
        else if(s instanceof Car){
            Node current = top;
            if(top.getData() instanceof Truck){
                temp.setNext(top);
                top = temp;
            }else{
                while(top.getNext() != null && top.getNext().getData() instanceof Car){
                    temp = top.getNext();
//                        temp = top;
                }
            }
        }else if(s instanceof Truck){

        }
    }
*/


    public Auto remove(int index) {

        return null;
    }

    public Auto get(int index) {

        return null;
    }

    public String toString() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.getNext());
            temp = temp.getNext();
        }
        return null;
    }


}