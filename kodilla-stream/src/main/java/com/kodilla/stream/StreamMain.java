package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getUserBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getQuantityCommentsOfUser() > 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        forumMap.entrySet().stream()
                .map(entry -> "UserId: " + entry.getKey() + ": " + entry.getValue().toString())
                .forEach(System.out::println);
    }
}
