package ex27_Super_Keyword;

public class Lab144_MultipleInheritance {
    class Child1 implements Father1,Father2{

        @Override
        public void money() {
            System.out.println("Child Money!");
        }
    }

    interface Father1{
        final int a = 10;
        void money();
    }
    interface Father2{
        void money();
    }
}
