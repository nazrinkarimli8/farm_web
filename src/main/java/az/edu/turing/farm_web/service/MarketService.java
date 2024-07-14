package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Market;
import az.edu.turing.farm_web.domain.repository.MarketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarketService {

    private final MarketRepository marketRepository;

    public List<Market> getAllMarkets() {
        return marketRepository.findAll();
    }

    public Market getMarketById(Long id) {
        return marketRepository.findById(id).orElse(null);
    }

    public Market createMarket(Market market) {
        return marketRepository.save(market);
    }

    public Market updateMarket(Long id, Market market) {
        Market existingMarket = getMarketById(id);
        if (existingMarket != null) {
            existingMarket.setName(market.getName());
            existingMarket.setLocation(market.getLocation());
            existingMarket.setSchedule(market.getSchedule());
            existingMarket.setDescription(market.getDescription());
            return marketRepository.save(existingMarket);
        }
        return null;
    }

    public void deleteMarket(Long id) {
        marketRepository.deleteById(id);
    }
}