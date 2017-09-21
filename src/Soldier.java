
public abstract class Soldier implements Shoot, Punch {

    String name;
    String rank;
    int serialNumber;

    public void sleep() {
        System.out.println("snore");
    }

    public void eat() {
        System.out.println("chew");
    }

    public void march() {
        System.out.println("walking in step");
    }


    public void speak() {

    }


}

interface BombMaker {
    Bomb bomber();
}

class Bomb extends Object {
    String name;

    public String toString() {
        return name;
    }
}

