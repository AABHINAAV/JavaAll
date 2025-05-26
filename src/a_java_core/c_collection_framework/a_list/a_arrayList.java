package c_collection_framework.a_list;

import java.util.ArrayList;

public class a_arrayList {

  public static void main(String[] args) {
    ArrayList<Integer> lst = new ArrayList<>();

    lst.add(1);
    lst.add(2);
    lst.add(3);
    lst.add(4);

    lst.add(2, 10);

    System.out.println("List : " + lst);

    //
    //
    //

    System.out.println("get : " + lst.get(2));

    //
    //
    //

    lst.set(1, 20);
    System.out.println("set : " + lst);

    //
    //
    //

    lst.remove(0);
    System.out.println("remove : " + lst);

    //
    //
    //

    System.out.println("size : " + lst.size());
    System.out.println("isEmpty : " + lst.isEmpty());

    //
    //
    //

    System.out.println("contains : " + lst.contains(10));

    //
    //
    //

    System.out.println("indexOf : " + lst.indexOf(10));

    //
    //
    //

    lst.clear();
  }
}
