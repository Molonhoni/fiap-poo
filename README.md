# Projeto - Classe Mouse

Este projeto foi desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO) em Java.

A classe **Mouse** representa um mouse sem fio do mundo real, contendo características e comportamentos relacionados ao seu funcionamento.

---

## Estrutura da Classe

### Atributos:
- `cor` → Cor do mouse
- `marca` → Marca do mouse
- `nivelBateria` → Percentual de bateria (0 a 100)

### Métodos:

####  usar(int consumo)
Diminui o nível da bateria.

Regras:
- O consumo não pode ser menor ou igual a zero.
- A bateria não pode ficar negativa.

---

#### carregar(int carga)
Aumenta o nível da bateria.

Regras:
- A carga não pode ser menor ou igual a zero.
- A bateria não pode ultrapassar 100%.

---

##  Testes Realizados

No `SistemaPrincipal` foram testados:

###  Casos Válidos
- Uso normal do mouse
- Carregamento normal

###  Casos Inválidos
- Uso com bateria insuficiente
- Carga negativa
- Consumo igual a zero

---

##  Conceitos Aplicados

- Classe e Objeto
- Atributos
- Métodos
- Regra de negócio com validação (`if`)
- Alteração de estado do objeto
- Testes de funcionamento
