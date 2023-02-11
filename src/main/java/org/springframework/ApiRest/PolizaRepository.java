package org.springframework.ApiRest;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.stream.DoubleStream;

public interface PolizaRepository extends JpaRepository<Poliza, Integer> {

    Optional<Poliza> findById(Integer id);

    Optional<Poliza>findByPlacaVehiculo(String PlacaVehiculo);


}


