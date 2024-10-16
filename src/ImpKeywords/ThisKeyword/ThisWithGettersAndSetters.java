package ImpKeywords.ThisKeyword;

public class ThisWithGettersAndSetters {
    int id;
    String name;

    //set value - setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // get value - getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ThisWithGettersAndSetters obj = new ThisWithGettersAndSetters();
        obj.setId(1);
        obj.setName("jitendra");
        System.out.println("Id : "+obj.getId()+" | Name : "+obj.getName());
    }
}

