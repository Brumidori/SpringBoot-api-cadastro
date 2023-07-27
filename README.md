# SpringBoot-api-crud-cadastro
Projeto desenvolvido em Java utilizando SpringBoot3 para construção de uma API de cadastro com CRUD completo e conexão com MySQL
<ul>
<li>Enviar dados para API no formato JSON;</li>
<li>Utilizar a anotação @RequestBody para receber os dados do corpo da requisição em um parâmetro no Controller;</li>
<li>Utilizar o padrão DTO (Data Transfer Object), via Java Records, para representar os dados recebidos em uma requisição POST;</li>
<li>Mapear uma entidade JPA e criar uma interface Repository para ela;</li>
<li>Utilizar o Flyway como ferramenta de Migrations do projeto;</li>
<li>Realizar validações com Bean Validation utilizando algumas de suas anotações, como a @NotBlank;</li>
<li>Mapear parâmetros dinâmicos em URL com a anotação @PathVariable;</li>
<li>Utilizar a interface Pageable do Spring para realizar consultas com paginação;</li>
<li>Controlar a paginação e a ordenação dos dados devolvidos pela API com os parâmetros page, size e sort;</li>
<li>Configurar o projeto para que os comandos SQL sejam exibidos no console;</li>
<li>Implementar o conceito de exclusão lógica com o uso de um atributo booleano;</li>
<li>Criar uma classe para isolar o tratamento de exceptions da API, com a utilização da anotação @RestControllerAdvice;</li>
<li>Utilizar a anotação @ExceptionHandler, do Spring, para indicar qual exception um determinado método da classe de tratamento de erros deve capturar;</li>
<li>Tratar erros do tipo 404 (Not Found) na classe de tratamento de erros;</li>
<li>Tratar erros do tipo 400 (Bad Request), para erros de validação do Bean Validation, na classe de tratamento de erros;</li>
<li>Simplificar o JSON devolvido pela API em casos de erro de validação do Bean Validation;</li>
<li>Implementar o processo de autenticação na API, de maneira Stateless, utilizando as classes e configurações do Spring Security;</li>
<li>Adicionar blibloteca jwt para gerar token;</li>
<li>Injetar uma propriedade do arquivo application.properties em uma classe gerenciada pelo Spring, utilizando a anotação @Value;</li>
<li>Simplificar o JSON devolvido pela API em casos de erro de validação do Bean Validation;</li>
<li>Devolver um token gerado na API quando um usuário se autenticar nela;</li>
<li>Implementar um filter criando uma classe que herda da classe OncePerRequestFilter, do Spring;</li>
<li>Utilizar a biblioteca Auth0 java-jwt para realizar a validação dos tokens recebidos na API;</li>
<li>Realizar o processo de autenticação da requisição, utilizando a classe SecurityContextHolder, do Spring;</li>
<li>Liberar e restringir requisições, de acordo com a URL e o verbo do protocolo HTTP.</li>
</ul>
