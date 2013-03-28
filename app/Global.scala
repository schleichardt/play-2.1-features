import filters.Take3instead2EssentialFilter
import play.api.mvc.WithFilters
import play.api.Play
import play.filters.csrf.CSRFFilter
import controllers.DependencyInjectedController

object Global extends WithFilters(Take3instead2EssentialFilter, CSRFFilter()) {
  val ClassOfDependencyInjectedController = classOf[DependencyInjectedController]

  lazy val diController = {
    val message = if(Play.isTest(Play.current)) "test" else "not-test"
    new DependencyInjectedController(message)
  }

  override def getControllerInstance[A](controllerClass: Class[A]) = {
    controllerClass match {
      case ClassOfDependencyInjectedController => diController.asInstanceOf[A]
      case _ => super.getControllerInstance(controllerClass)
    }
  }
}
