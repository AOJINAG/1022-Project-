package lab5;

public class Instructor {

    private String name;
    private int phoneExt;
    private String email;


    public Instructor(String name, int phoneExt, String email) {
        this.name = "Jackie";
        this.phoneExt = 70130;
        this.email = "jackie@eecs.yorku.ca";
    }

    public String getName() {
        return name;
    }

    public int getPhoneExtension() {
        return phoneExt;
    }

    public String getEmail() {
        return email;
    }

    public String getInformation() {
        return "Instructor " + name + " has campus phone extension " + phoneExt + " and contact email " + email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneExtension(int phoneExt) {
        this.phoneExt = phoneExt;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
