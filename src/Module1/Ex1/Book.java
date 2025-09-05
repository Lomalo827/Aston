package Module1.Ex1;

import java.util.Objects;

public class Book {

    private String name;
    private int publishYear;
    private int numberOfPages;

    public Book(int publishYear, int numberOfPages, String name) {
        this.publishYear = publishYear;
        this.numberOfPages = numberOfPages;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return '\n'+"Книга{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    //Переопределяем equals и hashCode, чтобы distinct в стриме отработал корректно
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear &&
                numberOfPages == book.numberOfPages &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishYear, numberOfPages, name);
    }
}