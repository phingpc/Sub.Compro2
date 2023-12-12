/*
import java.util.Scanner;

class Hero {
    String name;
    int HP;
    int attkType;
    int attkdamage;
    int defenPhysical;
    int defenMagic;
    int defen;
    public Hero(String name,int hp,int attkType,int attkDmg,int phyDef,int magDef){
        HP = hp;
        this.name = name;
        this.attkType = attkType;
        attkdamage =attkDmg;
        defenPhysical = phyDef;
        defenMagic = magDef ;
        checkAndWarn();
    }
    boolean checkAndWarn(){
        if(HP < 0 || attkdamage <0 ||defenPhysical <0 || defenMagic <0){
            System.out.println("warning: value cannot be negative");
            return false;
        } else {
            return true;
        }
    }
    void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("HP: "+HP);
        if(attkType == 1){
            System.out.println("Attack: "+attkdamage+" (physical)");
        } else {
            System.out.println("Attack: "+attkdamage+" (magical)");
        }
        System.out.println("Defense: "+defenPhysical+" (physical), "+defenMagic+" (magical)");
        checkAndWarn();
    }
}
public class AoSU1 {
    public static void main(String[] args) {     
        Scanner scan = new Scanner(System.in);    
        String name = scan.next();     
        int hp = scan.nextInt();     
        int attkType = scan.nextInt();     
        int attkDmg = scan.nextInt();     
        int phyDef = scan.nextInt();     
        int magDef = scan.nextInt();              
        Hero hero = new Hero(name, hp, attkType,attkDmg, phyDef, magDef);     
        hero.printInfo();     
        System.out.println(hero.checkAndWarn());   
    } 
}
//Murad 600 1 70 30 50
//Murad -600 2 70 -30 50