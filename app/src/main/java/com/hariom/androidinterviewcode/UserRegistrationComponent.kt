package com.hariom.androidinterviewcode

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService
}