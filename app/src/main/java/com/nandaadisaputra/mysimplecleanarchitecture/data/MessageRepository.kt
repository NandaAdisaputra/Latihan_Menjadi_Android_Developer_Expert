package com.nandaadisaputra.mysimplecleanarchitecture.data

import com.nandaadisaputra.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {

    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}