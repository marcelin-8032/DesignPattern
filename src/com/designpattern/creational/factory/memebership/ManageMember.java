package com.designpattern.creational.factory.memebership;

import java.util.LinkedList;

public class ManageMember {

    MemberFactory memberFactory;

    LinkedList<Member> memberLinkedList;

    public ManageMember(MemberFactory memberFactory) {
        this.memberFactory = memberFactory;
        this.memberLinkedList = new LinkedList<>();
    }

    public void getMembership(String memberType) {
        Member newMember = memberFactory.addMember(memberType);
        memberLinkedList.add(newMember);
    }

    public void print() {
        for (Member m : memberLinkedList) {
            m.print();
        }
    }

}



