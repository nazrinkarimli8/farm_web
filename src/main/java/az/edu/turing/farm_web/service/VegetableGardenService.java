package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.VegetableGarden;
import az.edu.turing.farm_web.domain.repository.VegetableGardenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VegetableGardenService {

    private final VegetableGardenRepository vegetableGardenRepository;

    public List<VegetableGarden> getAllVegetableGardens() {
        return vegetableGardenRepository.findAll();
    }

    public VegetableGarden getVegetableGardenById(Integer id) {
        return vegetableGardenRepository.findById(id).orElse(null);
    }

    public VegetableGarden createVegetableGarden(VegetableGarden vegetableGarden) {
        return vegetableGardenRepository.save(vegetableGarden);
    }

    public VegetableGarden updateVegetableGarden(Integer id, VegetableGarden vegetableGarden) {
        VegetableGarden existingVegetableGarden = getVegetableGardenById(id);
        if (existingVegetableGarden != null) {
            existingVegetableGarden.setWeight(vegetableGarden.getWeight());
            existingVegetableGarden.setGrowingInstructions(vegetableGarden.getGrowingInstructions());
            existingVegetableGarden.setProduct(vegetableGarden.getProduct());
            return vegetableGardenRepository.save(existingVegetableGarden);
        }
        return null;
    }

    public void deleteVegetableGarden(Integer id) {
        vegetableGardenRepository.deleteById(id);
    }
}
