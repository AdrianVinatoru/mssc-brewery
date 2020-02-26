package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImplV2 implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        log.info("Beer with id: {} returned: ", beerId);
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.GOSE)
                .upc(123445L)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        BeerDtoV2 savedBeer = BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .upc(beerDto.getUpc())
                .build();

        log.info("New Beer created: {}", savedBeer);
        return savedBeer;
    }

    @Override
    public BeerDtoV2 updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        log.info("Beer with id: {} was updated as: {} ", beerId, beerDto);
        return beerDto;
    }

    @Override
    public void deleteBeer(UUID beerID) {
        log.info("Beer with id: {} was deleted", beerID);
    }
}