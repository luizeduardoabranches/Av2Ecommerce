# Arquitetura de aplicações WEB - Prova AV2 projeto E-Commerce

## Endpoints

GET/register: localhost:8080/register

POST/login: localhost:8080/login

Enpoints de Admin
POST/admin: localhost:8080/admin/users

PUT/admin: localhost:8080/admin/users

DELETE/admin: localhost:8080/admin/users

Enpoints de Gerente
POST/manager: localhost:8080/manager/users

PUT/manager: localhost:8080/manager/users

DELETE/manager: localhost:8080/admin/users

Enpoints de Vendedor
POST/seller: localhost:8080/seller/users

PUT/seller: localhost:8080/seller/users

DELETE/seller: localhost:8080/seller/users

Enpoints de Cliente
POST/customer: localhost:8080/customer/users

PUT/customer: localhost:8080/customer/users

DELETE/customer: localhost:8080/customer/users


## Autenticação

Esta API utiliza o Jason Web Token (JWT) como chave de autenticação.

## Erros Comuns

Os erros comuns da aplicação são esses:

- [401 Unauthorized]: Significa que a senha ou o usuário estão incorretos.
- [403 Forbidden]: Isso acontece porque o usuário autenticado não possui a role especificada.

## Diagrama

<img width="900" alt="image" src="images\diagrama.png">


