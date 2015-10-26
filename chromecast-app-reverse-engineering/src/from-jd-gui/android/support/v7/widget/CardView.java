package android.support.v7.widget;

import a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import or;
import wu;
import wv;
import ww;
import wy;
import wz;

public class CardView
  extends FrameLayout
  implements wv
{
  private static final wy a;
  private boolean b;
  private boolean c;
  private final Rect d = new Rect();
  private final Rect e = new Rect();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {
      a = new wu();
    }
    for (;;)
    {
      a.a();
      return;
      if (Build.VERSION.SDK_INT >= 17) {
        a = new wz();
      } else {
        a = new ww();
      }
    }
  }
  
  public CardView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, or.a, paramInt, a.ce);
    paramInt = paramAttributeSet.getColor(or.b, 0);
    float f4 = paramAttributeSet.getDimension(or.c, 0.0F);
    float f2 = paramAttributeSet.getDimension(or.d, 0.0F);
    float f3 = paramAttributeSet.getDimension(or.e, 0.0F);
    this.b = paramAttributeSet.getBoolean(or.g, false);
    this.c = paramAttributeSet.getBoolean(or.f, true);
    int i = paramAttributeSet.getDimensionPixelSize(or.h, 0);
    this.d.left = paramAttributeSet.getDimensionPixelSize(or.j, i);
    this.d.top = paramAttributeSet.getDimensionPixelSize(or.l, i);
    this.d.right = paramAttributeSet.getDimensionPixelSize(or.k, i);
    this.d.bottom = paramAttributeSet.getDimensionPixelSize(or.i, i);
    float f1 = f3;
    if (f2 > f3) {
      f1 = f2;
    }
    paramAttributeSet.recycle();
    a.a(this, paramContext, paramInt, f4, f2, f1);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e.set(paramInt1, paramInt2, paramInt3, paramInt4);
    super.setPadding(this.d.left + paramInt1, this.d.top + paramInt2, this.d.right + paramInt3, this.d.bottom + paramInt4);
  }
  
  public final boolean a()
  {
    return this.b;
  }
  
  public final boolean b()
  {
    return this.c;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i;
    if (!(a instanceof wu))
    {
      i = View.MeasureSpec.getMode(paramInt1);
      switch (i)
      {
      default: 
        i = View.MeasureSpec.getMode(paramInt2);
        switch (i)
        {
        default: 
          label72:
          super.onMeasure(paramInt1, paramInt2);
        }
        break;
      }
    }
    for (;;)
    {
      return;
      paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(a.a(this)), View.MeasureSpec.getSize(paramInt1)), i);
      break;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(a.b(this)), View.MeasureSpec.getSize(paramInt2)), i);
      break label72;
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\widget\CardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */