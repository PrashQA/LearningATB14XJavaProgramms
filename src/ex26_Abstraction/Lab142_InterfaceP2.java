package ex26_Abstraction;

public class Lab142_InterfaceP2 {
    interface I1{
        void icm1();
        void icm2();
    }


    interface I2{
        void icm3();
    }

    class P implements I1,I2 {


        @Override
        public void icm1() {

        }

        @Override
        public void icm2() {


        }

        @Override
        public void icm3() {

        }
    }
}
