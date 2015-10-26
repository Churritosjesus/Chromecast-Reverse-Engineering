import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class i
  extends j
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  private boolean Z = true;
  public int a = 0;
  private int aa = -1;
  private boolean ab;
  private boolean ac;
  private boolean ad;
  public int b = 0;
  public boolean c = true;
  public Dialog d;
  
  public void a()
  {
    super.a();
    if ((!this.ad) && (!this.ac)) {
      this.ac = true;
    }
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (!this.ad) {
      this.ac = false;
    }
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (this.C == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      if (paramBundle != null)
      {
        this.a = paramBundle.getInt("android:style", 0);
        this.b = paramBundle.getInt("android:theme", 0);
        this.Z = paramBundle.getBoolean("android:cancelable", true);
        this.c = paramBundle.getBoolean("android:showsDialog", this.c);
        this.aa = paramBundle.getInt("android:backStackId", -1);
      }
      return;
    }
  }
  
  public void a(r paramr, String paramString)
  {
    this.ac = false;
    this.ad = true;
    paramr = paramr.a();
    paramr.a(this, paramString);
    paramr.b();
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.ac) {}
    for (;;)
    {
      return;
      this.ac = true;
      this.ad = false;
      if (this.d != null)
      {
        this.d.dismiss();
        this.d = null;
      }
      this.ab = true;
      if (this.aa >= 0)
      {
        this.x.a(this.aa, 1);
        this.aa = -1;
      }
      else
      {
        af localaf = this.x.a();
        localaf.a(this);
        if (paramBoolean) {
          localaf.c();
        } else {
          localaf.b();
        }
      }
    }
  }
  
  public final LayoutInflater b(Bundle paramBundle)
  {
    if (!this.c) {
      paramBundle = super.b(paramBundle);
    }
    for (;;)
    {
      return paramBundle;
      this.d = c(paramBundle);
      switch (this.a)
      {
      }
      for (;;)
      {
        if (this.d == null) {
          break label106;
        }
        paramBundle = (LayoutInflater)this.d.getContext().getSystemService("layout_inflater");
        break;
        this.d.getWindow().addFlags(24);
        this.d.requestWindowFeature(1);
      }
      label106:
      paramBundle = (LayoutInflater)this.y.getSystemService("layout_inflater");
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    this.Z = paramBoolean;
    if (this.d != null) {
      this.d.setCancelable(paramBoolean);
    }
  }
  
  public Dialog c(Bundle paramBundle)
  {
    return new Dialog(this.y, this.b);
  }
  
  public void d()
  {
    super.d();
    if (this.d != null)
    {
      this.ab = true;
      this.d.dismiss();
      this.d = null;
    }
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (!this.c) {}
    for (;;)
    {
      return;
      View localView = this.N;
      if (localView != null)
      {
        if (localView.getParent() != null) {
          throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
        this.d.setContentView(localView);
      }
      this.d.setOwnerActivity(this.y);
      this.d.setCancelable(this.Z);
      this.d.setOnCancelListener(this);
      this.d.setOnDismissListener(this);
      if (paramBundle != null)
      {
        paramBundle = paramBundle.getBundle("android:savedDialogState");
        if (paramBundle != null) {
          this.d.onRestoreInstanceState(paramBundle);
        }
      }
    }
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.d != null)
    {
      Bundle localBundle = this.d.onSaveInstanceState();
      if (localBundle != null) {
        paramBundle.putBundle("android:savedDialogState", localBundle);
      }
    }
    if (this.a != 0) {
      paramBundle.putInt("android:style", this.a);
    }
    if (this.b != 0) {
      paramBundle.putInt("android:theme", this.b);
    }
    if (!this.Z) {
      paramBundle.putBoolean("android:cancelable", this.Z);
    }
    if (!this.c) {
      paramBundle.putBoolean("android:showsDialog", this.c);
    }
    if (this.aa != -1) {
      paramBundle.putInt("android:backStackId", this.aa);
    }
  }
  
  public final void g_()
  {
    super.g_();
    if (this.d != null)
    {
      this.ab = false;
      this.d.show();
    }
  }
  
  public final void h_()
  {
    super.h_();
    if (this.d != null) {
      this.d.hide();
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (!this.ab) {
      a(true);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */