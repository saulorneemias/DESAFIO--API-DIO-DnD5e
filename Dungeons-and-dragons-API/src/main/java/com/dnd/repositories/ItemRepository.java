package main.java.com.dnd.repositories;

import main.java.com.dnd.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}