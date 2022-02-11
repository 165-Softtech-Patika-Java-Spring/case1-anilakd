package src.service;


import src.model.House;
import src.repository.IHouseRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author anilakdemir
 */
public class HouseService implements IHouseService{

    private final IHouseRepository houseRepository;

    public HouseService (IHouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public BigDecimal calculateTotalPriceOfAllHouse () {
        return calculateTotalPrice(this.houseRepository.getAllHouseList());
    }

    @Override
    public BigDecimal calculateTotalPriceOfAllSummerhouse () {
        return calculateTotalPrice(this.houseRepository.getSummerhouseList());
    }

    @Override
    public BigDecimal calculateTotalPriceOfAllVilla () {
        return calculateTotalPrice(this.houseRepository.getVillaList());
    }

    @Override
    public BigDecimal calculateTotalPriceOfAllApartment () {
        return calculateTotalPrice(this.houseRepository.getApartmentList());
    }

    @Override
    public double calculateAverageAreaOfAllHouse () {
        return calculateAverageArea(this.houseRepository.getAllHouseList());
    }

    @Override
    public double calculateAverageAreaOfAllSummerhouse () {
        return calculateAverageArea(this.houseRepository.getSummerhouseList());
    }

    @Override
    public double calculateAverageOfAllVilla () {
        return calculateAverageArea(this.houseRepository.getVillaList());
    }

    @Override
    public double calculateAverageOfAllApartment () {
        return calculateAverageArea(this.houseRepository.getApartmentList());
    }

    @Override
    public List<House> filterAllHouse (int numberOfRoom, int numberOfHall) {
        return this.houseRepository.getAllHouseList()
                .stream()
                .filter(house -> (house.getNumberOfRoom() == numberOfRoom) && (house.getNumberOfHall()==numberOfHall))
                .collect(Collectors.toList());
    }

    private BigDecimal calculateTotalPrice(List<? extends House> houseList){
        BigDecimal totalPriceOfAllApartment = BigDecimal.ZERO;
        for(House house : houseList){
            totalPriceOfAllApartment = totalPriceOfAllApartment.add(house.getPrice());
        }
        return totalPriceOfAllApartment;
    }

    private double calculateAverageArea(List<? extends House> houseList){
        double totalArea = 0;
        int size = houseList.size();
        for(House house : houseList){
            totalArea += house.getArea();
        }
        return totalArea/size;
    }
}
