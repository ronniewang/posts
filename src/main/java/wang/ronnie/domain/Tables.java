/**
 * This class is generated by jOOQ
 */
package wang.ronnie.domain;


import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.LANGUAGE</code>.
     */
    public static final Language LANGUAGE = wang.ronnie.domain.Language.LANGUAGE;

    /**
     * The table <code>PUBLIC.AUTHOR</code>.
     */
    public static final Author AUTHOR = Author.AUTHOR;

    /**
     * The table <code>PUBLIC.BOOK</code>.
     */
    public static final Book BOOK = Book.BOOK;

    /**
     * The table <code>PUBLIC.BOOK_STORE</code>.
     */
    public static final BookStore BOOK_STORE = wang.ronnie.domain.BookStore.BOOK_STORE;

    /**
     * The table <code>PUBLIC.BOOK_TO_BOOK_STORE</code>.
     */
    public static final BookToBookStore BOOK_TO_BOOK_STORE = wang.ronnie.domain.BookToBookStore.BOOK_TO_BOOK_STORE;
}