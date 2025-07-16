package guru.springframework.mssc_brewery.services;

import guru.springframework.mssc_brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().
                id(UUID.randomUUID())
                .bearName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .bearName(beerDto.getBearName())
                .beerStyle(beerDto.getBeerStyle())
                .upc(beerDto.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
      // to do - would add a real implementation to update the beer

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer: " + beerId);
    }
}
