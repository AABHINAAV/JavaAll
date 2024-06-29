class Abcd {
    private int empid;

    void setEmpid(int x) {
        empid = x;
    }

    int getEmpid() {
        return empid;
    }
}

class Result {
    public static void main(String[] args) {
        Abcd obj = new Abcd();
        obj.setEmpid(15);
        System.out.println(obj.getEmpid());
    }
}