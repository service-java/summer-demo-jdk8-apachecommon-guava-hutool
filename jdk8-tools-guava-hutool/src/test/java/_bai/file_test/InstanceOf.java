package _bai.file_test;


class Vehicle {
}

public class InstanceOf extends Vehicle {

    public static void main(String[] args) {
        Vehicle a = new InstanceOf();
        boolean result = a instanceof InstanceOf;
        System.out.println(result);
    }

}
