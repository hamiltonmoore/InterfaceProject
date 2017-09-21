public class Main {
    public static void main(String[] args) {


        class Infantry extends Soldier implements Punch {

            public void shoot() {
                System.out.println("pew pew pew");
            }

            public void punch() {
                System.out.println("You got punched by an Infantry!!");
            }
        }

        Infantry infantry = new Infantry();
        infantry.punch();

        class Batalian extends Soldier implements Punch {

            public void shoot() {
                System.out.println("pew pew pew");
            }

            public void punch() {
                System.out.println("punch!!");
            }

            @Override
            public boolean retract() {
                return false;
            }

        }
        Batalian batalian = new Batalian();
        batalian.punch();

        class Pilot extends Airforce implements Shoot {  //this has inherited bomber from src.Airforce

            public void shoot() {
                System.out.println("machine gun");
            }

            public void punch() {
                System.out.println("punch");
            }
        }
        Pilot pilot = new Pilot;
        pilot.shoot();
    }
}
