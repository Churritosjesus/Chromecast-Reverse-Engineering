package com.google.android.apps.chromecast.app.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import boe;
import bog;
import boh;
import gn;
import hx;

public class SlidingTabLayout
  extends HorizontalScrollView
{
  public int a;
  public int b;
  public ViewPager c;
  public hx d;
  public bog e;
  public final boh f;
  private int g;
  
  public SlidingTabLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SlidingTabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingTabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setHorizontalScrollBarEnabled(false);
    setFillViewport(true);
    this.g = ((int)(24.0F * getResources().getDisplayMetrics().density));
    this.f = new boh(paramContext);
    addView(this.f, -1, -2);
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i = this.f.getChildCount();
    if ((i == 0) || (paramInt1 < 0) || (paramInt1 >= i)) {}
    for (;;)
    {
      return;
      View localView = this.f.getChildAt(paramInt1);
      if (localView != null)
      {
        localView.setSelected(true);
        int j = localView.getLeft() + paramInt2;
        if (paramInt1 <= 0)
        {
          i = j;
          if (paramInt2 <= 0) {}
        }
        else
        {
          i = j - this.g;
        }
        scrollTo(i, 0);
      }
      for (paramInt2 = 0; paramInt2 < this.f.getChildCount(); paramInt2++) {
        if (paramInt2 != paramInt1)
        {
          localView = this.f.getChildAt(paramInt2);
          if (localView != null) {
            localView.setSelected(false);
          }
        }
      }
    }
  }
  
  public void a()
  {
    gn localgn = this.c.a;
    boe localboe = new boe(this);
    int i = 0;
    Object localObject1;
    TextView localTextView;
    if (i < localgn.a())
    {
      if (this.a == 0) {
        break label247;
      }
      localObject1 = LayoutInflater.from(getContext()).inflate(this.a, this.f, false);
      localTextView = (TextView)((View)localObject1).findViewById(this.b);
    }
    for (;;)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new TextView(getContext());
        ((TextView)localObject2).setGravity(17);
        ((TextView)localObject2).setTextSize(2, 12.0F);
        ((TextView)localObject2).setTypeface(Typeface.DEFAULT_BOLD);
        if (Build.VERSION.SDK_INT >= 11)
        {
          localObject1 = new TypedValue();
          getContext().getTheme().resolveAttribute(16843534, (TypedValue)localObject1, true);
          ((TextView)localObject2).setBackgroundResource(((TypedValue)localObject1).resourceId);
        }
        if (Build.VERSION.SDK_INT >= 14) {
          ((TextView)localObject2).setAllCaps(true);
        }
        int j = (int)(16.0F * getResources().getDisplayMetrics().density);
        ((TextView)localObject2).setPadding(j, j, j, j);
      }
      localObject1 = localTextView;
      if (localTextView == null)
      {
        localObject1 = localTextView;
        if (TextView.class.isInstance(localObject2)) {
          localObject1 = (TextView)localObject2;
        }
      }
      if (localObject1 != null) {
        ((TextView)localObject1).setText(localgn.b(i));
      }
      ((View)localObject2).setOnClickListener(localboe);
      this.f.addView((View)localObject2);
      i++;
      break;
      return;
      label247:
      localTextView = null;
      localObject1 = null;
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.c != null) {
      a(this.c.b, 0);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\widget\SlidingTabLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */