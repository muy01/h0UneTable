package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= tech.Parametres.TABLE_LIVRE)   		//permet de renommer la table: document dans oracle est un mot reservé, donc il faut renommer
public class Livre {
	
	@Id
	@Column(name = tech.Parametres.COL_REFLIVRE) 	//changm du nom de la colonne
	@GeneratedValue(strategy=GenerationType.AUTO)	// (sequence pour générer les valeurs) pas besoin de générer l'id , hibernate le fera pour nous, attention !
	private int 	iD  				= 1;
	
	@Column(length = 20, nullable=false) 			//contrainte NOT NULL et taille
	private String 	isbn 				= null;
	
	@Column(name = tech.Parametres.COL_DATE_ENREGISTR)
	@Temporal(TemporalType.DATE)					//donne le type Date 
	private Date 	dateEnregistrement 	= null;
	private int 	etat 				= 0;
	
	
	
	
	/*
	 * CONSTRUCTEURS
	 */
	
	
	/**
	 * Constructor just iD pour le find
	 * @param iD
	 */
	public Livre(int iD) {
		super();
		this.iD = iD;
	}




	/**
	 * Constructeur all fields
	 * @param iD
	 * @param isbn
	 * @param dateEnregistrement
	 * @param etat
	 */
	public Livre(int iD, String isbn, Date dateEnregistrement, int etat) {
		super();
		this.iD = iD;
		this.isbn = isbn;
		this.dateEnregistrement = dateEnregistrement;
		this.etat = etat;
	}



	/*
	 * GETTERS AND SETTERS
	 */

	public int getiD() {
		return iD;
	}




	public void setiD(int iD) {
		this.iD = iD;
	}




	public String getIsbn() {
		return isbn;
	}




	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}




	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}




	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}




	public int getEtat() {
		return etat;
	}




	public void setEtat(int etat) {
		this.etat = etat;
	}
	
	
	
	
	
	
	

}
