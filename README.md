# ProjectEsig-CRUD

## Projeto Item Envio
Projeto de CRUD desenvolvido com o JavaServer Faces(Jsf), Spring Boot e MVC, Spring Data JPA, MySql, JPA, Hibernate, Bootstrap, JQuery e publicado no Heroku.

--Link da Aplicação no Heroku: https://projectitemenvio.herokuapp.com/

Para a execução local do projeto, basta clonar na sua máquina, use uma IDE de desenvolvimento configurado para projetos Spring, então navegue até src/main/resources/application.properties, então basta comentar a configuração do banco de dados no HEROKU por um banco local, neste mesmo arquivo voce pode encontrar as configurações locais para MySQL, utilizando o MySql do XAMPP, substitua as credenciais e crie um banco chamado "projectesig".

Após iniciada a aplicação, basta acessar localhost:3306/. O projeto oferece uma ApiRest para acesso aos recursos: basta acessar os recursos GET e POST acrescentando "/item", e para DELETE "/item/{id}".

#### Ps.: Há um pequeno impasse na opção editar, favor verificar! E ocorreu um erro durante a publicação, não tive mais tempo para resolvê-lo.
