public class Person {

    private String name;  // private = restricted access

    // getter
    String getName(){
        return name;
    }

    // setter
    void setName(String newName){
        this.name = newName;
    }

}

// error
/*
public class Main2 {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("pin");
        System.out.println(myObj.getName());
    }
}
*/