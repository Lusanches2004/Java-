package org.example.cbf;

public class contaba {
    private String Banco;
    private String Agencia;
    private String NumerodaConta;
    private String TipodaConta;
    private double Saldoatual;
    private String Limitedisponivek;

    public contaba(String banco, String agencia, String numerodaConta, String tipodaConta, double saldoatual, String limitedisponivek) {
        Banco = banco;
        Agencia = agencia;
        NumerodaConta = numerodaConta;
        TipodaConta = tipodaConta;
        Saldoatual = saldoatual;
        Limitedisponivek = limitedisponivek;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNumerodaConta() {
        return NumerodaConta;
    }

    public void setNumerodaConta(String numerodaConta) {
        NumerodaConta = numerodaConta;
    }

    public String getTipodaConta() {
        return TipodaConta;
    }

    public void setTipodaConta(String tipodaConta) {
        TipodaConta = tipodaConta;
    }

    public double getSaldoatual() {
        return Saldoatual;
    }

    public void setSaldoatual(double saldoatual) {
        Saldoatual = saldoatual;
    }

    public String getLimitedisponivek() {
        return Limitedisponivek;
    }

    public void setLimitedisponivek(String limitedisponivek) {
        Limitedisponivek = limitedisponivek;
    }

    public String toString() {
         return "Banco: " + Banco + ", Agencia: " + Agencia + ", Numero da Conta: " + NumerodaConta + ", Tipo da Conta: " + TipodaConta + ", Saldo atual: " + Saldoatual + ", Limite disponivel: " + Limitedisponivek;
    }
}

