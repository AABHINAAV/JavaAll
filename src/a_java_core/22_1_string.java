class Result {
    public static void main(String[] args) {
        String s1 = new String("fname1");
        System.out.println(s1);  // fname1

        s1.concat(" lname1");
        System.out.println(s1); // fname1

        String s2 = s1.concat("lname1");
        System.out.println(s1); // fname1
        System.out.println(s2); // fname1lname1
    }
}