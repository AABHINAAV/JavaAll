// handling predefined checked exception using throw, throws and try catch block
 class Result {
     void fun() throws Exception {
         throw new Exception("hello");
     }

     public static void main(String[] args) {
         Result obj = new Result();

         try {
             obj.fun();
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
 }

//
//
//
// handling userdefined checked exception using throw, throws and try catch block
class UserDefinedException extends Exception {
    UserDefinedException(String e) {
        super(e);
    }
}

class Result {
    void fun() throws UserDefinedException {
        throw new UserDefinedException("hello");
    }

    public static void main(String[] args) {
        try {
            new Result().fun();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}