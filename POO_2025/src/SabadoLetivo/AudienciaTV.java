package SabadoLetivo;

public class AudienciaTV {

    private int canal, c9, c12, c23, c40, outros;

    public void computarAudiencia(int canal) {
        this.canal = canal;

        switch (this.canal) {
            case 9:
                this.c9++;
                break;
            case 12:
                this.c12++;
                break;
            case 23:
                this.c23++;
                break;
            case 40:
                this.c40++;
                break;
            default:
                if (this.canal != 0) {
                    this.outros++;
                }   break;
        }
    }

    public String exibirInformacoes() {
        return "Canal 9: " + this.c9
                + "\nCanal 12: " + this.c12
                + "\nCanal 23: " + this.c23
                + "\nCanal 40: " + this.c40
                + "\nOutros canais: " + this.outros;
    }
}
