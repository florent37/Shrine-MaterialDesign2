# Shrine-MaterialDesign2

Trying to reproduce some elements of Material Design 2 Shrine project on Android

https://material.io/design/material-studies/shrine.html#about-shrine

[![shrine_video](https://raw.githubusercontent.com/florent37/Shrine-MaterialDesign2/master/medias/shrine_video.gif)](https://github.com/florent37/Shrine-MaterialDesign2)

# About Shrine

The Shrine app provides an online marketplace featuring lifestyle and fashion items from promoted labels. Shrine’s brand aesthetic is modern, elegant, and sophisticated, and is the unifying concept behind the various brands and products showcased.

[![shrine_info_1](https://raw.githubusercontent.com/florent37/Shrine-MaterialDesign2/master/medias/shrine_info_1.png)](https://github.com/florent37/Shrine-MaterialDesign2)

## Overlapping sheets

The underlying theme of Shrine’s interaction model is that of three overlapping sheets. The bottom sheet has the navigation and branding elements; the middle sheet has the main content; and the top sheet has the shopping cart.
[![shrine_info_2](https://raw.githubusercontent.com/florent37/Shrine-MaterialDesign2/master/medias/shrine_info_2.png)](https://github.com/florent37/Shrine-MaterialDesign2)

# Implementation

I used [ShapeOfView](https://github.com/florent37/ShapeOfView) to allow views to have a custom shape,

https://github.com/florent37/ShapeOfView

```groovy
implementation 'com.github.florent37:shapeofview:1.0.7'
```

Here, to remove my view's corners, using `CutCornerView`

[![shrine_info_2](https://raw.githubusercontent.com/florent37/Shrine-MaterialDesign2/master/medias/clipcorner.png)](https://github.com/florent37/Shrine-MaterialDesign2)



# Button

[![shape_button](https://raw.githubusercontent.com/florent37/Shrine-MaterialDesign2/master/medias/shape_button.png)](https://github.com/florent37/Shrine-MaterialDesign2)

```
 <com.github.florent37.shapeofview.shapes.CutCornerView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        
        android:elevation="3dp"
        
        app:shape_cutCorner_bottomLeftSize="12dp"
        app:shape_cutCorner_bottomRightSize="12dp"
        app:shape_cutCorner_topLeftSize="12dp"
        app:shape_cutCorner_topRightSize="12dp">

        <android.support.constraint.ConstraintLayout
            android:id="@+id/addToCart"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@android:color/white"
            android:foreground="?attr/selectableItemBackground">
            
            <ImageView ... />
            
            <TextView ... />
```

# Sheets

[![sheets](https://raw.githubusercontent.com/florent37/Shrine-MaterialDesign2/master/medias/sheets.png)](https://github.com/florent37/Shrine-MaterialDesign2)

```
<com.github.florent37.shapeofview.shapes.CutCornerView
    android:id="@+id/middleSheet"
    android:layout_width="0dp"
    android:layout_height="0dp"
    android:layout_marginTop="16dp"
    android:elevation="4dp"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@+id/menu"
    app:shape_cutCorner_topLeftSize="42dp"
    tools:showIn="@layout/activity_main">

    <android.support.constraint.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@android:color/white">

```

Fiches Plateau Moto : [https://www.fiches-plateau-moto.fr/](https://www.fiches-plateau-moto.fr/)

