package org.springframework.ApiRest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Poliza {
    @Id
    @GeneratedValue
    private Integer NumPoliza;

    private String NomCliente;

    private int IdCliente;
    private Date FechaNacimiento;

    private Date FechaPoliza;

    private String CoberturaPoliza;

    private int MaxValorPoliza;

    private String NomPlanPoliza;

    private String CiudadCliente;

    private String DireccionCliente;

    private String PlacaVehiculo;

    private String ModeloVehiculo;

    private String Inspeccion;

    public Poliza(Integer NumPoliza,String NomCliente,
                  int IdCliente,
                  Date FechaNacimiento,
                  Date FechaPoliza,
                  String CoberturaPoliza,
                  int MaxValorPoliza,
                  String NomPlanPoliza,
                  String CiudadCliente,
                  String DireccionCliente,
                  String PlacaVehiculo,
                  String ModeloVehiculo,
                  String Inspeccion){
        this.NumPoliza = NumPoliza;
        this.NomCliente = NomCliente;
        this.IdCliente = IdCliente;
        this.FechaNacimiento = FechaNacimiento;
        this.FechaPoliza = FechaPoliza;
        this.CoberturaPoliza = CoberturaPoliza;
        this.MaxValorPoliza = MaxValorPoliza;
        this.NomPlanPoliza = NomPlanPoliza;
        this.CiudadCliente = CiudadCliente;
        this.DireccionCliente = DireccionCliente;
        this.PlacaVehiculo = PlacaVehiculo;
        this.ModeloVehiculo = ModeloVehiculo;
        this.Inspeccion = Inspeccion;


    }

    protected Poliza(){}


    public Integer getNumPoliza() {
        return NumPoliza;
    }

    public void setNumPoliza(Integer numPoliza) {
        NumPoliza = numPoliza;
    }

    public String getNomCliente() {
        return NomCliente;
    }

    public void setNomCliente(String nomCliente) {
        NomCliente = nomCliente;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public Date getFechaPoliza() {
        return FechaPoliza;
    }

    public void setFechaPoliza(Date fechaPoliza) {
        FechaPoliza = fechaPoliza;
    }

    public String getCoberturaPoliza() {
        return CoberturaPoliza;
    }

    public void setCoberturaPoliza(String coberturaPoliza) {
        CoberturaPoliza = coberturaPoliza;
    }

    public int getMaxValorPoliza() {
        return MaxValorPoliza;
    }

    public void setMaxValorPoliza(int maxValorPoliza) {
        MaxValorPoliza = maxValorPoliza;
    }

    public String getNomPlanPoliza() {
        return NomPlanPoliza;
    }

    public void setNomPlanPoliza(String nomPlanPoliza) {
        NomPlanPoliza = nomPlanPoliza;
    }

    public String getCiudadCliente() {
        return CiudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        CiudadCliente = ciudadCliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        DireccionCliente = direccionCliente;
    }

    public String getPlacaVehiculo() {
        return PlacaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        PlacaVehiculo = placaVehiculo;
    }

    public String getModeloVehiculo() {
        return ModeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        ModeloVehiculo = modeloVehiculo;
    }

    public String getInspeccion() {
        return Inspeccion;
    }

    public void setInspeccion(String inspeccion) {
        Inspeccion = inspeccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poliza poliza = (Poliza) o;
        return IdCliente == poliza.IdCliente && MaxValorPoliza == poliza.MaxValorPoliza && NumPoliza.equals(poliza.NumPoliza) && NomCliente.equals(poliza.NomCliente) && FechaNacimiento.equals(poliza.FechaNacimiento) && FechaPoliza.equals(poliza.FechaPoliza) && CoberturaPoliza.equals(poliza.CoberturaPoliza) && NomPlanPoliza.equals(poliza.NomPlanPoliza) && CiudadCliente.equals(poliza.CiudadCliente) && DireccionCliente.equals(poliza.DireccionCliente) && PlacaVehiculo.equals(poliza.PlacaVehiculo) && ModeloVehiculo.equals(poliza.ModeloVehiculo) && Inspeccion.equals(poliza.Inspeccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NumPoliza, NomCliente, IdCliente, FechaNacimiento, FechaPoliza, CoberturaPoliza, MaxValorPoliza, NomPlanPoliza, CiudadCliente, DireccionCliente, PlacaVehiculo, ModeloVehiculo, Inspeccion);
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "NumPoliza=" + NumPoliza +
                ", NomCliente='" + NomCliente + '\'' +
                ", IdCliente=" + IdCliente +
                ", FechaNacimiento=" + FechaNacimiento +
                ", FechaPoliza=" + FechaPoliza +
                ", CoberturaPoliza='" + CoberturaPoliza + '\'' +
                ", MaxValorPoliza=" + MaxValorPoliza +
                ", NomPlanPoliza='" + NomPlanPoliza + '\'' +
                ", CiudadCliente='" + CiudadCliente + '\'' +
                ", DireccionCliente='" + DireccionCliente + '\'' +
                ", PlacaVehiculo='" + PlacaVehiculo + '\'' +
                ", ModeloVehiculo='" + ModeloVehiculo + '\'' +
                ", Inspeccion='" + Inspeccion + '\'' +
                '}';
    }
}
