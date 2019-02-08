package br.com.flaprc.entidades;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Entidade pai para todo o sistema FlapRC.
 * 
 * @author Sávio
 */
@MappedSuperclass
public class FlapRCEntidade implements Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -2152443572434373454L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}