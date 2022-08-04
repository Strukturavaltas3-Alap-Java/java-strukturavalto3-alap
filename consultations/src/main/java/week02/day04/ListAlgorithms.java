package week02.day04;

import java.util.List;

public class ListAlgorithms {
    //5,4,6,7,3,5,6,8,1,2,4,3,2,1,-1,9,2
    //1,5,6,7,9,11

    //Döntsd el, hogy a számok végig növekednek-e!
    public boolean isListIncreasing(List<Integer> myList){
        for(int i=1;i<myList.size();i++){
            if(myList.get(i)<myList.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
