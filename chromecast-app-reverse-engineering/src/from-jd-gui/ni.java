import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;
import android.view.Window.Callback;

abstract class ni
  extends nh
{
  final Context a;
  final Window b;
  final Window.Callback c;
  final Window.Callback d;
  final ng e;
  mj f;
  boolean g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  CharSequence l;
  boolean m;
  private MenuInflater n;
  
  ni(Context paramContext, Window paramWindow, ng paramng)
  {
    this.a = paramContext;
    this.b = paramWindow;
    this.e = paramng;
    this.c = this.b.getCallback();
    if ((this.c instanceof nk)) {
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    this.d = a(this.c);
    this.b.setCallback(this.d);
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new nk(this, paramCallback);
  }
  
  public final mj a()
  {
    if (this.g) {
      if (this.f == null) {
        this.f = j();
      }
    }
    for (;;)
    {
      return this.f;
      if ((this.f instanceof pb)) {
        this.f = null;
      }
    }
  }
  
  public void a(Bundle paramBundle)
  {
    paramBundle = this.a.obtainStyledAttributes(oq.bN);
    if (!paramBundle.hasValue(oq.bR))
    {
      paramBundle.recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    if (paramBundle.getBoolean(oq.bR, false)) {
      this.g = true;
    }
    if (paramBundle.getBoolean(oq.bS, false)) {
      this.h = true;
    }
    if (paramBundle.getBoolean(oq.bT, false)) {
      this.i = true;
    }
    this.j = paramBundle.getBoolean(oq.bP, false);
    this.k = paramBundle.getBoolean(oq.ca, false);
    paramBundle.recycle();
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.l = paramCharSequence;
    b(paramCharSequence);
  }
  
  abstract boolean a(int paramInt, KeyEvent paramKeyEvent);
  
  abstract boolean a(KeyEvent paramKeyEvent);
  
  public final MenuInflater b()
  {
    if (this.n == null) {
      this.n = new pm(k());
    }
    return this.n;
  }
  
  abstract void b(CharSequence paramCharSequence);
  
  abstract boolean c(int paramInt);
  
  abstract boolean d(int paramInt);
  
  public final void g()
  {
    this.m = true;
  }
  
  public final mo h()
  {
    return new nj(this);
  }
  
  abstract mj j();
  
  final Context k()
  {
    Context localContext = null;
    Object localObject = a();
    if (localObject != null) {
      localContext = ((mj)localObject).e();
    }
    localObject = localContext;
    if (localContext == null) {
      localObject = this.a;
    }
    return (Context)localObject;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */