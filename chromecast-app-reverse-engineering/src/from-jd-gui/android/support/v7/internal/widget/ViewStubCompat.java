package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import oq;

public final class ViewStubCompat
  extends View
{
  public LayoutInflater a;
  private int b = 0;
  private int c;
  private WeakReference d;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, oq.cz, paramInt, 0);
    this.c = paramContext.getResourceId(oq.cB, -1);
    this.b = paramContext.getResourceId(oq.cC, 0);
    setId(paramContext.getResourceId(oq.cA, -1));
    paramContext.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public final View a()
  {
    Object localObject = getParent();
    if ((localObject != null) && ((localObject instanceof ViewGroup)))
    {
      if (this.b != 0)
      {
        ViewGroup localViewGroup = (ViewGroup)localObject;
        View localView;
        int i;
        if (this.a != null)
        {
          localObject = this.a;
          localView = ((LayoutInflater)localObject).inflate(this.b, localViewGroup, false);
          if (this.c != -1) {
            localView.setId(this.c);
          }
          i = localViewGroup.indexOfChild(this);
          localViewGroup.removeViewInLayout(this);
          localObject = getLayoutParams();
          if (localObject == null) {
            break label121;
          }
          localViewGroup.addView(localView, i, (ViewGroup.LayoutParams)localObject);
        }
        for (;;)
        {
          this.d = new WeakReference(localView);
          return localView;
          localObject = LayoutInflater.from(getContext());
          break;
          label121:
          localViewGroup.addView(localView, i);
        }
      }
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }
  
  protected final void dispatchDraw(Canvas paramCanvas) {}
  
  public final void draw(Canvas paramCanvas) {}
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public final void setVisibility(int paramInt)
  {
    if (this.d != null)
    {
      View localView = (View)this.d.get();
      if (localView != null) {
        localView.setVisibility(paramInt);
      }
    }
    for (;;)
    {
      return;
      throw new IllegalStateException("setVisibility called on un-referenced view");
      super.setVisibility(paramInt);
      if ((paramInt == 0) || (paramInt == 4)) {
        a();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\widget\ViewStubCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */