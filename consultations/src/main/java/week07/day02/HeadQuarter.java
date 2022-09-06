package week07.day02;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();


    public void addTrooper(Trooper trooper){
        troopers.add(trooper);
    }

    public void moveClosestTrooper(Position target){
        if(troopers.size()==0){
            throw new IllegalArgumentException("HeadQuarter has no troopers!");
        }
        Trooper closest= findClosestTrooper(target);
        moveTrooper(closest,target);

    }

    public void moveTrooperByName(String name, Position target){
        Trooper found = findTrooperByName(name);
         moveTrooper(found,target);
    }

    private Trooper findTrooperByName(String name){
        for(Trooper actual: troopers){
            if(actual.getName().equals(name)){
                return actual;
            }
        }
        throw new IllegalArgumentException("HeadQuarter has no trooper with name: "+name);
    }

    private Trooper findClosestTrooper(Position target) {
        Trooper closest = troopers.get(0);
        for(Trooper actual : troopers){
            if(actual.distanceFrom(target)< closest.distanceFrom(target)){
                closest = actual;
            }
        }
        return closest;
    }

    private void moveTrooper(Trooper trooper, Position target){
        trooper.changePosition(target);
    }
}
