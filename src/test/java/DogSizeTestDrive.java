import Dog.DogSize;
import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class DogSizeTestDrive {

    public static void main(String [] args) {

        DogSize one = new DogSize();
        one.setSize(70);
        DogSize two = new DogSize();
        two.setSize(22);
        DogSize three = new DogSize();
        three.setSize(7);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark(3);
        three.bark();

    }
}
