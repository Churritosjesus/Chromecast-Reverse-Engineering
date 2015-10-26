package com.google.android.apps.chromecast.app.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import blq;
import bml;
import bmm;
import bmu;
import bnw;

public class OverlaidImageView
  extends ImageView
{
  public final ValueAnimator a;
  public Bitmap b;
  public Bitmap c;
  public Bitmap d;
  public Bitmap e;
  public String f;
  public String g;
  public String h;
  public String i;
  public boolean j = false;
  public boolean k = false;
  private final Paint l = new Paint();
  private int m = 0;
  
  public OverlaidImageView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public OverlaidImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public OverlaidImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setWillNotDraw(false);
    if (Build.VERSION.SDK_INT < 11) {
      this.a = null;
    }
    for (;;)
    {
      return;
      this.a = ValueAnimator.ofInt(new int[] { 0, 255 });
      this.a.addUpdateListener(new bml(this));
      this.a.setDuration(600L);
      this.a.addListener(new bmm(this));
    }
  }
  
  private void a(Canvas paramCanvas, Bitmap paramBitmap, int paramInt, boolean paramBoolean)
  {
    if (paramBitmap == null) {
      return;
    }
    this.l.setAlpha(paramInt);
    int i2 = paramBitmap.getWidth();
    int i1 = paramBitmap.getHeight();
    paramInt = getWidth();
    int n = getHeight();
    float f2 = i2 / i1;
    float f1 = paramInt / n;
    Rect localRect;
    if (paramBoolean) {
      if (f2 > f1)
      {
        i1 = (int)(f2 * n);
        localRect = new Rect((paramInt - i1) / 2, 0, (i1 + paramInt) / 2, n);
      }
    }
    for (;;)
    {
      paramCanvas.drawBitmap(paramBitmap, new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight()), localRect, this.l);
      break;
      i1 = (int)(paramInt / f2);
      localRect = new Rect(0, (n - i1) / 2, paramInt, (i1 + n) / 2);
      continue;
      i1 = (int)(f2 * n);
      localRect = new Rect((paramInt - i1) / 2, 0, (i1 + paramInt) / 2, n);
    }
  }
  
  public final void a(bnw parambnw)
  {
    Resources localResources = getContext().getResources();
    Bitmap localBitmap2 = bmu.k.a(parambnw.name());
    Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null)
    {
      localBitmap1 = BitmapFactory.decodeResource(localResources, parambnw.f);
      bmu.k.a(parambnw.name(), localBitmap1);
    }
    parambnw = parambnw.name();
    if (TextUtils.equals(this.h, parambnw))
    {
      this.b = localBitmap1;
      this.c = null;
    }
    for (;;)
    {
      invalidate();
      return;
      this.k = false;
      this.d = localBitmap1;
      this.e = null;
      this.h = parambnw;
      this.f = parambnw;
      this.i = null;
      this.g = null;
      if ((Build.VERSION.SDK_INT < 11) || (this.a.isRunning()))
      {
        this.b = localBitmap1;
        this.c = null;
      }
      else
      {
        this.a.start();
      }
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.l.setAlpha(255);
    int n = 255 - this.m;
    if ((this.c != null) || (this.e != null))
    {
      a(paramCanvas, this.c, n, true);
      a(paramCanvas, this.e, this.m, true);
    }
    for (;;)
    {
      a(paramCanvas, this.b, n, this.j);
      a(paramCanvas, this.d, this.m, this.j);
      return;
      if (this.k)
      {
        a(paramCanvas, this.b, (int)(n * 0.3F), true);
        a(paramCanvas, this.d, (int)(this.m * 0.3F), true);
      }
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    Parcelable localParcelable = paramParcelable;
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      this.h = paramParcelable.getString("fgImageUrl");
      this.i = paramParcelable.getString("bgImageUrl");
      localParcelable = paramParcelable.getParcelable("instanceState");
    }
    super.onRestoreInstanceState(localParcelable);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("instanceState", super.onSaveInstanceState());
    localBundle.putString("fgImageUrl", this.h);
    localBundle.putString("bgImageUrl", this.i);
    return localBundle;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\widget\OverlaidImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */