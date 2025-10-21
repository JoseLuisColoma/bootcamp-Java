package nba.model.Partido;

public class Partido {
    protected String equipoLocal;
    protected String equipoVisitante;
    protected int puntosLocal;
    protected int puntosVisitante;

    public Partido(String equipoLocal, String equipoVisitante, int puntosLocal, int puntosVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
    }

    public String resultado() {
        return equipoLocal + " " + puntosLocal + " - " + puntosVisitante + " " + equipoVisitante;
    }
}
