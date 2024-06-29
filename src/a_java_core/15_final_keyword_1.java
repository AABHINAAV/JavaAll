class ClassA{
    final void fun1()
    {
        System.out.println("Class A fun1");
    }
}

class Result extends ClassA{
    // void fun1(){
    //     System.out.println("Class Result fun1");
    // }
    // error: fun1() in Result cannot override fun1() in ClassA
    public static void main(String[] args){
        final int i = 10;
        // i = i + 10;  error: cannot assign a value to final variable i
        System.out.println(i);


        Result obj = new Result();
        obj.fun1();
    }
}