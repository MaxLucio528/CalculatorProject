# CalculatorProject

Calculadora feita em Java, almeja-se criar uma calculadora com interface gráfica até a versão final.

Atualmente a calculadora executa as quatro operações básicas e potenciação, não possui interface gráfica e é executada no terminal.

Para editar o Diagrama de Classes, utilize o Software Ideas Modeler.

## Compilando e executando o código

1 - Estando na pasta raíz, digite o seguinte em seu terminal:

~~~~
javac -d bin src/calculus/*.java
~~~~

2 - Em seguida para executar digite:

~~~
java -cp bin calculus.StartProgram
~~~

3 - Para gerar o JavaDoc digite o seguinte:

~~~
javadoc -d doc src/calculus/*.java
~~~

**Alternativamente você pode importar esse programa em uma IDE para executá-lo.**

Versão atual: 1.1.3

## Changelog

**Versão 1.1.3 (06/10/2019)**

-> Modificação na estrutura dos arquivos, agora com a pasta bin presente, assim como a pasta calculus armazena o código-fonte dentro da pasta src.

-> Remoção da EclipseBranch.

**Versão 1.1.2 (05/10/2019)**

-> Modificação para que a versão feita na IDE Eclipse ficasse em uma branch secundária.

-> Versão livre para rodar em terminais criada.

-> Acentuação removida dos comentários para evitar problemas com os caracteres.

**Versão 1.1.1 (28/09/2019)**

-> Adição da classe Power, responsável pela execução de operações de potenciação; por consequêcia disso, houve
leves mudanças no código do MainMenu.java e ProgramExecution.java para acomodar a nova operação matemática.

**Versão 1.1 (28/09/2019)**

-> Modificação das funções que executam as 4 operações, alterações foram feitas no ProgramExecution.java

**Versão 1.0 (27/09/2019)** 

-> Criação do programa, com operações de adição, subtração, multiplicação e divisão.
