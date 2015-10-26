import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;

public final class lm
{
  final RectF a = new RectF();
  final Paint b = new Paint();
  final Paint c = new Paint();
  float d = 0.0F;
  float e = 0.0F;
  float f = 0.0F;
  float g = 5.0F;
  float h = 2.5F;
  int[] i;
  int j;
  float k;
  float l;
  float m;
  boolean n;
  Path o;
  float p;
  double q;
  int r;
  int s;
  int t;
  final Paint u = new Paint(1);
  int v;
  int w;
  private final Drawable.Callback x;
  
  public lm(Drawable.Callback paramCallback)
  {
    this.x = paramCallback;
    this.b.setStrokeCap(Paint.Cap.SQUARE);
    this.b.setAntiAlias(true);
    this.b.setStyle(Paint.Style.STROKE);
    this.c.setStyle(Paint.Style.FILL);
    this.c.setAntiAlias(true);
  }
  
  int a()
  {
    return (this.j + 1) % this.i.length;
  }
  
  public final void a(float paramFloat)
  {
    this.d = paramFloat;
    d();
  }
  
  public final void a(int paramInt)
  {
    this.j = paramInt;
    this.w = this.i[this.j];
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.n != paramBoolean)
    {
      this.n = paramBoolean;
      d();
    }
  }
  
  public final void a(int[] paramArrayOfInt)
  {
    this.i = paramArrayOfInt;
    a(0);
  }
  
  public final void b()
  {
    this.k = this.d;
    this.l = this.e;
    this.m = this.f;
  }
  
  public final void b(float paramFloat)
  {
    this.e = paramFloat;
    d();
  }
  
  public final void c()
  {
    this.k = 0.0F;
    this.l = 0.0F;
    this.m = 0.0F;
    a(0.0F);
    b(0.0F);
    c(0.0F);
  }
  
  public final void c(float paramFloat)
  {
    this.f = paramFloat;
    d();
  }
  
  void d()
  {
    this.x.invalidateDrawable(null);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\lm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */