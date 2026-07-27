# ERP API

API REST desenvolvida em Java com Spring Boot para um sistema ERP, responsável pelo gerenciamento de autenticação, usuários e demais módulos do sistema.

## Tecnologias

- Java 21
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Funcionalidades

- Autenticação utilizando JWT
- Login seguro
- Criptografia de senhas com BCrypt
- Controle de acesso por token
- API REST
- Validação de dados
- Persistência com JPA/Hibernate
- Tratamento de exceções

## Estrutura do Projeto

```
src
├── config
├── controller
├── dto
├── entity
├── exception
├── repository
├── security
├── service
└── util
```

## Como executar

### Clone o projeto

```bash
git clone https://github.com/w-Caue/erp-api.git
```

### Configure o banco de dados

No arquivo `application.properties` configure:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/erp
spring.datasource.username=root
spring.datasource.password=sua_senha
```

### Execute

```bash
mvn spring-boot:run
```

A API estará disponível em

```
http://localhost:8080
```

## Autenticação

Após realizar o login, a API retorna um Token JWT.

Exemplo:

```json
{
    "token":"eyJhbGciOiJIUzI1NiJ9..."
}
```

As rotas protegidas devem receber o cabeçalho:

```
Authorization: Bearer {TOKEN}
```

## Frontend

O frontend deste projeto está disponível em:

➡️ https://github.com/w-Caue/erp-web

## Melhorias futuras

- Cadastro de clientes
- Cadastro de fornecedores
- Controle de estoque
- Financeiro
- Vendas
- Dashboard
- Relatórios
- Controle de permissões por perfil

## 👨‍💻 Autor

Desenvolvido por **Cauê Sousa**

LinkedIn: https://linkedin.com/in/cauesousadev/

GitHub: https://github.com/w-Caue
