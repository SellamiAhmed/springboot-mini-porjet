package dsi22.project.produits.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import dsi22.project.produits.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

		User findByUsername(String username);

}
