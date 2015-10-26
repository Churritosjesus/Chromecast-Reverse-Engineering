import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class ar
  extends ap
{
  public static boolean a = false;
  final eq b = new eq();
  final eq c = new eq();
  final String d;
  m e;
  boolean f;
  boolean g;
  private boolean h;
  
  ar(String paramString, m paramm, boolean paramBoolean)
  {
    this.d = paramString;
    this.e = paramm;
    this.f = paramBoolean;
  }
  
  private as c(int paramInt, Bundle paramBundle, aq paramaq)
  {
    paramBundle = new as(this, paramInt, paramBundle, paramaq);
    paramBundle.c = paramaq.c_(paramInt);
    return paramBundle;
  }
  
  private as d(int paramInt, Bundle paramBundle, aq paramaq)
  {
    try
    {
      this.h = true;
      paramBundle = c(paramInt, paramBundle, paramaq);
      a(paramBundle);
      return paramBundle;
    }
    finally
    {
      this.h = false;
    }
  }
  
  public final bi a(int paramInt, Bundle paramBundle, aq paramaq)
  {
    if (this.h) {
      throw new IllegalStateException("Called while creating a loader");
    }
    paramBundle = (as)this.b.a(paramInt);
    if (a) {
      new StringBuilder("initLoader in ").append(this).append(": args=").append(null);
    }
    if (paramBundle == null)
    {
      paramaq = d(paramInt, null, paramaq);
      paramBundle = paramaq;
      if (a)
      {
        new StringBuilder("  Created new loader ").append(paramaq);
        paramBundle = paramaq;
      }
    }
    for (;;)
    {
      if ((paramBundle.d) && (this.f)) {
        paramBundle.b(paramBundle.c, paramBundle.f);
      }
      return paramBundle.c;
      if (a) {
        new StringBuilder("  Re-using existing loader ").append(paramBundle);
      }
      paramBundle.b = paramaq;
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.h) {
      throw new IllegalStateException("Called while creating a loader");
    }
    if (a) {
      new StringBuilder("destroyLoader in ").append(this).append(" of ").append(paramInt);
    }
    int i = this.b.e(paramInt);
    as localas;
    if (i >= 0)
    {
      localas = (as)this.b.d(i);
      this.b.b(i);
      localas.c();
    }
    paramInt = this.c.e(paramInt);
    if (paramInt >= 0)
    {
      localas = (as)this.c.d(paramInt);
      this.c.b(paramInt);
      localas.c();
    }
    if ((this.e != null) && (!a())) {
      this.e.b.g();
    }
  }
  
  final void a(as paramas)
  {
    this.b.a(paramas.a, paramas);
    if (this.f) {
      paramas.a();
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int j = 0;
    Object localObject1;
    int i;
    Object localObject2;
    if (this.b.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      localObject1 = paramString + "    ";
      for (i = 0; i < this.b.a(); i++)
      {
        localObject2 = (as)this.b.d(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.c(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(((as)localObject2).toString());
        ((as)localObject2).a((String)localObject1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    if (this.c.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      localObject2 = paramString + "    ";
      for (i = j; i < this.c.a(); i++)
      {
        localObject1 = (as)this.c.d(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.c(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(((as)localObject1).toString());
        ((as)localObject1).a((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
  }
  
  public final boolean a()
  {
    int j = this.b.a();
    int i = 0;
    boolean bool2 = false;
    if (i < j)
    {
      as localas = (as)this.b.d(i);
      if ((localas.g) && (!localas.e)) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        bool2 |= bool1;
        i++;
        break;
      }
    }
    return bool2;
  }
  
  public final bi b(int paramInt)
  {
    if (this.h) {
      throw new IllegalStateException("Called while creating a loader");
    }
    Object localObject = (as)this.b.a(paramInt);
    if (localObject != null) {
      if (((as)localObject).k != null) {
        localObject = ((as)localObject).k.c;
      }
    }
    for (;;)
    {
      return (bi)localObject;
      localObject = ((as)localObject).c;
      continue;
      localObject = null;
    }
  }
  
  public final bi b(int paramInt, Bundle paramBundle, aq paramaq)
  {
    if (this.h) {
      throw new IllegalStateException("Called while creating a loader");
    }
    as localas = (as)this.b.a(paramInt);
    if (a) {
      new StringBuilder("restartLoader in ").append(this).append(": args=").append(null);
    }
    if (localas != null)
    {
      paramBundle = (as)this.c.a(paramInt);
      if (paramBundle == null) {
        break label245;
      }
      if (!localas.d) {
        break label150;
      }
      if (a) {
        new StringBuilder("  Removing last inactive loader: ").append(localas);
      }
      paramBundle.e = false;
      paramBundle.c();
    }
    for (;;)
    {
      localas.c.d = true;
      this.c.a(paramInt, localas);
      for (paramBundle = d(paramInt, null, paramaq).c;; paramBundle = localas.k.c)
      {
        return paramBundle;
        label150:
        if (!localas.g)
        {
          this.b.a(paramInt, null);
          localas.c();
          break;
        }
        if (localas.k != null)
        {
          if (a) {
            new StringBuilder("  Removing pending loader: ").append(localas.k);
          }
          localas.k.c();
          localas.k = null;
        }
        localas.k = c(paramInt, null, paramaq);
      }
      label245:
      if (a) {
        new StringBuilder("  Making last loader inactive: ").append(localas);
      }
    }
  }
  
  final void b()
  {
    if (a) {
      new StringBuilder("Starting in ").append(this);
    }
    if (this.f)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStart when already started: " + this, localRuntimeException);
    }
    for (;;)
    {
      return;
      this.f = true;
      for (int i = this.b.a() - 1; i >= 0; i--) {
        ((as)this.b.d(i)).a();
      }
    }
  }
  
  final void c()
  {
    if (a) {
      new StringBuilder("Stopping in ").append(this);
    }
    if (!this.f)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStop when not started: " + this, localRuntimeException);
    }
    for (;;)
    {
      return;
      for (int i = this.b.a() - 1; i >= 0; i--) {
        ((as)this.b.d(i)).b();
      }
      this.f = false;
    }
  }
  
  final void d()
  {
    if (a) {
      new StringBuilder("Retaining in ").append(this);
    }
    Object localObject;
    if (!this.f)
    {
      localObject = new RuntimeException("here");
      ((RuntimeException)localObject).fillInStackTrace();
      Log.w("LoaderManager", "Called doRetain when not started: " + this, (Throwable)localObject);
    }
    for (;;)
    {
      return;
      this.g = true;
      this.f = false;
      for (int i = this.b.a() - 1; i >= 0; i--)
      {
        localObject = (as)this.b.d(i);
        if (a) {
          new StringBuilder("  Retaining: ").append(localObject);
        }
        ((as)localObject).h = true;
        ((as)localObject).i = ((as)localObject).g;
        ((as)localObject).g = false;
        ((as)localObject).b = null;
      }
    }
  }
  
  final void e()
  {
    for (int i = this.b.a() - 1; i >= 0; i--) {
      ((as)this.b.d(i)).j = true;
    }
  }
  
  final void f()
  {
    for (int i = this.b.a() - 1; i >= 0; i--)
    {
      as localas = (as)this.b.d(i);
      if ((localas.g) && (localas.j))
      {
        localas.j = false;
        if (localas.d) {
          localas.b(localas.c, localas.f);
        }
      }
    }
  }
  
  final void g()
  {
    if (!this.g)
    {
      if (a) {
        new StringBuilder("Destroying Active in ").append(this);
      }
      for (i = this.b.a() - 1; i >= 0; i--) {
        ((as)this.b.d(i)).c();
      }
      this.b.b();
    }
    if (a) {
      new StringBuilder("Destroying Inactive in ").append(this);
    }
    for (int i = this.c.a() - 1; i >= 0; i--) {
      ((as)this.c.d(i)).c();
    }
    this.c.b();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    a.a(this.e, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */