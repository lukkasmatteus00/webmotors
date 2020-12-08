#language: pt
#Author: lukkasmatteus@gmail.com
Funcionalidade: Pesquisar no campo de busca da WebMotors

  @PequisarWebMotors
  Esquema do Cenário: realizar acesso ao site da WebMotors a fim de pesquisar um automóvel especifico
    Dado que desejo acessar o site da WebMotors
    Quando acionar a "<marca>" do carro
    E escolher o "<modelo>"
    E escolher a "<versão>"
    Então deve retornar a quantidade de veiculos
    E as opções de  "<marca>" , "<modelo>" e "<versão>" que foram informados na busca

    Exemplos: 
      | marca | modelo | versão                                |
      | Honda | CITY   | 1.5 DX 16V FLEX 4P AUTOMÁTICO         |
      | Honda | CIVIC  | 1.5 16V TURBO GASOLINA TOURING 4P CVT |
      | Ford  | CORCEL | 1.4 GT GASOLINA 2P MANUAL             |
