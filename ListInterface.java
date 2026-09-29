public static class TestListReferenceBased {

}

  public void main(String[] args)
  {
    ListReferenceBased list = new ListReferenceBased();

    // 1. Test isEmpty()
    System.out.println("Is list empty? " + list.isEmpty());

    // 2. Test size()
    System.out.println("List size: " + list.size());

    // 3. Test add()
    list.add(1, "Apple");
    list.add(2, "Banana");
    list.add(3, "Watermelon");
    list.add(4, "Kiwi");

    // 4. Test size() after adding
    System.out.println("List size after adding: " + list.size());

    // 5. Test displayList()
    System.out.println("List contents:");
    list.displayList();

    // 6. Test get()
    System.out.println("Item at position 2: " + list.get(2));

    // 7. Test listLongest()
    System.out.println("Longest string: " + list.listLongest());

    // 8. Test remove()
    list.remove(2);

    System.out.println("After removing position 2:");
    list.displayList();

    // 9. Test size() after remove
    System.out.println("List size after remove: " + list.size());

    // 10. Test removeAll()
    list.removeAll();

    System.out.println("After removeAll:");
    System.out.println("Is list empty? " + list.isEmpty());
    System.out.println("List size: " + list.size());
  }
