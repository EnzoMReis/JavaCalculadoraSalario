package Entity;

public class Funcionario {

    private String nome;
    private String telefone;
    private double salarioBruto;
    private double valeAlimentcao;
    private double valeTransporte;
    private double planoSaude;
    public Funcionario(String nome, String telefone, double salarioBruto, double valeAlimentcao, double valeTransporte) {
        this.nome = nome;
        this.telefone = telefone;
        this.salarioBruto = salarioBruto;
        this.valeAlimentcao = valeAlimentcao;
        this.valeTransporte = valeTransporte;
    }

    public double calcularUmSobreDoze(){
        return salarioBruto / 12.0;
    }
    public double calcularFGTS(){
        return salarioBruto * 0.08;
    }
    public double calcularUmTercoFerias(){
        return salarioBruto / 3.0;
    }
    public double calcularValeAlimentacao(){
        return valeAlimentcao * 22.0;
    }
    public double calcularValeTransporte(){
        return valeTransporte * 22.0;
    }

    @Override
    public String toString() {
        return String.format(" Nome: %s \n" +
                " Telefone: %s \n" +
                " Salário Bruto: %.2f \n" +
                " 1/12 do Salário: %.2f \n" +
                " FGTS: %.2f \n" +
                " 1/3 Férias: %.2f \n" +
                " Vale Alimentação: %.2f \n" +
                " Vale Transporte: %.2f \n" +
                "",
                getNome(),getTelefone(),getSalarioBruto(),
                calcularUmSobreDoze(),calcularFGTS(),
                calcularUmTercoFerias(),calcularValeAlimentacao(),
                calcularValeTransporte());
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }
}
