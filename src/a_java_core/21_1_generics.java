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
        GenericClass<int> genericClass = new GenericClass<int>();
        genericClass.addData(1);
        genericClass.addData(2);

        print(genericClass.getAlldata());
    }
}