CREATE TABLE IF NOT EXISTS sistemas (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(150) NOT NULL,
  token VARCHAR(150) NOT NULL,
  PRIMARY KEY (id)
)
ENGINE = InnoDB default charset=utf8;