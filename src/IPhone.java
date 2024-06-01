import static functions.AparelhoTelefonico.*;
import static functions.NavegadorInternet.*;
import static functions.ReprodutorMusical.*;

public class IPhone {
    public static void main(String[] args) {
        tocar();
        pausar();
        selecionarMusica("musica");

        ligar("numeroTelefone");
        atender();
        iniciarCorreioVoz();

        exibirPagina("URL");
        adicionarNovaAba();
        atualizarPagina();
    }
}
