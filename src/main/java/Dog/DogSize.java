package Dog;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class DogSize {

    private int size;
    String name;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }



    public void bark () {

        if ( size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff");
        } else {
            System.out.println("Yip! Yip!");
        }
    }

    public void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("Ruff!");
            numOfBarks = numOfBarks - 1;
        }
    }

    int giveSacrat() {
        return 42;
    }
}
