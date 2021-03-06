package vn.buitanhung.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.buitanhung.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {

	Role findByName(String name);

}
