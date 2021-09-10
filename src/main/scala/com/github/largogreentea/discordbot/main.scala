package com.github.largogreentea.discordbot

import com.jagrosh.jdautilities.command.CommandClientBuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.{JDA, JDABuilder, OnlineStatus}

object DiscordBot{
  var jda:JDA = _

  def setBot(): Unit ={
    import com.github.largogreentea.discordbot.command._
    //コマンド
    val commands = Seq(
      new HelloCommand
    )
    val commandClient = new CommandClientBuilder()
      .setPrefix("/")
      .setOwnerId("713289479871266856")
      .addCommands(commands:_*)
      .setStatus(OnlineStatus.ONLINE)
      .useHelpBuilder(false)
      .setActivity(Activity.playing("β"))
      .build()


    try jda =  JDABuilder.createDefault("Token")
      .addEventListeners(commandClient)
      .build()
    catch{
      case e: Exception =>
        e.printStackTrace()
        println("Botの起動に失敗しました。")
        sys.exit(1)
    }
  }

}
object main {
  def main(args: Array[String]):Unit={
    DiscordBot.setBot()
  }
}