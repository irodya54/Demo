package AOP;

import org.springframework.stereotype.Component;

@Component("unilib")
public class UniLibrary extends AbstractLibrary {
//    @Override
    public void getBook() {
        System.out.println("МЫ берем книгу в университете ");
        System.out.println("____________________________________________");
    }

    @Override
    public void returnBook() {
        System.out.println("Мы возвращаем книгу в университет");
        System.out.println("____________________________________________");
    }

    public void getMagazine() {
        System.out.println("МЫ берем журнал в университете");
        System.out.println("____________________________________________");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в университет");
        System.out.println("____________________________________________");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в университет");
        System.out.println("____________________________________________");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в университет");
        System.out.println("____________________________________________");
    }
}
