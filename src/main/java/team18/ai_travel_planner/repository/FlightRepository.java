package team18.ai_travel_planner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team18.ai_travel_planner.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{
}
