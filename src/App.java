import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    //Função menu Principal;
    public static int menuPrincipal(){
        
        return Integer.parseInt(JOptionPane.showInputDialog(null, "____________HouseBurger_____________\n"+
                                                                "    Sistema de controle de estoque e venda.\n\n"+
                                                                "Escolha uma das opções abaixo: \n"+
                                                                "1 – Cadastrar produto\n"+
                                                                "2 – Vender produto\n"+
                                                                "3 – Consultar Produto\n"+
                                                                "4 – Mostrar Lucro \n"+
                                                                "5 – Sair \n\n"));
    }
    public static void main(String[] args) {
        //Arrays
        String nomeProduto[] = new String[100];
        String fornecedor[] = new String[100];
        float precoVenda[] = new float[100];
        float precoCusto[] = new float[100];
        int estoque[] = new int[100];
        float lucrofinal[] = new float[100];
        //Variaveis
        int quant = 0, escolha = JOptionPane.YES_OPTION;
        DecimalFormat formatador = new DecimalFormat("0.00");
        float lucro;

        do{//Laço de repetição para o programa continuar rodando enquanto escolha = YES_OPTION;
            String localizarProduto, venderProduto;
            int opcao, quantVenda, desc;
            Float descFinal, total;
            escolha = JOptionPane.YES_OPTION;

            opcao = menuPrincipal(); //Variavel Opção recebe valor do tipo inteiro da função menu principal;

            switch(opcao){
                case 1: //Opção de cadastrar produtos;
                    while(escolha == JOptionPane.YES_OPTION){
                        nomeProduto[quant] = JOptionPane.showInputDialog(null, "Nome do produto?");
                        fornecedor[quant] = JOptionPane.showInputDialog(null, "Fornecedor?");
                        precoVenda[quant] = Float.parseFloat(JOptionPane.showInputDialog(null, "Preço de Venda R$?"));
                        precoCusto[quant] = Float.parseFloat(JOptionPane.showInputDialog(null, "Preço de Custo R$?"));
                        estoque[quant] = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade em estoque?"));

                        quant++;
                        escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar cadastrando?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    }
                    break;
                case 2://Opção de vender produtos;
                    venderProduto = JOptionPane.showInputDialog(null, " ______Venda de Produto________\n\n"+
                                                                "Digite o nome do produto para venda: ");
                    quantVenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade a ser vendida?"));
                    desc = Integer.parseInt(JOptionPane.showInputDialog(null, "Desconto?"));

                    for(int i = 0; i<quant; i++){
                        if(nomeProduto[i].equalsIgnoreCase(venderProduto)){
                            if(quantVenda <= estoque[i]){
                                if(desc >= 0){
                                    if(desc <= 100){
                                        total = precoVenda[i] * quantVenda;
                                        descFinal = (total * desc) / 100;
                                        lucro = total - descFinal;
            
                                        escolha = JOptionPane.showConfirmDialog(null, "Realizar venda desse produto?\n\n"+
                                                                                      "Produto: "+ nomeProduto[i]+
                                                                                      "\nFornecedor: "+ fornecedor[i]+
                                                                                      "\nPreço: R$"+ formatador.format(precoVenda[i])+
                                                                                      "\n_______________________\n"+
                                                                                      "\nPreço Total: R$"+ formatador.format(total)+
                                                                                      "\nDesconto: R$"+ formatador.format(descFinal)+"\n\n"+
                                                                                      "\n\nTotal: R$"+ formatador.format(lucro), "Confirmação", JOptionPane.YES_NO_OPTION);
                                        if(escolha == JOptionPane.YES_OPTION){
                                            escolha = JOptionPane.NO_OPTION;
                                            estoque[i] = estoque[i] - quantVenda;
                                            lucrofinal[i] = lucro + lucrofinal[i];
                                            break;
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "O desconto não pode ser um número maior que 100!");
                                        escolha = JOptionPane.NO_OPTION;
                                        break;
                                    }
                                } else{
                                    JOptionPane.showMessageDialog(null, "O desconto não pode ser um número negativo!");
                                    escolha = JOptionPane.NO_OPTION;
                                    break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Estoque insuficiente!\n\n"+
                                                                    "Produto: " + nomeProduto[i]+ "\n" +
                                                                    "Preço: R$ " + formatador.format(precoVenda[i])+ "\n" +
                                                                    "Quantidade em estoque: " + estoque[i]+ "<==");
                                escolha = JOptionPane.NO_OPTION;
                                break;
                            }
                        }
                    }
                    break;
                case 3://Opção de consultar produtos;
                        while(escolha == JOptionPane.YES_OPTION){
                            localizarProduto = JOptionPane.showInputDialog(null, " ______Pesquisar Produto________\n\n"+
                                                                                "   Digite o nome do produto: ");
                            int i=0;
                            while(!localizarProduto.equalsIgnoreCase(nomeProduto[i])){
                                if(i<quant){
                                    i++;
                                }
                            }
                                JOptionPane.showMessageDialog(null, "Informações do produto: \n\n"+
                                                                    "Produto: "+nomeProduto[i]+
                                                                    "\nFornecedor: "+fornecedor[i]+
                                                                    "\nPreço: R$"+formatador.format(precoVenda[i])+
                                                                    "\nQuantidade em estoque: "+estoque[i]);
                    
                                escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar pesquisando?", "Confirmação", JOptionPane.YES_NO_OPTION);
                        }
                    break;
                case 4://Opção de pesquisar produtos;
                    while(escolha == JOptionPane.YES_OPTION){
                        localizarProduto = JOptionPane.showInputDialog(null, " ______Pesquisar Produto________\n\n"+
                                                                            "   Digite o nome do produto: ");
                        int i = 0;
                        while(!localizarProduto.equalsIgnoreCase(nomeProduto[i])){
                            if(i<quant){
                                i++;
                            }
                        }
                            JOptionPane.showMessageDialog(null, "Lucro do produto: \n\n"+
                                                                "Produto: "+nomeProduto[i]+
                                                                "\n________________________\n"+
                                                                "\nLucro gerado: R$"+formatador.format(lucrofinal[i]));

                            escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar pesquisando?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    }
                    break;
                case 5://Opção para encerrar a aplicação;
                    System.exit(0);
            }
        }while(escolha == JOptionPane.NO_OPTION);
    }
}