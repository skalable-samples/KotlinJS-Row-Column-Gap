import kotlinx.css.*
import kotlinx.css.properties.border
import styled.StyleSheet

/** Main style sheet for the gap example. */
object GapExampleStyles : StyleSheet("GapExampleStyles") {

    /** style for [mainContent] */
    val mainContent by css {
        display = Display.flex
        flexDirection = FlexDirection.column
        justifyContent = JustifyContent.center
        alignItems = Align.center
        rowGap = Gap(10.vw.value)
        margin(20.px)
    }

    /** style for [container] in a function so when statement can be used based on
     * @param gapExample is of [ExampleType], used for deciding where to apply the gap.
     * @param gapValue is the amount of gap to apply.
     */
    fun container(gapExample: ExampleType, gapValue: Double): RuleSet {
        val container by css {
            display = Display.flex
            flexWrap = FlexWrap.wrap
            width = 30.vw
            height = 20.vw
            gap = Gap(0.5.rem.value)
            /** when statement based on ExampleType to set the gap accordingly */
            when (gapExample) {
                is ExampleType.Dual -> gap = Gap(gapValue.rem.value)
                is ExampleType.Row -> rowGap = Gap(gapValue.rem.value)
                is ExampleType.Column -> columnGap = Gap(gapValue.rem.value)
            }
        }
        return container
    }

    /**
     * [label] style.
     * A function to apply color based on [ExampleType]
     * @param labelColor the color to apply
     */
    fun label(labelColor: Color): RuleSet {
        val label by css {
            display = Display.flex
            flexDirection = FlexDirection.column
            width = LinearDimension.fitContent
            color = labelColor
            textAlign = TextAlign.center
            fontFamily = "sans-serif;"
        }
        return label
    }

    /**
     * [item] style.
     * A function to apply color based on [ExampleType]
     * @param itemColor the color to apply
     */
    fun item(itemColor: Color): RuleSet {
        val item by css {
            backgroundColor = Color.white
            width = 10.vw
            height = 10.vw
            border(
                width = 3.px,
                style = BorderStyle.dotted,
                color = itemColor,
                borderRadius = 15.px
            )
        }
        return item
    }
} 
