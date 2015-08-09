package vn.buitanhung.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.buitanhung.jba.entity.Blog;
import vn.buitanhung.jba.entity.Role;

public interface BlogRepository extends JpaRepository<Blog,Integer> {

}
