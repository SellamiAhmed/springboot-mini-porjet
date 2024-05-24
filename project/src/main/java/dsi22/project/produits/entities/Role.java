package dsi22.project.produits.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private Long role_id;
private String role;

public Role() {
	
}

public Role(Long role_id, String role) {
	super();
	this.role_id = role_id;
	this.role = role;
}



public String getRole() {
	return this.role;	
}

public Long getRole_id() {
	return role_id;
}

public void setRole_id(Long role_id) {
	this.role_id = role_id;
}

public void setRole(String role) {
	this.role = role;
}

}