package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.ECategory;
import az.edu.turing.farm_web.domain.entity.Product;
import az.edu.turing.farm_web.domain.repository.CategoryRepository;
import az.edu.turing.farm_web.domain.repository.ProductRepository;
import az.edu.turing.farm_web.dto.request.BaseProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(null);

    }

    public Product createProduct(BaseProductDto baseProductDto) {
        Product product = new Product();
        product.setName(baseProductDto.getName());
        product.setDescription(baseProductDto.getDescription());
        product.setPrice(baseProductDto.getPrice());

        switch (baseProductDto.getCategoryName()){
            case "dairy" : product.setCategory(this.categoryRepository.findByCategory(ECategory.DAIRY));
                break;
            case "egg" : product.setCategory(this.categoryRepository.findByCategory(ECategory.EGG));
                break;
            case "fruit" : product.setCategory(this.categoryRepository.findByCategory(ECategory.FRUIT));
                break;
        }
        System.out.println(product.getCategory());
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Product existingProduct = getProductById(id);
        existingProduct.setName(product.getName());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setDescription(product.getDescription());
        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
