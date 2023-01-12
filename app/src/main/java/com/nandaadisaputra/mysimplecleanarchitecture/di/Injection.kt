package com.nandaadisaputra.mysimplecleanarchitecture.di

import com.nandaadisaputra.mysimplecleanarchitecture.data.IMessageDataSource
import com.nandaadisaputra.mysimplecleanarchitecture.data.MessageDataSource
import com.nandaadisaputra.mysimplecleanarchitecture.data.MessageRepository
import com.nandaadisaputra.mysimplecleanarchitecture.domain.IMessageRepository
import com.nandaadisaputra.mysimplecleanarchitecture.domain.MessageInteractor
import com.nandaadisaputra.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}