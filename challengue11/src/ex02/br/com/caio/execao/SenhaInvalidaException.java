package ex02.br.com.caio.execao;

public class SenhaInvalidaException extends RuntimeException {
    String message;

    public SenhaInvalidaException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
