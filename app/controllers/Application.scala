package controllers

import play.api._
import play.api.mvc._
import play.filters.csrf._

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

  def csrfLessFormAction = Action { implicit request =>
    Ok(views.html.csrfLessForm())
  }

  def csrfProtectedFormAction = Action { implicit request =>
    Ok(views.html.csrfProtectedForm())
  }

  def csrfProtectedAction = Action { implicit request =>
    Ok("csrf token valid")
  }
}