package az.edu.turing.farm_web.controller;

import az.edu.turing.farm_web.domain.entity.DairyProduct;
import az.edu.turing.farm_web.service.DairyProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dairy_products")
@RequiredArgsConstructor
public class DairyProductController {

    private final DairyProductService dairyProductService;

    @GetMapping
    public List<DairyProduct> getAllDairyProducts() {
        return dairyProductService.getAllDairyProducts();
    }

    @GetMapping("/{id}")
    public DairyProduct getDairyProductById(@PathVariable Integer id) {
        return dairyProductService.getDairyProductById(id);
    }

    @PostMapping
    public DairyProduct createDairyProduct(@RequestBody DairyProduct dairyProduct) {
        return dairyProductService.createDairyProduct(dairyProduct);
    }

    @PutMapping("/{id}")
    public DairyProduct updateDairyProduct(@PathVariable Integer id, @RequestBody DairyProduct dairyProduct) {
        return dairyProductService.updateDairyProduct(id, dairyProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteDairyProduct(@PathVariable Integer id) {
        dairyProductService.deleteDairyProduct(id);
    }
}