package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Farmer;
import az.edu.turing.farm_web.domain.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;

    public Farmer createFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    public Farmer getFarmer(Long id) {
        return farmerRepository.findById(id).orElseThrow();
    }
}
