package com.online.shopping.entity;

import java.io.Serializable;

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
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection="shopkeeper_osw")
public class Shopkeeper implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	2. Shopkeeper:
//		shopkeeperId: Unique identifier for each shopkeeper.
//		name: Name of the shopkeeper.
//		email: Email address of the shopkeeper (used for registration and communication).
//		password: Securely hashed password for authentication.
//		products: List of products the shopkeeper sells.
//		inventory: List of products in the shopkeeper's inventory.

		
		private String id;
		
		private String shopkeeperId;
		
		private String name;
		
		private String email;
		
		private String inventory;
		
//		private String email;
		
		

}
