# nova-cobranca-web
# Boletos e arquivos de retorno com BOPEPO e TEXGIT.

#### Sobre:

Sem fins comerciais, a idéia aqui é mostrar como podemos trabalhar com a geração de boletos bancários e arquivos de retorno, efetuando a baixa no banco de dados ao confirmar o pagamento do boleto, através do arquivo de retorno.

Sistema de cobrança que emite um boleto bancário para pagamento de condominio, e em outra tela efetua o recebimento do arquivo de retorno que o banco envia, contendo os boletos pagos para baixar no sistema e banco de dados.

#### Tecnologias:
Sistema desenvolvido utilizando uma plataforma baseada na tecnologia Java EE.

- Eclipse
- Tomcat 8.0
- Maven
- JSF 2.1 
- Primefaces 5.0
- JPA 2.0 com Hibernate 4.3.6.Final
- CDI com Weld 2.2.10.Final
- Drive JDBC MySQL 5.1.25 (usei esse banco, mas pode subir em outro por utilizar JPA)
- jrimum Bopepo 0.2.3-SNAPSHOT
- jrimum Texgit 0.2.0-SNAPSHOT
- JUnit 4.10
