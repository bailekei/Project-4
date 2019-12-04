import java.io.Serializable;
/***********************************************************************************************************************
 * CIS 162 Project 4
 * Class that controls the Nodes
 *
 * @author Keilani Bailey and Shayla Hinkley
 * @version Project 4: December 4th, 2019
 **********************************************************************************************************************/
public class Node implements Serializable {

   /** the data of the Auto */
    private Auto data;

   /** the next node in the linked list*/
    private Node next;

    /*******************************************************************************************************************
     * Constructor method
     *
     * @param data type Auto - the data of the Auto as the data within the node
     * @param next type Node - the next pointer that is needed within the node
     ******************************************************************************************************************/
    public Node(Auto data, Node next) {
        this.data = data;
        this.next = next;
    }

    /*******************************************************************************************************************
     * Constructor method that creates a linked list
     ******************************************************************************************************************/
    public Auto getData() {
        return data;
    }

    public void setData(Auto data) {

        this.data = data;
    }

    /*******************************************************************************************************************
     * Get method that returns the next node in the linked list
     *
     * @return next Type Node - the next node within the list
     ******************************************************************************************************************/
    public Node getNext() {
        return next;
    }

    /*******************************************************************************************************************
     * Set method that sets the next node in the linked list
     *
     * @param next type Node - the next node in the linked list
     ******************************************************************************************************************/
    public void setNext(Node next) {

        this.next = next;
    }
}