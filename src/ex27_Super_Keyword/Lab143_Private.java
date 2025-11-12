package ex27_Super_Keyword;

public class Lab143_Private {

}
class XYZ {
    XYZ() {
    }
    protected int my_gold = 10;
}

class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
}
