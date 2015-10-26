import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class j
  implements ComponentCallbacks, View.OnCreateContextMenuListener
{
  private static final ep a = new ep();
  static final Object e = new Object();
  j A;
  int B;
  int C;
  String D;
  boolean E;
  boolean F;
  public boolean G;
  boolean H;
  boolean I;
  boolean J = true;
  boolean K;
  int L;
  ViewGroup M;
  public View N;
  View O;
  boolean P;
  boolean Q = true;
  ar R;
  boolean S;
  boolean T;
  Object U = e;
  Object V = e;
  Object W = e;
  ax X = null;
  ax Y = null;
  private Object b = null;
  private Object c = null;
  private Object d = null;
  int f = 0;
  View g;
  int h;
  Bundle i;
  SparseArray j;
  int k = -1;
  String l;
  public Bundle m;
  public j n;
  int o = -1;
  public int p;
  boolean q;
  public boolean r;
  public boolean s;
  boolean t;
  boolean u;
  boolean v;
  int w;
  public t x;
  public m y;
  t z;
  
  public static j a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }
  
  public static j a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass2 = (Class)a.get(paramString);
      Class localClass1 = localClass2;
      if (localClass2 == null)
      {
        localClass1 = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass1);
      }
      paramContext = (j)localClass1.newInstance();
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(paramContext.getClass().getClassLoader());
        paramContext.m = paramBundle;
      }
      return paramContext;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new l("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new l("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new l("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
  }
  
  static boolean b(Context paramContext, String paramString)
  {
    try
    {
      Class localClass2 = (Class)a.get(paramString);
      Class localClass1 = localClass2;
      if (localClass2 == null)
      {
        localClass1 = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass1);
      }
      bool = j.class.isAssignableFrom(localClass1);
    }
    catch (ClassNotFoundException paramContext)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
    return bool;
  }
  
  public static void g() {}
  
  public static Animation i()
  {
    return null;
  }
  
  public static void m() {}
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }
  
  public final String a(int paramInt)
  {
    return e().getString(paramInt);
  }
  
  public final String a(int paramInt, Object... paramVarArgs)
  {
    return e().getString(paramInt, paramVarArgs);
  }
  
  public void a()
  {
    this.K = true;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  final void a(int paramInt, j paramj)
  {
    this.k = paramInt;
    if (paramj != null) {}
    for (this.l = (paramj.l + ":" + this.k);; this.l = ("android:fragment:" + this.k)) {
      return;
    }
  }
  
  public void a(Activity paramActivity)
  {
    this.K = true;
  }
  
  public final void a(Intent paramIntent)
  {
    if (this.y == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.y.a(this, paramIntent, -1);
  }
  
  public final void a(Intent paramIntent, int paramInt)
  {
    if (this.y == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.y.a(this, paramIntent, paramInt);
  }
  
  public void a(Bundle paramBundle)
  {
    this.K = true;
  }
  
  public void a(Menu paramMenu) {}
  
  public void a(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  public void a(View paramView, Bundle paramBundle) {}
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.B));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.C));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.D);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.k);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.l);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.w);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.q);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.r);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(this.s);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.t);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.u);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.E);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.F);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.J);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(this.I);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.G);
    paramPrintWriter.print(" mRetaining=");
    paramPrintWriter.print(this.H);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.Q);
    if (this.x != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.x);
    }
    if (this.y != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mActivity=");
      paramPrintWriter.println(this.y);
    }
    if (this.A != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.A);
    }
    if (this.m != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.m);
    }
    if (this.i != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.i);
    }
    if (this.j != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.j);
    }
    if (this.n != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(this.n);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.p);
    }
    if (this.L != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(this.L);
    }
    if (this.M != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.M);
    }
    if (this.N != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.N);
    }
    if (this.O != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      paramPrintWriter.println(this.N);
    }
    if (this.g != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(this.g);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStateAfterAnimating=");
      paramPrintWriter.println(this.h);
    }
    if (this.R != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      this.R.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if (this.z != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Child " + this.z + ":");
      this.z.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public LayoutInflater b(Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = this.y.getLayoutInflater().cloneInContext(this.y);
    if (this.z == null)
    {
      n();
      if (this.f < 5) {
        break label56;
      }
      this.z.m();
    }
    for (;;)
    {
      paramBundle = this.z;
      fm.a(localLayoutInflater, this.z);
      return localLayoutInflater;
      label56:
      if (this.f >= 4) {
        this.z.l();
      } else if (this.f >= 2) {
        this.z.k();
      } else if (this.f > 0) {
        this.z.j();
      }
    }
  }
  
  final View b(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.z != null) {
      this.z.j = false;
    }
    return a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public final void c(boolean paramBoolean)
  {
    if (this.A != null) {
      throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
    }
    this.G = true;
  }
  
  public void d()
  {
    this.K = true;
  }
  
  public void d(Bundle paramBundle)
  {
    this.K = true;
  }
  
  public final void d(boolean paramBoolean)
  {
    if (this.I != paramBoolean)
    {
      this.I = paramBoolean;
      if ((f()) && (!this.E)) {
        this.y.a_();
      }
    }
  }
  
  public final Resources e()
  {
    if (this.y == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    return this.y.getResources();
  }
  
  public void e(Bundle paramBundle) {}
  
  public final void e(boolean paramBoolean)
  {
    if (this.J != paramBoolean)
    {
      this.J = paramBoolean;
      if ((this.I) && (f()) && (!this.E)) {
        this.y.a_();
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public final void f(Bundle paramBundle)
  {
    if (this.k >= 0) {
      throw new IllegalStateException("Fragment already active");
    }
    this.m = paramBundle;
  }
  
  public final void f(boolean paramBoolean)
  {
    if ((!this.Q) && (paramBoolean) && (this.f < 4)) {
      this.x.a(this);
    }
    this.Q = paramBoolean;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.P = paramBoolean;
      return;
    }
  }
  
  public final boolean f()
  {
    if ((this.y != null) && (this.q)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  final void g(Bundle paramBundle)
  {
    e(paramBundle);
    if (this.z != null)
    {
      Parcelable localParcelable = this.z.i();
      if (localParcelable != null) {
        paramBundle.putParcelable("android:support:fragments", localParcelable);
      }
    }
  }
  
  public void g_()
  {
    this.K = true;
    if (!this.S)
    {
      this.S = true;
      if (!this.T)
      {
        this.T = true;
        this.R = this.y.a(this.l, this.S, false);
      }
      if (this.R != null) {
        this.R.b();
      }
    }
  }
  
  public final ap h()
  {
    if (this.R != null) {}
    for (ar localar = this.R;; localar = this.R)
    {
      return localar;
      if (this.y == null) {
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
      }
      this.T = true;
      this.R = this.y.a(this.l, this.S, true);
    }
  }
  
  public void h_()
  {
    this.K = true;
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public void j()
  {
    this.K = true;
  }
  
  public void k()
  {
    this.K = true;
  }
  
  public void l()
  {
    this.K = true;
    if (!this.T)
    {
      this.T = true;
      this.R = this.y.a(this.l, this.S, false);
    }
    if (this.R != null) {
      this.R.g();
    }
  }
  
  final void n()
  {
    this.z = new t();
    this.z.a(this.y, new k(this), this);
  }
  
  final void o()
  {
    if (this.z != null) {
      this.z.a(2, false);
    }
    if (this.S)
    {
      this.S = false;
      if (!this.T)
      {
        this.T = true;
        this.R = this.y.a(this.l, this.S, false);
      }
      if (this.R != null)
      {
        if (this.y.d) {
          break label85;
        }
        this.R.c();
      }
    }
    for (;;)
    {
      return;
      label85:
      this.R.d();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.K = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.y.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory()
  {
    this.K = true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    a.a(this, localStringBuilder);
    if (this.k >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.k);
    }
    if (this.B != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(this.B));
    }
    if (this.D != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.D);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */