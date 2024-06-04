public class HoraMinuto {
    private int hora;
    private int minutos;
    
    public HoraMinuto(int novaHora, int novoMinutos) {
        this.hora = novaHora;
        this.minutos = novoMinutos;
    }
    
    public int getHora() {
        return hora;
    }
    
    public void setHora(int novaHora) {
        this.hora = novaHora;
    }
    
    public int getMinutos() {
        return minutos;
    }
    
    public void setMinutos(int novoMinutos) {
        this.minutos = novoMinutos;
    }
    
    public void imprimirInformacoes() {
        System.out.println("Hora: " + this.hora + ":" + "minutos: " + this.minutos);
    }
}
