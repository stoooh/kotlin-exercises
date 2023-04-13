package exercise3

fun main() {
        val emailUser = Users.userEmail("mail_id", "ciaociao", "lollo@gmail.com")
        val facebookUser = Users.userFacebookEmail("facebook_id", "salento20", "alberto@gmail.com")
        val googleUser = Users.userGoogleEmail("google_id", "roma84", "gabriele.los@gmail.com")

        println(emailUser.printUser())
        println(facebookUser.printUser())
        println(googleUser.printUser())

}


