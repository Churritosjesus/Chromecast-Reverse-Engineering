import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import java.lang.reflect.Field;

public class si
  extends ListView
{
  private Rect a = new Rect();
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private Field f;
  private sj g;
  
  public si(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, null, paramInt);
    try
    {
      this.f = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.f.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  private void a(int paramInt, View paramView)
  {
    Rect localRect = this.a;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    localRect.left -= this.b;
    localRect.top -= this.c;
    localRect.right += this.d;
    localRect.bottom += this.e;
    for (;;)
    {
      try
      {
        bool = this.f.getBoolean(this);
        if (paramView.isEnabled() != bool)
        {
          paramView = this.f;
          if (bool) {
            continue;
          }
          bool = true;
          paramView.set(this, Boolean.valueOf(bool));
          if (paramInt != -1) {
            refreshDrawableState();
          }
        }
        return;
      }
      catch (IllegalAccessException paramView)
      {
        boolean bool;
        paramView.printStackTrace();
        continue;
      }
      bool = false;
    }
  }
  
  public final void a(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    Drawable localDrawable = getSelector();
    int i;
    float f2;
    float f1;
    if ((localDrawable != null) && (paramInt != -1))
    {
      i = 1;
      if (i != 0) {
        localDrawable.setVisible(false, false);
      }
      a(paramInt, paramView);
      if (i != 0)
      {
        paramView = this.a;
        f2 = paramView.exactCenterX();
        f1 = paramView.exactCenterY();
        if (getVisibility() != 0) {
          break label116;
        }
      }
    }
    for (;;)
    {
      localDrawable.setVisible(bool, false);
      bo.a(localDrawable, f2, f1);
      paramView = getSelector();
      if ((paramView != null) && (paramInt != -1)) {
        bo.a(paramView, paramFloat1, paramFloat2);
      }
      return;
      i = 0;
      break;
      label116:
      bool = false;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.g != null) {
      this.g.a = paramBoolean;
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    if (!this.a.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(this.a);
        localDrawable.draw(paramCanvas);
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public void drawableStateChanged()
  {
    int i = 1;
    super.drawableStateChanged();
    a(true);
    Drawable localDrawable = getSelector();
    if (localDrawable != null) {
      if ((!a()) || (!isPressed())) {
        break label48;
      }
    }
    for (;;)
    {
      if (i != 0) {
        localDrawable.setState(getDrawableState());
      }
      return;
      label48:
      i = 0;
    }
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null) {}
    for (Object localObject = new sj(paramDrawable);; localObject = null)
    {
      this.g = ((sj)localObject);
      super.setSelector(this.g);
      localObject = new Rect();
      if (paramDrawable != null) {
        paramDrawable.getPadding((Rect)localObject);
      }
      this.b = ((Rect)localObject).left;
      this.c = ((Rect)localObject).top;
      this.d = ((Rect)localObject).right;
      this.e = ((Rect)localObject).bottom;
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\si.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */