package ro.fasttrackit.curs2;

import ro.fasttrackit.curs2.countries.FileCountryReportGenerator;
import ro.fasttrackit.curs2.countries.InMemoryCountryReportGenerator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        var generator = new FileCountryReportGenerator("src/main/resources/countries.txt");
        generator.generateReport("output.txt");
        new InMemoryCountryReportGenerator().generateReport("romania.txt");
    }
}
