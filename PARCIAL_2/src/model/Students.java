/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jhon Alexis
 */
public class Students {
     // Attrbutes
    private int id;
    private String code;
    private String name;
    private String lastname;
    private String birthdate;
    private String universitydate;
    private String semester;
    private String faculty;
    
    //Constructors
    public Students() {};

    public Students(int id, String code, String name, String lastname, String birthdate, String universitydate, String semester, String faculty) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.universitydate = universitydate;
        this.semester = semester;
        this.faculty = faculty;
    }

    public Students(int id, String code, String name, String lastname, String faculty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    //Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getUniversitydate() {
        return universitydate;
    }

    public void setUniversitydate(String universitydate) {
        this.universitydate = universitydate;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return  "Id: " +id+ " Code: " +code+ " Name: " +name+ " Last Name: " +lastname+ " Birthdate:" +birthdate+ 
                " Univeristy Date: " +universitydate+ " Semester: " +semester+ " Faculty: " +faculty; 
    }
      
}
