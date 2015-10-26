import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

final class sq
  extends xu
  implements View.OnLongClickListener
{
  ml a;
  private final int[] b = { 16842964 };
  private TextView c;
  private ImageView d;
  private View e;
  
  public sq(sm paramsm, Context paramContext, ml paramml, boolean paramBoolean)
  {
    super(paramContext, null, a.j);
    this.a = paramml;
    paramsm = th.a(paramContext, null, this.b, a.j, 0);
    if (paramsm.d(0)) {
      setBackgroundDrawable(paramsm.a(0));
    }
    paramsm.a.recycle();
    if (paramBoolean) {
      b(8388627);
    }
    a();
  }
  
  public final void a()
  {
    Object localObject1 = this.a;
    Object localObject2 = ((ml)localObject1).c();
    if (localObject2 != null)
    {
      localObject1 = ((View)localObject2).getParent();
      if (localObject1 != this)
      {
        if (localObject1 != null) {
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
        addView((View)localObject2);
      }
      this.e = ((View)localObject2);
      if (this.c != null) {
        this.c.setVisibility(8);
      }
      if (this.d != null)
      {
        this.d.setVisibility(8);
        this.d.setImageDrawable(null);
      }
    }
    for (;;)
    {
      return;
      if (this.e != null)
      {
        removeView(this.e);
        this.e = null;
      }
      Object localObject4 = ((ml)localObject1).a();
      localObject2 = ((ml)localObject1).b();
      label197:
      int i;
      if (localObject4 != null)
      {
        Object localObject3;
        if (this.d == null)
        {
          ImageView localImageView = new ImageView(getContext());
          localObject3 = new xv(-2, -2);
          ((xv)localObject3).h = 16;
          localImageView.setLayoutParams((ViewGroup.LayoutParams)localObject3);
          addView(localImageView, 0);
          this.d = localImageView;
        }
        this.d.setImageDrawable((Drawable)localObject4);
        this.d.setVisibility(0);
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          break label362;
        }
        i = 1;
        label207:
        if (i == 0) {
          break label368;
        }
        if (this.c == null)
        {
          localObject3 = new wt(getContext(), null, a.k);
          ((TextView)localObject3).setEllipsize(TextUtils.TruncateAt.END);
          localObject4 = new xv(-2, -2);
          ((xv)localObject4).h = 16;
          ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          addView((View)localObject3);
          this.c = ((TextView)localObject3);
        }
        this.c.setText((CharSequence)localObject2);
        this.c.setVisibility(0);
      }
      for (;;)
      {
        if (this.d != null) {
          this.d.setContentDescription(((ml)localObject1).d());
        }
        if ((i != 0) || (TextUtils.isEmpty(((ml)localObject1).d()))) {
          break label395;
        }
        setOnLongClickListener(this);
        break;
        if (this.d == null) {
          break label197;
        }
        this.d.setVisibility(8);
        this.d.setImageDrawable(null);
        break label197;
        label362:
        i = 0;
        break label207;
        label368:
        if (this.c != null)
        {
          this.c.setVisibility(8);
          this.c.setText(null);
        }
      }
      label395:
      setOnLongClickListener(null);
      setLongClickable(false);
    }
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ml.class.getName());
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (Build.VERSION.SDK_INT >= 14) {
      paramAccessibilityNodeInfo.setClassName(ml.class.getName());
    }
  }
  
  public final boolean onLongClick(View paramView)
  {
    paramView = new int[2];
    getLocationOnScreen(paramView);
    Object localObject = getContext();
    int k = getWidth();
    int j = getHeight();
    int i = ((Context)localObject).getResources().getDisplayMetrics().widthPixels;
    localObject = Toast.makeText((Context)localObject, this.a.d(), 0);
    ((Toast)localObject).setGravity(49, paramView[0] + k / 2 - i / 2, j);
    ((Toast)localObject).show();
    return true;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.f.c > 0) && (getMeasuredWidth() > this.f.c)) {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f.c, 1073741824), paramInt2);
    }
  }
  
  public final void setSelected(boolean paramBoolean)
  {
    if (isSelected() != paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      super.setSelected(paramBoolean);
      if ((i != 0) && (paramBoolean)) {
        sendAccessibilityEvent(4);
      }
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */