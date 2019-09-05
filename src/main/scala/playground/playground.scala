package playground
import akka.actor.ActorSystem
object playground extends App{
  val actorSystem= ActorSystem("Madhav")
  print(actorSystem.name)
}
