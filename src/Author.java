public class Author {
    String name = "Александр";
    String surname = "Пушкин";
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String getName() {
        return name;
    }

    private String getSurname() {

        return surname;
    }
}
