import kotlinx.css.Color

/**
 * Sealed class ExampleType is a configuration class for
 * [gapExample]
 *
 * @property gapValue Default gapValue value.
 * @property typeLabel Main label for the input range
 * @property color the default color for the component
 */
sealed class ExampleType(
    open var gapValue: Double,
    open var typeLabel: String,
    open var color: Color
) {
    /**
     * data classes extending [ExampleType] with configuration values set.
     */
    data class Dual(
        override var gapValue: Double = 0.5,
        override var typeLabel: String = "Dual Gap",
        override var color: Color = Color.coral
    ) : ExampleType(gapValue, typeLabel, color)

    data class Row(
        override var gapValue: Double = 0.5,
        override var typeLabel: String = "Row Gap",
        override var color: Color = Color.cadetBlue
    ) : ExampleType(gapValue, typeLabel, color)

    data class Column(
        override var gapValue: Double = 0.5,
        override var typeLabel: String = "Column Gap",
        override var color: Color = Color.hotPink
    ) : ExampleType(gapValue, typeLabel, color)
}