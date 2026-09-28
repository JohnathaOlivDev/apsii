public class CD extends Produto implements InfoGerais {
    private int numFaixas;

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int num) {
        this.numFaixas = num;
    }

    @Override
    public void exibeInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: R$ " + String.format("%.2f", getPreco()));
        System.out.println("Numero de faixas: " + numFaixas);
    }
}
