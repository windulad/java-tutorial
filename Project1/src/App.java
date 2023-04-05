class A{
    String name = "A";
    String getName(){
        return this.name;
    }
    String greeting(){
        return "Class " + this.getName();
    }

    class B extends A{
        String name = "B";
        String getName(){
            return this.name;
        }
    }
}

public class App {
    public static void main(String args[]){
        A a = new A();
        A.B b = a.new B();
        System.out.println(a.greeting() + " has name " + a.getName());
        System.out.println(b.greeting() + " has name " + b.getName());
    }
}
