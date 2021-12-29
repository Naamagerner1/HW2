import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Folder extends StorageItem {
    private String date;
    protected ArrayList <StorageItem> listInFolder;

    public Folder(String name){
        super(name);
        //listInFolder = null;
        listInFolder = new ArrayList<>();
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

    int counter = 1;
    public void printAfterSort(SortingField sortBy){
        for (int j = 0; j<counter-1; j++){
            System.out.print("|    ");
        }
        System.out.println(this.name);
        for (StorageItem currItem : listInFolder){
            if (currItem instanceof Folder) {
                counter++;
                currItem.printTree(sortBy);
            }
            for (int i=0; i<counter ; i++){
                System.out.print("|    ");
            }
            System.out.println(currItem.getName());
        }
    }


    @Override
    public void printTree(SortingField sortBy){
        if (sortBy == SortingField.NAME){
                Collections.sort(listInFolder,(Comparator.comparing((StorageItem item) -> item.getName(), String.CASE_INSENSITIVE_ORDER)));
                printAfterSort(sortBy);
            }
        if (sortBy == SortingField.SIZE){
            Collections.sort(listInFolder,(Comparator.comparing((StorageItem item) -> item.getSize())
                    .thenComparing((StorageItem item) -> item.getName())));
            printAfterSort(sortBy);
        }
        if (sortBy == SortingField.DATE){
            Collections.sort(listInFolder,(Comparator.comparing((StorageItem item) -> item.getCreationDate())
                    .thenComparing((StorageItem item) -> item.getName())));
            printAfterSort(sortBy);
        }
    }





}
