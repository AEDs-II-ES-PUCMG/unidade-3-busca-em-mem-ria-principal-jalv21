public class Cliente {

	private static int ultimoID = 10_000;

    private String nome;
    private int documento;

    public Cliente (String nome) {
        setNome(nome);
        this.documento = ultimoID;
        ultimoID++;
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

    @Override
    public String toString() {
    	StringBuilder s = new StringBuilder();

        s.append("== CLIENTE ID " + ultimoID + "===");
        s.append("\nNOME: " + nome);
        s.append("\nDOC.: " + documento);
        s.append("\n");

        return s.toString();
    }

    @Override
    public int hashCode(){
    	return documento;
    }

    public static Cliente criarDoTexto(String linha) {
        return new Cliente(linha);
    }
}
