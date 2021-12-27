import java.util.*;

public abstract class StorageItem {
    protected String name;
    //private int size;

    public StorageItem (String name){
        this.name=name;
        Date d1 = new Date(2017,0,0,0,0,0);
        Date d2 = new Date(2022,11,31,23,59,59);
        Date d3 = new Date(2023,0,0,0,0,0);
        long miliSec1 = d1.getTime();
        long miliSec2 = d2.getTime();
        long miliSec3 = d3.getTime();
        long modolu = miliSec2 % miliSec1;
        long modoluNotGood = miliSec3 % miliSec2;
        System.out.println("1 - "+miliSec1 + " 2- "+miliSec2 + " modolu -> "+modolu + " Not Good -> "+modoluNotGood);

        //long random = Main.rnd.nextLong(miliSec1,miliSec2);
    }
    public String getName(){
        return name;
    }
    public abstract int getSize();

    public void printTree(SortingField sortBy){
        if (sortBy == SortingField.NAME){
            
        }
    }

}
