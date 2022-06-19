package com.syntax.class20;
public class Task3 {
    public static void main(String[] args) {
    ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
    chemistryTeacher.name ="Bla";
    chemistryTeacher.specialChemSubject = "Organic";
    chemistryTeacher.teachesChem();
    }
}
class Teacher {
    String name;
    String typeOfTeacher;
    void teach(){
        System.out.println(name+" teaches " + typeOfTeacher);
    }
}
class MathTeacher extends Teacher{
    String specialMathSubject;
    public void teachesMath(){
        System.out.println(name + " Teaches Math and his favourite math subject is " + specialMathSubject);
    }
}
class ChemistryTeacher extends Teacher{
    String specialChemSubject;
    public void teachesChem(){
        System.out.println(name + " Teaches chemistry and his favourite math subject is " + specialChemSubject);
    }
}
class PianoTeacher extends Teacher{
    String favoriteModelOfPiano;
    public void teachesPiano(){
        System.out.println(name + " teaches piano and his favorite Piano model is " + favoriteModelOfPiano);
    }
}