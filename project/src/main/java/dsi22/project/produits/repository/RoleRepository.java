package dsi22.project.produits.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import dsi22.project.produits.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(String role);
	
}

