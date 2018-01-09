//Notes 
//1. need the import declaration for Iterator
//2. the Listeirator does not need to specify tempalte type <item>
//3. capitalization errors

import java.util.Iterator;
public class Bag<Item> implements Iterable<Item>
{
  private class Node
  {
    Item item;
    Node next;
  }
  
  private Node first;
    
  public void add(Item item) 
  { 
    Node old = first;
    first = new Node();
    first.item = item;
    first.next = old;
  }  
  private class ListIterator implements Iterator<Item>
  {
    private Node current = first;
    public boolean hasNext()
    {
      return current != null;
    }
    public void remove(){}
    public Item next()
    {
      Item item = current.item;
      current = current.next;  
      return item;
    }
  }
     public Iterator<Item> iterator()
   {
     return new ListIterator();
   }
}