package org.example.rpg;

public class Werewolf extends Monster implements Bleedable{
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.35;
    }
    @Override
    public double attack(){
        System.out.println("Werewolf attacking");
        return getDamage()+ bleed();
    }
}
