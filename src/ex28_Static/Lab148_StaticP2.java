package ex28_Static;

public class Lab148_StaticP2 {
    class ATB{

        int phone_np;
        String name;

        static String course_name = "ATB";

        static void markAttendance(){
            System.out.println("Mark Attendance");
//        System.out.println(this.phone_np);
        }

        void display(){
            System.out.println(this.phone_np + this.name + course_name);
        }


    }
}
