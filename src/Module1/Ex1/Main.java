package Module1.Ex1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main (String[] args){
        List<Student> students = new ArrayList<>(List.of(
                new Student("Алексанадр", "Степушин", List.of(
                        new Book(2025,320,"Перекрёсток воронов"),
                        new Book(1963,320,"Под стеклянным колпаком"),
                        new Book(1927,288,"На маяк"),
                        new Book(2003,432,"Гарри Поттер и орден Феникса"),
                        new Book(1861,512,"Униженные и оскорбленные")
                )),
                new Student("Марина","Ахтямова",List.of(
                        new Book(1957,1394,"Атлант расправил плечи"),
                        new Book(1943,798,"Источник"),
                        new Book(2025,320,"Перекрёсток воронов"),
                        new Book(1954,320,"Повелитель мух"),
                        new Book(2005,672,"Гарри Поттер и принц-полукровка")
                )),
                new Student("Алена","Спиридонва",List.of(
                        new Book(2025,320,"Перекрёсток воронов"),
                        new Book(2022,384,"День когда пропали ангелы"),
                        new Book(1928,320,"Оралндо"),
                        new Book(1933,256,"Камера обскура"),
                        new Book(1866,672,"Преступление и наказание")
                ))
        ));

        students.stream().
                peek(student-> System.out.println(student)).
                flatMap(student -> student.getBooks().stream()).
                sorted(Comparator.comparingInt(book->book.getNumberOfPages())).
                distinct().
                filter(book -> book.getPublishYear()>2000).
                limit(3).
                map(book->book.getPublishYear()).
                findFirst().
                map(year->"Год "+year).
                orElse("Книги выпуска позже 2000 года нет").
                lines().
                forEach(student -> System.out.println(student));
    }

}