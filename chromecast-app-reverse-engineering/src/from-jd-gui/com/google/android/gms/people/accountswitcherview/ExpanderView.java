package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import b;

public class ExpanderView
  extends ImageButton
{
  private static final int[] a = { 16842920 };
  private boolean b;
  private String c;
  private String d;
  
  public ExpanderView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ExpanderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public ExpanderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    paramContext = paramContext.getResources();
    this.c = paramContext.getString(b.eE);
    this.d = paramContext.getString(b.eC);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    if (this.b) {}
    for (String str = this.d;; str = this.c)
    {
      setContentDescription(str);
      refreshDrawableState();
      return;
    }
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (this.b) {
      mergeDrawableStates(arrayOfInt, a);
    }
    return arrayOfInt;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\people\accountswitcherview\ExpanderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */