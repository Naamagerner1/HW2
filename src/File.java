public class File extends StorageItem {
    //public String name;
    private String ext;
    private String content;
    private String date;

    public File (String name, String ext){
        super(name);
        this.ext = ext;
        content = null;
    }
    public String getExt(){
        return ext;
    }
    public String getDate(){
        return date;
    }
    public String getContent(){
        return content;
    }

    @Override
    public String getName(){
        return this.name+"."+ext;
    }
    public int getSize(){
        return content.length();
    }

    void addContent(String contentToAdd){
        content = content + contentToAdd;
    }
    void printContent(){
        int size = getSize();
        System.out.println(this.name+" Size: "+size+"MB Created: "+date);
        System.out.println(content);
    }
}
