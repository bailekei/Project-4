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
                    while(!top.getNext().getData().getBoughtOn().after(s.getBoughtOn()) && top.getNext() != null){
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
                    while(top.getNext().getData() instanceof Car && top.getNext() != null){
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
//
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