package exercise3

sealed class Users(open val type: String, open val password: String, open val email: String) {
    data class userEmail(override val type: String, override val password: String, override val email: String) :
        Users(type, password, email)
    data class userFacebookEmail(override val type: String, override val password: String, override val email: String) :
        Users(type, password, email)
    data class userGoogleEmail(override val type: String, override val password: String, override val email: String) :
        Users(type, password, email)


    fun printUser() : Any {
        return when(this) {
            is userEmail -> "$type user with mail: $email and password: $password"
            is userFacebookEmail -> "$type mail user with email: $email and password: $password"
            is userGoogleEmail -> "$type mail user with email: $email and password: $password"
            else -> {
                println("no user found")
            }
        }
    }
}
