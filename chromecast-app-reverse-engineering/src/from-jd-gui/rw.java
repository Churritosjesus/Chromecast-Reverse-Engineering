import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.support.v7.internal.widget.ActivityChooserView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;
import java.util.List;

public final class rw
  implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  public rw(ActivityChooserView paramActivityChooserView) {}
  
  public final void onClick(View paramView)
  {
    if (paramView == ActivityChooserView.e(this.a))
    {
      this.a.b();
      paramView = ActivityChooserView.a(this.a).a.b();
      int i = ActivityChooserView.a(this.a).a.a(paramView);
      paramView = ActivityChooserView.a(this.a).a.b(i);
      if (paramView != null)
      {
        paramView.addFlags(524288);
        this.a.getContext().startActivity(paramView);
      }
    }
    for (;;)
    {
      return;
      if (paramView != ActivityChooserView.f(this.a)) {
        break;
      }
      ActivityChooserView.a(this.a, false);
      ActivityChooserView.a(this.a, ActivityChooserView.g(this.a));
    }
    throw new IllegalArgumentException();
  }
  
  public final void onDismiss()
  {
    if (ActivityChooserView.h(this.a) != null) {
      ActivityChooserView.h(this.a).onDismiss();
    }
    if (this.a.c != null) {
      this.a.c.a(false);
    }
  }
  
  public final void onItemClick(AdapterView arg1, View paramView, int paramInt, long paramLong)
  {
    switch (((rv)???.getAdapter()).getItemViewType(paramInt))
    {
    default: 
      throw new IllegalArgumentException();
    case 1: 
      ActivityChooserView.a(this.a, Integer.MAX_VALUE);
    }
    do
    {
      return;
      this.a.b();
      if (!ActivityChooserView.d(this.a)) {
        break;
      }
    } while (paramInt <= 0);
    paramView = ActivityChooserView.a(this.a).a;
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      synchronized (paramView.a)
      {
        paramView.d();
        localObject1 = (rm)paramView.b.get(paramInt);
        localObject2 = (rm)paramView.b.get(0);
        if (localObject2 != null)
        {
          f = ((rm)localObject2).b - ((rm)localObject1).b + 5.0F;
          localObject2 = new android/content/ComponentName;
          ((ComponentName)localObject2).<init>(((rm)localObject1).a.activityInfo.packageName, ((rm)localObject1).a.activityInfo.name);
          localObject1 = new rp;
          ((rp)localObject1).<init>((ComponentName)localObject2, System.currentTimeMillis(), f);
          if (!paramView.c.add(localObject1)) {
            break label325;
          }
          paramView.f = true;
          paramView.e();
          if (paramView.e) {
            break;
          }
          paramView = new java/lang/IllegalStateException;
          paramView.<init>("No preceding call to #readHistoricalData");
          throw paramView;
        }
      }
      float f = 1.0F;
    }
    if (paramView.f)
    {
      paramView.f = false;
      if (!TextUtils.isEmpty(paramView.d))
      {
        localObject2 = new rq;
        ((rq)localObject2).<init>(paramView);
        localObject1 = new Object[2];
        localObject1[0] = paramView.c;
        localObject1[1] = paramView.d;
        if (Build.VERSION.SDK_INT < 11) {
          break label330;
        }
        ((AsyncTask)localObject2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])localObject1);
      }
    }
    for (;;)
    {
      paramView.notifyChanged();
      label325:
      break;
      label330:
      ((AsyncTask)localObject2).execute((Object[])localObject1);
    }
    if (ActivityChooserView.a(this.a).b) {}
    for (;;)
    {
      ??? = ActivityChooserView.a(this.a).a.b(paramInt);
      if (??? == null) {
        break;
      }
      ???.addFlags(524288);
      this.a.getContext().startActivity(???);
      break;
      paramInt++;
    }
  }
  
  public final boolean onLongClick(View paramView)
  {
    if (paramView == ActivityChooserView.e(this.a))
    {
      if (ActivityChooserView.a(this.a).getCount() > 0)
      {
        ActivityChooserView.a(this.a, true);
        ActivityChooserView.a(this.a, ActivityChooserView.g(this.a));
      }
      return true;
    }
    throw new IllegalArgumentException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */