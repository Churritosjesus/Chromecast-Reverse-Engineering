import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;

public final class boh
  extends LinearLayout
{
  public bof a;
  private final int b;
  private final Paint c;
  private final int d;
  private final Paint e;
  private final int f;
  private final Paint g;
  private final float h;
  private int i;
  private float j;
  private final boi k;
  
  public boh(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private boh(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, null);
    setWillNotDraw(false);
    float f1 = getResources().getDisplayMetrics().density;
    int m = a.dl;
    this.f = a(m, (byte)38);
    this.k = new boi();
    this.k.a = new int[] { -13388315 };
    this.k.b = new int[] { a(m, 32) };
    this.b = ((int)(0.0F * f1));
    this.c = new Paint();
    this.c.setColor(this.f);
    this.d = ((int)(2.0F * f1));
    this.e = new Paint();
    this.h = 0.5F;
    this.g = new Paint();
    this.g.setStrokeWidth((int)(f1 * 1.0F));
  }
  
  private static int a(int paramInt, byte paramByte)
  {
    return Color.argb(paramByte, Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt));
  }
  
  final void a(int paramInt, float paramFloat)
  {
    this.i = paramInt;
    this.j = paramFloat;
    invalidate();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    int i5 = getHeight();
    int i3 = getChildCount();
    int i4 = (int)(Math.min(Math.max(0.0F, this.h), 1.0F) * i5);
    Object localObject;
    View localView;
    int i2;
    int i1;
    int n;
    int m;
    if (this.a != null)
    {
      localObject = this.a;
      if (i3 > 0)
      {
        localView = getChildAt(this.i);
        i2 = localView.getLeft();
        i1 = localView.getRight();
        n = ((bof)localObject).a(this.i);
        if ((this.j <= 0.0F) || (this.i >= getChildCount() - 1)) {
          break label457;
        }
        int i6 = ((bof)localObject).a(this.i + 1);
        m = n;
        if (n != i6)
        {
          f2 = this.j;
          f1 = 1.0F - f2;
          f3 = Color.red(i6);
          float f7 = Color.red(n);
          float f6 = Color.green(i6);
          float f5 = Color.green(n);
          float f8 = Color.blue(i6);
          float f4 = Color.blue(n);
          m = Color.rgb((int)(f3 * f2 + f7 * f1), (int)(f6 * f2 + f5 * f1), (int)(f4 * f1 + f8 * f2));
        }
        localView = getChildAt(this.i + 1);
        float f2 = this.j;
        float f3 = localView.getLeft();
        float f1 = this.j;
        i2 = (int)(i2 * (1.0F - f1) + f2 * f3);
        f1 = this.j;
        f2 = localView.getRight();
        f3 = this.j;
        n = (int)(i1 * (1.0F - f3) + f2 * f1);
        i1 = m;
      }
    }
    for (;;)
    {
      this.e.setColor(i1);
      paramCanvas.drawRect(i2, i5 - this.d, n, i5, this.e);
      paramCanvas.drawRect(0.0F, i5 - this.b, getWidth(), i5, this.c);
      n = (i5 - i4) / 2;
      m = 0;
      for (;;)
      {
        if (m < i3 - 1)
        {
          localView = getChildAt(m);
          this.g.setColor(((bof)localObject).b(m));
          paramCanvas.drawLine(localView.getRight(), n, localView.getRight(), n + i4, this.g);
          m++;
          continue;
          localObject = this.k;
          break;
        }
      }
      return;
      label457:
      m = i1;
      i1 = n;
      n = m;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\boh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */