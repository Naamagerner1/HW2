import java.util.Collections;
import java.util.Comparator;

public class File extends StorageItem {
    //public String name;
    private String ext;
    private String content;
    //private String date;

    public File (String name, String ext){
        super(name);
        this.ext = ext;
        content = new String();
    }
    public String getExt(){
        return ext;
    }
    /*
    public String getCreationDate(){
        return date.toString();
    }*/
    public String getContent(){
        return content;
    }

    @Override
    public String getName(){
        String theName = name + "." + ext;
        return theName;
    }
    public int getSize(){
        return content.length();
    }

    void addContent(String contentToAdd){
        content = content + contentToAdd;
    }
    void printContent(){
        int size = getSize();
        System.out.println(this.getName()+" Size: "+size+"MB Created: "+this.getCreationDate());
        System.out.println(content);
    }

}
