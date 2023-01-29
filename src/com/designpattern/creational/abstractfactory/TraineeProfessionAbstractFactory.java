package com.designpattern.creational.abstractfactory;


 class TraineeProfessionAbstractFactory extends AbstractFactory {
    @Override
    Profession getProfession(String typeOfProfession) {

        if (typeOfProfession == null) {
            return null;
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new TraineeEngineer();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new TraineeEngineer();
        } else if (typeOfProfession.equalsIgnoreCase("Doctor")) {
            return new TraineeDoctor();
        }
        return null;
    }
}
