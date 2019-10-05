# CalculatorProject
Calculadora feita em Java, almeja-se criar uma calculadora com interface gráfica até a versão final.

Atualmente a calculadora executa as quatro operações básicas e potenciação, não possui interface gráfica e é executada no console.

Para editar o Diagrama de Classes, utilize o Software Ideas Modeler.

## Compilando e executando o código

1 - Entre na pasta "src" e digite no seu terminal o seguinte:

~~~~
javac -d ../. *.java
~~~~

2 - Volte a pasta anterior e digite no terminal o seguinte:

~~~
java -cp . calculus.StartProgram
~~~

Versão atual: 1.1.2

## Changelog

**Versão 1.1.2 (05/10/2019)**

-> Modificação para que a versão feita em IDE ficasse em uma branch secundária.

-> Versão livre para rodar em terminais criada.

-> Acentuação removida dos comentários para evitar problemas com os caracteres.

**Versão 1.1.1 (28/09/2019)**

-> Adição da classe Power, responsável pela execução de operações de potenciação; por consequêcia disso, houve
leves mudanças no código do MainMenu.java e ProgramExecution.java para acomodar a nova operação matemática.

**Versão 1.1 (28/09/2019)**

-> Modificação das funções que executam as 4 operações, alterações foram feitas no ProgramExecution.java

**Versão 1.0 (27/09/2019)** 

-> Criação do programa, com operações de adição, subtração, multiplicação e divisão.
