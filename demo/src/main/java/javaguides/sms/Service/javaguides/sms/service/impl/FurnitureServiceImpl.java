package javaguides.sms.Service.javaguides.sms.service.impl;

import javaguides.sms.Service.FurnitureService;
import javaguides.sms.entity.Furniture;
import javaguides.sms.Repository.FurnitureRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FurnitureServiceImpl implements FurnitureService {

    private FurnitureRepository furnitureRepository;

    public FurnitureServiceImpl(FurnitureRepository furnitureRepository) {
        super();
        this.furnitureRepository = furnitureRepository;
    }

    @Override
    public List<Furniture> getAllFurniture() {
        //return List.of();
        return furnitureRepository.findAll();
    }

    @Override
    public Furniture saveFurniture(Furniture furniture) {
        return furnitureRepository.save(furniture);
    }
    @Override
    public Furniture getFurnitureById(Long id) {
        return furnitureRepository.findById(id).get();

    }

    @Override
    public Furniture updateFurniture(Furniture furniture) {

        return furnitureRepository.save(furniture);
    }

    @Override
    public void deleteFurnitureById(Long id) {
        furnitureRepository.deleteById(id);

    }
}
