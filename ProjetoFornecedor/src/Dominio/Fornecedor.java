package Dominio;

import java.util.Objects;

public class Fornecedor {

    private int codigo;
    private String RazaoSocial;
    private String NomeFan;
    private String CNPJ;
    private String email;
    private String telefone;

    public Fornecedor(){

    }

    public Fornecedor(int codigo,String razaoSocial,String nomeFantasia,String cnpj,String email,String telefone) {
        this.NomeFan = nomeFantasia;
        this.codigo = codigo;
        this.RazaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.email = email;
        this.telefone = telefone;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setRazaoSocial(String nomesocial){
        this.RazaoSocial = nomesocial;
    }

    public String getRazaoSocial(){
        return this.RazaoSocial;
    }

    public void setCNPJ(String cnpj){
        this.CNPJ = cnpj;
    }
    public String getCNPJ(){
        return this.CNPJ;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return  this.telefone;
    }

    public String getNomeFan() {
        return NomeFan;
    }

    public void setNomeFan(String nomeFan) {
        NomeFan = nomeFan;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornecedor that = (Fornecedor) o;
        return getCodigo() == that.getCodigo() && Objects.equals(getRazaoSocial(), that.getRazaoSocial()) && Objects.equals(getNomeFan(), that.getNomeFan()) && Objects.equals(getCNPJ(), that.getCNPJ()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getTelefone(), that.getTelefone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getRazaoSocial(), getNomeFan(), getCNPJ(), getEmail(), getTelefone());
    }
}
