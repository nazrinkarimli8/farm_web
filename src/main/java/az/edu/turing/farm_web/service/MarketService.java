package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Market;
import az.edu.turing.farm_web.domain.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketService {
    @Autowired
    private MarketRepository marketRepository;

    public Market createMarket(Market market) {
        return marketRepository.save(market);
    }

    public Market getMarket(Long id) {
        return marketRepository.findById(id).orElseThrow();
    }
}
