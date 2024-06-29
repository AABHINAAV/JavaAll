package c_Thread;

public class C3_which_better {

    public class TempClass {}

//    public class UsingThreadClass extends TempClass, Thread{}
    // it will give error because in java multiple inheritence is not allowed so can restrict
    // us from doing our work

    public class UsingRunnableInterface extends TempClass implements Runnable{
        @Override
        public void run() {

        }
    }
    // here we can perform multiple inheritence because Runnable is interface
}

//firstly Runnable interface  was built
//then Thread class was made using implementing the Runnable interface
//so Thread class has some extra features
//But Runnable interface has better performance than Thread class
//and we can perform multiple inheritence using Runnable interface
