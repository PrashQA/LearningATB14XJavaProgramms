package ex20_Multilevel_Inheritance;

public class Lab130_Multilevel {
    public static void main(String[] args) {
        Son pramod = new Son();
        pramod.home();
        pramod.bhk3();
        pramod.gf();
        pramod.extra();

        Father f = new Father();
        f.gf();
        f.home();
        f.extra();

        Grandfather gf =  new Grandfather();
        gf.gf();
        gf.home();

        // Dynamic Dispatch
        Grandfather g1 = new Son();
        Father f1  = new Son();
        //Son s1 = new Grandfather();
        //Son s2 = new Father();


    }
}
