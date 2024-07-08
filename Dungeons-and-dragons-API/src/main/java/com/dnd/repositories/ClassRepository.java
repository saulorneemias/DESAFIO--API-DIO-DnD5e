package main.java.com.dnd.repositories;

import main.java.com.dnd.models.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class, Long> {