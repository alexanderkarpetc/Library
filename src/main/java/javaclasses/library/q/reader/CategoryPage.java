package javaclasses.library.q.reader;

import javaclasses.library.c.Status;
import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookVO;

import java.util.Map;
import java.util.TreeMap;
//Todo[Karpets]: need to check if this one is necessary
public class CategoryPage {
    private Map<BookVO, Status> books = new TreeMap<>();
    private UserId currentUser;//???
}
