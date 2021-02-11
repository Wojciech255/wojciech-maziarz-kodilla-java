package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(12345, "Dylan Murphy", 'm', 2000, 5, 12,1));
        theUserList.add(new ForumUser(26243, "Dorothy Newman", 'f', 1990, 3, 18,0));
        theUserList.add(new ForumUser(74624, "Nicolas Sparks", 'm', 1980, 7, 7,3));
        theUserList.add(new ForumUser(76542, "Matilda Davies", 'f', 2010, 6, 21,4));
        theUserList.add(new ForumUser(32145, "John Smith", 'm', 2011, 9, 25,0));
    }

    public List<ForumUser> getTheUserList() {
        return new ArrayList<>(theUserList);
    }


}
