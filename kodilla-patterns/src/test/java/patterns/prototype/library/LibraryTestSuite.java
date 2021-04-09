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
        library.getBooks().add(new Book("tittttleee", "autoooor", LocalDate.of(2002, 02, 02)));
        library.getBooks().add(new Book("tittttleee2", "autoooor2", LocalDate.of(2002, 02, 02)));
        library.getBooks().add(new Book("tittttleee3", "autoooor3", LocalDate.of(2003, 02, 02)));
        library.getBooks().add(new Book("tittttleee4", "autoooor4", LocalDate.of(2004, 02, 02)));

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
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedBoard);
        //When
        //Then
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedBoard.getBooks().size());
    }
}
