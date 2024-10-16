package Dominio;

public  class Funcionario {

     private int codigo;
     private String nome;
     private String cargo;
     private double salario;
     private String email;
     private  String telefone;

     public Funcionario(){

     }

     public Funcionario(int codigo,String nome,String cargo,double salario,String email,String telefone) {
          this.codigo = codigo;
          this.nome = nome;
          this.cargo = cargo;
          this.salario = salario;
          this.email = email;
          this.telefone = telefone;
     }


     public void setCodigo(int codigo){
          this.codigo = codigo;
     }

     public int getCodigo(){
          return this.codigo;
     }


     public void setNome(String nome){
          this.nome = nome;
     }

     public String getNome(){
          return  this.nome;
     }

     public  void setCargo(String cargo){
          this.cargo = cargo;
     }

     public String getCargo(){
          return this.cargo;
     }

     public double getSalario() {
          return salario;
     }

     public void setSalario(double salario) {
          this.salario = salario;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getTelefone() {
          return telefone;
     }

     public void setTelefone(String telefone) {
          this.telefone = telefone;
     }
}
