package sudo

class Pessoa {
    int id
    String nome
    String cpf
    Date dataNascimento
    String sexo
    String telResidencial
    String telCelular
    String telComercial
    String email
    String estCivil
    String profissao
    String indicacao
    String obs
    Date dhc
    String cep
    String endereco
    String numero
    String bairro
    String complemento
    String cidade
    String estado

    static constraints = {
        nome (size: 10..200, blank: false, unique: false)
        cpf (size: 11..11, blank: false, unique: true)
        dataNascimento (blank: false, unique: false)
        sexo (blank: false, unique: false, inList: ["masculino","feminino"])
        endereco(size: 2..200, blank: false, unique: false)
        telResidencial(size: 1..14, blank: false, unique: false)
        telCelular(size: 1..14, blank: false, unique: false)
        telComercial(size: 1..14, blank: false, unique: false)
        cep(size: 9..9, blank: false, unique: false)
        email(size: 1..200, blank: false, unique: true)
        estCivil(size: 1..100, blank: false, unique: false)
        profissao( blank: false, unique: false, inList: ["Analista","Comeciante"])
        indicacao(size: 1..200, blank: false, unique: false)
        obs(size: 1..200, blank: false, unique: false)
        dhc(size: 1..14, blank: false, unique: false)
        numero(size: 1..100, blank: false, unique: false)
        bairro(size: 1..100, blank: false, unique: false)
        complemento(size: 1..200, blank: false, unique: false)
        cidade(size: 1..100, blank: false, unique: false)
        estado(size: 1..100, blank: false, unique: false)
    }
}
