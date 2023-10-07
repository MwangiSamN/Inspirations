package com.example.inspirations.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.inspirations.R

data class Inspiration(
    @StringRes val dateRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes:Int
)

object InspirationsRepository{
    val inspirations = listOf(
        Inspiration(
            dateRes = R.string.date1,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image1
        ),
        Inspiration(
            dateRes = R.string.date2,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image2
        ),
        Inspiration(
            dateRes = R.string.date3,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image3
        ),
        Inspiration(
            dateRes = R.string.date4,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image4
        ),
        Inspiration(
            dateRes = R.string.date5,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image5
        ),
        Inspiration(
            dateRes = R.string.date6,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image6
        ),
        Inspiration(
            dateRes = R.string.date7,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image2
        ),
        Inspiration(
            dateRes = R.string.date8,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image3
        ),
        Inspiration(
            dateRes = R.string.date9,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image4
        ),
        Inspiration(
            dateRes = R.string.date10,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image5
        ),
        Inspiration(
            dateRes = R.string.date11,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image6
        ),
        Inspiration(
            dateRes = R.string.date12,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image4
        ),
        Inspiration(
            dateRes = R.string.date13,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image5
        ),
        Inspiration(
            dateRes = R.string.date14,
            titleRes =R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.image6
        )
    )
}
