public class Teacher extends Person {

    private String id;

    public Teacher(String name, String surname, String id) {
        // new Person(name, surname)
        super(name, surname);
        this.id = id;
    }

    @Override
    public String toString() {
        return this.id + " " + super.toString();
    }
}
