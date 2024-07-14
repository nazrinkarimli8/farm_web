package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.MeatProduct;
import az.edu.turing.farm_web.domain.repository.MeatProductRepository;
import az.edu.turing.farm_web.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MeatProductService {

    private final MeatProductRepository meatProductRepository;
    private final ProductRepository productRepository;

    public List<MeatProduct> getAllMeatProducts() {
        return meatProductRepository.findAll();
    }

    public MeatProduct getMeatProductById(Long id) {
//        return meatProductRepository.findOne(id);
        return null;
    }

    public MeatProduct createMeatProduct(MeatProduct meatProduct) {
        return meatProductRepository.save(meatProduct);
    }

    public MeatProduct updateMeatProduct(Long id, MeatProduct meatProduct) {



        MeatProduct existingMeatProduct = getMeatProductById(id);
//        existingMeatProduct.setName(meatProduct.getName());
//        existingMeatProduct.setCategory(meatProduct.getCategory());
//        existingMeatProduct.setPrice(meatProduct.getPrice());
//        existingMeatProduct.setDescription(meatProduct.getDescription());
//        existingMeatProduct.setType(meatProduct.getType());
        return meatProductRepository.save(existingMeatProduct);
    }

    public void deleteMeatProduct(Long id) {
        meatProductRepository.deleteById(id);
    }
}

