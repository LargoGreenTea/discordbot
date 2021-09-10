package com.github.largogreentea.discordbot.command

import com.jagrosh.jdautilities.command.{Command, CommandEvent}
class HelloCommand extends Command{
  this.name = "hello"

  override def execute(event:CommandEvent) : Unit  ={
    event.getChannel.sendMessage("hello!")
  }
}
