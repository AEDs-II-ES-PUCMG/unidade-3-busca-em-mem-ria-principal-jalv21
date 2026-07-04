public class Cliente {

	private static int ultimoID = 10_000;

    private String nome;
    private int documento;

    /**
     * Construtor do cliente. Cria um novo cliente a partir do nome informado.
     * TODO: atribua ao cliente um número de documento gerado sequencialmente a partir
     * do contador estático ultimoID (e incremente o contador).
     */
    public Cliente (String nome) {
        setNome(nome);

    }

    public String getNome() {
    	return nome;
    }

    public void setNome(String nome) {
        if(nome.isEmpty() || nome.isBlank())
            throw new IllegalArgumentException("Nome em branco.");
        else {
            int contadorPalavras = 1;
            for(int i = 0; i < nome.length(); i++) {
                if(nome.charAt(i) == ' ');
                contadorPalavras++;
            }

            if(contadorPalavras <= 2)
                throw new IllegalArgumentException("O nome deve conter pelo menos duas palavras.");    

            this.nome = nome;
        }
    }

    /**
     * TODO: retorne uma representação textual do cliente, incluindo seu nome e documento.
     */
    @Override
    public String toString() {
    	StringBuilder s = new StringBuilder();

        s.append("== CLIENTE ID " + ultimoID + "===");
        s.append("\nNOME: " + nome);
        s.append("\nDOC.: " + documento);
        s.append("\n");

        return s.toString();
    }

    /**
     * TODO: retorne um código hash para o cliente, que corresponde a seu documento.
     */
    @Override
    public int hashCode(){
    	return documento;
    }
}
