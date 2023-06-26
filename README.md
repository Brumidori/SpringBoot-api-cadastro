# SpringBoot-api-crud-cadastro
Projeto desenvolvido em Java utilizando SpringBoot3 para construção de uma API de cadastro com CRUD completo e conexão com MySQL
<ul>
<li>Enviar dados para API no formato JSON;</li>
<li>Utilizar a anotação @RequestBody para receber os dados do corpo da requisição em um parâmetro no Controller;</li>
<li>Utilizar o padrão DTO (Data Transfer Object), via Java Records, para representar os dados recebidos em uma requisição POST.</li>
<li>Mapear uma entidade JPA e criar uma interface Repository para ela;</li>
<li>Utilizar o Flyway como ferramenta de Migrations do projeto;</li>
<li>Realizar validações com Bean Validation utilizando algumas de suas anotações, como a @NotBlank.</li>
<li>Mapear parâmetros dinâmicos em URL com a anotação @PathVariable;</li>
<li>Utilizar a interface Pageable do Spring para realizar consultas com paginação;</li>
<li>Controlar a paginação e a ordenação dos dados devolvidos pela API com os parâmetros page, size e sort;</li>
<li>Configurar o projeto para que os comandos SQL sejam exibidos no console.</li>
<li>Implementar o conceito de exclusão lógica com o uso de um atributo booleano.</li>
</ul>