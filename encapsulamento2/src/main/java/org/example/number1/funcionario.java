package org.example.number1;

public class funcionario {
    private String id;
    private String nome;
    private String salario;
    private String setor;
    private String sexo;
    private String idade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public funcionario(String id, String nome, String salario, String setor, String sexo, String idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;


    }

    @Override
    public String toString() {
        return "funcionario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", salario='" + salario + '\'' +
                ", setor='" + setor + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
