import java.util.Scanner;

class Result {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter name : ");
        String name = s.nextLine();

        
        System.out.print("enter gender : ");
        char gender = s.next().charAt(0);

        
        System.out.print("enter age : ");
        long age = s.nextInt();

        
        System.out.print("enter phone number : ");
        long pno = s.nextLong();

        
        System.out.println("\n\nFull Name : " + name);
        System.out.println("Full gender : " + gender);
        System.out.println("Full age : " + age);
        System.out.println("Full pno : " + pno);
        s.close();
    }  
}
