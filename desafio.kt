enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val age: Int, val formacao: Formacao)

data class ConteudoEducacional(val nome: String, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun getInscritos() {
        println("Lista de Inscritos: $inscritos")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("HTML", Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("CSS", Nivel.BASICO)
    val conteudo3 = ConteudoEducacional("JavaScript", Nivel.BASICO)
    val formacao = Formacao("Front-end", arrayListOf(conteudo1, conteudo2, conteudo3))
    val usuario = Usuario("Jeferson", 28, formacao)
    formacao.matricular(usuario)
    formacao.getInscritos()
}