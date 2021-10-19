package MASTER_SISPRING.AP10;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection="patients")
public class Patient {
	
	@Id
	private ObjectId _id;
	
	private String nom,prenom,sexe;
	private DateTimeFormat date;
	public ObjectId getId() {
		return _id;
	}
	public void setId(ObjectId id) {
		this._id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public DateTimeFormat getDate() {
		return date;
	}
	public void setDate(DateTimeFormat date) {
		this.date = date;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(ObjectId id, String nom, String prenom, DateTimeFormat date, String sexe) {
		super();
		this._id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.sexe = sexe;
	}
	
	
	
	
	
}
