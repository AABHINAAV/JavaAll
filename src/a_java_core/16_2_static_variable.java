class Result {
    static int count = 0;

    Result() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Result obj1 = new Result();
        Result obj2 = new Result();
        Result obj3 = new Result();
    }
}