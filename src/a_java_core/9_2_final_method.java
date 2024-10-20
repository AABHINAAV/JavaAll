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
}