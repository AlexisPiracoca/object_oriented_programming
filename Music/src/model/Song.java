/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ITEDRIS
 */
public class Song {
    //Attributes
    private int id;
    private String name;
    private String releaseDate;
    private String duration;
    
    //Constructors
    public Song(){}

    public Song(int id, String name, String releaseDate, String duration) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }
    
    //Getter and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
}
