package com.design.pattern.behavioral.iterator.socialnework;

public class FaceBookIterator implements ProfileIterator {

    private Facebook facebook;
    private String profileId, type;
    private Integer currentPosition;
    private Profile profile[];


    public FaceBookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    @Override
    public Profile getNext() {
        return null;
    }

    @Override
    public boolean hasMore() {
        return false;
    }
}
