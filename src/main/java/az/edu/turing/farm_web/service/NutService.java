package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Nut;
import az.edu.turing.farm_web.domain.repository.NutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NutService {
    private final NutRepository nutRepository;

    public List<Nut> getAllNuts() {
        return nutRepository.findAll();
    }

    public Nut getNutById(Integer id) {
        return nutRepository.findById(id).orElse(null);
    }

    public Nut createNut(Nut nut) {
        return nutRepository.save(nut);
    }

    public Nut updateNut(Integer id, Nut nut) {
        Nut existingNut = getNutById(id);
        if (existingNut != null) {
            existingNut.setWeight(nut.getWeight());
            existingNut.setShellType(nut.getShellType());
            existingNut.setProduct(nut.getProduct());
            return nutRepository.save(existingNut);
        }
        return null;
    }

    public void deleteNut(Integer id) {
        nutRepository.deleteById(id);
    }
}