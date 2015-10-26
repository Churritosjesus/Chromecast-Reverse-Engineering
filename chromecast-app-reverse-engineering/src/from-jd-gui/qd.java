import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

public final class qd
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, qq
{
  qa a;
  nd b;
  py c;
  
  public qd(qa paramqa)
  {
    this.a = paramqa;
  }
  
  public final void a(qa paramqa, boolean paramBoolean)
  {
    if (((paramBoolean) || (paramqa == this.a)) && (this.b != null)) {
      this.b.dismiss();
    }
  }
  
  public final boolean a_(qa paramqa)
  {
    return false;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a((qe)this.c.b().getItem(paramInt), null, 0);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    this.c.a(this.a, true);
  }
  
  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if ((paramInt == 82) || (paramInt == 4)) {
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        paramDialogInterface = this.b.getWindow();
        if (paramDialogInterface == null) {
          break label146;
        }
        paramDialogInterface = paramDialogInterface.getDecorView();
        if (paramDialogInterface == null) {
          break label146;
        }
        paramDialogInterface = paramDialogInterface.getKeyDispatcherState();
        if (paramDialogInterface == null) {
          break label146;
        }
        paramDialogInterface.startTracking(paramKeyEvent, this);
      }
    }
    for (;;)
    {
      return bool;
      if ((paramKeyEvent.getAction() == 1) && (!paramKeyEvent.isCanceled()))
      {
        Object localObject = this.b.getWindow();
        if (localObject != null)
        {
          localObject = ((Window)localObject).getDecorView();
          if (localObject != null)
          {
            localObject = ((View)localObject).getKeyDispatcherState();
            if ((localObject != null) && (((KeyEvent.DispatcherState)localObject).isTracking(paramKeyEvent)))
            {
              this.a.a(true);
              paramDialogInterface.dismiss();
              continue;
            }
          }
        }
      }
      label146:
      bool = this.a.performShortcut(paramInt, paramKeyEvent, 0);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */