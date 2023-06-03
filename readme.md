# **Documentação README - Projeto Java Spring Boot**

Este repositório contém um projeto Java Spring Boot pronto para ser executado. O projeto utiliza o framework Spring Boot para facilitar o desenvolvimento de aplicações Java web. Nesta documentação, você encontrará instruções sobre como configurar e executar o projeto em sua máquina local.

## Pré-requisitos
Antes de executar o projeto, verifique se você possui as seguintes ferramentas instaladas em sua máquina:

- Java Development Kit (JDK) 11 ou superior
- Maven
- IDE Java (recomendado, mas não obrigatório)

### Configuração do Projeto
Clone este repositório para o seu ambiente local utilizando o seguinte comando:
```bash
git clone https://github.com/joelcoelho29/sostool-backend
```
Navegue até o diretório raiz do projeto:
```bash
cd sostool-backend
```

Abra o projeto em sua IDE Java de preferência (por exemplo, IntelliJ, Eclipse, NetBeans) ou continue com a linha de comando se preferir.

No diretório raiz do projeto, você encontrará um arquivo chamado application.properties. Verifique as configurações neste arquivo e faça alterações caso desejar, como informações da porta onde o sistema roda.

## Executando o Projeto
Existem duas maneiras principais de executar o projeto: usando a IDE ou a linha de comando com o Maven.

### Executando com o Maven
Abra o terminal ou prompt de comando.

Navegue até o diretório raiz do projeto.

Execute o seguinte comando:
```bash
mvn spring-boot:run
```
O Maven irá compilar o projeto, baixar as dependências necessárias e iniciar a aplicação. Verifique a saída do console para ver se a aplicação foi iniciada com sucesso.

Caso ainda não tenha o maven instalado, você pode tentar iniciar o projeto rodando o seguinte comando:
```bash
.\mvn spring-boot:run
```

### Acessando a Aplicação
Após a execução bem-sucedida da aplicação, você pode acessá-la em seu navegador web usando a seguinte URL:

```
http://localhost:8081/workspace
```
Esta é a URL padrão para acesso local à aplicação Spring Boot. No entanto, se você modificou a configuração de porta no arquivo *application.properties*, utilize a porta configurada em seu ambiente.

## Conclusão
Agora você sabe como configurar e executar este projeto Java Spring Boot. Se tiver dúvidas ou encontrar problemas, consulte a documentação do Spring Boot em https://spring.io/projects/spring-boot.