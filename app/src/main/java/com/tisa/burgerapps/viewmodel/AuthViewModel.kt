package com.tisa.burgerapps.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tisa.burgerapps.model.LoginResponse
import com.tisa.burgerapps.repository.AuthRepository
import kotlinx.coroutines.launch

class AuthViewModel : ViewModel() {

    private val repo = AuthRepository()

    val loginResult = MutableLiveData<LoginResponse>()
    val error = MutableLiveData<String>()

    fun login(email: String, password: String) {
        viewModelScope.launch {
            try {
                loginResult.value = repo.login(email, password)
            } catch (e: Exception) {
                error.value = e.message
            }
        }
    }
}
