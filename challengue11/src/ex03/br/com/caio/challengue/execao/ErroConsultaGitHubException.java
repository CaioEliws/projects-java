package ex03.br.com.caio.challengue.execao;

public class ErroConsultaGitHubException extends RuntimeException {
    String message;

    public ErroConsultaGitHubException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
