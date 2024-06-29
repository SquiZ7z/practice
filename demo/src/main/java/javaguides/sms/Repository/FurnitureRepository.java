package javaguides.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javaguides.sms.entity.Furniture;

public interface FurnitureRepository extends JpaRepository<Furniture, Long> {

}

