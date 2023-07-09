package com.design.pattern.behavioral.iterator.socialnework;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkersIterator(String profileId);
}
