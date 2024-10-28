package Repositorio;

import Dominio.Fornecedor;
import FakeDB.FornecedorFAKEDB;

public class FornecedorRepositorio extends BaseRepositorio<Fornecedor>{

    private FornecedorFAKEDB fornefk;

    public FornecedorRepositorio(){
        this.fornefk = new FornecedorFAKEDB();
        this.listatab = this.fornefk.getTabela();

    }

    @Override
    public Fornecedor Read(int codigo) {
         if(!listatab.isEmpty()){
             for(Fornecedor forne : listatab){
                 if(forne.getCodigo() == codigo){
                     return forne;
                 }else{
                     System.out.println("FORNECEDOR NAO ENCONTRADO!!");
                 }

             }
         }else{
             System.out.println("LISTA VAZIA!!!");
         }

         return null;
    }

    @Override
    public Fornecedor Edit(Fornecedor obj) {
        Fornecedor forne = this.Read(obj.getCodigo());

        if(forne != null){
            forne.setRazaoSocial(obj.getRazaoSocial());
            forne.setNomeFan(obj.getNomeFan());
            forne.setCNPJ(obj.getCNPJ());
            forne.setEmail(obj.getEmail());
            forne.setTelefone(obj.getTelefone());
            return forne;
        }

        System.out.println("NAO FOI POSSIVEL EDITAR O FUNCIONARIO");
        return null;
    }

    @Override
    public Fornecedor Add(Fornecedor obj) {
       if(listatab.isEmpty()){
           obj.setCodigo(1);
       }else{
           int ultimo = this.listatab.get(this.listatab.size() -1).getCodigo();
          obj.setCodigo(ultimo +1);
       }

       this.listatab.add(obj);
       return obj;
    }

    @Override
    public Fornecedor Delete(int codigo) {
        if(!listatab.isEmpty()){
            for(Fornecedor forne : listatab){
                if(forne.getCodigo() == codigo){
                    this.listatab.remove(forne);
                    return forne;
                }
            }
        }
        System.out.println("Erro ao deletar o fornecedor");
        return null;

    }
}
