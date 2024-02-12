package com.online.shopping.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown= true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection="customer_osw")
public class Customer implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	@Id
	private String id;
	
	private String name;
	
	private String email;
	
	private String cart;
	
	private String orders;
	

}
