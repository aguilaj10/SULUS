package com.mbn.sulus.view

import android.support.v4.content.ContextCompat
import android.support.v4.widget.TextViewCompat
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.mbn.sulus.R
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

/**
 * Created by jonathan on 4/03/18.
 */
class ItemList : AnkoComponent<CarAdapter> {
    override fun createView(ui: AnkoContext<CarAdapter>): View = with(ui) {
        verticalLayout {
            lparams(width = matchParent)
            cardView {
                linearLayout {
                    lparams(width = matchParent)
                    orientation = LinearLayout.HORIZONTAL
                    imageView(R.mipmap.ic_launcher_round) {
                        id = R.id.imgItem
                        scaleType = ImageView.ScaleType.CENTER_CROP
                    }.lparams(width = dip(0), height = dip(200), weight = 1f)

                    linearLayout {
                        padding = dip(5)
                        orientation = LinearLayout.VERTICAL
                        textView(R.string.title) {
                            id = R.id.itemTitle
                            TextViewCompat.setTextAppearance(this, android.R.style.TextAppearance_Material_Large)
                        }
                        textView(R.string.title) {
                            id = R.id.itemDesc
                            TextViewCompat.setTextAppearance(this, android.R.style.TextAppearance_Material_Small)
                        }
                        textView(R.string.title) {
                            id = R.id.itemPrice
                            TextViewCompat.setTextAppearance(this, android.R.style.TextAppearance_Material_Medium)
                            textColor = ContextCompat.getColor(ctx, R.color.colorAccent)
                        }.lparams {
                            topMargin = dip(5)
                            gravity = Gravity.END
                        }
                    }.lparams(width = dip(0), height = wrapContent, weight = 4f)
                }
            }
        }
    }

}