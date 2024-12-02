
public class ParametrosInvalidosException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }

}
