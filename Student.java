
package test1;
class Student {
        private String id;
    private String name;
    private String address;
    private int yob;
    private String standard;

    public Student(String id, String name, String address, int yob, String standard) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.yob = yob;
        this.standard = standard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
    
}