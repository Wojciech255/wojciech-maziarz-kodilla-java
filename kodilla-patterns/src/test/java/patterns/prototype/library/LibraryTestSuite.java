package patterns.prototype.library;

import org.junit.jupiter.api.Test;
import prototype.library.Book;
import prototype.library.Library;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //when
        Library library = new Library("Project 1");
        library.getBooks().add(new Book("50 Shades of Grey", "E. L. James ", LocalDate.of(2011, 02, 02)));
        library.getBooks().add(new Book("The Last of the Mohicans", "James Fenimore Cooper", LocalDate.of(1826, 02, 02)));
        library.getBooks().add(new Book("The Jungle Book", "Rudyard Kipling", LocalDate.of(1894, 02, 02)));
        library.getBooks().add(new Book("Neverending Story", "Michael Ende", LocalDate.of(1979, 02, 02)));

        Library clonedBoard = null;
        try {
            clonedBoard = library.shallowCopy();
            clonedBoard.setName("Project 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedBoard = null;
        try {
            deepClonedBoard = library.deepCopy();
            deepClonedBoard.setName("Project 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        //When
        //Then
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedBoard.getBooks().size());
    }
}
