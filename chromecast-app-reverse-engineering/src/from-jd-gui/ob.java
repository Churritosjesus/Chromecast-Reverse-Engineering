import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Toast;

public final class ob
  extends View
{
  private static final int[] l = { 16842912 };
  private static final int[] m = { 16842911 };
  public final tz a;
  public final oc b;
  public tx c = tx.c;
  public boolean d;
  public boolean e;
  private op f = op.a();
  private Drawable g;
  private boolean h;
  private boolean i;
  private int j;
  private int k;
  
  public ob(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private ob(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, a.cg);
  }
  
  private ob(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(a.a(paramContext), paramAttributeSet, paramInt);
    paramContext = getContext();
    this.a = tz.a(paramContext);
    this.b = new oc(this);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, vp.a, paramInt, 0);
    paramAttributeSet = paramContext.getDrawable(vp.d);
    if (this.g != null)
    {
      this.g.setCallback(null);
      unscheduleDrawable(this.g);
    }
    this.g = paramAttributeSet;
    if (paramAttributeSet != null)
    {
      paramAttributeSet.setCallback(this);
      paramAttributeSet.setState(getDrawableState());
      if (getVisibility() != 0) {
        break label175;
      }
    }
    label175:
    for (boolean bool = true;; bool = false)
    {
      paramAttributeSet.setVisible(bool, false);
      refreshDrawableState();
      this.j = paramContext.getDimensionPixelSize(vp.c, 0);
      this.k = paramContext.getDimensionPixelSize(vp.b, 0);
      paramContext.recycle();
      setClickable(true);
      setLongClickable(true);
      return;
    }
  }
  
  public final void a(op paramop)
  {
    if (paramop == null) {
      throw new IllegalArgumentException("factory must not be null");
    }
    this.f = paramop;
  }
  
  public final boolean a()
  {
    Object localObject3 = null;
    if (!this.d) {}
    Object localObject1;
    for (boolean bool = false;; bool = false)
    {
      return bool;
      localObject1 = getContext();
      if ((localObject1 instanceof ContextWrapper)) {
        if (!(localObject1 instanceof Activity)) {}
      }
      for (localObject2 = (Activity)localObject1;; localObject2 = null)
      {
        localObject1 = localObject3;
        if ((localObject2 instanceof m)) {
          localObject1 = ((m)localObject2).b;
        }
        if (localObject1 != null) {
          break label86;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        localObject1 = ((ContextWrapper)localObject1).getBaseContext();
        break;
      }
      label86:
      localObject2 = tz.d();
      if ((!((uh)localObject2).b()) && (((uh)localObject2).a(this.c))) {
        break label156;
      }
      if (((r)localObject1).a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
        break;
      }
      Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
    }
    Object localObject2 = op.b();
    ((oh)localObject2).a(this.c);
    ((oh)localObject2).a((r)localObject1, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
    for (;;)
    {
      bool = true;
      break;
      label156:
      if (((r)localObject1).a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null)
      {
        Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
        bool = false;
        break;
      }
      this.f.c().a((r)localObject1, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
    }
  }
  
  public void b()
  {
    int n = 0;
    boolean bool1;
    if (this.d)
    {
      uh localuh = tz.d();
      if ((localuh.b()) || (!localuh.a(this.c))) {
        break label100;
      }
      bool1 = true;
      if ((!bool1) || (!localuh.f)) {
        break label105;
      }
    }
    label100:
    label105:
    for (boolean bool2 = true;; bool2 = false)
    {
      if (this.h != bool1)
      {
        this.h = bool1;
        n = 1;
      }
      if (this.i != bool2)
      {
        this.i = bool2;
        n = 1;
      }
      if (n != 0) {
        refreshDrawableState();
      }
      setEnabled(tz.a(this.c, 1));
      return;
      bool1 = false;
      break;
    }
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.g != null)
    {
      int[] arrayOfInt = getDrawableState();
      this.g.setState(arrayOfInt);
      invalidate();
    }
  }
  
  public final void jumpDrawablesToCurrentState()
  {
    if (getBackground() != null) {
      bo.a(getBackground());
    }
    if (this.g != null) {
      bo.a(this.g);
    }
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.d = true;
    if (!this.c.c()) {
      this.a.a(this.c, this.b, 0);
    }
    b();
  }
  
  protected final int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (this.i) {
      mergeDrawableStates(arrayOfInt, m);
    }
    for (;;)
    {
      return arrayOfInt;
      if (this.h) {
        mergeDrawableStates(arrayOfInt, l);
      }
    }
  }
  
  public final void onDetachedFromWindow()
  {
    this.d = false;
    if (!this.c.c()) {
      this.a.a(this.b);
    }
    super.onDetachedFromWindow();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.g != null)
    {
      int i6 = getPaddingLeft();
      int i7 = getWidth();
      int i5 = getPaddingRight();
      int i2 = getPaddingTop();
      int i3 = getHeight();
      int i4 = getPaddingBottom();
      int i1 = this.g.getIntrinsicWidth();
      int n = this.g.getIntrinsicHeight();
      i5 = i6 + (i7 - i5 - i6 - i1) / 2;
      i2 = (i3 - i4 - i2 - n) / 2 + i2;
      this.g.setBounds(i5, i2, i5 + i1, i2 + n);
      this.g.draw(paramCanvas);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i2 = 0;
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.getSize(paramInt2);
    int i3 = View.MeasureSpec.getMode(paramInt1);
    paramInt2 = View.MeasureSpec.getMode(paramInt2);
    int i4 = this.j;
    if (this.g != null)
    {
      paramInt1 = this.g.getIntrinsicWidth();
      i4 = Math.max(i4, paramInt1);
      int i5 = this.k;
      paramInt1 = i2;
      if (this.g != null) {
        paramInt1 = this.g.getIntrinsicHeight();
      }
      i2 = Math.max(i5, paramInt1);
      switch (i3)
      {
      default: 
        paramInt1 = i4 + getPaddingLeft() + getPaddingRight();
        switch (paramInt2)
        {
        default: 
          label129:
          paramInt2 = getPaddingTop() + i2 + getPaddingBottom();
        }
        break;
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      return;
      paramInt1 = 0;
      break;
      paramInt1 = i1;
      break label129;
      paramInt1 = Math.min(i1, i4 + getPaddingLeft() + getPaddingRight());
      break label129;
      paramInt2 = n;
      continue;
      paramInt2 = Math.min(n, getPaddingTop() + i2 + getPaddingBottom());
    }
  }
  
  public final boolean performClick()
  {
    boolean bool1 = false;
    boolean bool2 = super.performClick();
    if (!bool2) {
      playSoundEffect(0);
    }
    if ((a()) || (bool2)) {
      bool1 = true;
    }
    return bool1;
  }
  
  public final boolean performLongClick()
  {
    boolean bool = true;
    if (super.performLongClick()) {}
    for (;;)
    {
      return bool;
      if (!this.e)
      {
        bool = false;
      }
      else
      {
        localObject = getContentDescription();
        if (!TextUtils.isEmpty((CharSequence)localObject)) {
          break;
        }
        bool = false;
      }
    }
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int i2 = getWidth();
    int i3 = getHeight();
    int n = arrayOfInt[1];
    int i4 = i3 / 2;
    int i1 = localContext.getResources().getDisplayMetrics().widthPixels;
    Object localObject = Toast.makeText(localContext, (CharSequence)localObject, 0);
    if (n + i4 < localRect.height()) {
      ((Toast)localObject).setGravity(8388661, i1 - arrayOfInt[0] - i2 / 2, i3);
    }
    for (;;)
    {
      ((Toast)localObject).show();
      performHapticFeedback(0);
      break;
      ((Toast)localObject).setGravity(81, 0, i3);
    }
  }
  
  public final void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    Drawable localDrawable;
    if (this.g != null)
    {
      localDrawable = this.g;
      if (getVisibility() != 0) {
        break label34;
      }
    }
    label34:
    for (boolean bool = true;; bool = false)
    {
      localDrawable.setVisible(bool, false);
      return;
    }
  }
  
  protected final boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.g)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */