package newpackage;
public class Player2 {
    int vida = 5;
    String nome;
    private int escolha;
    boolean arma = false;
    int fase=1;

public Player2(){
}    
public void setNome (String jogadorNome) {
    this.nome = jogadorNome;
}             
public String getNome(){
    return nome;
}
public void setEscolha(int opção){
    this.escolha=opção;
}
public int getEscolha(){
    return escolha;
}
public void setarma(){
    arma=true;
    vida +=5;
}
public boolean getarma(){
    return arma;
}

}