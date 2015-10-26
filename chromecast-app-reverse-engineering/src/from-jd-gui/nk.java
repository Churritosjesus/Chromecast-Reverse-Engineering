import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

class nk
  extends pr
{
  nk(ni paramni, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (this.a.a(paramKeyEvent)) {}
    for (boolean bool = true;; bool = super.dispatchKeyEvent(paramKeyEvent)) {
      return bool;
    }
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    if (this.a.a(paramKeyEvent.getKeyCode(), paramKeyEvent)) {}
    for (boolean bool = true;; bool = super.dispatchKeyShortcutEvent(paramKeyEvent)) {
      return bool;
    }
  }
  
  public void onContentChanged() {}
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if ((paramInt == 0) && (!(paramMenu instanceof qa))) {}
    for (boolean bool = false;; bool = super.onCreatePanelMenu(paramInt, paramMenu)) {
      return bool;
    }
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    if (this.a.d(paramInt)) {}
    for (boolean bool = true;; bool = super.onMenuOpened(paramInt, paramMenu)) {
      return bool;
    }
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    if (this.a.c(paramInt)) {}
    for (;;)
    {
      return;
      super.onPanelClosed(paramInt, paramMenu);
    }
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    qa localqa;
    boolean bool1;
    if ((paramMenu instanceof qa))
    {
      localqa = (qa)paramMenu;
      if ((paramInt != 0) || (localqa != null)) {
        break label34;
      }
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      localqa = null;
      break;
      label34:
      if (localqa != null) {
        localqa.j = true;
      }
      boolean bool2 = super.onPreparePanel(paramInt, paramView, paramMenu);
      bool1 = bool2;
      if (localqa != null)
      {
        localqa.j = false;
        bool1 = bool2;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */