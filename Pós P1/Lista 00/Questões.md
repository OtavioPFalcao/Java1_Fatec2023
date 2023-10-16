1- Nesta terceira versão do exercício sobrecarregue o construtor da classe Retangulo (declare novamente a mesma função) para que seja possível ao usuário fornecer os valores para a base e a altura. Obs.: neste construtor não haverá parâmetros. A classe Principal deve ser alterada de forma que no momento da criação do objeto o construtor a ser evocado seja exatamente o que não possui parâmetros. Para realizar a leitura use a classe JOptionPane (já apresentada). 

Passe parâmetros de tal forma que a cada leitura seja colada a devida mensagem “Digite a altura:” ou “Digite a base:”. Para realizar a entrada de dados, faça outra classe, por exemplo, Le_Esc_String, onde será implementado os métodos de leitura e escrita de string. 



2- Nesta nova versão do exercício apenas reutilize a classe Retangulo do exercício anterior e na classe Principal, declare dois objetos ret1 e ret2 da classe Retangulo; crie o objeto ret1 passando como parâmetros os valores 6 e 4, respectivamente para a base e a altura; para ret2 crie o objeto sem passar nenhum parâmetro (os valores deverão ser digitados pelo usuário). Exiba a áreae o perímetro de ret1 e ret2 utilizando os devidos métodos (exibeArea e exibePerimetro). 

Exiba o valor da maior área e o valor do maior perímetro (utilize os métodos que retornam os respectivos valores para cada objeto, compare-os e exiba o maior valor) usando a classe Le_Esc_String. 



3-  Defina uma classe chamada Media contendo dois atributos (soma e contador do tipo float) e três  métodos:método construtor deve inicializar os atributos com ZERO;método Acrescenta deve ser definido com um parâmetro do tipo float que deve somar este valor ao atributo soma e incrementar o atributo contador;método MediaAtual deve retornar o valor da média atual(soma/contador);

Defina uma segunda classe chamada Principal onde deverá ser implementado o método main. Dentro deste método declare o objeto m da classe Media e crie-o. Ativeo método Acrescenta sucessivas vezes passando como argumento os valores 3, 5, 10 e 8. Exiba o valor a média atual.



4 - Implemente uma segunda versão para o exercício anterior alterando a classe Principal de forma a permitir que o usuário possa fornecer os números para o cálculo do valor (defina um laço na função main para permitir que o usuário decida quando finalizar a entrada dos números).