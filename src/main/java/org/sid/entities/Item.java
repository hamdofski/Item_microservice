package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


 @Entity
public class Item implements Serializable {
	 
	 @Id @GeneratedValue
	private Long idItem;
	private Long idProduct;
	private Long idFacture;
	private int quantite;
	
	
	public Item(Long idProduct, Long idFacture, int quantite) {
		super();
		this.idProduct = idProduct;
		this.idFacture = idFacture;
		this.quantite = quantite;
	}
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdItem() {
		return idItem;
	}
	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	

}
