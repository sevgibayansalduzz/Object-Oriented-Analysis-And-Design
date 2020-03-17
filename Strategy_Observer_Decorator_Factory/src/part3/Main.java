package part3;

public class Main {
    public static void main(String[] args) {
        Suit suit1=new Dec();
        Suit suit2=new Ora();
        Suit suit3=new Tor();

        suit1=new AutoRifle(suit1);
        suit1=new AutoRifle(suit1);
        suit1=new Laser(suit1);
        suit1=new Laser(suit1);
        System.out.println(suit1.wholeCustomDescription());

        suit2=new AutoRifle(suit2);
        suit2=new Laser(suit2);
        suit2=new RocketLauncher(suit2);
        suit2=new Flamethrower(suit2);
        System.out.println(suit2.wholeCustomDescription());

        suit3=new Laser(suit3);
        suit3=new Laser(suit3);
        suit3=new RocketLauncher(suit3);
        System.out.println(suit3.wholeCustomDescription());
    }
}
