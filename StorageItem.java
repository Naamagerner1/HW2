import java.util.*;

public abstract class StorageItem {
    protected String name;
    Date date;

    public StorageItem (String name){
        this.name=name;
        Date d1 = new Date(2017,0,0,0,0,0);
        Date d2 = new Date(2022,11,31,23,59,59);
        long miliSec1 = d1.getTime();
        long miliSec2 = d2.getTime();
        long distance = miliSec2 - miliSec1;
        long random = Main.rnd.nextLong();
        if (random < 0)
            random = -1 * random;

        long modulu = random % distance;
        long dateMiliSec = miliSec1 + modulu;
        date = new Date(dateMiliSec);
    }
    public String getName(){
        return name;
    }
    public abstract int getSize();

    public void printTree(SortingField sortBy){
        return;
    }

}
