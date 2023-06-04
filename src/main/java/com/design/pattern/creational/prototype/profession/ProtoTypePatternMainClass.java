package com.design.pattern.creational.prototype.profession;

import lombok.extern.slf4j.Slf4j;

@Slf4j
 class ProtoTypePatternMainClass {


     public static void main(String[] args) throws CloneNotSupportedException {
         ProfessionCache.loadProffesionCache();

         Profession docProfession=ProfessionCache.getCloneNewProfession(1);
         log.info(String.valueOf(docProfession));

         Profession engProfession=ProfessionCache.getCloneNewProfession(2);
         log.info(String.valueOf(engProfession));

         Profession teachProfession=ProfessionCache.getCloneNewProfession(3);
         log.info(String.valueOf(teachProfession));

         Profession docProfession2=ProfessionCache.getCloneNewProfession(1);
         log.info(String.valueOf(docProfession2));


     }
}
