
public class Airforce extends Soldier implements BombMaker {
    private boolean inAPlane;

    public void speak() {
        super.speak();
        System.out.println("We don't have a chant");
    }

    public void shoot() {
        System.out.println("Pew pew pew");
    }

    public void punch() {
        System.out.println("punch!!");
    }

    @Override
    public Bomb bomber() {
        Bomb b = new Bomb();
         b.name = "MOAB";
        return b;
    }
}
