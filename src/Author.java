public class Author {
    String name = "Александр";
    String surname = "Пушкин";
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }
}