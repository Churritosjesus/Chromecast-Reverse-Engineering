package com.google.android.apps.chromecast.app.widget;

import anc;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class BoundedLinearLayout
  extends LinearLayout
{
  private final int a;
  private final int b;
  
  public BoundedLinearLayout(Context paramContext)
  {
    super(paramContext);
    this.a = -1;
    this.b = -1;
  }
  
  public BoundedLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, anc.a);
    this.a = paramContext.getDimensionPixelSize(anc.c, -1);
    this.b = paramContext.getDimensionPixelSize(anc.b, -1);
    paramContext.recycle();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = View.MeasureSpec.getSize(paramInt1);
    int i = paramInt1;
    if (this.a > 0)
    {
      i = paramInt1;
      if (this.a < j) {
        i = View.MeasureSpec.makeMeasureSpec(this.a, View.MeasureSpec.getMode(paramInt1));
      }
    }
    j = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = paramInt2;
    if (this.b > 0)
    {
      paramInt1 = paramInt2;
      if (this.b < j) {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(this.b, View.MeasureSpec.getMode(paramInt2));
      }
    }
    super.onMeasure(i, paramInt1);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\widget\BoundedLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */