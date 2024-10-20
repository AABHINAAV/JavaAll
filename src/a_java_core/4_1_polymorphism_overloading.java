class Result {
    public static void main(String []args)
    {
        System.out.println("default main method");

        Result obj = new Result();
        obj.main(5);
    }    

    public void main(int args)
    {
        System.out.println("overloaded main method and argument passed value = " + args);
    }    
}

/*
 * yes we can overload main function
 * because in java jvm calls only that main method which has string type argument
 * and main method of string type argument can be only one 
 */