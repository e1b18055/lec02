package oit.is.z1461.kaizi.lec02.model;

import java.util.Random;

public class Janken {
  String hand;
  String enemyHand = "Pa";
  String result = "Error";

  public Janken(){
  }

  public Janken(String hand) {
    randomEnemyHand();
    this.hand = hand;
    if (hand.equals("Gu") && enemyHand.equals("Gu")
      || hand.equals("Tyoki") && enemyHand.equals("Tyoki")
      || hand.equals("Pa") && enemyHand.equals("Pa")) {
      result = "Draw";
    } else if (hand.equals("Gu") && enemyHand.equals("Tyoki")
      || hand.equals("Tyoki") && enemyHand.equals("Pa")
      || hand.equals("Pa") && enemyHand.equals("Gu")) {
      result = "You Win!";
    } else if (hand.equals("Gu") && enemyHand.equals("Pa")
      || hand.equals("Tyoki") && enemyHand.equals("Gu")
      || hand.equals("Pa") && enemyHand.equals("Tyoki")) {
      result = "You Lose!";
    }
  }

  public void randomEnemyHand(){
    int r = new java.util.Random().nextInt(3);
    if (r == 0) {
      enemyHand = "Gu";
    } else if (r == 1) {
      enemyHand = "Tyoki";
    } else {
      enemyHand = "Pa";
    }
  }

  public void setHand(String hand){
    this.hand = hand;
  }

  public String getHand(){
    return hand;
  }

  public void setEnemyHand(String enemyHand){
    this.enemyHand = enemyHand;
  }

  public String getEnemyHand(){
    return enemyHand;
  }

  public void setResult (String result){
    this.result = result;
  }

  public String getResult(){
    return result;
  }
}
