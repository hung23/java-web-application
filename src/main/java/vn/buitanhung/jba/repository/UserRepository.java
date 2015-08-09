package vn.buitanhung.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.buitanhung.jba.entity.Role;
import vn.buitanhung.jba.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
