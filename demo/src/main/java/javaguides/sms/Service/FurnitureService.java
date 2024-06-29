package javaguides.sms.Service;

import javaguides.sms.entity.Furniture;

import java.util.List;

public interface FurnitureService {
    List<Furniture> getAllFurniture();

    Furniture saveFurniture(Furniture furniture);

    Furniture getFurnitureById(Long id);

    Furniture updateFurniture(Furniture furniture);

    void deleteFurnitureById(Long id);
}

