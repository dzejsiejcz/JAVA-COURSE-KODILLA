package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> theListOfForumUsers = new ArrayList<>();

    public Forum() {
        theListOfForumUsers.add(new ForumUser(1, "Adam", 'M',
                LocalDate.of(1999,5,3), 5 ));
        theListOfForumUsers.add(new ForumUser(2, "Megan", 'F',
                LocalDate.of(2002,5,3), 5 ));
        theListOfForumUsers.add(new ForumUser(3, "Nicole", 'F',
                LocalDate.of(2006,5,3), 5 ));
        theListOfForumUsers.add(new ForumUser(4, "John", 'M',
                LocalDate.of(1986,5,3), 5 ));
        theListOfForumUsers.add(new ForumUser(5, "George", 'M',
                LocalDate.of(2010,5,3), 5 ));
        theListOfForumUsers.add(new ForumUser(6, "Roger", 'M',
                LocalDate.of(2001,11,1), 5 ));
        theListOfForumUsers.add(new ForumUser(7, "Tom", 'M',
                LocalDate.of(2001,11,30), 5 ));
    }

    public final List<ForumUser> getUserList() {
        return theListOfForumUsers;
    }
}
