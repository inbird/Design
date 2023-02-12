package behavioral.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        BookShelfAggregate bookShelfAggregate = new BookShelfAggregate(3);

        bookShelfAggregate.appendBook(new Book("JAVA"));
        bookShelfAggregate.appendBook(new Book("Python"));
        bookShelfAggregate.appendBook(new Book("Oracle"));

        Iterator it = bookShelfAggregate.CreateIterator();

        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
