public class ShortCut extends StorageItem{
    private String date;
    private StorageItem item;

    public ShortCut(StorageItem item){
        super(item.getName());
        this.item = item;
    }

    public int getSize() {
        return 1;
    }

    @Override
    public String getName() {
        return item.getName() +" [shortcut]";
    }

    public StorageItem getItem(){
        return item;
    }
}
