package main.java.com.dnd.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int level;

    @ManyToOne
    private Class characterClass;

    @ManyToMany
    private List<Item> items;

}
