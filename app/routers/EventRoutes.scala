package routers

import controllers.EventController
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._

import javax.inject.Inject

class EventRoutes @Inject()(controller: EventController) extends SimpleRouter{
  val prefix = "/event"



  override def routes: Routes = {
    case GET (p"/") => controller.getAllEvents
    case POST (p"/") => controller.createEvent // TODO: Json meegeven als body
    case GET (p"/$id") => controller.getEventById(id.toLong)
    case DELETE (p"/$id") => controller.deleteEventById(id.toLong)
    case PUT (p"/$id") => controller.updateEventById(id.long)
  }


}
