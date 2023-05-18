package com.design.pattern.creational.factory.memebership;

public class MemberFactory {

    Member addMember(String memberType){

        if(memberType==null){
            return null;
        }

        if(memberType.equals("TemporaryMember")){
            return new TemporaryMember();
        }else if(memberType.equals("AnnualMember")){
            return new AnnualMember();
        }else if(memberType.equals("PermanentMember")){
            return new PermanentMember();
        }

        return null;

    }
}
