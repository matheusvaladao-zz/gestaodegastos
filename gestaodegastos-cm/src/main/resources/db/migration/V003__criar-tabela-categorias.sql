CREATE TABLE IF NOT EXISTS categorias (
  id BIGINT NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(70) NOT NULL,
  PRIMARY KEY (id)
)
ENGINE = InnoDB default charset=utf8;