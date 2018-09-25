package com.company.Iterator;

public class BooksCollection extends BaseCollection<Book>{

    @Override
    public Iterator<Book> getIterator() {
        return new BookIterator();
    }


    private class BookIterator implements Iterator<Book> {

        private int position;

        @Override
        public boolean hasNext() {
            return position < collection.size();
        }

        @Override
        public Book next() {
            if (this.hasNext()) {
                return collection.get(position++);
            }
            return null;
        }
    }

}