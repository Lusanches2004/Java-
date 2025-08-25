package org.example.cbf;

public class funcionarioc {
    private String codigodofuncionario;
    private String nome;
    private String  Endereço;
    private String telefone;
    private String email;
    private String contaBancaria;

    public funcionarioc(String codigodofuncionario, String nome, String Endereço, String telefone, String email, String contaBancaria) {
        this.codigodofuncionario = codigodofuncionario;
        this.nome = nome;
        this.Endereço = Endereço;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    public String getCodigodofuncionario() {
        return codigodofuncionario;
    }

    public void setCodigodofuncionario(String codigodofuncionario) {
        this.codigodofuncionario = codigodofuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "funcionarioc{" +
                "codigodofuncionario='" + codigodofuncionario + '\'' +
                ", nome='" + nome + '\'' +
                ", Endereço='" + Endereço + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", contaBancaria='" + contaBancaria + '\'' +
                '}';
    }
}
