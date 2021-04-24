import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.id
import react.dom.render
import styled.css
import styled.styledDiv

/**
 * main launcher.
 */
fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            /* Main container */
            styledDiv {
                attrs.id = ID.MAIN_CONTENT
                css {
                    +GapExampleStyles.mainContent
                }
                /* Example showing both row and column */
                gapExample {
                    type = ExampleType.Dual()
                }

                /* Example showing row */
                gapExample {
                    type = ExampleType.Row()
                }

                /* Example showing column */
                gapExample {
                    type = ExampleType.Column()
                }
            }
        }
    }
}
