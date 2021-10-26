package controllers

import play.api.Configuration
import play.api.mvc.{AbstractController, BaseController, ControllerComponents, Handler}

import javax.inject.Inject

class EventController @Inject()(cc:ControllerComponents, config: Configuration) extends AbstractController(cc) {
  def getAllEvents =TODO

  def createEvent = TODO

  def getEventById(id: Long)= Action {
    val result:String = "Id given: " + String.valueOf(id)
    Ok(result)
  }
  def deleteEventById(id:Long) = TODO

  def updateEventById(id:Long) = TODO
}
