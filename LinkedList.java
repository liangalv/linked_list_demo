package linkedlist;

import java.util.Objects;

public class LinkedList{
    private ListNode firstNode;

    public void setFirstNode(ListNode node){
        this.firstNode = node;
    }

    public ListNode getFirstNode(){
        return this.firstNode;
    }
    
    //TODO: exercise for reader
    //Search O(n)
    //Insert O(n)
    //Deletion O(n)

    //Returns whether Item is in LinkedList
    public boolean search(ListNode listNode){
        //This line gets the value we are searching for
        int valToSearch = listNode.getValue(); 
        //This sets the head, i.e (that is) the beginning of the list
        ListNode currNode = this.firstNode;
        //If we find a null node this means that we are at the end of the list
        //Therefore we will exit this while loop
        while(Objects.nonNull(currNode)){
            if (valToSearch == currNode.getValue()){
                return true;
                }
            //variable currNode is now referring to the next node
            currNode = currNode.getNext();
            }
        return false;
        }
    }
    public void insert(ListNode listNode){

    }
    public void deletion(int index){

    }

    /* HELPERS */

    private ListNode locateNode(int valueToFind){
        ListNode currNode = this.firstNode;
        while(Objects.nonNull(currNode)){
            if(currNode.getValue() == valueToFind){
                return currNode;
            }
            currNode = currNode.next;
        }
        return null;
    }


}

private class ListNode{
    private ListNode next;
    private int value;

    public void ListNode(int value){
        setValue(value);
    }
    //Overload constructor
    public void ListNode(int value, ListNode next){
        setValue(value);
        setNextNode(next);
    }

    /*SETTERS*/
    public void setValue(int value){
        this.value = value
    }
    public void setNextNode(ListNode node){
        this.next = node;
    }
    /*GETTERS */
    public ListNode getNext(){
        return this.next;
    }
    public int getValue(){
        return this.value;
    }
}
