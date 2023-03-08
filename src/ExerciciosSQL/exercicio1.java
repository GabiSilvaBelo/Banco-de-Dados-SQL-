package ExerciciosSQL;

public class exercicio1 {
	
	CREATE DATABASE db_colaboradores;

	USE db_colaboradores;

	CREATE TABLE tb_informacoes(
	    id bigint auto_increment,
		nome varchar(255) not null,
		idade int,
		area varchar(255),
	    gestor varchar(255),
	    salario double,
	    PRIMARY KEY (id)
	);

	INSERT INTO tb_informacoes(nome, idade, area, gestor, salario) 
	values ("Rafaela Costa", 23, "Marketing", "Fabricio", 2.800);
	INSERT INTO tb_informacoes(nome, idade, area, gestor, salario) 
	values ("Cristiano Souza", 20, "Financeiro", "Daniela", 3.500);
	INSERT INTO tb_informacoes(nome, idade, area, gestor, salario) 
	values ("Juliana Diaz", 20, "Compliance", "Gisele", 1.500);
	INSERT INTO tb_informacoes(nome, idade, area, gestor, salario) 
	values ("Gabriela Gomes", 30, "TI", "Cristina", 10.000);
	INSERT INTO tb_informacoes(nome, idade, area, gestor, salario) 
	values ("Igor Alcantara", 18, "Fiscal", "Lopes", 1.220);

	SELECT * FROM tb_informacoes;

	ALTER TABLE tb_informacoes MODIFY salario decimal(6,3);

	SELECT * FROM tb_informacoes WHERE salario > 2.000;

	SELECT * FROM tb_informacoes WHERE salario < 2.000;

	UPDATE tb_informacoes SET idade = 19 WHERE id = 5;

}
