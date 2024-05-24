package dsi22.project.produits.entities;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.JoinColumn;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private Long user_id;
private String username;
private String password;
private Boolean enabled;

@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
@JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id") ,
inverseJoinColumns = @JoinColumn(name="role_id"))
private List<Role> roles;

public User() {
	
}
public User(Long user_id, String username, String password, Boolean enabled, List<Role> roles) {
	super();
	this.user_id = user_id;
	this.username = username;
	this.password = password;
	this.enabled = enabled;
	this.roles = roles;
}

public Long getUser_id() {
	return user_id;
}
public void setUser_id(Long user_id) {
	this.user_id = user_id;
}
public void setUsername(String username) {
	this.username = username;
}
public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
}
public void setRoles(List<Role> roles) {
	this.roles = roles;
}
public String getPassword() {
	return this.password;
}

public void setPassword(String password) {
	this.password =password;
	
}

public List<Role> getRoles() {
	return this.roles;
}

public String getUsername() {
	return this.username;
}

public Boolean getEnabled() {
	return this.enabled;
}


}
