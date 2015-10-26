import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class as
  implements bj
{
  final int a;
  aq b;
  bi c;
  boolean d;
  boolean e;
  Object f;
  boolean g;
  boolean h;
  boolean i;
  boolean j;
  as k;
  private Bundle l;
  private boolean m;
  private boolean n;
  
  public as(ar paramar, int paramInt, Bundle paramBundle, aq paramaq)
  {
    this.a = paramInt;
    this.l = paramBundle;
    this.b = paramaq;
  }
  
  final void a()
  {
    if ((this.h) && (this.i)) {
      this.g = true;
    }
    for (;;)
    {
      return;
      if (!this.g)
      {
        this.g = true;
        if (ar.a) {
          new StringBuilder("  Starting: ").append(this);
        }
        if ((this.c == null) && (this.b != null)) {
          this.c = this.b.c_(this.a);
        }
        if (this.c != null)
        {
          if ((this.c.getClass().isMemberClass()) && (!Modifier.isStatic(this.c.getClass().getModifiers()))) {
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.c);
          }
          if (!this.n)
          {
            bi localbi = this.c;
            int i1 = this.a;
            if (localbi.b != null) {
              throw new IllegalStateException("There is already a listener registered");
            }
            localbi.b = this;
            localbi.a = i1;
            this.n = true;
          }
          this.c.a();
        }
      }
    }
  }
  
  public final void a(bi parambi, Object paramObject)
  {
    if (ar.a) {
      new StringBuilder("onLoadComplete: ").append(this);
    }
    if (this.m) {}
    for (;;)
    {
      return;
      if (this.o.b.a(this.a) == this)
      {
        as localas = this.k;
        if (localas != null)
        {
          if (ar.a) {
            new StringBuilder("  Switching to pending loader: ").append(localas);
          }
          this.k = null;
          this.o.b.a(this.a, null);
          c();
          this.o.a(localas);
        }
        else
        {
          if ((this.f != paramObject) || (!this.d))
          {
            this.f = paramObject;
            this.d = true;
            if (this.g) {
              b(parambi, paramObject);
            }
          }
          parambi = (as)this.o.c.a(this.a);
          if ((parambi != null) && (parambi != this))
          {
            parambi.e = false;
            parambi.c();
            parambi = this.o.c;
            int i1 = this.a;
            i1 = ef.a(parambi.c, parambi.e, i1);
            if ((i1 >= 0) && (parambi.d[i1] != eq.a))
            {
              parambi.d[i1] = eq.a;
              parambi.b = true;
            }
          }
          if ((this.o.e != null) && (!this.o.a())) {
            this.o.e.b.g();
          }
        }
      }
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    as localas = this;
    for (;;)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(localas.a);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(localas.l);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(localas.b);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(localas.c);
      if (localas.c != null) {
        localas.c.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
      if ((localas.d) || (localas.e))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mHaveData=");
        paramPrintWriter.print(localas.d);
        paramPrintWriter.print("  mDeliveredData=");
        paramPrintWriter.println(localas.e);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mData=");
        paramPrintWriter.println(localas.f);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(localas.g);
      paramPrintWriter.print(" mReportNextStart=");
      paramPrintWriter.print(localas.j);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(localas.m);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mRetaining=");
      paramPrintWriter.print(localas.h);
      paramPrintWriter.print(" mRetainingStarted=");
      paramPrintWriter.print(localas.i);
      paramPrintWriter.print(" mListenerRegistered=");
      paramPrintWriter.println(localas.n);
      if (localas.k == null) {
        break;
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(localas.k);
      paramPrintWriter.println(":");
      localas = localas.k;
      paramString = paramString + "  ";
    }
  }
  
  final void b()
  {
    if (ar.a) {
      new StringBuilder("  Stopping: ").append(this);
    }
    this.g = false;
    if ((!this.h) && (this.c != null) && (this.n))
    {
      this.n = false;
      this.c.a(this);
      this.c.c();
    }
  }
  
  final void b(bi parambi, Object paramObject)
  {
    String str;
    if (this.b != null)
    {
      if (this.o.e == null) {
        break label185;
      }
      str = this.o.e.b.k;
      this.o.e.b.k = "onLoadFinished";
    }
    for (;;)
    {
      try
      {
        if (ar.a)
        {
          StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>("  onLoadFinished in ");
          localStringBuilder1 = localStringBuilder1.append(parambi).append(": ");
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>(64);
          a.a(paramObject, localStringBuilder2);
          localStringBuilder2.append("}");
          localStringBuilder1.append(localStringBuilder2.toString());
        }
        this.b.a(parambi, paramObject);
        if (this.o.e != null) {
          this.o.e.b.k = str;
        }
        this.e = true;
        return;
      }
      finally
      {
        if (this.o.e != null) {
          this.o.e.b.k = str;
        }
      }
      label185:
      str = null;
    }
  }
  
  final void c()
  {
    as localas = this;
    if (ar.a) {
      new StringBuilder("  Destroying: ").append(localas);
    }
    localas.m = true;
    boolean bool = localas.e;
    localas.e = false;
    String str;
    if ((localas.b != null) && (localas.c != null) && (localas.d) && (bool))
    {
      if (ar.a) {
        new StringBuilder("  Reseting: ").append(localas);
      }
      if (localas.o.e == null) {
        break label213;
      }
      str = localas.o.e.b.k;
      localas.o.e.b.k = "onLoaderReset";
    }
    for (;;)
    {
      if (localas.o.e != null) {
        localas.o.e.b.k = str;
      }
      localas.b = null;
      localas.f = null;
      localas.d = false;
      if (localas.c != null)
      {
        if (localas.n)
        {
          localas.n = false;
          localas.c.a(localas);
        }
        localas.c.e();
      }
      if (localas.k != null)
      {
        localas = localas.k;
        break;
      }
      return;
      label213:
      str = null;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" : ");
    a.a(this.c, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */