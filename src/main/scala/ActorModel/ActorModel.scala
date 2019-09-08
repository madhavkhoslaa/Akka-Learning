package ActorModel
import akka.actor.{Actor, ActorSystem, Props}
object ActorModel extends App {
  ///Creating an actor system
  val actorSystem= ActorSystem("FirstActorSystem")
  println(actorSystem.name)
  ///Creating Actors
  class WordCountActor extends Actor{
    var totalWords= 0
    def receive: PartialFunction[Any, Unit] = {
      case message: String => totalWords+=  message.split(" ").length
        println(s"I have recieved $message of length $totalWords")
      case msg => println("Message cannot be evaluated")
    }
  }
  ///Instantaiting the actor
  val wordCountActor = actorSystem.actorOf(Props[WordCountActor], "wordCountActor")
  val wordCountActor2 = actorSystem.actorOf(Props[WordCountActor], "wordCountActor2")

  /// Communicating with the Actor
  wordCountActor ! "I'm learning akka and it's pretty damn cool"
  wordCountActor2 ! "Hey Actor 2"
  ///Sending this message is completely asynchronous

}

