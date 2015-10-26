package com.google.android.apps.chromecast.app.widget;

import aer;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import bks;
import blp;
import bms;

public class ReusableImageView
  extends ImageView
{
  private String a;
  private final blp b = new blp("ReusableImageView");
  
  public ReusableImageView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public ReusableImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ReusableImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(aer paramaer, String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      if ((paramInt2 != 0) && (paramInt1 != 0))
      {
        localLayoutParams.height = paramInt2;
        localLayoutParams.width = paramInt1;
      }
      setLayoutParams(localLayoutParams);
      this.a = bks.a(paramInt1 / 2, paramInt2 / 2, paramString);
      setImageBitmap(null);
      paramString = this.a;
      if (paramaer != null) {
        paramaer.a(this.a, new bms(this, paramBoolean));
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\widget\ReusableImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */