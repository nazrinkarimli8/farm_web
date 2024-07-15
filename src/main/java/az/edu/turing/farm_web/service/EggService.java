package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Egg;
import az.edu.turing.farm_web.domain.repository.EggRepository;
import az.edu.turing.farm_web.domain.repository.ProductRepository;
import az.edu.turing.farm_web.dto.request.EggDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EggService {

    private final EggRepository eggRepository;
    private final ProductService productService;

    public List<Egg> getAllEggs() {
        return eggRepository.findAll();
    }

    public Egg getEggById(int id) {
        return eggRepository.findById(id).orElse(null);
    }

    public Egg createEgg(EggDto eggDto) {
        Egg egg = new Egg();
        egg.setCount(eggDto.getCount());
        egg.setSize(eggDto.getSize());
        egg.setProduct(productService.createProduct(eggDto));
        return eggRepository.save(egg);
    }

    public Egg updateEgg(int id, Egg egg) {
        Egg existingEgg = getEggById(id);
        if (existingEgg != null) {
            existingEgg.setCount(egg.getCount());
            existingEgg.setSize(egg.getSize());
            existingEgg.setProduct(egg.getProduct());
            return eggRepository.save(existingEgg);
        }
        return null;
    }

    public void deleteEgg(int id) {
        eggRepository.deleteById(id);
    }
}