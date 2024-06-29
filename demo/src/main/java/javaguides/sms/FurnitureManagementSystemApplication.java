package javaguides.sms;

import javaguides.sms.entity.Furniture;
import javaguides.sms.Repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FurnitureManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FurnitureManagementSystemApplication.class, args);
    }

    @Autowired
    private FurnitureRepository furnitureRepository;

    @Override
    public void run(String... args) throws Exception {

         Furniture furniture1 = new Furniture("Стіл","Дуб",5700);
        furnitureRepository.save(furniture1);

        Furniture furniture2 = new Furniture("Шафа","Червоне дерево",8700);
        furnitureRepository.save(furniture2);

        Furniture furniture3 = new Furniture("Стілець","Дерево",2500);
        furnitureRepository.save(furniture3);
    }
}


