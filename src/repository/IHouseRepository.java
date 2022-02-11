package src.repository;

import src.model.Apartment;
import src.model.House;
import src.model.Summerhouse;
import src.model.Villa;

import java.util.List;

/**
 * @author anilakdemir
 */
public interface IHouseRepository {

    List<House> getAllHouseList ();
    List<Apartment> getApartmentList();
    List<Villa> getVillaList();
    List<Summerhouse> getSummerhouseList();
}
