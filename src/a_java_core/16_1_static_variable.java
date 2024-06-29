class Result{
    String name;
    int age;
    static String school = "St. Mary's School";

    Result(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(school);
    }
    public static void main(String[] args)
    {
        Result s1 = new Result("Abhinav", 24);
        Result s2 = new Result("Nandini", 18);

        s1.display();
        s2.display();
    }
}