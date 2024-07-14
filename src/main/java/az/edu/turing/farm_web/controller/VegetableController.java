package az.edu.turing.farm_web.controller;

import az.edu.turing.farm_web.domain.entity.Vegetable;
import az.edu.turing.farm_web.service.VegetableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vegetables")
@RequiredArgsConstructor
public class VegetableController {

    private final VegetableService vegetableService;

    @GetMapping
    public List<Vegetable> getAllVegetables() {
        return vegetableService.getAllVegetables();
    }

    @GetMapping("/{id}")
    public Vegetable getVegetableById(@PathVariable Integer id) {
        return vegetableService.getVegetableById(id);
    }

    @PostMapping
    public Vegetable createVegetable(@RequestBody Vegetable vegetable) {
        return vegetableService.createVegetable(vegetable);
    }

    @PutMapping("/{id}")
    public Vegetable updateVegetable(@PathVariable Integer id, @RequestBody Vegetable vegetable) {
        return vegetableService.updateVegetable(id, vegetable);
    }

    @DeleteMapping("/{id}")
    public void deleteVegetable(@PathVariable Integer id) {
        vegetableService.deleteVegetable(id);
    }
}