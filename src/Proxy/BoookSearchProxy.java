package Proxy;

import java.util.List;

public class BoookSearchProxy {
    private BookSearch bSearch;
    private List<Book> cache;

    public BoookSearchProxy (BookSearch bSearch) {
        this.bSearch = bSearch;
    }
    public Book getBook (String isbn) {
        Book b1 = null;
        if (cache.isEmpty()) {
            bSearch.getBook(isbn);
            if (b1 != null) {
                cache.add(b1);
            }
        } else {
            for (Book b : cache) {
                b1 = b.getIsbn() == isbn ? b : null;
                if (b1 != null) {
                    break;
                }
            }
        }
        return b1;
    }
}
