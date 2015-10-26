package android.support.v7.internal.view.menu;

import a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import oq;
import qe;
import qs;

public class ListMenuItemView
  extends LinearLayout
  implements qs
{
  public boolean a;
  public boolean b;
  private qe c;
  private ImageView d;
  private RadioButton e;
  private TextView f;
  private CheckBox g;
  private TextView h;
  private Drawable i;
  private int j;
  private Context k;
  private Context l;
  private LayoutInflater m;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.l = paramContext;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, oq.aP, paramInt, 0);
    this.i = paramAttributeSet.getDrawable(oq.aQ);
    this.j = paramAttributeSet.getResourceId(oq.aR, -1);
    this.a = paramAttributeSet.getBoolean(oq.aS, false);
    this.k = paramContext;
    paramAttributeSet.recycle();
  }
  
  private LayoutInflater c()
  {
    if (this.m == null) {
      this.m = LayoutInflater.from(this.l);
    }
    return this.m;
  }
  
  public final qe a()
  {
    return this.c;
  }
  
  public final void a(qe paramqe, int paramInt)
  {
    this.c = paramqe;
    Object localObject1;
    label58:
    Object localObject2;
    label139:
    label163:
    label200:
    label228:
    char c1;
    if (paramqe.isVisible())
    {
      paramInt = 0;
      setVisibility(paramInt);
      localObject1 = paramqe.a(this);
      if (localObject1 == null) {
        break label431;
      }
      this.f.setText((CharSequence)localObject1);
      if (this.f.getVisibility() != 0) {
        this.f.setVisibility(0);
      }
      boolean bool = paramqe.isCheckable();
      if ((bool) || (this.e != null) || (this.g != null))
      {
        if (!this.c.e()) {
          break label455;
        }
        if (this.e == null)
        {
          this.e = ((RadioButton)c().inflate(a.bM, this, false));
          addView(this.e);
        }
        localObject1 = this.e;
        localObject2 = this.g;
        if (!bool) {
          break label510;
        }
        ((CompoundButton)localObject1).setChecked(this.c.isChecked());
        if (!bool) {
          break label504;
        }
        paramInt = 0;
        if (((CompoundButton)localObject1).getVisibility() != paramInt) {
          ((CompoundButton)localObject1).setVisibility(paramInt);
        }
        if ((localObject2 != null) && (((CompoundButton)localObject2).getVisibility() != 8)) {
          ((CompoundButton)localObject2).setVisibility(8);
        }
      }
      bool = paramqe.d();
      paramqe.c();
      if ((!bool) || (!this.c.d())) {
        break label545;
      }
      paramInt = 0;
      if (paramInt == 0)
      {
        localObject2 = this.h;
        c1 = this.c.c();
        if (c1 != 0) {
          break label551;
        }
        localObject1 = "";
        ((TextView)localObject2).setText((CharSequence)localObject1);
      }
      if (this.h.getVisibility() != paramInt) {
        this.h.setVisibility(paramInt);
      }
      localObject1 = paramqe.getIcon();
      localObject2 = this.c.b;
      if (!this.b) {
        break label643;
      }
      paramInt = 1;
      label304:
      if (((paramInt != 0) || (this.a)) && ((this.d != null) || (localObject1 != null) || (this.a)))
      {
        if (this.d == null)
        {
          this.d = ((ImageView)c().inflate(a.bK, this, false));
          addView(this.d, 0);
        }
        if ((localObject1 == null) && (!this.a)) {
          break label654;
        }
        localObject2 = this.d;
        if (paramInt == 0) {
          break label648;
        }
        label391:
        ((ImageView)localObject2).setImageDrawable((Drawable)localObject1);
        if (this.d.getVisibility() != 0) {
          this.d.setVisibility(0);
        }
      }
    }
    for (;;)
    {
      setEnabled(paramqe.isEnabled());
      return;
      paramInt = 8;
      break;
      label431:
      if (this.f.getVisibility() == 8) {
        break label58;
      }
      this.f.setVisibility(8);
      break label58;
      label455:
      if (this.g == null)
      {
        this.g = ((CheckBox)c().inflate(a.bJ, this, false));
        addView(this.g);
      }
      localObject1 = this.g;
      localObject2 = this.e;
      break label139;
      label504:
      paramInt = 8;
      break label163;
      label510:
      if (this.g != null) {
        this.g.setVisibility(8);
      }
      if (this.e == null) {
        break label200;
      }
      this.e.setVisibility(8);
      break label200;
      label545:
      paramInt = 8;
      break label228;
      label551:
      localObject1 = new StringBuilder(null);
      switch (c1)
      {
      default: 
        ((StringBuilder)localObject1).append(c1);
      }
      for (;;)
      {
        localObject1 = ((StringBuilder)localObject1).toString();
        break;
        ((StringBuilder)localObject1).append(null);
        continue;
        ((StringBuilder)localObject1).append(null);
        continue;
        ((StringBuilder)localObject1).append(null);
      }
      label643:
      paramInt = 0;
      break label304;
      label648:
      localObject1 = null;
      break label391;
      label654:
      this.d.setVisibility(8);
    }
  }
  
  public final boolean b()
  {
    return false;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setBackgroundDrawable(this.i);
    this.f = ((TextView)findViewById(a.bx));
    if (this.j != -1) {
      this.f.setTextAppearance(this.k, this.j);
    }
    this.h = ((TextView)findViewById(a.bt));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.d != null) && (this.a))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.d.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0)) {
        localLayoutParams1.width = localLayoutParams.height;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\internal\view\menu\ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */