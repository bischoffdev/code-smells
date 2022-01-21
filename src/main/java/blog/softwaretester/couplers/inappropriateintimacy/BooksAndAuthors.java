package blog.softwaretester.couplers.inappropriateintimacy;

public class BooksAndAuthors{
    class Book {
        private final String title;
        private Author author;

        public Book(String title) {
            this.title = title;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }
    }

    class Author {
        private final String name;
        private Book book;

        public Author(String name) {
            this.name = name;
        }

        public void setBook(Book book) {
            this.book = book;
        }
    }
}

