import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class bi
{
  public int a;
  public bj b;
  public boolean c = false;
  public boolean d = false;
  private boolean e = true;
  private boolean f = false;
  private boolean g = false;
  
  public bi(Context paramContext)
  {
    paramContext.getApplicationContext();
  }
  
  public final void a()
  {
    this.c = true;
    this.e = false;
    this.d = false;
    b();
  }
  
  public final void a(bj parambj)
  {
    if (this.b == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.b != parambj) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.b = null;
  }
  
  public final void a(Object paramObject)
  {
    if (this.b != null) {
      this.b.a(this, paramObject);
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.b);
    if (this.c)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.c);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(false);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(false);
    }
    if ((this.d) || (this.e))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.d);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.e);
    }
  }
  
  public void b() {}
  
  public final void c()
  {
    this.c = false;
    d();
  }
  
  public void d() {}
  
  public final void e()
  {
    f();
    this.e = true;
    this.c = false;
    this.d = false;
    this.f = false;
    this.g = false;
  }
  
  public void f() {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    a.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */