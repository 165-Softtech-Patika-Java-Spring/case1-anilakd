package src.service;

import src.model.House;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author anilakdemir
 */
public interface IHouseService {

    BigDecimal calculateTotalPriceOfAllHouse ();
    BigDecimal calculateTotalPriceOfAllSummerhouse();
    BigDecimal calculateTotalPriceOfAllVilla();
    BigDecimal calculateTotalPriceOfAllApartment();

    double calculateAverageAreaOfAllHouse();
    double calculateAverageAreaOfAllSummerhouse();
    double calculateAverageOfAllVilla();
    double calculateAverageOfAllApartment();

    List<House> filterAllHouse(int numberOfRoom, int numberOfHall);
}
