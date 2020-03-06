class A{
    int x =10;
    void sing(){
        System.out.println("A is singing");
    }
}



public class Inheritance extends A {
    int x =7;
    void sing(){
        System.out.println("B is singing");

    }
    public static void main(String[] args) {
        A a = new Inheritance();
        A a1 = new A();
        System.out.println(a.x);
        a1.sing();
        a.sing();
    }

}
