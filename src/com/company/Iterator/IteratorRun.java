package com.company.Iterator;


public class IteratorRun {

    public static void run() {
        BaseCollection<Book> bookCollection = new BooksCollection();
        Book book = new Book("1", "Harry Potter", 2001);
        Book book1 = new Book("2", "Gra o Tron", 2008);
        Book book2 = new Book("3", "Hobbit", 2012);
        bookCollection.addItem(book);
        bookCollection.addItem(book1);
        bookCollection.addItem(book2);
        Iterator<Book> bookIterator = bookCollection.getIterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }
    }
}