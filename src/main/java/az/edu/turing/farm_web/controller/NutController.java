package az.edu.turing.farm_web.controller;

import az.edu.turing.farm_web.domain.entity.Nut;
import az.edu.turing.farm_web.service.NutService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nuts")
@RequiredArgsConstructor
public class NutController {

    private final NutService nutService;

    @GetMapping
    public List<Nut> getAllNuts() {
        return nutService.getAllNuts();
    }

    @GetMapping("/{id}")
    public Nut getNutById(@PathVariable Integer id) {
        return nutService.getNutById(id);
    }

    @PostMapping
    public Nut createNut(@RequestBody Nut nut) {
        return nutService.createNut(nut);
    }

    @PutMapping("/{id}")
    public Nut updateNut(@PathVariable Integer id, @RequestBody Nut nut) {
        return nutService.updateNut(id, nut);
    }

    @DeleteMapping("/{id}")
    public void deleteNut(@PathVariable Integer id) {
        nutService.deleteNut(id);
    }
}
