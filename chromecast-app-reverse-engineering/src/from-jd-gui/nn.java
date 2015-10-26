import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ViewStubCompat;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.Window.Callback;
import android.widget.PopupWindow;

final class nn
  extends nk
{
  nn(nm paramnm, Window.Callback paramCallback)
  {
    super(paramnm, paramCallback);
  }
  
  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    nm localnm;
    label317:
    boolean bool;
    if (this.a.n)
    {
      pl localpl = new pl(this.a.a, paramCallback);
      localnm = this.a;
      if (localnm.o != null) {
        localnm.o.c();
      }
      nu localnu1 = new nu(localnm, localpl);
      paramCallback = localnm.a();
      if (paramCallback != null) {
        localnm.o = paramCallback.a(localnu1);
      }
      if (localnm.o == null)
      {
        if (localnm.o != null) {
          localnm.o.c();
        }
        nu localnu2 = new nu(localnm, localnu1);
        Object localObject;
        if (localnm.p == null)
        {
          if (!localnm.j) {
            break label497;
          }
          localObject = new TypedValue();
          paramCallback = localnm.a.getTheme();
          paramCallback.resolveAttribute(a.l, (TypedValue)localObject, true);
          if (((TypedValue)localObject).resourceId != 0)
          {
            Resources.Theme localTheme = localnm.a.getResources().newTheme();
            localTheme.setTo(paramCallback);
            localTheme.applyStyle(((TypedValue)localObject).resourceId, true);
            paramCallback = new pi(localnm.a, 0);
            paramCallback.getTheme().setTo(localTheme);
            localnm.p = new ActionBarContextView(paramCallback);
            localnm.q = new PopupWindow(paramCallback, null, a.o);
            localnm.q.setContentView(localnm.p);
            localnm.q.setWidth(-1);
            paramCallback.getTheme().resolveAttribute(a.h, (TypedValue)localObject, true);
            int i = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject).data, paramCallback.getResources().getDisplayMetrics());
            localnm.p.e = i;
            localnm.q.setHeight(-2);
            localnm.r = new ns(localnm);
          }
        }
        else
        {
          if (localnm.p != null)
          {
            localnm.p.c();
            paramCallback = localnm.p.getContext();
            localObject = localnm.p;
            if (localnm.q != null) {
              break label540;
            }
            bool = true;
            label355:
            paramCallback = new pj(paramCallback, (ActionBarContextView)localObject, localnu2, bool);
            if (!localnu1.a(paramCallback, paramCallback.b())) {
              break label546;
            }
            paramCallback.d();
            localnm.p.a(paramCallback);
            localnm.p.setVisibility(0);
            localnm.o = paramCallback;
            if (localnm.q != null) {
              localnm.b.getDecorView().post(localnm.r);
            }
            localnm.p.sendAccessibilityEvent(32);
            if (localnm.p.getParent() != null) {
              gt.q((View)localnm.p.getParent());
            }
          }
          label464:
          localnm.o = localnm.o;
        }
      }
      else
      {
        paramCallback = localnm.o;
        if (paramCallback == null) {
          break label554;
        }
        paramCallback = localpl.b(paramCallback);
      }
    }
    for (;;)
    {
      return paramCallback;
      paramCallback = localnm.a;
      break;
      label497:
      paramCallback = (ViewStubCompat)localnm.s.findViewById(a.aV);
      if (paramCallback == null) {
        break label317;
      }
      paramCallback.a = LayoutInflater.from(localnm.k());
      localnm.p = ((ActionBarContextView)paramCallback.a());
      break label317;
      label540:
      bool = false;
      break label355;
      label546:
      localnm.o = null;
      break label464;
      label554:
      paramCallback = null;
      continue;
      paramCallback = super.onWindowStartingActionMode(paramCallback);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */