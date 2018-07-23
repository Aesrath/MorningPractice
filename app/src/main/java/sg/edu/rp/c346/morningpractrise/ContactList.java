package sg.edu.rp.c346.morningpractrise;

/**
 * Created by 16003806 on 23/7/2018.
 */

public class ContactList {

    private String name;
    private String numCode;
    private int num;

    public ContactList(String name, String numCode, int num) {
        this.name = name;
        this.numCode = numCode;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumCode() {
        return numCode;
    }

    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "name='" + name + '\'' +
                ", numCode='" + numCode + '\'' +
                ", num=" + num +
                '}';
    }
}
