package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        UniLibrary library = context.getBean("unilib", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        library.addBook("Merzlyakov", book);
//        library.returnBook();
        library.addMagazine();
//        library.returnMagazine();
//
//        SchoolLibrary schoolLibrary = context.getBean("schoollib", SchoolLibrary.class);
//        schoolLibrary.getBook();
//        schoolLibrary.returnBook();



        context.close();
    }
}
