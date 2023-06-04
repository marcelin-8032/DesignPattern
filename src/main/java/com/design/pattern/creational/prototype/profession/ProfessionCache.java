package com.design.pattern.creational.prototype.profession;

import java.util.Hashtable;
import java.util.Map;

public class ProfessionCache {


    private static Map<Integer, Profession> professionMap = new Hashtable<>();


    public static Profession getCloneNewProfession(int id) throws CloneNotSupportedException {
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession) cachedProfessionInstance.clone();
    }


    public static void loadProffesionCache() {
        var doctor = new Doctor();
        doctor.id = 1;
        professionMap.put(doctor.id, doctor);

        var engineer = new Engineer();
        engineer.id = 2;
        professionMap.put(engineer.id, engineer);

        var teacher = new Teacher();
        teacher.id = 3;
        professionMap.put(teacher.id, teacher);

    }

}
