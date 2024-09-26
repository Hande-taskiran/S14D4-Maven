package org.example.rpg;

public class Main {
    public static void main(String[] args) {
        Monster troll = new Troll("Troll", 5, 3.5);
        System.out.println("troll damage: "+troll.getDamage());
        System.out.println(troll.attack());
        Monster werewolf = new Werewolf("wolf", 4, 3.0);
        System.out.println("werewolf damage: " +werewolf.getDamage());
        System.out.println(werewolf.attack());
    }
}
