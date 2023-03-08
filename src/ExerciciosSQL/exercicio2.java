package ExerciciosSQL;

public class exercicio2 {
	
	CREATE DATABASE db_ecommerce;

	USE db_ecommerce;

	CREATE TABLE tb_produtos(
	    id bigint auto_increment,
		nome varchar(255) not null,
		preco decimal,
		marca varchar(255),
	    cor varchar(255),
	    tamanho varchar(255),
	    PRIMARY KEY (id)
	);

	INSERT INTO tb_produtos(nome, preco, marca, cor, tamanho) 
	values ("Regata", 30.00, "Liquido", "branca", "p");
	INSERT INTO tb_produtos(nome, preco, marca, cor, tamanho)
	values ("Legging", 60.00, "Adidas", "preto", "m");
	INSERT INTO tb_produtos(nome, preco, marca, cor, tamanho) 
	values ("Top", 30.00, "Liquido", "laranja", "g");
	INSERT INTO tb_produtos(nome, preco, marca, cor, tamanho)
	values ("Short Saia", 55.00, "Nike", "azul", "pp");
	INSERT INTO tb_produtos(nome, preco, marca, cor, tamanho) 
	values ("Top", 29.90, "Agua Azul", "verde", "m");
	INSERT INTO tb_produtos(nome, preco, marca, cor, tamanho) 
	values ("Camiseta", 40.00, "Nike", "cinza", "p");
	INSERT INTO tb_produtos(nome, preco, marca, cor, tamanho)
	values ("Camiseta", 40.00, "Nike", "cinza", "m");
	INSERT INTO tb_produtos(nome, preco, marca, cor, tamanho) 
	values ("Camiseta", 40.00, "Nike", "cinza", "g");

	SELECT * FROM tb_produtos;

	ALTER TABLE tb_produtos MODIFY preco decimal(6,2);

	SELECT * FROM tb_produtos WHERE preco > 40.00;

	SELECT * FROM tb_produtos WHERE preco <= 40.00;

	UPDATE tb_produtos SET tamanho = "g" WHERE id = 7;

}
