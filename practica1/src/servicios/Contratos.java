package src.servicios;

public enum Contratos {
    UNDISPOSITIVO("un dispositivo", 7), DOSDISPOSITIVOS("dos dispositivos", 10), 
    CUATRODISPOSITIVOS("cuatro dispositivos", 15);
    
    private String contrato;
    private int costo;

    private Contratos(String contrato, int costo) {
        this.contrato = contrato;
        this.costo = costo;
    }

    public String getContrato() {
        return this.contrato;
    }

    public int getCosto() {
        return this.costo;
    }
}