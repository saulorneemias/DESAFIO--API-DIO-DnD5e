package main.java.com.dnd.repositories;

import main.java.com.dnd.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
