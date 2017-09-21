
public class Navy extends Soldier {
    private boolean inAShip;

    @Override
    public void speak() {
        super.speak();   //what does this bit do?
        System.out.println("Hooyah!!");
    }

    public void shoot() {
        System.out.println("pew pew pew");
    }

    public void punch() {
        System.out.println("punch!!");
    }
}
