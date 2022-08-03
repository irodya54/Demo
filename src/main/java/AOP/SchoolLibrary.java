package AOP;

import org.springframework.stereotype.Component;

@Component("schoollib")
public class SchoolLibrary extends AbstractLibrary{
//    @Override
    public void getBook() {
        System.out.println("Мы берем книгу в школе");
    }

    @Override
    public void returnBook() {
        System.out.println("Мы возвращаем книгу в школу");
    }
}
