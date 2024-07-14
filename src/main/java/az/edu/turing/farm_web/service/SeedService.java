package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Seed;
import az.edu.turing.farm_web.domain.repository.SeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeedService {

    private final SeedRepository seedRepository;

    public List<Seed> getAllSeeds() {
        return seedRepository.findAll();
    }

    public Seed getSeedById(Integer id) {
        return seedRepository.findById(id).orElse(null);
    }

    public Seed createSeed(Seed seed) {
        return seedRepository.save(seed);
    }

    public Seed updateSeed(Integer id, Seed seed) {
        Seed existingSeed = getSeedById(id);
        if (existingSeed != null) {
            existingSeed.setPacketSize(seed.getPacketSize());
            existingSeed.setInstructions(seed.getInstructions());
            existingSeed.setProduct(seed.getProduct());
            return seedRepository.save(existingSeed);
        }
        return null;
    }

    public void deleteSeed(Integer id) {
        seedRepository.deleteById(id);
    }
}
