package az.edu.turing.farm_web.controller;

import az.edu.turing.farm_web.domain.entity.Farmer;
import az.edu.turing.farm_web.domain.entity.User;
import az.edu.turing.farm_web.service.FarmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmers")
@RequiredArgsConstructor
public class FarmerController {

    private final FarmerService farmerService;

    @GetMapping
    public List<Farmer> getAllFarmers() {
        return farmerService.getAllFarmers();
    }

    @GetMapping("/{id}")
    public Farmer getFarmerById(@PathVariable Long id) {
        return farmerService.getFarmerById(id);
    }

    @PostMapping
    public Farmer createFarmer(@RequestBody Farmer farmer) {
        return farmerService.createFarmer(farmer);
    }

    @PutMapping("/{id}")
    public Farmer updateFarmer(@PathVariable Long id, @RequestBody Farmer farmer) {
        return farmerService.updateFarmer(id, farmer);
    }

    @DeleteMapping("/{id}")
    public void deleteFarmer(@PathVariable Long id) {
        farmerService.deleteFarmer(id);
    }
}