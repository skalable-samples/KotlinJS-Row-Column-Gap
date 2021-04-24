/** IDs for sliders, containers and items */
object ID {
    const val MAIN_CONTENT = "main_content"

    private const val SLIDER_DUAL = "slider_dual"
    private const val SLIDER_COL = "slider_col"
    private const val SLIDER_ROW = "slider_row"

    /** Utility fun to return correct ID based on [ExampleType] */
    fun sliderID(type: ExampleType) = when (type) {
        is ExampleType.Dual -> SLIDER_DUAL
        is ExampleType.Row -> SLIDER_ROW
        is ExampleType.Column -> SLIDER_COL
    }

    private const val LABEL_DUAL = "label_dual"
    private const val LABEL_COL = "label_col"
    private const val LABEL_ROW = "label_row"

    /** Utility fun to return correct ID based on [ExampleType] */
    fun labelID(type: ExampleType) = when (type) {
        is ExampleType.Dual -> LABEL_DUAL
        is ExampleType.Row -> LABEL_ROW
        is ExampleType.Column -> LABEL_COL
    }

    private const val CONTAINER_DUAL = "container_dual"
    private const val CONTAINER_COL = "container_col"
    private const val CONTAINER_ROW = "container_row"

    /** Utility fun to return correct ID based on [ExampleType] */
    fun containerID(type: ExampleType) = when (type) {
        is ExampleType.Dual -> CONTAINER_DUAL
        is ExampleType.Row -> CONTAINER_ROW
        is ExampleType.Column -> CONTAINER_COL
    }

    private const val ITEM_DUAL = "item_dual"
    private const val ITEM_COL = "item_col"
    private const val ITEM_ROW = "item_row"

    /** Utility fun to return correct ID based on [ExampleType] */
    fun itemID(type: ExampleType) = when (type) {
        is ExampleType.Dual -> ITEM_DUAL
        is ExampleType.Row -> ITEM_ROW
        is ExampleType.Column -> ITEM_COL
    }
}