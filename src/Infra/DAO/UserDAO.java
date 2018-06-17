package Infra.DAO;

/**
 *
 * @authors wellington
 */
import Business.Model.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 *
 * @author Carlinhos
 */
public class UserDAO {

    private final String endereco1;
    private final Path caminho1;
    private final Charset utf8;
    private final String token;

    public UserDAO(String end) {
        this.endereco1 = end;
        caminho1 = Paths.get(endereco1);
        utf8 = StandardCharsets.UTF_8;
        token = ";";
    }

    public UserDAO() {
        this.endereco1 = "src/util/ArquivoTexto/Dados.txt";
        caminho1 = Paths.get(endereco1);
        utf8 = StandardCharsets.UTF_8;
        token = ";";
    }

    public HashMap<String, Usuario> lerDados() {
        HashMap<String, Usuario> usuarios = new HashMap<>();
        String dado[];
        try (BufferedReader leitor = Files.newBufferedReader(caminho1, utf8)) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                dado = linha.split(token);
                usuarios.put(dado[0], new Usuario(dado[0], dado[1], dado[2]));
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler os dados");
        }
        return usuarios;
    }

    public void salvarDados(Usuario usu) {
        HashMap<String, Usuario> usuarios = this.lerDados();
        usuarios.put(usu.getCpf(), usu);
        String dado;
        try (BufferedWriter escritor = Files.newBufferedWriter(caminho1, utf8)) {
            for (HashMap.Entry<String, Usuario> u : usuarios.entrySet()) {
                dado = u.getKey() + token + u.getValue().getLogin() + token + u.getValue().getSenha();
                escritor.write(dado);
                escritor.newLine(); // para quebrar linha ao armazenar
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados");
        }
    }
}
