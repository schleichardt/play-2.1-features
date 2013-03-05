package filters

import play.api.mvc._

object Take3instead2EssentialFilter extends EssentialFilter {
  def apply(next: EssentialAction) = new EssentialAction {
    def apply(request: RequestHeader) = {
      if (request.path.startsWith("/2")) {
        controllers.Application.action3("in filters you have to parse the path yourself")(request)
      } else {
        next(request)
      }
    }
  }
}