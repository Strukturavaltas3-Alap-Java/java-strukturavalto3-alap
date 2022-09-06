package week07.day02;

public class Main {


    public static void main(String[] args) {
        Trooper trooper1 = new Trooper("John");
        Trooper trooper2 = new Trooper("Jane");
        Trooper trooper3 = new Trooper("Jack");

        HeadQuarter headQuarter = new HeadQuarter();
        headQuarter.addTrooper(trooper1);
        headQuarter.addTrooper(trooper2);
        headQuarter.addTrooper(trooper3);

        trooper1.changePosition(new Position(2,2));
        trooper2.changePosition(new Position(-3,1));
        trooper3.changePosition(new Position(5,-4));

        headQuarter.moveClosestTrooper(new Position(2,-2));

        System.out.println(trooper3.getPosition().getPosX()+" "+trooper3.getPosition().getPosY());

        headQuarter.moveTrooperByName("Jane",new Position(1,1));
        System.out.println(trooper2.getPosition().getPosX()+" "+trooper2.getPosition().getPosY());
    }
}
