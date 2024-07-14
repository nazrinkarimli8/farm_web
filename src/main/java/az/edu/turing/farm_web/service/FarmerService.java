package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Farmer;
import az.edu.turing.farm_web.domain.repository.FarmerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FarmerService {

    private final FarmerRepository farmerRepository;

    public Farmer createFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    public Farmer getFarmer(Long id) {
        return farmerRepository.findById(id).orElseThrow();
    }
}
