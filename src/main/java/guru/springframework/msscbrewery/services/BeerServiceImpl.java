package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        log.info("Beer with id: {} returned: ", beerId);
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .upc(123445L)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        BeerDto savedBeer = BeerDto.builder().id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .upc(beerDto.getUpc())
                .build();

        log.info("New Beer created: {}", savedBeer);
        return savedBeer;
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        log.info("Beer with id: {} was updated as: {} ", beerId, beerDto);
        return beerDto;
    }

    @Override
    public void deleteBeer(UUID beerID) {
        log.info("Beer with id: {} was deleted", beerID);
    }
}
