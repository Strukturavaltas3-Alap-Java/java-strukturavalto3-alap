package week13.day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {

    ClassNoteBook classNoteBook = new ClassNoteBook();

    @Test
    void testAddStudent(){
        assertTrue(classNoteBook.getNotebook().isEmpty());

        classNoteBook.addStudent(new Student(1L,"John"));

        assertFalse(classNoteBook.getNotebook().isEmpty());
        assertEquals(0, classNoteBook.getNotebook().get(1L).size());
    }

    @Test
    void testAddMark(){
        classNoteBook.addStudent(new Student(1L,"John"));

        classNoteBook.addMark(1L,5);
        classNoteBook.addMark(1L,4);

        assertEquals(2, classNoteBook.getNotebook().get(1L).size());
    }

    @Test
    void testAddMarkWithWrongId(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,()->classNoteBook.addMark(1L,5));

        assertEquals("Id not exists: 1", iae.getMessage());
    }

}