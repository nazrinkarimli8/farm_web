package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Vegetable;
import az.edu.turing.farm_web.domain.repository.VegetableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VegetableService {

    private final VegetableRepository vegetableRepository;

    public List<Vegetable> getAllVegetables() {
        return vegetableRepository.findAll();
    }

    public Vegetable getVegetableById(Integer id) {
        return vegetableRepository.findById(id).orElse(null);
    }

    public Vegetable createVegetable(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    public Vegetable updateVegetable(Integer id, Vegetable vegetable) {
        Vegetable existingVegetable = getVegetableById(id);
        if (existingVegetable != null) {
            existingVegetable.setWeight(vegetable.getWeight());
            existingVegetable.setSeasonal(vegetable.isSeasonal());
            existingVegetable.setOrganic(vegetable.isOrganic());
            existingVegetable.setProduct(vegetable.getProduct());
            return vegetableRepository.save(existingVegetable);
        }
        return null;
    }

    public void deleteVegetable(Integer id) {
        vegetableRepository.deleteById(id);
    }
}