package main.java.com.dnd.controllers;

import main.java.com.dnd.dto.CharacterDTO;
import main.java.com.dnd.Character;
import main.java.com.dnd.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {
    @Autowired
    private CharacterService characterService;

    @GetMapping
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable Long id) {
        return characterService.getCharacterById(id);
    }

    @PostMapping
    public Character createCharacter(@RequestBody CharacterDTO characterDTO) {
        return characterService.saveCharacter(characterDTO);
    }

    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable Long id, @RequestBody CharacterDTO characterDTO) {
        return characterService.updateCharacter(id, characterDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
    }
}
