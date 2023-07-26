package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.usuario.DadosAutenticacao;
import med.voll.api.domain.usuario.Usuario;
import med.voll.api.infra.security.DadosTokenJwt;
import med.voll.api.infra.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados){
        //Esse primeiro token é o login e a senha, e já está sendo representado no DTO DadosAutenticacao. No entanto,
        // esse DTO não é o parâmetro esperado pelo Spring, ele espera uma classe dele próprio -
        // e não uma classe do projeto.
        //Portanto, na variável token criaremos a classe que representa o usuário e a senha.
        // Após o new, vamos instanciar um objeto do tipo UsernamePasswordAuthenticationToken()
        // passando como parâmetro o DTO, sendo dados.login(), e dados.senha().

        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        var authentication = manager.authenticate(authenticationToken);

        //devolve um token gerado pelo JWT token em um DTO json
        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());
        return  ResponseEntity.ok(new DadosTokenJwt(tokenJWT));
    }
}
