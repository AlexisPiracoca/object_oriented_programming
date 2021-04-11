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
public class SongAuthor {
    //Attributes
    private int songId;
    private String authorId;
    
    //Constructors
    public SongAuthor(){}
    
    public SongAuthor(int songId, String autorId){
        this.songId = songId;
        this.authorId = authorId;
    }
    
    //Getter and Setters
    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
    
}
