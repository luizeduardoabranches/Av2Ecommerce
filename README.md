# Arquitetura de aplicações WEB - Sistema de Autenticação e Autorização

Esta API permite que você controle acessos a determinadas partes do sistema a partir de ROLES de usuários.

## Sumário

- [Endpoints](#endpoints)
- [Autenticação](#autenticação)
- [Erros Comuns](#erros-comuns)
- [Diagrama](#diagrama)
- [Exemplos de Uso](#exemplos-de-uso)

## Endpoints

GET/moderador: localhost:8080/moderador

GET/admin: localhost:8080/admin 

GET/comum: localhost:8080/comum 

GET/username: localhost:8080/username/{token}

POST/user: localhost:8080/login

## Autenticação

Esta API utiliza o Jason Web Token (JWT) como chave de autenticação.

## Erros Comuns

Os erros comuns da aplicação são esses:

- [401 Unauthorized]: Significa que a senha ou o usuário estão incorretos.
- [403 Forbidden]: Isso acontece porque o usuário autenticado não possui a role especificada.

## Diagrama

<img width="900" alt="image" src="images\diagrama.png">

## Exemplos de uso

<img width="900" alt="image" src="images\login.jpg">

<img width="900" alt="image" src="images\comum.jpg">

<img width="900" alt="image" src="images\moderador.jpg">

<img width="900" alt="image" src="images\admin.jpg">

<img width="900" alt="image" src="images\username.jpg">


