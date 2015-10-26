import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

public class adc
  extends ReplacementSpan
{
  private static Paint c = new Paint();
  public Drawable a;
  public float b;
  
  public adc(Drawable paramDrawable)
  {
    this.a = paramDrawable;
  }
  
  public void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    paramCanvas.save();
    paramCanvas.translate(paramFloat, (paramInt5 - this.a.getBounds().bottom + paramInt3) / 2);
    this.a.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    c.set(paramPaint);
    if (paramFontMetricsInt != null)
    {
      c.getFontMetricsInt(paramFontMetricsInt);
      paramPaint = i();
      int i = paramFontMetricsInt.descent - paramFontMetricsInt.ascent;
      int j = (int)this.b / 2;
      paramFontMetricsInt.ascent = (Math.min(paramFontMetricsInt.top, paramFontMetricsInt.top + (i - paramPaint.bottom) / 2) - j);
      paramInt2 = paramFontMetricsInt.bottom;
      paramInt1 = paramFontMetricsInt.bottom;
      paramFontMetricsInt.descent = (Math.max(paramInt2, (paramPaint.bottom - i) / 2 + paramInt1) + j);
      paramFontMetricsInt.top = paramFontMetricsInt.ascent;
      paramFontMetricsInt.bottom = paramFontMetricsInt.descent;
    }
    return i().right;
  }
  
  protected Rect i()
  {
    return this.a.getBounds();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\adc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */