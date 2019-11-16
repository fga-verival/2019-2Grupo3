# TBL 2 FASE 3

## Tabela de contribuição
| Matricula | Nome | Porcentagem |
|---|---|---|
| 16/0000840 | Alexandre Miguel Rodrigues Nunes Pereira | 100 |
| 16/0117003 | Daniel Maike Mendes Gonçalves | 100 |
| 16/0135681 | Marco Antonio de Lima Costa | 100 |
| 16/0127912 | João Vitor Ferreira Alves | 100 |
| 17/0062686 | Pedro Rodrigues Pereira | 100 |
| 16/0143403 | Renan Welz Schadt | 100 |
| 15/0147601 | Rômulo Vinícius de Souza | 100 |
| 16/0144949 | Shayane Marques Alcântara | 100 |

## Descreva as técnicas solicitadas (falsificação e triangularização)
Falsificação: A técnica de falsificação cria o método utilizado no teste e força o retorno do que é esperado no teste, com o intuito de atingir a barra verde. Ela ocorre antes da implementação da lógica para poder atingir a barra verde. Além disso, esta fase antecede a duplicação e a triangulação.

Triangularização: É uma prática do TDD utilizada para garantir o funcionamento correto da funcionalidade testada. A ideia é fazer testes com corpos parecidos, porém, com dados diferentes, para ter certeza que a regra está sendo cumprida corretamente.
Esta prática pode ser explicada através da analogia de triangulação de radares, em que dois ou mais radares apontam para o mesmo alvo e cálculos contendo as distâncias entre os radares e o alvo podem resultar na distância real do alvo.

## Explique: Como triangularizar com parâmetros em frameworks de testes unitários
Quando estamos criando os cenários de testes dos nossos componentes de software, sente-se a necessidade de passar diferentes parâmetros para um mesmo cenário de teste e observar se o comportamento é como o esperado.
No JUnit, são criados atributos na classe de teste, em que serão recebidos a partir de um construtor e utilizados no teste (tanto os de entrada quanto o de saída). Então, é criada uma lista de lista de Object, nas quais recebem os dados utilizados para a funcionalidade e o dado de saída. O teste criado vai iterar sobre a lista de lista de objetos para coletar os dados e comparar com a saída. Com isso é preciso um teste que itere sobre os diferentes parâmetros.

## Ao final o grupo deve fazer uma análise crítica sobre o uso das técnicas usadas (facilidades, dificuldades encontradas e aplicabilidade prática)
TDD é um dos caminhos que pode nos levar a um aumento de produtividade e um aumento da qualidade do que é feito, ao criar uma funcionalidade a partir de casos de teste. Isso auxilia uma maior probabilidade de garantir o funcionamento correto de uma funcionalidade em questão.
Com o TDD é possível observar um feedback rápido sobre a nova funcionalidade e sobre as outras já existentes no sistema. O código fica mais limpo, já que escrevemos códigos simples para o teste passar. Além disso, há uma maior segurança na correção de bugs, na refatoração e também maior produtividade ao encontrar menos bugs e não desperdiçar tempo com depuradores. Também foi possível observar um código menos acoplado já que para escrever testes temos que separar o código em pequenos pedaços.
