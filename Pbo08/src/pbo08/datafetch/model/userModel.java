/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo08.datafetch.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author MZ17
 */
public class userModel {
      @SerializedName("id")
	private int id;
	@SerializedName("password")
	private String password;

	@SerializedName("nama")
	private String nama;
        
	@SerializedName("username")
	private String username;
       

    public userModel(String password, String nama, int id, String username) {
        this.password = password;
        this.nama = nama;
        this.id = id;
        this.username = username;
    }

    public userModel(String password, String nama, String username, String role) {
        this.password = password;
        this.nama = nama;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

       
}
