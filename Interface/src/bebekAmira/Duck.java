package bebekAmira;

import bebekAmira.fly.*;
import bebekAmira.sound.*;

public class Duck {

  private BehaviourFly behaviourFly;
  private BehaviourSound behaviourSound;

  public Duck(BehaviourFly behaviourFly, BehaviourSound behaviourSound) {
    this.behaviourFly = behaviourFly;
    this.behaviourSound = behaviourSound;
  }

  public void setBehaviourFly(BehaviourFly behaviourFly) {
    this.behaviourFly = behaviourFly;
  }

  public void setBehaviourSound(BehaviourSound behaviourSound) {
    this.behaviourSound = behaviourSound;
  }

  public void fly() {
    behaviourFly.fly();
  }

  public void sound() {
    behaviourSound.sound();
  }
}