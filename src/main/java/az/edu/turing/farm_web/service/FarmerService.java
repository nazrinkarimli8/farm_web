package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Farmer;
import az.edu.turing.farm_web.domain.repository.FarmerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FarmerService {

    private final FarmerRepository farmerRepository;

    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    public Farmer getFarmerById(Long id) {
        return farmerRepository.findById(id).orElse(null);
    }

    public Farmer createFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    public Farmer updateFarmer(Long id, Farmer farmer) {
        Farmer existingFarmer = getFarmerById(id);
        if (existingFarmer != null) {
            existingFarmer.setFarmName(farmer.getFarmName());
            existingFarmer.setFarmDescription(farmer.getFarmDescription());
            existingFarmer.setProduct(farmer.getProduct());
            return farmerRepository.save(existingFarmer);
        }
        return null;
    }

    public void deleteFarmer(Long id) {
        farmerRepository.deleteById(id);
    }
}
