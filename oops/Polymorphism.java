package oops;

public class Polymorphism {
//    static class Runtime {
//        static class AnyVehicle {
//            public void move() {
//                System.out.println("any vehicle will move");
//            }
//        }
//
//        static class Bike extends AnyVehicle {
//            public void move() {
//                System.out.println("Bike can move too");
//            }
//        }
//
//        static class test {
//            public static void main(String[] args) {
//                AnyVehicle vehicle = new Bike();
//                vehicle = new AnyVehicle();
//                vehicle.move();
//            }
//        }
//    }

    static class CompileTime {
        public int add(int x, int y){
            return x+y;
        }
        // 2nd method with name add
        public int add(int x, int y, int z){
            return x+y+z;
        }
        // 3rd method with name add
        public int add(double x, int y){
            return (int)x+y;
        }
        // 4th method with name add
        public int add(int x, double y){
            return x+(int)y;
        }
    }
    static class Test{
        public static void main(String[] args){
            CompileTime demo = new CompileTime();
            // In the below statement, the Compiler looks at the argument types and decides to call method 1
            System.out.println(demo.add(2,3));
            // Similarly, in the below statement, the compiler calls method 2
            System.out.println(demo.add(2,3,4));
            // Similarly, in the below statement, the compiler calls method 4
            System.out.println(demo.add(2,3.4));
            // Similarly, in the below statement, the compiler calls method 3
            System.out.println(demo.add(2.5,3));
        }
    }
}
