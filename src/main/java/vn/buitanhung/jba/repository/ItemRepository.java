package vn.buitanhung.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.buitanhung.jba.entity.Item;
import vn.buitanhung.jba.entity.Role;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
