import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public final class wl
  extends Button
{
  private static final int[] a = { 16842964 };
  private te b;
  private tf c;
  
  public wl(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.x);
  }
  
  private wl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (tf.a)
    {
      th localth = th.a(getContext(), paramAttributeSet, a, paramInt, 0);
      if (localth.d(0))
      {
        localObject = localth.a().a(localth.e(0, -1));
        if (localObject != null) {
          a((ColorStateList)localObject);
        }
      }
      this.c = localth.a();
      localth.a.recycle();
    }
    Object localObject = paramContext.obtainStyledAttributes(paramAttributeSet, oq.O, paramInt, 0);
    int i = ((TypedArray)localObject).getResourceId(oq.P, -1);
    ((TypedArray)localObject).recycle();
    if (i != -1)
    {
      localObject = paramContext.obtainStyledAttributes(i, oq.bH);
      if (((TypedArray)localObject).hasValue(oq.bM)) {
        setAllCaps(((TypedArray)localObject).getBoolean(oq.bM, false));
      }
      ((TypedArray)localObject).recycle();
    }
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, oq.O, paramInt, 0);
    if (paramAttributeSet.hasValue(oq.Q)) {
      setAllCaps(paramAttributeSet.getBoolean(oq.Q, false));
    }
    paramAttributeSet.recycle();
    paramAttributeSet = getTextColors();
    if ((paramAttributeSet != null) && (!paramAttributeSet.isStateful())) {
      if (Build.VERSION.SDK_INT >= 21) {
        break label237;
      }
    }
    label237:
    for (paramInt = tb.c(paramContext, 16842808);; paramInt = tb.a(paramContext, 16842808))
    {
      setTextColor(tb.a(paramAttributeSet.getDefaultColor(), paramInt));
      return;
    }
  }
  
  private void a()
  {
    if ((getBackground() != null) && (this.b != null)) {
      tf.a(this, this.b);
    }
  }
  
  private void a(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.b == null) {
        this.b = new te();
      }
      this.b.a = paramColorStateList;
      this.b.b = true;
    }
    for (;;)
    {
      a();
      return;
      this.b = null;
    }
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    a();
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(Button.class.getName());
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  public final void setAllCaps(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (pg localpg = new pg(getContext());; localpg = null)
    {
      setTransformationMethod(localpg);
      return;
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    a(null);
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.c != null) {}
    for (ColorStateList localColorStateList = this.c.a(paramInt);; localColorStateList = null)
    {
      a(localColorStateList);
      return;
    }
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramInt, oq.bH);
    if (paramContext.hasValue(oq.bM)) {
      setAllCaps(paramContext.getBoolean(oq.bM, false));
    }
    paramContext.recycle();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\wl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */