package org.iesfm.library;

import org.iesfm.library.exceptions.BookNotFoundException;
import org.iesfm.library.exceptions.MemberNotFoundException;

public interface ILibrary {

    void showBooks();

    void showBooks(String genre);

    void showMembers();

    void showMembers(int cp);

    void showMemberLends(String nif);

    void showMemberLends(int numMember);

    void showMemberInfo(String nif) throws MemberNotFoundException;

    void showBook(int isbn) throws BookNotFoundException;

    // is has

    boolean memberHasLend(int numMember, int isbn);
}
