package com.nandaadisaputra.mysimplecleanarchitecture.di

import com.nandaadisaputra.mysimplecleanarchitecture.data.IMessageDataSource
import com.nandaadisaputra.mysimplecleanarchitecture.data.MessageDataSource
import com.nandaadisaputra.mysimplecleanarchitecture.data.MessageRepository
import com.nandaadisaputra.mysimplecleanarchitecture.domain.IMessageRepository
import com.nandaadisaputra.mysimplecleanarchitecture.domain.MessageInteractor
import com.nandaadisaputra.mysimplecleanarchitecture.domain.MessageUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class Injection {
    @Provides
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }
    @Provides
    fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }
    @Provides
    fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}