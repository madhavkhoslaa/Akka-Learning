package Revision

import akka.actor.ActorSystem

object Recap1 extends App {
  val actor= ActorSystem("madhav")
  println(actor.name)
}
