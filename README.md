## Avaliação acadêmica

Este repositorio é destinado apenas para estudo. O Código foi desenvolvido durante o 1º semestre do curso de Bacharelado em Sistema de informação, como critério avaliativo.

## Objetivo e requisitos

Crie um programa para uma Lanchonete que efetue o cálculo de vendas e o controle de
estoque. O programa deve trabalhar da seguinte forma:
    A – O menu principal do sistema deve ter as seguintes opções:
        1 – Cadastrar produto
        2 – Vender produto
        3 – Consultar Produto
        4 – Mostrar Lucro
        5 – Sair

    B – A opção “1” do menu deve permitir o cadastro de um novo produto para a venda. Os dados a serem cadastrados são:
    - Nome do produto
    - Fornecedor
    - Preço de venda
    - Preço de custo
    - Quantidade em estoque

Obs: Após o cadastro, o produto já deve estar disponível para efetuar a venda e
consulta.

    C – A opção “2” do menu deve permitir vender um produto já cadastrado. Os dados a serem
    solicitados na venda são:
        - Nome do produto
        - Quantidade a ser vendida.
        - Desconto da venda (%)

Obs: O programa deve:
    1. Verificar se o produto escolhido tem estoque suficiente para venda;
    2. Verificar desconto negativo ou maior que 100%;
    3. Mostrar na tela: valor total bruto, desconto concedido e o total final;
    4. Abater do estoque do produto a quantidade que foi vendida.

    D – A opção “3” do menu, deve mostrar na tela todos os dados do produto consultado.
        O dado a ser solicitado para consulta é:
            - Nome do produto

    E – A opção “4” do menu deve mostrar na tela o lucro acumulado em todas as vendas efetuadas do produto escolhido.
        O dado a ser solicitado para consulta é:
            - Nome do produto

    F – A opção “5” do menu, efetua a saída do programa.

Observações Gerais:
    1- Deve-se utilizar array (vetor) na construção do programa;
    2- Neste trabalho serão avaliados a funcionalidade do sistema e a explicação dos membros do grupo.

## Tela principal

![Screenshot](/Screenshot/tela_principal.jpg)
