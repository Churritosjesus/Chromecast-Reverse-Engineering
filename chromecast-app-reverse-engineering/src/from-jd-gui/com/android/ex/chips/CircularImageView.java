package com.android.ex.chips;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircularImageView
  extends ImageView
{
  private static float a = 1.0F;
  private final Matrix b = new Matrix();
  private final RectF c = new RectF();
  private final RectF d = new RectF();
  private final Paint e = new Paint();
  private final Paint f;
  
  public CircularImageView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.e.setAntiAlias(true);
    this.e.setFilterBitmap(true);
    this.e.setDither(true);
    this.f = new Paint();
    this.f.setColor(0);
    this.f.setStyle(Paint.Style.STROKE);
    this.f.setStrokeWidth(a);
    this.f.setAntiAlias(true);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Object localObject1 = getDrawable();
    if ((localObject1 instanceof StateListDrawable))
    {
      if (((StateListDrawable)localObject1).getCurrent() == null) {
        break label231;
      }
      localObject1 = (BitmapDrawable)((Drawable)localObject1).getCurrent();
    }
    for (;;)
    {
      if (localObject1 == null) {}
      for (;;)
      {
        return;
        localObject1 = (BitmapDrawable)localObject1;
        break;
        Object localObject2 = ((BitmapDrawable)localObject1).getBitmap();
        if (localObject2 != null)
        {
          this.c.set(0.0F, 0.0F, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight());
          this.d.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
          localObject1 = this.c;
          RectF localRectF = this.d;
          localObject2 = new BitmapShader((Bitmap)localObject2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
          this.b.reset();
          this.b.setRectToRect((RectF)localObject1, localRectF, Matrix.ScaleToFit.FILL);
          ((BitmapShader)localObject2).setLocalMatrix(this.b);
          this.e.setShader((Shader)localObject2);
          paramCanvas.drawCircle(localRectF.centerX(), localRectF.centerY(), localRectF.width() / 2.0F, this.e);
          paramCanvas.drawCircle(localRectF.centerX(), localRectF.centerY(), localRectF.width() / 2.0F - a / 2.0F, this.f);
        }
      }
      label231:
      localObject1 = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\android\ex\chips\CircularImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */