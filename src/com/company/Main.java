package com.company;

public class Main {

    public static void main(String[] args) {
      Boss Demble = new Boss();
      Demble.setDamage(100);
      Demble.setHealth(700);
      Demble.setBossDefenceType("умный");
        System.out.println(Demble.getDamage()+" "+Demble.getHealth()+" "+Demble.getBossDefenceType() );


    }
    public static void Hero (){
        Hero Voin = new Hero(300,60, "супер урон");
        System.out.println(Voin.getDamage()+" "+Voin.getHealth()+" "+Voin.getSuperAbility() );
    }
}
    