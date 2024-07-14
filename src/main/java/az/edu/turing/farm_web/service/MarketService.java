package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Market;
import az.edu.turing.farm_web.domain.repository.MarketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarketService {

    private final MarketRepository marketRepository;

    public Market createMarket(Market market) {
        return marketRepository.save(market);
    }

    public Market getMarket(Long id) {
        return marketRepository.findById(id).orElseThrow();
    }
}
