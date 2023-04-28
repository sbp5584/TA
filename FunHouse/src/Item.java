public class Item {

    public int hp_regen;
    protected String name;
    protected String desc;
    protected int value;

    public Item(String name, String desc, int value){
        this.name = name;
        this.desc = desc;
        this.value= value;
    }
    public Item(String name, int uses){
        this.name = name;
    }
    public String toString(){
        return String.format("%s \n=====\n %s \nValue= %d \n", this.name, this.desc, this.value);
    }


}