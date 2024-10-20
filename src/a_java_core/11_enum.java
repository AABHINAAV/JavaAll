enum Mobile {
    Apple(100), Samsung, Honor(200);

    int x;

    Mobile()
    {
        this.x = 50;
        System.out.println("default constructor");
    }

    Mobile(int x)
    {
        this.x = x;
        System.out.println("parameterised constructor");
    }

    int getValx()
    {
        return x;
    }
}

class Result {
    public static void main(String[] args) {
        Mobile obj = Mobile.Apple;

        switch (obj) {
            case Apple:
                System.out.println("apple");
                break;
            case Samsung:
                System.out.println("Samsung");
                break;
            case Honor:
                System.out.println("Honor");
                break;
        }

        System.out.println(Mobile.Apple.getValx());
        System.out.println(Mobile.Samsung.getValx());
        System.out.println(Mobile.Honor.getValx());
    }
}