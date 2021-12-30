import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class StorageItem {
    protected String name;
    protected Date date;

    public StorageItem (String name){
        this.name=name;
        Date d1 = new Date(117,0,1,0,0,0);
        Date d2 = new Date(122,11,31,23,59,59);
        long miliSec1 = d1.getTime();
        long miliSec2 = d2.getTime();
        long distance = miliSec2 - miliSec1;
        long random = Main.rnd.nextLong();
        if (random < 0)
            random = (-1) * random;

        long modulu = random % distance;
        long dateMiliSec = miliSec1 + modulu;
        date = new Timestamp(dateMiliSec);
    }
    public String getName(){
        return name;
    }
    public String getCreationDate(){
        return date.toString();
    }
    public abstract int getSize();

    public void printTree(SortingField sortBy, int number){
        return;
    }
    public void printTree(SortingField sortBy){
        printTree(sortBy, 1);
    }
    File findFile(String path){
        return null; ///////////////////////////////////////////////////
    }


}
