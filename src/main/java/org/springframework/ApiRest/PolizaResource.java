package org.springframework.ApiRest;



import java.util.Objects;

public class PolizaResource {
    private Poliza poliza;

    public PolizaResource(){}

    public PolizaResource(Poliza poliza){
        this.poliza = poliza;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolizaResource that = (PolizaResource) o;
        return poliza.equals(that.poliza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poliza);
    }

    @Override
    public String toString() {
        return "PolizaResource{" +
                "poliza=" + poliza +
                '}';
    }

}
