package az.edu.turing.farm_web.controller;

import az.edu.turing.farm_web.domain.entity.Seed;
import az.edu.turing.farm_web.service.SeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seeds")
@RequiredArgsConstructor
public class SeedController {

    private final SeedService seedService;

    @GetMapping
    public List<Seed> getAllSeeds() {
        return seedService.getAllSeeds();
    }

    @GetMapping("/{id}")
    public Seed getSeedById(@PathVariable Integer id) {
        return seedService.getSeedById(id);
    }

    @PostMapping
    public Seed createSeed(@RequestBody Seed seed) {
        return seedService.createSeed(seed);
    }

    @PutMapping("/{id}")
    public Seed updateSeed(@PathVariable Integer id, @RequestBody Seed seed) {
        return seedService.updateSeed(id, seed);
    }

    @DeleteMapping("/{id}")
    public void deleteSeed(@PathVariable Integer id) {
        seedService.deleteSeed(id);
    }
}