package az.edu.turing.farm_web.controller;

import az.edu.turing.farm_web.domain.entity.Egg;
import az.edu.turing.farm_web.dto.request.EggDto;
import az.edu.turing.farm_web.service.EggService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eggs")
@RequiredArgsConstructor
@CrossOrigin
public class EggController {

    private final EggService eggService;

    @GetMapping
    public List<Egg> getAllEggs() {
        return eggService.getAllEggs();
    }

    @GetMapping("/{id}")
    public Egg getEggById(@PathVariable int id) {
        return eggService.getEggById(id);
    }

    @PostMapping
    public Egg createEgg(@RequestBody EggDto eggDto) {
        return eggService.createEgg(eggDto);
    }

    @PutMapping("/{id}")
    public Egg updateEgg(@PathVariable int id, @RequestBody Egg egg) {
        return eggService.updateEgg(id, egg);
    }

    @DeleteMapping("/{id}")
    public void deleteEgg(@PathVariable int id) {
        eggService.deleteEgg(id);
    }
}