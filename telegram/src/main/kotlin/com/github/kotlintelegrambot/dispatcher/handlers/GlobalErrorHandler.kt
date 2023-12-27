package com.github.kotlintelegrambot.dispatcher.handlers

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.Update
import com.github.kotlintelegrambot.errors.TelegramError

data class GlobalErrorHandlerEnvironment(
    val bot: Bot,
    val update: Update,
    val error: Throwable,
)

class GlobalErrorHandler(private val handler: HandleGlobalError) {

    operator fun invoke(bot: Bot, update: Update, error: Throwable) {
        val errorHandlerEnvironment = GlobalErrorHandlerEnvironment(bot, update, error)
        handler.invoke(errorHandlerEnvironment)
    }
}
