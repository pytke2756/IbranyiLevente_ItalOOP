package hu.petrik.italoop;

public class Main {

    public static void main(String[] args) {
        Bor b1 = new Bor("fehér", 1444);
        Aszu b2 = new Aszu(1555, 21);
        kiirBor(b1);
        kiirBor(b2);

    }

    public static void kiirBor(Bor bor){
        System.out.println(bor);
    }
}
