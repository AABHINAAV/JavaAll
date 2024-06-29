// handling predefined checked exception using try catch
// class Result {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;
//             int c = a / b;
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

//
//
//
// handling user defined checked exception using try catch
// class UserDefinedException extends Exception {
//     UserDefinedException(String e) {
//         super(e);
//     }
// }

// class Result {
//     public static void main(String[] args) {
//         try {
//             throw new UserDefinedException("hello");
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

//
//
//
// best practice
// handling user-defined unchecked exception using try catch and throw
class UserDefinedException extends RuntimeException {
    UserDefinedException(String e) {
        super(e);
    }
}

class Result {
    public static void main(String[] args) {
        try {
            throw new TempClassName("hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}