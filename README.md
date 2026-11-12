# ☕ Exercícios de Java - Maratona Java Virado no Jiraya 🥷

Este repositório contém as minhas soluções, anotações e exercícios práticos desenvolvidos ao longo do curso **Maratona Java - Virado no Jiraya**, ministrado pelo **DevDojo**.

O objetivo principal é consolidar os fundamentos da linguagem Java e avançar até tópicos mais sofisticados da Orientação a Objetos e ecossistema da linguagem.

---

## 📌 Conteúdos Praticados

- **Fundamentos do Java:** Tipos primitivos, operadores, estruturas condicionais e laços de repetição.
- **Orientação a Objetos (OO):**
    - Classes, atributos, métodos e coesão.
    - Sobrecarga e inicialização.
    - **Associação de classes** (Unidirecional, Bidirecional, N:N).
    - Herança, Polimorfismo e Classes Abstratas.
    - Interfaces e Modificadores (`final`, `static`).
- **Tratamento de Exceções:** Bloco `try-catch-finally`, exceções customizadas.
- **Coleções e Utilitários:** `String`, `StringBuilder`, `Arrays`, `ArrayList`, entre outros.

---

## 🧩 Módulos e Conceitos Aplicados

| Pacote | Conceito de POO | Classes de Domínio Implementadas |
| :--- | :--- | :--- |
| `encapsulamento` | Proteção de estado e regras de acesso | `ContaBancaria` |
| `heranca` | Reaproveitamento e especialização de classes | `Membro`, `MembroVip`, `MembroRegular` |
| `classesabstratas` | Modelos base e polimorfismo | `Notificacao`, `NotificacaoEmail`, `NotificacaoSms` |
| `interfaces` | Contratos e arquitetura de execução de testes | `ExecutavelDeTeste`, `TesteUnitario`, `TesteIntegracao`, `TesteDeCarga`, `CarregandoMassaDeDados`, `LimparAmbiente` |
| `associacao` | Relacionamentos (1:1, 1:N, N:N) | `Escola`, `Professor`, `Aluno`, `Seminario`, `Local`, `Livro`, `Autor`, `Empresa` |
| `enums` | Tipagem segura e constantes de domínio | `Cliente`, `Jogador`, `StatusPedido`, `TipoPagamento` |
| `metodos` & `sobrecargametodos` | Sobrecarga (`Overload`) e regras de negócio | `CalculadoraEstatistica`, `CalculadoraGeometrica`, `Livraria`, `Livro`, `ContaBancaria` |
| `modificadorfinal` & `tostring` | Imutabilidade (`final`) e representação textual | `ConfiguracaoSistema`, `DiretorioLog`, `Usuario` |