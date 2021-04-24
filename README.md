![image](https://storage.googleapis.com/skalable.appspot.com/logo.png)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE.txt)
[![Kotlin JS IR supported](https://img.shields.io/badge/Kotlin%2FJS-IR%20supported-yellow)](https://kotl.in/jsirsupported)

# Managing Gaps in Rows, Columns (or even both!) with KotlinJS

At sKalable we are on a mission to make KotlinJS websites mainstream. We strive to make them easy to code, fun to build and, of course, skalable! :) :P

We are aware that sometimes when building the design of our website, working with column and row gaps can be initially tricky. Who hasn't struggled with this before? We certainly have...

_Let's explore how we can work effectively with gaps in rows and columns to smash our designs!_

## Mind the Gap

So what actually is the [gap](https://developer.mozilla.org/en-US/docs/Web/CSS/gap) property?

The `gap` property refers to the space between `columns` and `rows` by specifying the size of their gutters within flex, multi-columns and grid layouts. We use the `gap` property to add the required spacing between the items in our website so that they comply with the design and look great! :D

![](https://storage.googleapis.com/skalable.appspot.com/KotlinJS%20Understanding%20Gap/Understanding%20Flexbox.png)

In terms of the syntax it can be confusing to grasp at first. Essentially, Columns have `rowGaps` and Rows have `columnGaps`. Each of these takes a `Gap` value in the form of a size property.

## Gaps and Flexbox

When should we use gaps? Usually gaps are used in cells that repeat or to justify items on screen when a particular distance is required between them. In this example project we have used `rem` to set the sizing of gaps but other sizes such as `pct` or `px` work too.

It is worth mentioning that there are three gap variants that we can use with flexbox. Let's explore them in more detail below.

### Gap for Rows only

When we want to add spaces to items in a flexDirection column we need to include `rowGap` as per the example below.

```kotlin
/**
 * Style for rowGap in a flex column
 */
val container by css {
    ...
    display = Display.flex
    flexDirection = FlexDirection.column
    //when flex direction is column we use rowGap as spacing
    rowGap = Gap(YOUR_VALUE.rem.value) // this can be other sizes
    ...
}
```

As we can see, using a column layout with `rowGap` applies spacing between the row cells.

![](https://storage.googleapis.com/skalable.appspot.com/KotlinJS%20Understanding%20Gap/rowGap.gif)

### Gap for Columns only

Adding spaces to items in a flexDirection row requires `rowColumn` like in this example.

```kotlin
/**
 * Style for columnGap in a flex row
 */
val container by css {
    ...
    display = Display.flex
    flexDirection = FlexDirection.row
    //when flex direction is row we use columnGap as spacing
    columnGap = Gap(YOUR_VALUE.rem.value) // this can be other sizes
    ...
}
```

Here we are applying columnGap to a row layout. Modifying the spacing size horizontally between cells. 

![](https://storage.googleapis.com/skalable.appspot.com/KotlinJS%20Understanding%20Gap/columnGapFinal.gif)

### Gap for both Rows and Columns

What happens when we need both row and column gaps?! Luckily this is built in using just `gap` as the key...

```kotlin
/**
 * Style for gap in both flexRow and flexColumn
 */
val container by css {
    ...
    display = Display.flex
    flexDirection = FlexDirection.row
    //gap allows for both rows and columns to be sized as one
    gap = Gap(YOUR_VALUE.rem.value) // this can be other sizes
    ...
}
```
as we can see, both row and column spacing is adjusted in tandem.

![](https://storage.googleapis.com/skalable.appspot.com/KotlinJS%20Understanding%20Gap/DualGapFinal2.gif)

## What is the Gap Object?!

In KotlinJS and Styled-Components there is a wrapper around how we set the value of the spacing called `Gap(value: String)` which requires a string value as the parameter. 

Because of this we must convert our size by using `value` which is of type `String`. This is provided for free thanks to the `LinearDimensions` class. Ensuring all our conversions are web safe!

## Conclusion

Using row and column gaps correctly is incredibly beneficial to keeping CSS clean and will speed up your development process if you can apply them correctly. We hope that this article has helped resolved your confusion around this topic.

Please feel free to post any questions below, and we will be happy to support you :)

You can check out the sample project [here]().

@sKalable we are Full Stack Kotlin-centric agency that creates code that is always flexible, maintainable and of course, ***sKalable*** :D

[Twitter](https://twitter.com/skalable_dev)

[Dev.to](https://dev.to/skalabledev)

[LinkedIn](https://www.linkedin.com/company/skalable-dev/)

Follow us on for the latest updates and strategies in Kotlin, Multiplatform and much more, catering for your business or personal needs. 
