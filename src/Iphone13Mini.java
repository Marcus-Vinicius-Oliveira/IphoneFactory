public class Iphone13Mini implements Iphone {
    private Double tamanhoTela = 5.4;
    private Integer memoria = 128;
    private Integer resolucaoCameraFront = 12;
    private Integer resolucaoCameraPrincipal = 12;
    private String nome = "Iphone13Mini";

    public Iphone13Mini(){

    }

    public Iphone13Mini(Double tamanhoTela, Integer memoria, Integer resolucaoCameraFront, Integer resolucaoCameraPrincipal, String nome) {
        this.tamanhoTela = tamanhoTela;
        this.memoria = memoria;
        this.resolucaoCameraFront = resolucaoCameraFront;
        this.resolucaoCameraPrincipal = resolucaoCameraPrincipal;
        this.nome = nome;
    }

    public Double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(Double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public Integer getResolucaoCameraFront() {
        return resolucaoCameraFront;
    }

    public void setResolucaoCameraFront(Integer resolucaoCameraFront) {
        this.resolucaoCameraFront = resolucaoCameraFront;
    }

    public Integer getResolucaoCameraPrincipal() {
        return resolucaoCameraPrincipal;
    }

    public void setResolucaoCameraPrincipal(Integer resolucaoCameraPrincipal) {
        this.resolucaoCameraPrincipal = resolucaoCameraPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public String toString(){
//        StringBuilder sb = new StringBuilder();
//        sb.append(nome + "\n");
//        sb.append(tamanhoTela + "\n");
//        sb.append(memoria + "\n");
//        sb.append(resolucaoCameraPrincipal + "\n");
//        sb.append(resolucaoCameraFront + "\n");
//        return sb.toString();
//    }

    @Override
    public String exibirDetalhes() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome + "\n");
        sb.append("Tela: " + tamanhoTela + " polegadas" + "\n");
        sb.append("Mem??ria de: " + memoria + "GB" + "\n");
        sb.append("C??mera traseira com " + resolucaoCameraPrincipal + "MP" + "\n");
        sb.append("C??mera frontal com " + resolucaoCameraFront + "MP" + "\n");
        return sb.toString();
    }
}
