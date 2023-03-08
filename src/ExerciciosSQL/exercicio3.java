package ExerciciosSQL;

public class exercicio3 {
	
	CREATE DATABASE db_escola;

	USE db_escola;

	CREATE TABLE tb_estudantes(
	    id bigint auto_increment,
		nome varchar(255) not null,
		idade int,
		serie varchar(255),
	    extracurricular varchar(255),
	    nota float,
	    PRIMARY KEY (id)
	);

	INSERT INTO tb_estudantes(nome, idade, serie, extracurricular, nota) 
	values ("Luiza Diaz", 12, "6ª série", "natação", 10.0);
	INSERT INTO tb_estudantes(nome, idade, serie, extracurricular, nota)
	values ("Fernando Lima", 10, "4ª série", "teatro", 9.0);
	INSERT INTO tb_estudantes(nome, idade, serie, extracurricular, nota) 
	values ("Vitoria Fraga", 15, "1ª série colegial", "kung Fu", 10.0);
	INSERT INTO tb_estudantes(nome, idade, serie, extracurricular, nota)
	values ("Tamires Souza", 7, "1ª série", "ginástica", 6.0);
	INSERT INTO tb_estudantes(nome, idade, serie, extracurricular, nota)
	values ("Vitor Pereira", 16, "2ª série colegial", "boxe", 8.0);
	INSERT INTO tb_estudantes(nome, idade, serie, extracurricular, nota)
	values ("Carolina Silva", 9, "5ª série", "teatro", 9.1);
	INSERT INTO tb_estudantes(nome, idade, serie, extracurricular, nota)
	values ("Carlos Diaz", 8, "2ª série", "robotica", 6.0);
	INSERT INTO tb_estudantes(nome, idade, serie, extracurricular, nota) 
	values ("Roberta Lucciari", 13, "7ª série", "natação", 5.5);

	SELECT * FROM tb_estudantes;

	ALTER TABLE tb_estudantes MODIFY nota decimal(6,1);

	SELECT * FROM tb_estudantes WHERE nota > 7.0;

	SELECT * FROM tb_estudantes WHERE nota < 7.0;

	UPDATE tb_estudantes SET extracurricular = "inglês nivel II" WHERE id = 8;

}
