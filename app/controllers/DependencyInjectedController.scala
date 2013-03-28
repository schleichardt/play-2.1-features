package controllers

import play.api.mvc.{Action, Controller}

class DependencyInjectedController(message: String) extends Controller {

  def index = Action {
    Ok(message)
  }
}
