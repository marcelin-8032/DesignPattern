package com.design.pattern.structural.composite.armyhierarchy;

class ArmyCompositeDemo {
    public static void main(String[] args) {

        // Creating soldiers
        Soldier soldier1 = new Soldier("John");
        Soldier soldier2 = new Soldier("Paul");
        Soldier soldier3 = new Soldier("George");
        Soldier soldier4 = new Soldier("Ringo");

        // Creating sergeants and adding soldiers to them
        Sergeant sergeant1 = new Sergeant("Sergeant Smith");
        Sergeant sergeant2 = new Sergeant("Sergeant Brown");

        sergeant1.add(soldier1);
        sergeant1.add(soldier2);

        sergeant2.add(soldier3);
        sergeant2.add(soldier4);

        // Creating a general and adding sergeants to the general
        General general = new General("General Williams");
        general.add(sergeant1);
        general.add(sergeant2);

        // Display details of the entire hierarchy
        general.showDetails();
    }

}
