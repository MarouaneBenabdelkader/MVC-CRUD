package org.pfe.models;

import java.util.ArrayList;

public class Student {
    
    private static ArrayList<Student> students = new ArrayList<Student>();
    
    public static void save(Student student){
        students.add(student);
    }
    
    public  static ArrayList<Student> getAll(){
        return students;
    }
    
    public static void update(Student student){
        for (Student st: students) {
            if (student.getCne().equals(st.getCne())) {
                st.setName(student.getName());
                return;
            }
        }
    }

    public static void delete(Student student){
        for (Student st: students) {
            if (student.getCne().equals(student.getCne())) {
                students.remove(st);
                return;
            }
        }
    }
    public static Student getByCne(String cne) {
        for (Student st: students) {
            if (st.getCne().equals(cne)) {
                return st;
            }
        }

        return  null;
    }
    public String getCne() {
        return cne;
    }
    
    
    public void setCne(String cne) {
        this.cne = cne;
    }

    private String cne;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    
    
}
