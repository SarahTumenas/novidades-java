## Compilar com classpath
javac -d bin\ -cp bin 
src\br\com\alura\jpms\modelo\dominio\Categoria.java 
src\br\com\alura\jpms\modelo\dominio\Livro.java 
src\br\com\alura\jpms\modelo\dominio\NotaFiscal.java 
src\br\com\alura\jpms\http\dao\LivroDAO.java
src\br\com\alura\jpms\nf\servico\NotaFiscalServico.java
src\br\com\alura\jpms\nf\subscriber\NotaFiscalSubscriber.java
src\br\com\alura\jpms\nf\util\NotaFiscalUtil.java
src\br\com\alura\jpms\Principal.java

## Executar com classpath 
java -cp bin br.com.alura.jpms.Principal

## Compilar com module path
javac -d mods\br.com.alura.jpms --module-path mods 
src\br.com.alura\br\com\alura\jpms\modelo\dominio\Categoria.java 
src\br.com.alura\br\com\alura\jpms\modelo\dominio\Livro.java 
src\br.com.alura\br\com\alura\jpms\modelo\dominio\NotaFiscal.java 
src\br.com.alura\br\com\alura\jpms\http\dao\LivroDAO.java
src\br.com.alura\br\com\alura\jpms\nf\servico\NotaFiscalServico.java
src\br.com.alura\br\com\alura\jpms\nf\subscriber\NotaFiscalSubscriber.java
src\br.com.alura\br\com\alura\jpms\nf\util\NotaFiscalUtil.java
src\br.com.alura\br\com\alura\jpms\Principal.java

## Executar com module path
java --module-path mods -m br.com.alura/br.com.alura.jpms.Principal