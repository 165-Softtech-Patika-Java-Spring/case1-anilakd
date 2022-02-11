package src.repository;

import src.model.Apartment;
import src.model.House;
import src.model.Summerhouse;
import src.model.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anilakdemir
 */
public class HouseRepository implements IHouseRepository{

    private List<Apartment> apartmentList;
    private List<Villa> villaList;
    private List<Summerhouse> summerhouseList;

    //this part is to initialize data
    {
        initializeApartmentList();
        initializeVillaList();
        initializeSummerhouseList();
    }

    @Override
    public List<House> getAllHouseList () {
        List<House> houseList = new ArrayList<>();
        houseList.addAll(this.apartmentList);
        houseList.addAll(this.villaList);
        houseList.addAll(this.summerhouseList);
        return houseList;
    }

    @Override
    public List<Apartment> getApartmentList () {
        return this.apartmentList;
    }

    @Override
    public List<Villa> getVillaList () {
        return this.villaList;
    }

    @Override
    public List<Summerhouse> getSummerhouseList () {
        return this.summerhouseList;
    }

    private void initializeApartmentList(){
        this.apartmentList = new ArrayList<>();
        Apartment apartment1 = new Apartment();
        apartment1.setPrice(new BigDecimal(120));
        apartment1.setNumberOfHall(1);
        apartment1.setNumberOfRoom(2);
        apartment1.setArea(100);
        apartmentList.add(apartment1);

        Apartment apartment2 = new Apartment();
        apartment2.setPrice(new BigDecimal(150));
        apartment2.setNumberOfHall(1);
        apartment2.setNumberOfRoom(3);
        apartment2.setArea(130);
        apartmentList.add(apartment2);

        Apartment apartment3 = new Apartment();
        apartment3.setPrice(new BigDecimal(180));
        apartment3.setNumberOfHall(1);
        apartment3.setNumberOfRoom(4);
        apartment3.setArea(160);
        apartmentList.add(apartment3);
    }

    private void initializeVillaList(){
        this.villaList = new ArrayList<>();
        Villa villa1 = new Villa();
        villa1.setPrice(new BigDecimal(210));
        villa1.setNumberOfHall(2);
        villa1.setNumberOfRoom(4);
        villa1.setArea(200);
        villaList.add(villa1);

        Villa villa2 = new Villa();
        villa2.setPrice(new BigDecimal(240));
        villa2.setNumberOfHall(2);
        villa2.setNumberOfRoom(5);
        villa2.setArea(230);
        villaList.add(villa2);

        Villa villa3 = new Villa();
        villa3.setPrice(new BigDecimal(270));
        villa3.setNumberOfHall(2);
        villa3.setNumberOfRoom(6);
        villa3.setArea(260);
        villaList.add(villa3);
    }

    private void initializeSummerhouseList(){
        this.summerhouseList = new ArrayList<>();
        Summerhouse summerhouse1 = new Summerhouse();
        summerhouse1.setPrice(new BigDecimal(300));
        summerhouse1.setNumberOfHall(2);
        summerhouse1.setNumberOfRoom(4);
        summerhouse1.setArea(210);
        summerhouseList.add(summerhouse1);

        Summerhouse summerhouse2 = new Summerhouse();
        summerhouse2.setPrice(new BigDecimal(330));
        summerhouse2.setNumberOfHall(1);
        summerhouse2.setNumberOfRoom(5);
        summerhouse2.setArea(240);
        summerhouseList.add(summerhouse2);

        Summerhouse summerhouse3 = new Summerhouse();
        summerhouse3.setPrice(new BigDecimal(360));
        summerhouse3.setNumberOfHall(2);
        summerhouse3.setNumberOfRoom(6);
        summerhouse3.setArea(270);
        summerhouseList.add(summerhouse3);
    }
}
