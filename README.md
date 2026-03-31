2.1 -- saltos de 5 significa que, começando do indice 0, o codigo pula 5 caracteres da frase para poder cifrar ela de maneira com que pareça uma sequencia de caracteres aleatorios.

2.2 -- usando saltos de 5 de maneira circular, significa que, quando os saltos de 5 em 5 chegam em por exemplo 45, ele recomeça no 3 pra poder chegar em 47, fazendo com que ele passe por todos os caracteres da frase mesmo sendo numeros impares.

2.3 -- usamos o operador de "%" pra delimitar um limite de quantos caracteres a frase tem.

2.4 -- o salto só funciona porque o 5 e 47 são coprimos, ou seja, o MDC que eles compartilham é apenas o 1.
