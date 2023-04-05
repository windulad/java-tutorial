public class First_c{
    public void myMethod(){
        System.out.println("Method");
    }
    {
        System.out.println("Instance block");
    }
    public void First_c(){
        System.out.println("Constructor");
    }
    static {
        System.out.println("Static block");
    }
    public static void main(String args[]){
        First_c c = new First_c();
        c.First_c();
        c.myMethod();
    }
}