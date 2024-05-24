package dsi22.project.produits.service;

import dsi22.project.produits.entities.Role;
import dsi22.project.produits.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);


}
