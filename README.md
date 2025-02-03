# Projeto de Teste de Botões com Katalon Studio, Appium e Android Studio

Este é um projeto simples para testar as funcionalidades em uma aplicação Android. O projeto utiliza as seguintes ferramentas:

## Ferramentas Utilizadas

- **Katalon Studio**: Para criar e gerenciar os casos de teste, incluindo a automação do fluxo de testes e a organização dos objetos da interface.
- **Appium**: Como framework para automação de testes em dispositivos Android.
- **Android Studio**: Para emulação e compilação do aplicativo Android utilizado no teste.

## Objetivo do Projeto

O objetivo principal é verificar a funcionalidade de diferentes botões na interface da aplicação, como:

- Botões de adicionar, editar e excluir produtos.
- Botões de confirmação e cancelamento.

## Estrutura do Projeto

### Casos de Teste
Os casos de teste foram criados no **Katalon Studio** e organizados na aba “Test Cases”. Cada caso de teste verifica uma funcionalidade específica do botão.

### Object Repository
Todos os elementos da interface, como botões e campos de texto, estão armazenados no “Object Repository” do Katalon Studio para facilitar o reuso nos casos de teste.

### Aplicação Android
A aplicação Android utilizada nos testes foi desenvolvida e emulada no **Android Studio**.

## Como Executar os Testes

1. Certifique-se de que o **Appium Server** está em execução.
2. Abra o projeto no **Katalon Studio**.
3. Configure o caminho para o APK da aplicação no perfil de execução.
4. Execute os casos de teste desejados.