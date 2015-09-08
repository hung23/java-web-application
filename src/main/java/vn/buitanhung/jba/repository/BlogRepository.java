package vn.buitanhung.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.buitanhung.jba.entity.Blog;
import vn.buitanhung.jba.entity.Role;
import vn.buitanhung.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
	
	List<Blog> findByUser(User user);

}
