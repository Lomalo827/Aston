package Module1.Ex1;

import java.util.List;

public class Student {

    private String firstName;

    private String lastName;

    private List<Book> books;

    public Student(String firstName, String lastName, List<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Студент:"+'\n'+"{" +
                "Имя:'" + firstName + '\'' +
                ", Фамилия:'" + lastName + '\'' +
                ", Список книг:" + books +
                '}';
    }
}