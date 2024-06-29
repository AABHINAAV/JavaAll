interface i1 {
    public abstract void show();
}

interface i2 {
    public abstract void show();
}

class Result implements i1, i2 {
    public void show() {
        System.out.println("hello from interface");
    }

    public static void main(String []args)
    {
        Result obj = new Result();
        obj.show();
    }
}