package com.designpattern.creational.factory.memebership;

public class MemberFactoryMainClass {


    public static void main(String[] args) {
        var memberFactory = new MemberFactory();
        var sportClub = new ManageMember(memberFactory);

        sportClub.getMembership("TemporaryMember");
        sportClub.getMembership("AnnualMember");
        sportClub.getMembership("PermanentMember");

        sportClub.print();
    }
}
