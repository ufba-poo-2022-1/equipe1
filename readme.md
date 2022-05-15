# Descrição
Uma API feita com SpringBoot para armazenamento de perguntas que poderiam ser feitas simulando uma aula online, um chat ao vivo e outras ferramentas.
Utilizamos o banco MySQL hospedado online na AWS, a API poderá ser acessada futuramente em seu deplo que será feito no Heroku ou AWS Lambda.
- O objetivo deste projeto é para entrega na matéria Programação Orientada à Objetos, lecionada pelo Docente Rodrigo Rocha no semestre 2022.1 
- De forma prática podemos abordar as camadas iniciais da orientação à objetos utilizando uma biblioteca chamada Lombok (https://projectlombok.org/), onde abstraímos a necessidade de criar manualmente getters/setters/construtores através de anotações que em tempo de compilação gera todos esses itens no código final, reduzindo a poluição de código, visto que ao utilizar um banco de dados, nossas camadas de modelo serão tratadas como entidades pela JPA, facilitando nosso trabalho
- Os conceitos de sobrecarga podem ser visto também na utilização do Lombok, através das anotações @NoArgsConstructor, @RequiredArgsConstructor, @AllArgsConstructor e @Data, que abstraí para o programador a necessidade de criar construtores sem argumentos, com aragumentos, com todos os argumentos e com os getters e setters, facilitando bastante em alguns aspectos
- A utilização de Interfaces se dá pela camada de abstração que construímos em volta do nosso "Service", e do "Repository", onde nós utilizamos de recursos da JPA para otimizar a criação de métodos para consulta à bancos e a devida separação de todos os seus componentes necessários
- Interfaces ... EM CONSTRUÇÃO 

# Quem somos?
Feito por Bruno de Lucas (https://github.com/brunodelucasbarbosa) e Elis Marcela (https://github.com/develis) 
  . Estudantes do Bacharelado em Ciências da Computação pela Universidade Federal da Bahia - UFBA

# Milestones

~~- (25/4) Descrição do projeto: breve descrição do propósito do programa e de aspectos técnicos como linguagem de programação e ambiente de execução (web, mobile etc.)~~
- (~~11/5~~, 23/5 e 6/6) Screenshots: capturas de tela do projeto, postadas no Discord
- (23/5 e 6/6) Devlogs: relatos sobre a implementação de uma ou mais funcionalidades do programa, destacando dificuldades e soluções técnicas, com foco em aspectos de linguagens orientadas a objetos

# Avaliação 

- (10% da nota) qualidade da documentação
- (55% da nota) qualidade do código
- (30% da nota) entregas periódicas
- (5% da nota) apresentação final
- contribuição no GitHub

# Requisitos Mínimos 

O programa não pode ser muito simples. Ele deve definir no mínimo 7 classes e sua implementação deve usar ao menos 4 dos seguintes mecanismos de linguagens OO:

- construtores
- getters/setters ou properties
- sobrecarga de métodos ou construtores
- sobreposição de métodos (override)
- herança ou implementação de interface
- exceções

Além disso, o código-fonte deve estar bem documentado, usando algum mecanismo similar ao javadoc do Java.

Cada programa deve estar hospedado em um repositório público no GitHub. 
