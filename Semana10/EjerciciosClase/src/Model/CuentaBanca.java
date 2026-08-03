package Model;
public class CuentaBanca {
   private String nameUser; 
   private String pasword;
  // CuentaBancaria cuenta;
   
   public void Usuario(String nameUser, String pasword, CuentaBanca cuenta){
       this.nameUser = nameUser;
       this.pasword = pasword;
     //  this.cuenta = cuenta;
   }
   public String getPassword(){
       return pasword;
   } 
   
   public void setPassword(String password){
       this.pasword = pasword;
   }
   public String getNameUser(){
       return nameUser;
   }
   
   public void setNameUser(String nameUser){
       this.nameUser = nameUser;
   }

   public boolean verificarPasword(String intento){
       boolean confirmar = this.pasword.equals(intento);
       return confirmar;
   }
   
}
