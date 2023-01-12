package com.nandaadisaputra.mysimplecleanarchitecture.data

import com.nandaadisaputra.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}