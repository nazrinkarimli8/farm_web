package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.DairyProduct;
import az.edu.turing.farm_web.domain.repository.DairyProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DairyProductService {

    private final DairyProductRepository dairyProductRepository;

    public List<DairyProduct> getAllDairyProducts() {
        return dairyProductRepository.findAll();
    }

    public DairyProduct getDairyProductById(Integer id) {
        return dairyProductRepository.findById(id).orElse(null);
    }

    public DairyProduct createDairyProduct(DairyProduct dairyProduct) {
        return dairyProductRepository.save(dairyProduct);
    }

    public DairyProduct updateDairyProduct(Integer id, DairyProduct dairyProduct) {
        DairyProduct existingDairyProduct = getDairyProductById(id);
        if (existingDairyProduct != null) {
            existingDairyProduct.setFatContent(dairyProduct.getFatContent());
            existingDairyProduct.setPackaging(dairyProduct.getPackaging());
            existingDairyProduct.setProduct(dairyProduct.getProduct());
            return dairyProductRepository.save(existingDairyProduct);
        }
        return null;
    }

    public void deleteDairyProduct(Integer id) {
        dairyProductRepository.deleteById(id);
    }
}