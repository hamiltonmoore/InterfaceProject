
public class Marines extends Soldier implements Punch {
    private boolean adaptable;

    public void speak() {
        super.speak();   // is this bit needed?
        System.out.println("oohrah!!");
    }

    public void shoot() {
        System.out.println("pew pew pew");
    }

    public void punch() {
        System.out.println("punch!!");
    }
}
