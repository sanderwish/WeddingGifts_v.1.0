package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.entities.Gift;

public interface GiftRepository extends JpaRepository<Gift, Long> {

}
