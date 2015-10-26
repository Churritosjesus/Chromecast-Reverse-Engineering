import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class m
  extends Activity
{
  final Handler a = new n(this);
  public final t b = new t();
  boolean c;
  boolean d;
  private q e = new o(this);
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  private ep l;
  private ar m;
  
  private static String a(View paramView)
  {
    char c3 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    char c1;
    label118:
    label135:
    label152:
    label169:
    label186:
    label203:
    label220:
    label244:
    label261:
    int n;
    Object localObject;
    switch (paramView.getVisibility())
    {
    default: 
      localStringBuilder.append('.');
      if (paramView.isFocusable())
      {
        c1 = 'F';
        localStringBuilder.append(c1);
        if (!paramView.isEnabled()) {
          break label562;
        }
        c1 = 'E';
        localStringBuilder.append(c1);
        if (!paramView.willNotDraw()) {
          break label568;
        }
        c1 = '.';
        localStringBuilder.append(c1);
        if (!paramView.isHorizontalScrollBarEnabled()) {
          break label574;
        }
        c1 = 'H';
        localStringBuilder.append(c1);
        if (!paramView.isVerticalScrollBarEnabled()) {
          break label580;
        }
        c1 = 'V';
        localStringBuilder.append(c1);
        if (!paramView.isClickable()) {
          break label586;
        }
        c1 = 'C';
        localStringBuilder.append(c1);
        if (!paramView.isLongClickable()) {
          break label592;
        }
        c1 = 'L';
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        if (!paramView.isFocused()) {
          break label598;
        }
        c1 = c3;
        localStringBuilder.append(c1);
        if (!paramView.isSelected()) {
          break label604;
        }
        c1 = 'S';
        localStringBuilder.append(c1);
        c1 = c2;
        if (paramView.isPressed()) {
          c1 = 'P';
        }
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        n = paramView.getId();
        if (n != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(n));
          localObject = paramView.getResources();
          if ((n != 0) && (localObject != null)) {
            switch (0xFF000000 & n)
            {
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        paramView = ((Resources)localObject).getResourcePackageName(n);
        String str = ((Resources)localObject).getResourceTypeName(n);
        localObject = ((Resources)localObject).getResourceEntryName(n);
        localStringBuilder.append(" ");
        localStringBuilder.append(paramView);
        localStringBuilder.append(":");
        localStringBuilder.append(str);
        localStringBuilder.append("/");
        localStringBuilder.append((String)localObject);
      }
      catch (Resources.NotFoundException paramView)
      {
        label562:
        label568:
        label574:
        label580:
        label586:
        label592:
        label598:
        label604:
        continue;
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localStringBuilder.append('V');
      break;
      localStringBuilder.append('I');
      break;
      localStringBuilder.append('G');
      break;
      c1 = '.';
      break label118;
      c1 = '.';
      break label135;
      c1 = 'D';
      break label152;
      c1 = '.';
      break label169;
      c1 = '.';
      break label186;
      c1 = '.';
      break label203;
      c1 = '.';
      break label220;
      c1 = '.';
      break label244;
      c1 = '.';
      break label261;
      paramView = "app";
      continue;
      paramView = "android";
    }
  }
  
  private void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null) {
      paramPrintWriter.println("null");
    }
    for (;;)
    {
      return;
      paramPrintWriter.println(a(paramView));
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i1 = paramView.getChildCount();
        if (i1 > 0)
        {
          paramString = paramString + "  ";
          for (int n = 0; n < i1; n++) {
            a(paramString, paramPrintWriter, paramView.getChildAt(n));
          }
        }
      }
    }
  }
  
  final ar a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.l == null) {
      this.l = new ep();
    }
    ar localar = (ar)this.l.get(paramString);
    if (localar == null) {
      if (paramBoolean2)
      {
        localar = new ar(paramString, this, paramBoolean1);
        this.l.put(paramString, localar);
      }
    }
    for (;;)
    {
      return localar;
      localar.e = this;
    }
  }
  
  public final void a(j paramj, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1) {
      super.startActivityForResult(paramIntent, -1);
    }
    for (;;)
    {
      return;
      if ((0xFFFF0000 & paramInt) != 0) {
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
      }
      super.startActivityForResult(paramIntent, (paramj.k + 1 << 16) + (0xFFFF & paramInt));
    }
  }
  
  final void a(String paramString)
  {
    if (this.l != null)
    {
      ar localar = (ar)this.l.get(paramString);
      if ((localar != null) && (!localar.g))
      {
        localar.g();
        this.l.remove(paramString);
      }
    }
  }
  
  final void a(boolean paramBoolean)
  {
    if (!this.h)
    {
      this.h = true;
      this.d = paramBoolean;
      this.a.removeMessages(1);
      if (this.k)
      {
        this.k = false;
        if (this.m != null)
        {
          if (this.d) {
            break label68;
          }
          this.m.c();
        }
      }
    }
    for (;;)
    {
      this.b.a(2, false);
      return;
      label68:
      this.m.d();
    }
  }
  
  public void a_()
  {
    if (Build.VERSION.SDK_INT >= 11) {
      invalidateOptionsMenu();
    }
    for (;;)
    {
      return;
      this.i = true;
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int n = Build.VERSION.SDK_INT;
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.c);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.h);
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.k);
    if (this.m != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.m)));
      paramPrintWriter.println(":");
      this.m.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.b.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    a(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.b.j = false;
    int n = paramInt1 >> 16;
    if (n != 0)
    {
      n--;
      if ((this.b.b == null) || (n < 0) || (n >= this.b.b.size())) {
        Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(paramInt1));
      }
    }
    for (;;)
    {
      return;
      j localj = (j)this.b.b.get(n);
      if (localj == null)
      {
        Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(paramInt1));
      }
      else
      {
        localj.a(0xFFFF & paramInt1, paramInt2, paramIntent);
        continue;
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
      }
    }
  }
  
  public void onBackPressed()
  {
    if (!this.b.d())
    {
      if (Build.VERSION.SDK_INT < 21) {
        break label23;
      }
      finishAfterTransition();
    }
    for (;;)
    {
      return;
      label23:
      finish();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.b.a(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.b.a(this, this.e, null);
    if (getLayoutInflater().getFactory() == null) {
      getLayoutInflater().setFactory(this);
    }
    super.onCreate(paramBundle);
    p localp = (p)getLastNonConfigurationInstance();
    if (localp != null) {
      this.l = localp.b;
    }
    Parcelable localParcelable;
    t localt;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      localt = this.b;
      if (localp == null) {
        break label101;
      }
    }
    label101:
    for (paramBundle = localp.a;; paramBundle = null)
    {
      localt.a(localParcelable, paramBundle);
      this.b.j();
      return;
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    boolean bool;
    if (paramInt == 0)
    {
      bool = super.onCreatePanelMenu(paramInt, paramMenu) | this.b.a(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT < 11) {}
    }
    for (;;)
    {
      return bool;
      bool = true;
      continue;
      bool = super.onCreatePanelMenu(paramInt, paramMenu);
    }
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject;
    if (!"fragment".equals(paramString)) {
      localObject = super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    for (;;)
    {
      return (View)localObject;
      View localView = this.b.a(null, paramString, paramContext, paramAttributeSet);
      localObject = localView;
      if (localView == null) {
        localObject = super.onCreateView(paramString, paramContext, paramAttributeSet);
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    a(false);
    this.b.p();
    if (this.m != null) {
      this.m.g();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0)) {
      onBackPressed();
    }
    for (boolean bool = true;; bool = super.onKeyDown(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.b.q();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool;
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      switch (paramInt)
      {
      default: 
        bool = false;
        break;
      case 0: 
        bool = this.b.a(paramMenuItem);
        break;
      case 6: 
        bool = this.b.b(paramMenuItem);
      }
    }
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.b.j = false;
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.b.b(paramMenu);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.g = false;
    if (this.a.hasMessages(2))
    {
      this.a.removeMessages(2);
      this.b.m();
    }
    this.b.a(4, false);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    this.a.removeMessages(2);
    this.b.m();
    this.b.h();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null)) {
      if (this.i)
      {
        this.i = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
    }
    for (boolean bool = super.onPreparePanel(0, paramView, paramMenu) | this.b.a(paramMenu);; bool = super.onPreparePanel(paramInt, paramView, paramMenu)) {
      return bool;
    }
  }
  
  public void onResume()
  {
    super.onResume();
    this.a.sendEmptyMessage(2);
    this.g = true;
    this.b.h();
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    Object localObject3 = null;
    int i2 = 0;
    if (this.c) {
      a(true);
    }
    Object localObject4 = this.b;
    int n;
    Object localObject1;
    Object localObject2;
    int i1;
    if (((t)localObject4).b != null)
    {
      n = 0;
      localObject1 = null;
      localObject2 = localObject1;
      if (n < ((t)localObject4).b.size())
      {
        j localj = (j)((t)localObject4).b.get(n);
        localObject2 = localObject1;
        if (localj != null)
        {
          localObject2 = localObject1;
          if (localj.G)
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localj);
            localj.H = true;
            if (localj.n == null) {
              break label143;
            }
          }
        }
        label143:
        for (i1 = localj.n.k;; i1 = -1)
        {
          localj.o = i1;
          n++;
          localObject1 = localObject2;
          break;
        }
      }
    }
    else
    {
      localObject2 = null;
    }
    if (this.l != null)
    {
      int i3 = this.l.size();
      localObject4 = new ar[i3];
      for (n = i3 - 1; n >= 0; n--) {
        localObject4[n] = ((ar)this.l.c(n));
      }
      n = 0;
      i1 = i2;
      i2 = n;
      if (i1 < i3)
      {
        localObject1 = localObject4[i1];
        if (((ar)localObject1).g) {
          n = 1;
        }
        for (;;)
        {
          i1++;
          break;
          ((ar)localObject1).g();
          this.l.remove(((ar)localObject1).d);
        }
      }
    }
    else
    {
      i2 = 0;
    }
    if ((localObject2 == null) && (i2 == 0)) {
      localObject1 = localObject3;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = new p();
      ((p)localObject1).a = ((ArrayList)localObject2);
      ((p)localObject1).b = this.l;
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.b.i();
    if (localParcelable != null) {
      paramBundle.putParcelable("android:support:fragments", localParcelable);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    this.c = false;
    this.h = false;
    this.a.removeMessages(1);
    if (!this.f)
    {
      this.f = true;
      this.b.k();
    }
    this.b.j = false;
    this.b.h();
    if (!this.k)
    {
      this.k = true;
      if (this.m == null) {
        break label150;
      }
      this.m.b();
    }
    int i2;
    ar[] arrayOfar;
    for (;;)
    {
      this.j = true;
      this.b.l();
      if (this.l == null) {
        return;
      }
      i2 = this.l.size();
      arrayOfar = new ar[i2];
      for (n = i2 - 1; n >= 0; n--) {
        arrayOfar[n] = ((ar)this.l.c(n));
      }
      label150:
      if (!this.j)
      {
        this.m = a("(root)", this.k, false);
        if ((this.m != null) && (!this.m.f)) {
          this.m.b();
        }
      }
    }
    for (int n = 0; n < i2; n++)
    {
      ar localar = arrayOfar[n];
      if (localar.g)
      {
        if (ar.a) {
          new StringBuilder("Finished Retaining in ").append(localar);
        }
        localar.g = false;
        for (int i1 = localar.b.a() - 1; i1 >= 0; i1--)
        {
          as localas = (as)localar.b.d(i1);
          if (localas.h)
          {
            if (ar.a) {
              new StringBuilder("  Finished Retaining: ").append(localas);
            }
            localas.h = false;
            if ((localas.g != localas.i) && (!localas.g)) {
              localas.b();
            }
          }
          if ((localas.g) && (localas.d) && (!localas.j)) {
            localas.b(localas.c, localas.f);
          }
        }
      }
      localar.f();
    }
  }
  
  public void onStop()
  {
    super.onStop();
    this.c = true;
    this.a.sendEmptyMessage(1);
    this.b.o();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */