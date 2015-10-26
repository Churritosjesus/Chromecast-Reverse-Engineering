import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

final class wx
  implements zw
{
  wx(ww paramww) {}
  
  public final void a(Canvas paramCanvas, RectF paramRectF, float paramFloat, Paint paramPaint)
  {
    float f3 = 2.0F * paramFloat;
    float f2 = paramRectF.width() - f3 - 1.0F;
    float f4 = paramRectF.height();
    float f1 = paramFloat;
    if (paramFloat >= 1.0F)
    {
      f1 = paramFloat + 0.5F;
      this.a.a.set(-f1, -f1, f1, f1);
      int i = paramCanvas.save();
      paramCanvas.translate(paramRectF.left + f1, paramRectF.top + f1);
      paramCanvas.drawArc(this.a.a, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f2, 0.0F);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawArc(this.a.a, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f4 - f3 - 1.0F, 0.0F);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawArc(this.a.a, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f2, 0.0F);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawArc(this.a.a, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.restoreToCount(i);
      paramCanvas.drawRect(paramRectF.left + f1 - 1.0F, paramRectF.top, paramRectF.right - f1 + 1.0F, paramRectF.top + f1, paramPaint);
      paramCanvas.drawRect(paramRectF.left + f1 - 1.0F, paramRectF.bottom - f1 + 1.0F, paramRectF.right - f1 + 1.0F, paramRectF.bottom, paramPaint);
    }
    paramFloat = paramRectF.left;
    f2 = paramRectF.top;
    paramCanvas.drawRect(paramFloat, Math.max(0.0F, f1 - 1.0F) + f2, paramRectF.right, paramRectF.bottom - f1 + 1.0F, paramPaint);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */