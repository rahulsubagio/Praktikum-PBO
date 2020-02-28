package bebekAmira;

import bebekAmira.fly.*;
import bebekAmira.sound.*;

public class Main {
  public static void main(String[] args) {
    Duck superDuck = new Duck(new RocketFly(), new ToaSound());
    System.out.println("Super Duck Behaviour : ");
    superDuck.fly();
    superDuck.sound();

    System.out.println("");
    System.out.println("Noob Duck Behaviour : ");
    Duck noobDuck = new Duck(new WingsFly(), new NormalSound());
    noobDuck.fly();
    noobDuck.sound();

    System.out.println("");
    System.out.println("Super Duck change Fly Behaviour : ");
    superDuck.setBehaviourFly(new PlaneFly());
    superDuck.fly();
    superDuck.sound();
  }
}