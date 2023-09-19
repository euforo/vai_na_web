programa {
  funcao inicio() {
    caracter nome_usuario, senha_usuario
  }


  funcao criar_usuario(caracter nome_usuario,caracter senha_usuario){
    escreva("Digite  o nome de seu usuaio: ")
    leia(nome_usuario)
    escreva ("digite sua senha")
    leia(senha_usuario)
    retorne senha_usuario nome_usuario
  }
  funcao logar_user(caracter nome_usuario,caracter senha_usuario){
    escreva ("para logar digite  o nome de seu usuaio: ")
    leia(nome_usuario_login)
    escreva("digite sua senha")
    leia(senha_usuario_login)
    se ( nome_usuario != nome_usuario_login ou senha_usuario_login != senha_usuario){
      escreva("logaaado \n")
    }  
  senao{
    escreva ("bem vindo!" +)
  }  
  }
}
