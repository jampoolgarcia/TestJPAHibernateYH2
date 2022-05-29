package testAppAdminEmpre.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String lastName;
	
	@Column
	private Date date;
	
	public Empleado() {
		
	}

	public Empleado(Long id, String name, String lastName, Date date) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", name=" + name + ", lastName=" + lastName + ", date=" + date + "]";
	}
	
	

	
}
