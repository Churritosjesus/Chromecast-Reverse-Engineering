import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public final class nd
  extends ny
  implements DialogInterface
{
  private mx a = new mx(getContext(), this, getWindow());
  
  public nd(Context paramContext, int paramInt)
  {
    super(paramContext, a(paramContext, paramInt));
  }
  
  static int a(Context paramContext, int paramInt)
  {
    if (paramInt >= 16777216) {}
    for (;;)
    {
      return paramInt;
      TypedValue localTypedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(a.v, localTypedValue, true);
      paramInt = localTypedValue.resourceId;
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    int k = 0;
    super.onCreate(paramBundle);
    mx localmx = this.a;
    localmx.b.a().b(1);
    int i = localmx.G;
    i = localmx.F;
    localmx.b.setContentView(i);
    paramBundle = (ViewGroup)localmx.c.findViewById(a.ba);
    localmx.w = ((ScrollView)localmx.c.findViewById(a.bk));
    localmx.w.setFocusable(false);
    localmx.B = ((TextView)localmx.c.findViewById(16908299));
    label175:
    label221:
    label267:
    Object localObject1;
    int j;
    label303:
    label321:
    label329:
    Object localObject2;
    if (localmx.B != null)
    {
      if (localmx.e != null) {
        localmx.B.setText(localmx.e);
      }
    }
    else
    {
      localmx.n = ((Button)localmx.c.findViewById(16908313));
      localmx.n.setOnClickListener(localmx.L);
      if (!TextUtils.isEmpty(localmx.o)) {
        break label730;
      }
      localmx.n.setVisibility(8);
      i = 0;
      localmx.q = ((Button)localmx.c.findViewById(16908314));
      localmx.q.setOnClickListener(localmx.L);
      if (!TextUtils.isEmpty(localmx.r)) {
        break label755;
      }
      localmx.q.setVisibility(8);
      localmx.t = ((Button)localmx.c.findViewById(16908315));
      localmx.t.setOnClickListener(localmx.L);
      if (!TextUtils.isEmpty(localmx.u)) {
        break label783;
      }
      localmx.t.setVisibility(8);
      paramBundle = localmx.a;
      localObject1 = new TypedValue();
      paramBundle.getTheme().resolveAttribute(a.t, (TypedValue)localObject1, true);
      if (((TypedValue)localObject1).data == 0) {
        break label811;
      }
      j = 1;
      if (j != 0)
      {
        if (i != 1) {
          break label817;
        }
        mx.a(localmx.n);
      }
      if (i == 0) {
        break label849;
      }
      i = 1;
      localObject2 = (ViewGroup)localmx.c.findViewById(a.bz);
      localObject1 = th.a(localmx.a, null, oq.H, a.u, 0);
      if (localmx.C == null) {
        break label855;
      }
      paramBundle = new ViewGroup.LayoutParams(-1, -2);
      ((ViewGroup)localObject2).addView(localmx.C, 0, paramBundle);
      localmx.c.findViewById(a.by).setVisibility(8);
      label404:
      paramBundle = localmx.c.findViewById(a.aZ);
      if (i == 0)
      {
        paramBundle.setVisibility(8);
        paramBundle = localmx.c.findViewById(a.bw);
        if (paramBundle != null) {
          paramBundle.setVisibility(0);
        }
      }
      localObject2 = (FrameLayout)localmx.c.findViewById(a.bc);
      if (localmx.g == null) {
        break label1047;
      }
      paramBundle = localmx.g;
      label473:
      i = k;
      if (paramBundle != null) {
        i = 1;
      }
      if ((i == 0) || (!mx.a(paramBundle))) {
        localmx.c.setFlags(131072, 131072);
      }
      if (i == 0) {
        break label1080;
      }
      FrameLayout localFrameLayout = (FrameLayout)localmx.c.findViewById(a.bb);
      localFrameLayout.addView(paramBundle, new ViewGroup.LayoutParams(-1, -1));
      if (localmx.m) {
        localFrameLayout.setPadding(localmx.i, localmx.j, localmx.k, localmx.l);
      }
      if (localmx.f != null) {
        ((LinearLayout.LayoutParams)((FrameLayout)localObject2).getLayoutParams()).weight = 0.0F;
      }
    }
    for (;;)
    {
      paramBundle = localmx.f;
      if ((paramBundle != null) && (localmx.D != null))
      {
        paramBundle.setAdapter(localmx.D);
        i = localmx.E;
        if (i >= 0)
        {
          paramBundle.setItemChecked(i, true);
          paramBundle.setSelection(i);
        }
      }
      ((th)localObject1).a.recycle();
      return;
      localmx.B.setVisibility(8);
      localmx.w.removeView(localmx.B);
      if (localmx.f != null)
      {
        paramBundle = (ViewGroup)localmx.w.getParent();
        i = paramBundle.indexOfChild(localmx.w);
        paramBundle.removeViewAt(i);
        paramBundle.addView(localmx.f, i, new ViewGroup.LayoutParams(-1, -1));
        break;
      }
      paramBundle.setVisibility(8);
      break;
      label730:
      localmx.n.setText(localmx.o);
      localmx.n.setVisibility(0);
      i = 1;
      break label175;
      label755:
      localmx.q.setText(localmx.r);
      localmx.q.setVisibility(0);
      i |= 0x2;
      break label221;
      label783:
      localmx.t.setText(localmx.u);
      localmx.t.setVisibility(0);
      i |= 0x4;
      break label267;
      label811:
      j = 0;
      break label303;
      label817:
      if (i == 2)
      {
        mx.a(localmx.q);
        break label321;
      }
      if (i != 4) {
        break label321;
      }
      mx.a(localmx.t);
      break label321;
      label849:
      i = 0;
      break label329;
      label855:
      localmx.z = ((ImageView)localmx.c.findViewById(16908294));
      if (!TextUtils.isEmpty(localmx.d)) {
        j = 1;
      }
      for (;;)
      {
        if (j != 0)
        {
          localmx.A = ((TextView)localmx.c.findViewById(a.aY));
          localmx.A.setText(localmx.d);
          if (localmx.x != 0)
          {
            localmx.z.setImageResource(localmx.x);
            break;
            j = 0;
            continue;
          }
          if (localmx.y != null)
          {
            localmx.z.setImageDrawable(localmx.y);
            break;
          }
          localmx.A.setPadding(localmx.z.getPaddingLeft(), localmx.z.getPaddingTop(), localmx.z.getPaddingRight(), localmx.z.getPaddingBottom());
          localmx.z.setVisibility(8);
          break;
        }
      }
      localmx.c.findViewById(a.by).setVisibility(8);
      localmx.z.setVisibility(8);
      ((ViewGroup)localObject2).setVisibility(8);
      break label404;
      label1047:
      if (localmx.h != 0)
      {
        paramBundle = LayoutInflater.from(localmx.a).inflate(localmx.h, (ViewGroup)localObject2, false);
        break label473;
      }
      paramBundle = null;
      break label473;
      label1080:
      ((FrameLayout)localObject2).setVisibility(8);
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    mx localmx = this.a;
    int i;
    if ((localmx.w != null) && (localmx.w.executeKeyEvent(paramKeyEvent)))
    {
      i = 1;
      if (i == 0) {
        break label43;
      }
    }
    for (;;)
    {
      return bool;
      i = 0;
      break;
      label43:
      bool = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    mx localmx = this.a;
    int i;
    if ((localmx.w != null) && (localmx.w.executeKeyEvent(paramKeyEvent)))
    {
      i = 1;
      if (i == 0) {
        break label43;
      }
    }
    for (;;)
    {
      return bool;
      i = 0;
      break;
      label43:
      bool = super.onKeyUp(paramInt, paramKeyEvent);
    }
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    this.a.a(paramCharSequence);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */