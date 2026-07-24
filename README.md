# Delivery Alimentos FitNutri - Backend

<p align="center">
  <img src="https://i.imgur.com/Ei8epc3.png" width="300" alt="FitHub Delivery">
</p>

[![Top Language](https://img.shields.io/github/languages/top/Grupo-05-Turma-Java-85/delivery_alimentos-backend?style=flat-square)](https://github.com/Grupo-05-Turma-Java-85/delivery_alimentos-backend)[![Repo Size](https://img.shields.io/github/repo-size/Grupo-05-Turma-Java-85/delivery_alimentos-backend?style=flat-square)](https://github.com/Grupo-05-Turma-Java-85/delivery_alimentos-backend)[![Last Commit](https://img.shields.io/github/last-commit/Grupo-05-Turma-Java-85/delivery_alimentos-backend?style=flat-square)](https://github.com/Grupo-05-Turma-Java-85/delivery_alimentos-backend)[![Java](https://img.shields.io/badge/Java-17-red?style=flat-square&logo=openjdk)](https://openjdk.org/)[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=flat-square&logo=springboot)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white)](https://www.mysql.com/)[![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven)](https://maven.apache.org/)[![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?style=flat-square)](https://hibernate.org/)[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)



# 1. Descrição

O **FitNutri Delivery** é uma API Back-end desenvolvida para gerenciar um sistema de delivery de alimentos. A aplicação permite o gerenciamento de **usuários**, **categorias** e **produtos**, implementando operações de cadastro, consulta e autenticação de usuários, além do **CRUD completo** para as entidades de categorias e produtos. O projeto também estabelece relacionamentos entre as entidades, garantindo uma estrutura organizada e consistente dos dados. Desenvolvido com **Java**, **Spring Boot**, **MySQL** e **JPA/Hibernate**, segue a arquitetura **REST** e aplica boas práticas no desenvolvimento de APIs.



# 2. Sobre esta API

O **FitNutri Delivery** é uma API REST desenvolvida para o gerenciamento de um sistema de delivery de alimentos. A aplicação permite gerenciar usuários, categorias e produtos, possibilitando o cadastro, consulta e atualização de usuários, além das operações de cadastro, consulta, atualização e exclusão de categorias e produtos. O sistema também implementa o relacionamento entre as entidades, garantindo uma organização eficiente e consistente dos dados.

O projeto foi desenvolvido utilizando **Java**, **Spring Boot**, **Spring Data JPA**, **Hibernate** e **MySQL**, seguindo a arquitetura REST e boas práticas de desenvolvimento Back-end. Para a persistência dos dados, foi utilizado um **banco de dados relacional MySQL**, integrado à aplicação por meio do JPA/Hibernate, garantindo um gerenciamento seguro e eficiente das informações.



## 2.1 Principais Funcionalidades

- Cadastro e gerenciamento de usuários. 
- Cadastro, consulta, atualização e exclusão de categorias. 
- Cadastro, consulta, atualização e exclusão de produtos. 
- Relacionamento entre usuários, categorias e produtos. 
- Consulta de informações através de endpoints REST. 
- Persistência de dados utilizando banco de dados relacional MySQL. 
- Validação de dados das entidades da aplicação.



# 3. Diagrama de Classes

<p align="center">   <img src="https://ik.imagekit.io/iibl43pgxp/diagrama-classes%20(1).png" width="1500" alt="Diagrama de Classes"> </p>



# 4. Diagrama Entidade-Relacionamento (DER)

<p align="center">
  <img src="https://ik.imagekit.io/iibl43pgxp/diagrama-er.png" width="1500" alt="Diagrama de Entidade-Relacionamento">
</p>



# 5. Tecnologias utilizadas

| **Item**                 | **Tecnologia**  |
| ------------------------ | --------------- |
| Servidor                 | Tomcat          |
| Linguagem de Programação | Java            |
| Framework                | Spring          |
| ORM                      | JPA + Hibernate |
| Banco de dados           | MySQL           |



# 6. Requisitos

Para executar os códigos localmente, você precisará:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Banco de dados [MySQL](https://dev.mysql.com/downloads/)
- [STS](https://spring.io/tools)
- [Insomnia](https://insomnia.rest/download) ou [Postman](https://www.postman.com/)



# 7. Como Executar o projeto no STS

## 7.1. Importando o Projeto

1. Clone o repositório do Projeto [FitNutri Delivery](https://github.com/Grupo-05-Turma-Java-85/delivery_alimentos-backend.git) dentro da pasta do *Workspace* do STS

```
git clone https://github.com/Grupo-05-Turma-Java-85/delivery_alimentos-backend.git
```

2. Abra o **Spring Tools Suite (STS)**

3. Acesse:

```
File → Import
```

4. Selecione:

```
General → Existing Projects into Workspace
```

5. Escolha a pasta onde o projeto foi clonado

6. Clique em **Finish**



## 7.2. Executando o Projeto

1. Abra a aba **Boot Dashboard**
2. Localize o projeto **delivery_alimentos-backend**
3. Clique em:

```
Start or Restart
```

4. Aguarde a inicialização no console do STS

Caso a aplicação seja iniciada corretamente, a API estará disponível em:

```
http://localhost:8080
```

5. Utilize o [Insomnia](https://insomnia.rest/) ou o [Postman](https://www.postman.com/) para testar os endpoints.



# 10. Testando os endpoints

A API pode ser testada utilizando ferramentas como:

- Insomnia

- Postman

  

  ### 📦Endpoints de Produto

| Método | Endpoint                              | Descrição                                                    |
| ------ | ------------------------------------- | ------------------------------------------------------------ |
| GET    | `/produtos`                           | Retorna todos os produtos cadastrados.                       |
| GET    | `/produtos/{id}`                      | Busca um produto específico pelo ID.                         |
| GET    | `/produtos/produto/{produto}`         | Busca produtos cujo nome do produto contenha o termo pesquisado. |
| POST   | `/produtos`                           | Cadastra um novo produto.                                    |
| PUT    | `/produtos`                           | Atualiza os dados de um produto existente.                   |
| DELETE | `/produtos/{id}`                      | Remove um produto pelo ID.                                   |
| GET    | `/produtos/valor_maior/{valor}`       | Busca produtos com valor maior que o informado.              |
| GET    | `/produtos/valor_menor/{valor}`       | Busca produtos com valor menor que o informado.              |
| GET    | `/produtos/calorias_maior/{calorias}` | Busca produtos com calorias maior que o informado.           |
| GET    | `/produtos/calorias_menor/{calorias}` | Busca produtos com calorias menor que o informado.           |
| GET    | `/produtos/recomendados/{calorias}`   | Retorna produtos recomendados com base nas calorias informadas. |

Exemplo de requisição:

1. Deletar produto pelo id

   \```http DELETE http://localhost:8080/produtos/1



### 	📌Endpoints de Categoria

| Método | Endpoint                            | Descrição                                                    |
| ------ | ----------------------------------- | ------------------------------------------------------------ |
| GET    | `/categorias`                       | Retorna todas as categorias cadastradas.                     |
| GET    | `/categorias/{id}`                  | Busca uma categoria específica pelo ID.                      |
| GET    | `/categorias/categoria/{categoria}` | Busca clientes cujo nome da categoria contenha o termo pesquisado. |
| POST   | `/categorias`                       | Cadastra uma nova categoria.                                 |
| PUT    | `/categorias`                       | Atualiza os dados de uma categoria existente.                |
| DELETE | `/categorias/{id}`                  | Remove uma categoria pelo ID.                                |

Exemplo de requisição:

1. Buscar categoria pelo -

   \```http GET http://localhost:8080/categorias/categoria/saudaveis



### 	👤Endpoints de Usuario 

| Método | Endpoint                   | Descrição                                     |
| ------ | -------------------------- | --------------------------------------------- |
| GET    | `/usuarios`                | Retorna todos os usuários cadastrados.        |
| GET    | `/usuarios/{id}`           | Busca um usuário específico pelo ID.          |
| GET    | `/usuarios/usuario/{nome}` | Busca usuários que contenha o nome informado. |
| POST   | `/usuarios`                | Cadastra um novo usuário.                     |
| PUT    | `/usuarios`                | Atualiza dados de um usuário existente.       |

Exemplo de requisição:

1. Criar um novo usuário

   \```http POST http://localhost:8080/usuarios



# 9. Contribuição

Este repositório é parte de um projeto educacional, mas contribuições são sempre bem-vindas!

Caso tenha sugestões, correções ou melhorias, fique à vontade para:

- Criar uma **issue**
- Enviar um **pull request**
- Compartilhar com outros desenvolvedores!



# 10. Contato

Desenvolvido por [**Grupo 05 - Turma Java 85**](https://github.com/Grupo-05-Turma-Java-85)

Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue!

💻Obrigada por visitar o projeto!
