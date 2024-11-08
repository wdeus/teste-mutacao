# Projeto de Exemplo: Teste Baseado em Defeitos com PIT e JUnit

## Objetivo

Este projeto tem como objetivo demonstrar a utilização da técnica de **teste baseado em defeitos** em um ambiente Java. Utilizamos o **framework JUnit** para escrever os testes unitários e o **PIT** (mutation testing) para análise de cobertura baseada em mutações. O exemplo prático ilustra como refinar testes ao longo do tempo com base nos feedbacks fornecidos pelo relatório do PIT, aprimorando a detecção de potenciais defeitos.

## Ferramentas e Tecnologias

- **Linguagem**: Java
- **Gerenciador de Dependências**: Maven
- **Framework de Testes**: JUnit
- **Ferramenta de Análise de Mutações**: PIT

## Estrutura dos Testes

Para fins didáticos, o projeto foi estruturado em três classes de teste:
1. **BancoTest1** - Implementa testes iniciais, com cobertura básica.
2. **BancoTest2** - Testes aprimorados após o feedback do PIT.
3. **BancoTest3** - Testes mais completos, visando uma cobertura mais abrangente e precisa após novas análises do PIT.

Essa estrutura demonstra como os testes podem ser refinados progressivamente com base nos relatórios de mutação, corrigindo e ampliando a cobertura de casos reais.

## Configuração e Execução

### 1. Instalar Dependências
Para instalar as dependências do projeto, execute o seguinte comando no diretório raiz do projeto:
```bash
mvn clean install
```
### 2. Executar os Testes com PIT
Para rodar os testes e gerar o relatório de cobertura por mutação, execute:
```bash
mvn test-compile org.pitest:pitest-maven:mutationCoverage
```
O PIT irá gerar um relatório em HTML que detalha a eficácia dos testes ao cobrir potenciais defeitos inseridos. Este relatório estará disponível em:
```bash
target/pit-reports/index.html
```

## Analisar a cobertura por classe de teste
Para observar a evolução da cobertura de testes, você pode alternar a classe de teste alvo no arquivo de configuração pom.xml. Na seção <targetTests>, especifique qual classe de teste será usada pelo PIT para gerar o relatório de cobertura. Por exemplo:
```code
<targetTests>
    <param>br.gov.sp.cps.mutation.core.BancoTest3</param>
</targetTests>
```
Altere o valor entre BancoTest1, BancoTest2 e BancoTest3 para visualizar as diferenças de cobertura em cada versão de teste.

