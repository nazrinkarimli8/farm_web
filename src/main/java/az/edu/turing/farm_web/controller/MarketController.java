package az.edu.turing.farm_web.controller;

import az.edu.turing.farm_web.domain.entity.Market;
import az.edu.turing.farm_web.service.MarketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/markets")
@RequiredArgsConstructor
public class MarketController {

    private final MarketService marketService;

    @GetMapping
    public List<Market> getAllMarkets() {
        return marketService.getAllMarkets();
    }

    @GetMapping("/{id}")
    public Market getMarketById(@PathVariable Long id) {
        return marketService.getMarketById(id);
    }

    @PostMapping
    public Market createMarket(@RequestBody Market market) {
        return marketService.createMarket(market);
    }

    @PutMapping("/{id}")
    public Market updateMarket(@PathVariable Long id, @RequestBody Market market) {
        return marketService.updateMarket(id, market);
    }

    @DeleteMapping("/{id}")
    public void deleteMarket(@PathVariable Long id) {
        marketService.deleteMarket(id);
    }
}
