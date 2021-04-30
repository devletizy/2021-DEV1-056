/**
 * 
 */
package com.test.morpion.backend.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author bilonjea
 *
 */
@Data
@Component
public class MorpionCase {
	
	private int posX;
	
	private int posY;
	
	private String State; // the case is disable when it full
	
	private String type; //Diagonal, Middle, and Center
	
	private String value; // X or O

}
