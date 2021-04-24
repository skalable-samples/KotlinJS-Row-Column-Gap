import kotlinx.css.*
import kotlinx.html.InputType
import kotlinx.html.id
import kotlinx.html.js.onChangeFunction
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.Event
import react.*
import styled.css
import styled.styledDiv
import styled.styledInput
import styled.styledLabel

/**Set values for the slider**/
const val MAX = 5.5.toString()
const val MIN = 0.5.toString()
const val STEP = 0.1.toString()

/**
 * Props interface
 * @see ExampleType
 */
external interface GapExampleProps : RProps {
    var type: ExampleType
}

/**
 * Functional component gapExample with [GapExampleProps]
 *
 * [useState] values and
 * gapValue: string — so the range input value can be recorded
 */
private val gapExample = functionalComponent<GapExampleProps> { props ->

    var gapValue by useState { props.type.gapValue.toString() }

    /** onGapSliderChanged handles the changes on the input slider */
    val onGapSliderChanged = { event: Event ->
        gapValue = (event.target as HTMLInputElement).value
    }

    /** Main container */
    styledDiv {
        css {
            display = Display.inlineFlex
            alignItems = Align.center
            gap = Gap(3.rem.toString())
        }
        /** styledLabel for the label */
        styledLabel {
            attrs.id = ID.labelID(props.type)
            css {
                +GapExampleStyles.label(props.type.color)
            }
            +props.type.typeLabel
            /**
             * styledInput for range slider.
             *
             * Attribute values for inputType, min, max and step are set.
             * Value is equal to the gapValue used in the useState to update
             * the range value on the slider.
             *
             * OnChangedFunction called when the value of the range slider has been changed.
             */
            styledInput {
                attrs {
                    id = ID.sliderID(props.type)
                    type = InputType.range
                    min = MIN
                    max = MAX
                    step = STEP
                    value = gapValue
                    onChangeFunction = onGapSliderChanged
                }
            }
        }

        /** Container for items */
        styledDiv {
            attrs.id = ID.containerID(props.type)
            css {
                +GapExampleStyles.container(props.type, gapValue.toDouble())
            }
            /** loop that creates four items cells */
            for (i in 0..3) {
                styledDiv {
                    attrs.id = ID.itemID(props.type)
                    css {
                        +GapExampleStyles.item(props.type.color)
                    }
                }
            }
        }
    }
}

/** ReactBuilder function used to construct the Functional Component [gapExample] */
fun RBuilder.gapExample(handler: GapExampleProps.() -> Unit) = child(gapExample) {
    attrs(handler)
}