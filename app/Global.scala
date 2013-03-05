import filters.Take3instead2EssentialFilter
import play.api.mvc.WithFilters
import play.filters.csrf.CSRFFilter

object Global extends WithFilters(Take3instead2EssentialFilter, CSRFFilter()) {

}
