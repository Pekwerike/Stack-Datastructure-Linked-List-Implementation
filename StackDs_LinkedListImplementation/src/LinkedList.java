public class LinkedList <Item> {

    /**
     * initializing the First node in the linkedList
     **/
    Node first = null;

    /**
     * Data class to represent a single node in the linkedList
     **/
    class Node {
        Item Item;
        Node next;
    }

    /**
     * Function to check if the list is empty
     **/
    public Boolean isEmpty() {
        return first == null;
    }

    /**
     * Putting items inside the linkedList
     **/
    public void push(Item dataToInsert) {
        /**Check if the linked list is empty**/
        if (isEmpty()) {
            first = new Node();
            first.Item = dataToInsert;
            first.next = null;
        }
        /**If list is not empty**/
        else {
            /**Hold a link to the list**/
            Node oldList = first;
            /**Create a new node to be added on the top of linked list**/
            first = new Node();
            first.Item = dataToInsert;
            /**Make the new node point back to the rest of the list**/
            first.next = oldList;
        }
    }

    /**
     * Returning items from the list
     **/
    public Item pop() {
        Item itemToBePoped;
        /**Check if the linked list is empty**/
        if (isEmpty()) {
            return null;
        } else {
            /**Retrieving the item in the top node**/
            itemToBePoped = first.Item;
            /**Making the next node on the list the top node**/
            first = first.next;
            return itemToBePoped;
        }

    }
}
