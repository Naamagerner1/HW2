import java.util.ArrayList;

public class Folder extends StorageItem {
    private String date;
    private ArrayList <StorageItem> listInFolder = new ArrayList<>();

    public Folder(String name){
        super(name);
        listInFolder = null;
    }

    public int getSize() {
        int sum = 0;
        for (StorageItem currItem : listInFolder){
            sum += currItem.getSize();
        }
        return sum;
    }

    boolean addItem (StorageItem item) {
        for (StorageItem currItem : listInFolder){
            if (currItem.getName() == item.getName())
                return false;
        }
        listInFolder.add(item);
        return true;
    }
    File findFile(String path){
        String[] separated = path.split("/");
        String fileInPath = null;
        for (String currInSeparated : separated){
            fileInPath = currInSeparated;
        }
        for (StorageItem currItem : listInFolder) {
            if (currItem.getName() == fileInPath) {
                if (currItem instanceof File)
                    return (File)currItem;
            }
        }
        return null;
    }





}
