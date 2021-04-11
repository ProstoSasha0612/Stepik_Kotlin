package chapter3

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    val personalInfo = client?.personalInfo?:return
    val email = personalInfo?.email?: return
    if(message ==null || email == null) return
    mailer.sendMessage(email,message)
}

class Client(val personalInfo: PersonalInfo?)

class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}