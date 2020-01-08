package com.kodilla.testing.library;

import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testListBookWithConditionReturnList(){

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBook = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBook.add(book1);
        resultListOfBook.add(book2);
        resultListOfBook.add(book3);
        resultListOfBook.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBook);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4,theListOfBooks.size());
    }

    public List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title" + n ,"Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return  resultList;
    }

    @Test
    public void testListBookWithConditionMoreThan20(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Taken
        assertEquals(0,theListOfBooks0.size());
        assertEquals(15,theListOfBooks15.size());
        assertEquals(0,theListOfBooks40.size());



    }

    @Test
    public void testListBookWithConditionFragmentShorterThan3(){
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOffZeroBooks(){

        //Given
        LibraryUser libraryUser = new LibraryUser("Arnold","Oczytany","88092996692");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookList = new ArrayList<Book>();
        when(libraryDatabaseMock.listBooksInHandOff(libraryUser)).thenReturn(bookList);

        //When
        List<Book> resultList = bookLibrary.listBooksInHandOff(libraryUser);

        //Then
        assertEquals(0,resultList.size());
    }

    @Test
    public void testListBooksInHandsOffOneBook(){
        //Given
        LibraryUser libraryUser = new LibraryUser("Arnold","Oczytany","88092996692");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf1Book = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandOff(libraryUser)).thenReturn(resultListOf1Book);

        //When
        List<Book> theListOfOneBook = bookLibrary.listBooksInHandOff(libraryUser);

        //Then
        assertEquals(1,theListOfOneBook.size());


    }

    @Test
    public void testListBooksInHandsOffFiveBooks(){
        //Given
        LibraryUser libraryUser = new LibraryUser("Arnold","Oczytany","88092996692");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandOff(libraryUser)).thenReturn(resultListOf5Books);

        //When
        List<Book> theListOfFiveBooks = bookLibrary.listBooksInHandOff(libraryUser);


        //Then
        assertEquals(5,theListOfFiveBooks.size());


    }
}
