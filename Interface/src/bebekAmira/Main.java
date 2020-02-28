package bebekAmira;

import bebekAmira.attack.ArrowAttact;
import bebekAmira.attack.SwordAttack;
import bebekAmira.defense.ArmorDefense;
import bebekAmira.defense.ShiledDefense;
import bebekAmira.fly.*;
import bebekAmira.sound.*;

public class Main {
  public static void main(String[] args) {
    Duck superDuck = new Duck(new RocketFly(), new ToaSound(), new ArrowAttact(), new ShiledDefense());
    System.out.println("Super Duck Behaviour : ");
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();

    System.out.println("");
    System.out.println("Noob Duck Behaviour : ");
    Duck noobDuck = new Duck(new WingsFly(), new NormalSound(), new SwordAttack(), new ArmorDefense());
    noobDuck.fly();
    noobDuck.sound();
    noobDuck.attack();
    noobDuck.defense();

    System.out.println("");
    System.out.println("Super Duck change Fly Behaviour : ");
    superDuck.setBehaviourFly(new PlaneFly());
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();
  }
}