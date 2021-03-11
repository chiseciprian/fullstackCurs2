package ro.fasttrackit.curs2.countries.composition;

import ro.fasttrackit.curs2.countries.Continent;
import ro.fasttrackit.curs2.countries.Country;

import java.util.List;

public class InMemoryCountryProvider implements CountryProvider {
    @Override
    public List<Country> readCountries() {
        return List.of(
                new Country("Moldova", "Chisinau", Continent.EUROPE, 123124, 6_000_000, List.of("ROU"))
        );
    }
}
