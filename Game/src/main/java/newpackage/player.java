package newpackage;
public class player {
    private  int saude;
    String nome;

public player(){
}    
public void setNome (String jogadorNome) {
    nome = jogadorNome;
}             

public String getNome(){
    return nome;
}
public void setSaude(){
    saude=95;
}
public int getSaude(){
    return saude;
}
public void arranhao(){
 saude-=20;
  }
public void beberAgua(){
  saude+=5;
  }
}