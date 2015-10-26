package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout
  extends FrameLayout
{
  public TypedValue a;
  public TypedValue b;
  public TypedValue c;
  public TypedValue d;
  public TypedValue e;
  public TypedValue f;
  public final Rect g = new Rect();
  
  public ContentFrameLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(Rect paramRect)
  {
    fitSystemWindows(paramRect);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n = 0;
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    int j;
    int i1;
    int i2;
    TypedValue localTypedValue;
    label60:
    int i;
    if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
    {
      j = 1;
      i1 = View.MeasureSpec.getMode(paramInt1);
      i2 = View.MeasureSpec.getMode(paramInt2);
      if (i1 != Integer.MIN_VALUE) {
        break label482;
      }
      if (j == 0) {
        break label348;
      }
      localTypedValue = this.d;
      if ((localTypedValue == null) || (localTypedValue.type == 0)) {
        break label482;
      }
      if (localTypedValue.type != 5) {
        break label356;
      }
      i = (int)localTypedValue.getDimension(localDisplayMetrics);
    }
    for (;;)
    {
      label88:
      int m;
      int k;
      if (i > 0)
      {
        m = View.MeasureSpec.makeMeasureSpec(Math.min(i - (this.g.left + this.g.right), View.MeasureSpec.getSize(paramInt1)), 1073741824);
        k = 1;
      }
      for (;;)
      {
        i = paramInt2;
        if (i2 == Integer.MIN_VALUE)
        {
          if (j == 0) {
            break label387;
          }
          localTypedValue = this.e;
          label148:
          i = paramInt2;
          if (localTypedValue != null)
          {
            i = paramInt2;
            if (localTypedValue.type != 0)
            {
              if (localTypedValue.type != 5) {
                break label395;
              }
              paramInt1 = (int)localTypedValue.getDimension(localDisplayMetrics);
            }
          }
        }
        for (;;)
        {
          label181:
          i = paramInt2;
          if (paramInt1 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(paramInt1 - (this.g.top + this.g.bottom), View.MeasureSpec.getSize(paramInt2)), 1073741824);
          }
          super.onMeasure(m, i);
          i2 = getMeasuredWidth();
          m = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
          if ((k == 0) && (i1 == Integer.MIN_VALUE)) {
            if (j != 0)
            {
              localTypedValue = this.b;
              label264:
              if ((localTypedValue == null) || (localTypedValue.type == 0)) {
                break label463;
              }
              if (localTypedValue.type != 5) {
                break label433;
              }
              paramInt1 = (int)localTypedValue.getDimension(localDisplayMetrics);
            }
          }
          for (;;)
          {
            label291:
            paramInt2 = paramInt1;
            if (paramInt1 > 0) {
              paramInt2 = paramInt1 - (this.g.left + this.g.right);
            }
            if (i2 < paramInt2) {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
            }
            for (paramInt1 = 1;; paramInt1 = n)
            {
              if (paramInt1 != 0) {
                super.onMeasure(paramInt2, i);
              }
              return;
              j = 0;
              break;
              label348:
              localTypedValue = this.c;
              break label60;
              label356:
              if (localTypedValue.type != 6) {
                break label491;
              }
              i = (int)localTypedValue.getFraction(localDisplayMetrics.widthPixels, localDisplayMetrics.widthPixels);
              break label88;
              label387:
              localTypedValue = this.f;
              break label148;
              label395:
              if (localTypedValue.type != 6) {
                break label477;
              }
              paramInt1 = (int)localTypedValue.getFraction(localDisplayMetrics.heightPixels, localDisplayMetrics.heightPixels);
              break label181;
              localTypedValue = this.a;
              break label264;
              label433:
              if (localTypedValue.type != 6) {
                break label472;
              }
              paramInt1 = (int)localTypedValue.getFraction(localDisplayMetrics.widthPixels, localDisplayMetrics.widthPixels);
              break label291;
              label463:
              paramInt2 = m;
            }
            label472:
            paramInt1 = 0;
          }
          label477:
          paramInt1 = 0;
        }
        label482:
        k = 0;
        m = paramInt1;
      }
      label491:
      i = 0;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\widget\ContentFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */