package src;

import src.repository.HouseRepository;
import src.service.HouseService;


/**
 * @author anilakdemir
 */
public class Main {

    public static void main (String[] args) {
        HouseRepository houseRepository = new HouseRepository();
        HouseService houseService = new HouseService(houseRepository);
        System.out.println("Total price of all apartments : " + houseService.calculateTotalPriceOfAllApartment());
        System.out.println("Total price of all villas : " + houseService.calculateTotalPriceOfAllVilla());
        System.out.println("Total price of all summerhouses : " + houseService.calculateTotalPriceOfAllSummerhouse());
        System.out.println("Total price of all houses : " + houseService.calculateTotalPriceOfAllHouse());

        System.out.println("***************************");
        System.out.println("Average area of all apartments : " + houseService.calculateAverageOfAllApartment());
        System.out.println("Average area of all villas : " + houseService.calculateAverageOfAllVilla());
        System.out.println("Average area of all summerhouses : " + houseService.calculateAverageAreaOfAllSummerhouse());
        System.out.println("Average area of all houses : " + houseService.calculateAverageAreaOfAllHouse());

        System.out.println("***************************");
        System.out.println("Number of houses with 3 rooms and 1 living room : "
                + houseService.filterAllHouse(3,1).size());
        System.out.println("Number of houses with 4 rooms and 2 living room : "
                + houseService.filterAllHouse(4,2).size());
    }
}
