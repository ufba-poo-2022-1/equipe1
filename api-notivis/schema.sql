CREATE DATABASE anotacoes_alunos;

USE DATABASE anotacoes_alunos;

-- TODO: IMPLEMENTAR TABELAS DO BANCO

CREATE TABLE aluno (
  id INTEGER PRIMARY KEY,
  nome TEXT NOT NULL,
  matricula VARCHAR(5) NOT NULL UNIQUE,
);

CREATE TABLE anotacoes (
  id INTEGER PRIMARY KEY,
  id_aluno;
)