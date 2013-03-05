import filters.Take3instead2EssentialFilter
import play.api.mvc.WithFilters

object Global extends WithFilters(Take3instead2EssentialFilter) {

}
