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



public static void main() {

    class Infantry extends Soldier {

        public void shoot() {
            System.out.println("pew pew pew");
        }

        public void punch() {
            System.out.println("punch!!");
        }
    }

    class Batalian extends Soldier {

        public void shoot() {
            System.out.println("pew pew pew");
        }

        public void punch() {
            System.out.println("punch!!");
        }
    }

    class Pilot extends Airforce {  //this has inherited bomber from Airforce

        public void shoot() {
            System.out.println("machine gun");
        }

        public void punch() {
            System.out.println("punch");
        }


    }

}
}

interface BombMaker {
        Bomb bomber();
        }

class Bomb extends Object {
    String name;
    public String toString(){
        return name;
    }
}

