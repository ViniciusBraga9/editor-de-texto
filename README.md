📝 Editor de Texto Básico em JavaFX

Um editor de texto simples desenvolvido em JavaFX, com interface gráfica intuitiva e funcionalidade de salvamento de arquivos .txt.
O projeto tem como objetivo demonstrar conceitos fundamentais de GUI em Java, manipulação de eventos e escrita de arquivos.

🚀 Funcionalidades

Interface gráfica construída com JavaFX

Área de texto central para edição livre

Barra de ferramentas com botão Salvar

Salvamento de arquivos de texto no sistema operacional

Uso do FileChooser para seleção do local de gravação

🧠 Conceitos Aplicados

Este projeto utiliza e demonstra:

Programação orientada a eventos

Componentes gráficos do JavaFX (TextArea, Button, ToolBar)

Layouts (BorderPane)

Manipulação de arquivos com File e PrintWriter

Boas práticas básicas de separação de responsabilidades

🖥️ Interface

A aplicação é composta por:

ToolBar no topo com o botão Salvar

TextArea ocupando a área central da janela

Janela redimensionável com tamanho inicial de 800x600

📂 Estrutura do Projeto
Main.java

O projeto é intencionalmente simples, concentrando toda a lógica em uma única classe para fins didáticos.

⚙️ Pré-requisitos

Antes de executar o projeto, certifique-se de ter:

Java JDK 8 ou superior

JavaFX configurado corretamente (necessário principalmente a partir do Java 11)

Uma IDE compatível (IntelliJ IDEA, Eclipse, NetBeans, etc.)

▶️ Como Executar

Clone ou baixe este repositório

Abra o projeto em sua IDE Java

Verifique se o JavaFX está configurado no classpath

Execute a classe Main

Ou via terminal (exemplo):

javac Main.java
java Main
💾 Como Funciona o Salvamento

O usuário digita o texto na área central

Clica no botão Salvar

Um seletor de arquivos é exibido

O conteúdo do editor é gravado no arquivo escolhido
