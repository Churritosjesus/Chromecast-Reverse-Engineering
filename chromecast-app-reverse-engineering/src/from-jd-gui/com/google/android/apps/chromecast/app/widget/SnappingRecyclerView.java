package com.google.android.apps.chromecast.app.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import boj;

public class SnappingRecyclerView
  extends RecyclerView
{
  public int s;
  private int t = 0;
  
  public SnappingRecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SnappingRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SnappingRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.o = new boj(this);
  }
  
  public final boolean b(int paramInt1, int paramInt2)
  {
    double d1 = Math.log(Math.abs(paramInt1) * 0.3499999940395355D / (ViewConfiguration.getScrollFriction() * 1000000.0D));
    double d2 = ViewConfiguration.getScrollFriction();
    paramInt2 = (int)(Math.exp(d1 * 1.7352941743642858D) * (d2 * 1000000.0D));
    int i = this.t;
    if (paramInt1 > 0)
    {
      paramInt1 = paramInt2;
      paramInt1 += i;
      if (paramInt1 % this.s >= this.s / 2) {
        break label112;
      }
    }
    label112:
    for (paramInt1 = Math.max(paramInt1 / this.s, 0);; paramInt1 = Math.max(paramInt1 / this.s + 1, 0))
    {
      a(paramInt1 * this.s - this.t, 0);
      return true;
      paramInt1 = -paramInt2;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\widget\SnappingRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */