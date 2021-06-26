package kodlamaio.nortwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="passwordrepeat")
	private String passwordrepeat;
	
	@Column(name="eMail")
	private String eMail;
	
}
