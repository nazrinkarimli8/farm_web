package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.DairyProduct;
import az.edu.turing.farm_web.domain.entity.Product;
import az.edu.turing.farm_web.domain.repository.DairyProductRepository;
import az.edu.turing.farm_web.dto.request.DairyProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DairyProductService {

    private final DairyProductRepository dairyProductRepository;
    private final ProductService productService;

    public List<DairyProduct> getAllDairyProducts() {
        return dairyProductRepository.findAll();
    }

    public DairyProduct getDairyProductById(Integer id) {
        return dairyProductRepository.findById(id).orElse(null);
    }

    public DairyProduct createDairyProduct(DairyProductDto dairyProductDto) {
        DairyProduct dairyProduct = new DairyProduct();

        dairyProduct.setFatContent(dairyProductDto.getFatContent());
        System.out.println(dairyProduct.getFatContent());

        dairyProduct.setPackaging(dairyProductDto.getPackaging());
        System.out.println(dairyProduct.getPackaging());

        dairyProduct.setProduct(this.productService.createProduct(dairyProductDto));
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