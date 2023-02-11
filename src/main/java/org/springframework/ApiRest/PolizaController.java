package org.springframework.ApiRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
public class PolizaController {
    private final  PolizaRepository repository;

    public PolizaController(PolizaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/poliza")
    public List<Poliza> getAll(){
        return repository.findAll()
                .stream()
                .map(poliza -> new Poliza(poliza.getNumPoliza(),
                        poliza.getNomCliente(),
                        poliza.getIdCliente(),
                        poliza.getFechaNacimiento(),
                        poliza.getFechaPoliza(),
                        poliza.getCoberturaPoliza(),
                        poliza.getMaxValorPoliza(),
                        poliza.getNomPlanPoliza(),
                        poliza.getCiudadCliente(),
                        poliza.getDireccionCliente(),
                        poliza.getPlacaVehiculo(),
                        poliza.getModeloVehiculo(),
                        poliza.getInspeccion()))
                .collect(Collectors.toList());
    }


    @GetMapping("/id/{NumPoliza}")
    public Optional<Poliza> getId(@PathVariable Integer NumPoliza) throws Exception{
        return repository.findById(NumPoliza)
                .map(poliza -> new Poliza(poliza.getNumPoliza(),
                        poliza.getNomCliente(),
                        poliza.getIdCliente(),
                        poliza.getFechaNacimiento(),
                        poliza.getFechaPoliza(),
                        poliza.getCoberturaPoliza(),
                        poliza.getMaxValorPoliza(),
                        poliza.getNomPlanPoliza(),
                        poliza.getCiudadCliente(),
                        poliza.getDireccionCliente(),
                        poliza.getPlacaVehiculo(),
                        poliza.getModeloVehiculo(),
                        poliza.getInspeccion()));

    }




    @GetMapping("/Placa/{PlacaVehiculo}")
    public Optional<Poliza> getPlacas(@PathVariable String PlacaVehiculo) throws Exception{
        return repository.findByPlacaVehiculo(PlacaVehiculo)
                .map(poliza -> new Poliza(poliza.getNumPoliza(),
                        poliza.getNomCliente(),
                        poliza.getIdCliente(),
                        poliza.getFechaNacimiento(),
                        poliza.getFechaPoliza(),
                        poliza.getCoberturaPoliza(),
                        poliza.getMaxValorPoliza(),
                        poliza.getNomPlanPoliza(),
                        poliza.getCiudadCliente(),
                        poliza.getDireccionCliente(),
                        poliza.getPlacaVehiculo(),
                        poliza.getModeloVehiculo(),
                        poliza.getInspeccion()));

    }










}
