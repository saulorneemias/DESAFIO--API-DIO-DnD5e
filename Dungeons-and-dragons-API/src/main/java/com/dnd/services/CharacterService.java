package main.java.com.dnd.services;

import main.java.com.dnd.models.Character;
import main.java.com.dnd.repositories.CharacterRepository;
import main.java.com.dnd.dto.CharacterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    public Character getCharacterById(Long id) {
        return characterRepository.findById(id).orElse(null);
    }

    public Character saveCharacter(CharacterDTO characterDTO) {
        Character character = new Character();
        character.setName(characterDTO.getName());
        character.setLevel(characterDTO.getLevel());
        // Configurar characterClass e items
        return characterRepository.save(character);
    }

    public Character updateCharacter(Long id, CharacterDTO characterDTO) {
        Character character = characterRepository.findById(id).orElse(null);
        if (character != null) {
            character.setName(characterDTO.getName());
            character.setLevel(characterDTO.getLevel());
            // Atualizar characterClass e items
            return characterRepository.save(character);
        }
        return null;
    }

    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }
}