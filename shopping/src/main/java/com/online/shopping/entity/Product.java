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
@Document(collection="product_osw")
public class Product implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	
		
	@Id
	private String productId; 
	
	private String name;
	
	private String description;
	
	private String price;
	
	
	private String stock;
	
//	private Manufacturer manufacturer;
	
	
	
	
	

}
