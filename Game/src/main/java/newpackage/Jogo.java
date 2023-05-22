package newpackage;
import java.util.Scanner;
import javax.swing.JFrame;
public class Jogo {
    public static void main(String args[]){
     int op = 0;
     int op1 = 0;
     Scanner sc = new Scanner(System.in);
     player a1 = new player();
     String jogadorNome;
     while (op!=2){
         //MENU
     System.out.println("A ESCOLHA !\n\nMenu:\n 1-Iniciar 2-Sair");
     op = sc.nextInt();
     NewJFrame frame = new NewJFrame(); 
        //MENU
     if (op==1){
         //INÍCIO
        
        System.out.println("\nEPISÓDIO 1\n\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nVocê acorda em uma casa sozinho e não \nlembra como foi parar lá, não lembra de\n"
        + "seu nome e nem de onde veio.\nSem lembrar absolutamente de nada, muito assustado,\nlevanta e procura algo que o faça lembrar de como chegou até ali.\nVocê avista duas portas, uma leva ao banheiro e a outra está fechada.\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««");        
        System.out.println("\n 1- Ir até a porta.\n 2- Ir ao banheiro.\n\nEscolha uma opção:");
        op1 = sc.nextInt();
        a1.setSaude();
        while (op1==1){    
        System.out.println("\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nVocê chega até a porta e percebe que está trancada e não tem a mínima \nforça para abrir, então percebe que será necessário um objeto para abrir a porta.\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««");
        System.out.println("\n2- Ir ao banheiro.\n\nEscolha uma opção:");
        op1 = sc.nextInt();}
        if (op1==2){
        System.out.println("\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nVocê chega ao banheiro e se olha no espelho por um instante e percebe alguns\nferimentos em seu rosto, ao lado encontra uma ferramenta que lhe\najudará a abrir a porta, então você pega a ferramenta e vai até a porta trancada.\n");
        System.out.println("Ao sair da casa você se depara com uma noite chuvosa no meio de uma floresta,\nvocê encontra dois caminhos, um a direita e outro a esquerda, escolha qual caminho seguir:\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\n\n1-Direita\n2-Esquerda\n\nEscolha uma opção:");
        op1 = sc.nextInt();
        System.out.println();
        switch (op1){
        case 1:
        a1.beberAgua();
        System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nAo caminhar floresta a dentro, você chega as margens de\num extenso rio onde bebe um pouco de água e lava o rosto.");
        case 2:
        System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nAndando em meio a chuva, você encontra uma identidade no chão,\nnela tem a sua foto e está escrito seu nome.\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\n");
        System.out.println("Digite seu nome:");
        jogadorNome = sc.next();
        a1.setNome(jogadorNome);
        }
        //INÍCIO
    System.out.println("\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nJogador:"+a1.getNome()+"\n"+"Saúde:"+a1.getSaude()+"%\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nAndando por um longo e perigoso caminho, você percebe que\no silêncio foi o que te livrou a todo momento,\nnão chamando atenção de nenhum ser.\nLogo em frente você avista uma placa informando a distância da próxima cidade,\n20km, apesar de estar muito cansado continua a caminhar.\n\nMais a frente, você encontra uma moto...\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\n\n1-Pegar a moto\n2-Continuar caminhando\n\nEscolha uma opção:");    
    op1 = sc.nextInt();
    switch (op1){
    case 1:    
        System.out.println("\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nA moto ligou e está funcionando perfeitamente, mas algo\nouviu o barulho da moto, uma criatura estranha agora está vindo atrás de você.\nEntão você acelera a moto e sai rapidamente para conseguir escapar, a criatura\nque estava se aproximando acaba sendo atingida por uma flecha de alguém.\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\nPor quem ? De onde ?\nMesmo sem entender, você continua sua jornada em direção a cidade Bielo City\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\n"+"Jogador:"+a1.getNome()+"\nSaúde:"+a1.getSaude()+"%\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\n\n                                  WELCOME BIELO CITY");
        break;
    case 2:
        a1.arranhao();
        System.out.println("\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nDepois de muito tempo de caminhada, você ouve algo se aproximar.\nEntão quando você menos espera uma criatura surge do meio das árvores e te ataca\nfazendo com que você caia no chão e fique face a face com a criatura,\nela lhe causa vários arranhões até que é atingida por uma flecha que a mata na hora.\nPor quem ? De onde ?\nMesmo sem entender, você continua sua jornada em direção a cidade Bielo City\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\n"+"Jogador:"+a1.getNome()+"\nSaúde:"+a1.getSaude()+"%\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\n\n                                  WELCOME BIELO CITY");
        break;
        }
    System.out.println("\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\nApós alguns minutos de viagem, você chega a cidade de Bielo City\n««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««««\n");
     }
    }
  }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      Player2 f2 = new Player2();
      System.out.println("\n EP. 2 ");
      System.out.println("BEM VINDO AO INFERNO...");
      int controle=1;
      int fase=2;
       System.out.println("\n\n VC já percebeu que não está mais sozinho.\n" +
         "Tem um prédio principal na cidade,tem luzes acesas por lá, parece ter alguém...");
        System.out.println("\n1- Ir até lá \n 2- Seguir até o centro da cidade\n");
        int opção = sc.nextInt();
        f2.setEscolha(opção);
      while (controle ==1){
       
        if ( opção == 1){
          int controladora=1;
          System.out.println("\n\n VC mal chegou ao prédio e já ouve barulhos horripilantes, mas não deixa o medo te abalar. \n" +
                               "Algo percebe a sua presença e vc sente que está sendo seguido\n"
                  + ". ouve passos atrás de você, o que fazer ??\n");
          System.out.println("1- CORRER \n 2- ESCONDER\n");
          opção = sc.nextInt();
          f2.setEscolha(opção);
          while (controladora ==1){
           
            if (opção==1){
                System.out.println("\n\n Ao correr vc faz mais barulhos,  chamando mais atenção ainda de outros monstros\n"
                        + "Eles te encontraram..." +
                          "5 criaturas assutadoras te cercam e te matam...\n   FIM DO JOGO\n");
                controle += 1;
             }
            else {
                System.out.println("\n\n Ótimo, Na sua frente tem um caixote de madeira e guarda-roupa. Escolha onde se esconder:");
                System.out.println("\n1- Caixote \n 2- Guarda-Roupa\n");
                opção = sc.nextInt();
                f2.setEscolha(opção);
                System.out.println("\n\nO Monstro Passou e não te viu, dentro tem revolver, munição e um colete a prova de bala");
                System.out.println("\n1-Pegar Tudo\n 2-Não pegar nada\n");
                opção = sc.nextInt();
                f2.setEscolha(opção);
                if (opção ==1){
                    f2.setarma();
                }
                else{
                    System.out.println("\nVC continua Desarmado");
                }
                System.out.println("\n\nAgora vc decide se fica no prédio ou sai: ");
                System.out.println("1-Sair\n 2-Ficar e procurar vestígios\n");
                opção = sc.nextInt();
                f2.setEscolha(opção);
                if (opção==1){
                    opção=2;
                    controladora+=1;
                }
                else {
                    System.out.println("\n\nVc sobe as escadas e ao chegar no ultimo andar, ver uma especie de casulo gigante\n"+
                                        "Ao redor tem várias criaturas em frente a ele, parecem que estão protegendo cintra qualquer coisa\n"+
                                        "que venha ameaçar oq quer que seja.\n Escolha oq fazer:  ");
                    System.out.println("\n1- Atirar no casulo\n 2-Sair do prédio devagar");
                    opção = sc.nextInt();
                    f2.setEscolha(opção);
                    if (opção ==1){
                        System.out.println("\n\nVc entrou em confronto com todos os monstros que estavam proximo ao casulo\n"+
                                "logo todos os monstros do prédio chegaram\n __ VC FOI DERROTADO\n");
                    controle +=1;
                    }
                    else{
                        controladora+=1;
                        opção=2;
                    }    
                }
                }
                
           }
          opção=2;
         }
       else if (opção==2) {
           System.out.println("\n\n Vc vai em direção ao centro da cidade, de longa distancia vc percebe que está havendo um ritual ");
           System.out.println("\n 1-Ir até lá\n 2-Esconder e observar");
           opção = sc.nextInt();
           f2.setEscolha(opção);
           if (opção ==1){
               System.out.println("\n Os Monstros te pegam e te queimam vivo");
               controle +=1;
           }
           else{
               System.out.println("\n\nVC entra em uma casa abandonada e observa que no ritual estão queimando humanos\n"
                       + "Do nada escuta passos atrás de VC... \n Escuta uma voz feminina-'Parado, se não eu te mato\n "
                       + "vira devargar'...  ");
               System.out.println("\n 1- Virar e Reagir \n 2- Virar para dialogar");
               opção = sc.nextInt();
               f2.setEscolha(opção);
               if (opção ==1){
                   if (f2.getarma() == true){
                      System.out.println("\n VC estava em desvantagem e morreu");
                   }
               }
               else {
                   System.out.println("\nVc Obedeceu e virou devagar.");
                   System.out.println("\nEra uma mulher,ela te conta que foi ela que te salvou da criatura (lá no primeiro EP antes de entrar na cidade)\n"
                           + " Ela também te explica que não pertence ao grupo deles, e que está tentando\n"
                           + "evitar que saiam da cidade para não causar um caos no mundo");
                   System.out.println("\nEscolha oq fazer: \n 1- Sair da cidade\n 2- Ajudar o mundo.");
                   opção = sc.nextInt();
                   f2.setEscolha(opção);
                   if (opção ==1){
                       System.out.println("\n Ok, obrigado por jogar até aqui.\n Até Breve");
                       controle+=1;
                   }
                   else{
                       System.out.println("\n O futuro do mundo depende de Vc "+f2.getNome());
                       fase +=1;
                   }
                }
           } 
         }
        
        
                
        
       if (fase==3){
           System.out.println("\n\n\nInicio do EP 3\n (DESCOBRIRAM VCS)\n CORRAM.\n");
           System.out.println("\n\nVcs são descobertos e logo todos estão atras de vcs\n"
                   + "Vcs correm em direção da saida. mas a cidade está rodeada de grade\n "
                   + "A altura não ajuda, mas eles estão chegando decida oque fazer, rápido:  ");
           System.out.println("\n1-Tentar pular a grande\n 2- Voltar e esconder");
           opção = sc.nextInt();
           f2.setEscolha(opção);
           if (opção ==1){
                 System.out.println("\n\nSó um vai poder passar:\n");
                 System.out.println("1- A moça\n 2-Você");
                 opção = sc.nextInt();
                 f2.setEscolha(opção);
                 if (opção ==1){
                 System.out.println("\nFim do jogo para Vc, Mas a moça passou e conseguiu salvar o mundo\n"
                       + "Parabéns por seu ato heróico.");
                 controle+=1;
                 }
                 else{
                    System.out.println("\n\n A moça te ajuda a Subir, mas algo segura em sua perna\n"
                            + "mas vc consegue escapar\n Agora vc está dentro de uma mata e tentará buscar ajuda\n"
                            + "\n PARTE 2 DO JOGO EM BREVE...");
                    controle+=1;
                   }
            }
            else{
                System.out.println("\nVcs se escondem em uma casa\n após alguns minutinhos decidem sair\n"
                   + "mas lá fora os monstros ainda procuram por vcs.");
                System.out.println("Na saida da casa tem um carro, O que fazer?\n 1- pegar o carro\n 2-correr até a saida");
                opção = sc.nextInt();
                f2.setEscolha(opção);
                if (opção ==1){
                    System.out.println("O carro ligou e fez barulho, chamando assim a atenção dos monstros\n"
                         + "mesmo assim, conseguem sair dos monstros.\n"
                         + " mas para sair da cidade quebram as grades com o carro e esacapam");
                    System.out.println("Você abriu as grades daquela cidade e fazendo com que tudo que \n"
                         + "estava preso ali fosse solto, fazendo com que o mundo fosse destruido.\n"
                         + "VC FALHOU"); 
                    controle+=1;
               }
               else{
                   System.out.println("Vcs correm até o local em que vc entrou\n"
                           + "Parabéns vcs estão fora...");
                   System.out.println("AGUARDE A PARTE 2 <3");
                   controle+=1;
               }
            }
        }
     }    
   }
}
