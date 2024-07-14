package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Fruit;
import az.edu.turing.farm_web.domain.repository.FruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FruitService {

    private final FruitRepository fruitRepository;

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    public Fruit getFruitById(Long id) {
        return fruitRepository.findById(id).orElse(null);
    }

    public Fruit createFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Long id, Fruit fruit) {
        Fruit existingFruit = getFruitById(id);
        if (existingFruit != null) {
            existingFruit.setType(fruit.getType());
            existingFruit.setProduct(fruit.getProduct());
            return fruitRepository.save(existingFruit);
        }
        return null;
    }

    public void deleteFruit(Long id) {
        fruitRepository.deleteById(id);
    }
}
