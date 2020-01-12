package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(01,"AdamSmith",'M', LocalDate.of(1998,06,16 ),2));
        theUserList.add(new ForumUser(02,"DavidRicardo",'M', LocalDate.of(1980,04,19 ),0));
        theUserList.add(new ForumUser(03,"ThomasMalthus",'M', LocalDate.of(2010,02,13 ),9));
        theUserList.add(new ForumUser(04,"VeraCaspary",'F', LocalDate.of(1987,06,13 ),8));
        theUserList.add(new ForumUser(05,"FridaKahlo",'F', LocalDate.of(2004,07,06 ),0));
        theUserList.add(new ForumUser(06,"KatharineHepburn",'F', LocalDate.of(1989,05,12 ),22));
        theUserList.add(new ForumUser(07,"MargaretThatcher",'F', LocalDate.of(1990,10,13 ),60));
    }

    public List<ForumUser> getTheUserList() {
        return new ArrayList<>(theUserList);
    }

}
