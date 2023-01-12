package com.nandaadisaputra.mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nandaadisaputra.mysimplecleanarchitecture.base.viewmodel.BaseViewModel
import com.nandaadisaputra.mysimplecleanarchitecture.domain.MessageEntity
import com.nandaadisaputra.mysimplecleanarchitecture.domain.MessageUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val messageUseCase: MessageUseCase
) : BaseViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}