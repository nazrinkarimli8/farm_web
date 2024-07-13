package az.edu.turing.farm_web.controller;

import az.edu.turing.farm_web.domain.entity.MeatProduct;
import az.edu.turing.farm_web.service.MeatProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meat-products")
public class MeatProductController {
    @Autowired
    private MeatProductService meatProductService;

    @GetMapping
    public List<MeatProduct> getAllMeatProducts() {
        return meatProductService.getAllMeatProducts();
    }

    @GetMapping("/{id}")
    public MeatProduct getMeatProductById(@PathVariable Long id) {
        return meatProductService.getMeatProductById(id);
    }

    @PostMapping
    public MeatProduct createMeatProduct(@RequestBody MeatProduct meatProduct) {
        return meatProductService.createMeatProduct(meatProduct);
    }

    @PutMapping("/{id}")
    public MeatProduct updateMeatProduct(@PathVariable Long id, @RequestBody MeatProduct meatProduct) {
        return meatProductService.updateMeatProduct(id, meatProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteMeatProduct(@PathVariable Long id) {
        meatProductService.deleteMeatProduct(id);
    }
}
