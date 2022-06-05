package com.hariom.androidinterviewcode

/**
 * Constructor injection
 */
class UserRegistrationService(private val userRepository: UserRepository = UserRepository(),
                              private val emailService: EmailService = EmailService()
) {

    fun registerUser(email : String, password : String){

            userRepository.saveUser(email, password)
            emailService.send(email, "no-reply@sstudio.inc","User registered")

    }
}