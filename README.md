# WebMotors

Esse projeto foi realizado como parte de um processo seletivo para a empresa Projeto 22, com foco no cliente WebMotors.

>DESAFIO AUTOMAÇÃO

Passos:

1. Acessar o site: https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque
2. Selecionar a marca "Honda"
3. Selecionar o modelo "City"
4. Selecionar alguma versão
5. No resultado da busca, realizar algumas validações

> Observações solicitadas

Preferencialmente desenvolver com linguagem Java, com selenium, cucumber.

---
## Índice

- [Tecnologias utilizadas](#tecnologias-utilizadas)
- [Executar o teste](#executar-o-teste)
- [Relatórios de testes](#relatórios-de-testes)
- [Considerações Finais](#considerações-finais)
---
## Tecnologias utilizadas
---
Para o desafio, foram ultilizadas as seguintes tecnologias:
- Selenium
- Java
- Cucumber (BDD)
- Junit
---

## Executar o teste

Para executar o projeto, via Maven, basta seguir no seu terminal predileto para o diretório do projeto e executar o seguinte comando:
```bash
  $ mvn test
```
Caso deseje executar pela IDE de sua preferência, executar o arquivo *RunPesquisaWebMotors.java* inicia todos os testes. 

*ATENÇÃO:* Confirma se a versão do ChromeDriver - WebDriver for Chrome é a mesma do navegador instalado, pois os testes foram implementados em cima da Versão 87.0.4280.88 do Chrome.
- Link para atualizar a versão do ChromeDriver: https://chromedriver.chromium.org/downloads
- Caminho para extrair o driver no projeto de automação: webMotors\src\test\resources\driver

---
## Relatórios de testes 
 
Ao executar os testes, os relatórios HTML estão sendo gravados dentro do diretório *target/cucumber-reports/html/*. Nesse report HTML, está registrada a execução dos casos de testes, juntamente com as descrições de sucesso/falha no testes executados.

---
## Considerações Finais
 
*UFA!* Deu trabalho! rsrs e valeu a pena. Como há algum tempo já não trabalhava com testes em interface, precisei de um tempo para recuperar a antiga prática, ainda mais no BDD, pois atualmente trabalho com foco em testes de API's. Foi um exercício interessante reativar os conhecimentos. 

Em resumo, durante o desafio, fui me afiando e aprendendo. Espero conseguir mostrar meus conhecimentos para meus avaliadores. 
 
Até mais!
