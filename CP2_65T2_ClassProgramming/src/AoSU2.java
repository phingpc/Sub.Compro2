
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

class Team {
    Hero[] members = null;
    public Team (Hero[] members) {
        if(!is5Memberteam(members)){
            return;
        } else if(isValid(members)){
            this.members = members;
        }
    }
    boolean is5MemberTeam(Hero[] members) {
        if(members == null || members.length<5){
            System.out.println("member is missing");
            return false;
        } else if (members.length>=6){
            System.out.println("too many members");
            return false;
        } else {
            System.out.println("full team");
            return true;
        }
    }
    boolean isValid(Hero[] members) {
        if(!is5MemberTeam(members)){
            return false;
        }
        boolean valid = true;
        for(int i = 0; i<members.length; i++){
            for(int j=i+1; j<members.length; j++){
                if(members[i].name.equals(members[j].name)){
                valid=false;
                System.out.println("cannot select same hero: "+members[i].name);
                return false;
            }
            }
            System.out.println("valid hero selection");
            return true;
        }
    }
}

public class AoSU2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero[] members = null;
        if (N>0) {
            members = new Hero[N+1];
            for (int i = 0; i < N; ++i) {
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                members[i] = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
    }
}
