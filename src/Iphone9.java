public class Iphone9 implements Iphone {

    private Double tamanhoTela = 4.7;
    private Integer memoria = 64;
    private Integer resolucaoCameraFront = 7;
    private Integer resolucaoCameraPrincipal = 12;
    private String nome = "Iphone9";

    public Iphone9(){

    }

    public Iphone9(Double tamanhoTela, Integer memoria, Integer resolucaoCameraFront, Integer resolucaoCameraPrincipal, String nome) {
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

    @Override
    public String exibirDetalhes() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome + "\n");
        sb.append("Tela: " + tamanhoTela + " polegadas" + "\n");
        sb.append("Memória de: " + memoria + "GB" + "\n");
        sb.append("Câmera traseira com " + resolucaoCameraPrincipal + "MP" + "\n");
        sb.append("Câmera frontal com " + resolucaoCameraFront + "MP" + "\n");
        return sb.toString();
    }
}
