/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo08.datafetch.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author MZ17
 */
public class ResponseUser {
    @SerializedName("data")
	private List<userModel> data;

	@SerializedName("status")
	private String status;

	public List<userModel> getData(){
		return data;
	}

	public String getStatus(){
		return status;
	}
}
