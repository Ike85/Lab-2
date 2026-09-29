// ****************************************************
// Reference-based implementation of ADT list.
// ********************************************
public class ListReferenceBased {
  private Node head;
  private int numItems;

  public ListReferenceBased() {
    numItems = 0;
    head = null;
  }

  public boolean isEmpty() {
    return numItems == 0;
  }

  public int size() {
    return numItems;
  }

  private Node find(int index) {
    Node curr = head;

    for (int skip = 1; skip < index; skip++) {
      curr = curr.getNext();
    }

    return curr;
  }

  public Object get(int index)
          throws ListIndexOutOfBoundsException {
    if (index >= 1 && index <= numItems) {
      Node curr = find(index);
      Object dataItem = curr.getItem();

      return dataItem;
    } else {
      throw new ListIndexOutOfBoundsException(
              "List index out of bounds exception on get");
    }
  }

  public void add(int index, Object item)
          throws ListIndexOutOfBoundsException {
    if (index >= 1 && index <= numItems + 1) {
      if (index == 1) {
        Node newNode = new Node(item, head);
        head = newNode;
      } else {
        Node prev = find(index - 1);
        Node newNode = new Node(item, prev.getNext());
        prev.setNext(newNode);
      }

      numItems++;
    } else {
      throw new ListIndexOutOfBoundsException(
              "List index out of bounds exception on add");
    }
  }

  public void remove(int index)
          throws ListIndexOutOfBoundsException {
    if (index >= 1 && index <= numItems) {
      if (index == 1) {
        head = head.getNext();
      } else {
        Node prev = find(index - 1);
        Node curr = prev.getNext();

        prev.setNext(curr.getNext());
      }

      numItems--;
    } else {
      throw new ListIndexOutOfBoundsException(
              "List index out of bounds exception on remove");
    }
  }

  public void removeAll() {
    head = null;
    numItems = 0;
  }

  public void displayList()
  {
    Node curr = head;

    while (curr != null)
    {
      System.out.println(curr.getItem());
      curr = curr.getNext();
    }
  }


  public String listLongest()
  {
    Node curr = head;

    if (curr == null)
    {
      return null;
    }

    String longest = (String) curr.getItem();

    while (curr != null)
    {
      String current = (String) curr.getItem();

      if (current.length() > longest.length())
      {
        longest = current;
      }

      curr = curr.getNext();
    }

    return longest;
  }
}