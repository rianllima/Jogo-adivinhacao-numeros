### Implementação do Jogo de Adivinhação de Números em Java

#### Objetivo:
Desenvolver um programa em Java que implemente o jogo de "Adivinhação de Números", utilizando os
recursos e conceitos apresentados na disciplina de Programação de Sistemas I. O objetivo é praticar o uso
de estruturas de controle, geração de números aleatórios, manipulação de entradas do usuário e lógica
condicional. 

#### Descrição do Jogo:
O jogo consiste no computador escolher aleatoriamente um número num intervalo específico (por exemplo,
de 1 a 100). O jogador deve adivinhar o número, e o programa fornecerá dicas se o número é maior ou
menor que a tentativa do jogador. O jogo continua até que o jogador acerte o número ou deseje encerrar.

#### Requisitos funcionais:
Escolha do Intervalo: o jogador pode definir o intervalo de números, dentro do qual um número deve ser
adivinhado
Geração de Números Aleatórios: o programa deve gerar um número aleatório no intervalo definido.
Entrada do Jogador: permitir que o jogador insira tentativas para adivinhar o número.
Fornecimento de Dicas: informar ao jogador se o número adivinhado é maior, menor ou igual ao número
gerado.
Contagem de Tentativas: manter um contador de tentativas até o acerto.
Opção de Sair: permitir que o jogador encerre o jogo a qualquer momento.
Mensagem de Encerramento: exibir uma mensagem de encerramento, informando o número de tentativas
realizadas.

#### Requisitos Técnicos:
Uso de Estruturas de Controle: implementar loops e condicionais para gerenciar o fluxo do jogo.
Geração de Números Aleatórios: utilizar a classe ‘Random’ para gerar o número secreto.
Tratamento de Exceções: incluir tratamento para entradas inválidas (por exemplo, caracteres não
numéricos).
Interação com o Usuário: exibir mensagens claras e informativas para guiar o jogador.

#### Entrega:
Código-fonte completo, comentado e organizado.

#### Critérios de Avaliação:
Funcionamento correto do jogo.
Clareza e organização do código (indentação adequada).
Uso adequado de estruturas de controle e manipulação de entradas.
Qualidade do tratamento de exceções e interação com o usuário.

#### Dicas para Implementação:
Utilize a classe "Random" para selecionar o número aleatório no intervalo definido.
Mantenha o loop ativo até que o jogador adivinhe corretamente ou escolha sair.
Use condicionais para comparar a entrada do jogador com o número secreto e fornecer dicas.
Valide as entradas do jogador para garantir que são números no intervalo especificado.