package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def action2 = Action {
    Ok("2")
  }

  def action3(x: String) = Action {
    Ok("3 " + x)
  }
}