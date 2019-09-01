package src.servicios;

public enum Contratos {
    UNDISPOSITIVO("un dispositivo", 7), DOSDISPOSITIVOS("dos dispositivos", 10), 
    CUATRODISPOSITIVOS("cuatro dispositivos", 15), GRATIS("usuario normal", 0), 
    AMAZONNORMAL("amazon normal", 7), AMAZONPREMIUM("amazon premium", 13),
    SPOTIFYPREMIUM("spotify premium", 4), YOUTUBEPREMIUM("youtube premium", 6);
    
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