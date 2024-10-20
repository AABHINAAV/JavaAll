import java.util.ArrayList;
import java.util.List;

class GenericClass<type> {

  private List<type> alldata = new ArrayList<type>();

  public void addData(type data) {
    alldata.add(data);
  }

  public List<type> getAlldata() {
    return alldata;
  }
}

class Result {

  public static void main(String[] args) {
    GenericClass<Integer> genericClass = new GenericClass<Integer>();
    genericClass.addData(1);
    genericClass.addData(2);

    System.out.println(genericClass.getAlldata());
  }
}
