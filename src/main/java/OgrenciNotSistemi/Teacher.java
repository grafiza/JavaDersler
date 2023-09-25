package OgrenciNotSistemi;

public class Teacher {
    public String name;
    public String branch;

    public Teacher() {
    }

    public Teacher(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
    public void Teacher(){

    }
}
