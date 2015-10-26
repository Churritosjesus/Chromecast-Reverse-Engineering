import java.lang.ref.WeakReference;

abstract class cfk
  extends cah
{
  private static final WeakReference b = new WeakReference(null);
  private WeakReference a = b;
  
  cfk(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  final byte[] a()
  {
    try
    {
      Object localObject3 = (byte[])this.a.get();
      Object localObject1 = localObject3;
      if (localObject3 == null)
      {
        localObject1 = b();
        localObject3 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject3).<init>(localObject1);
        this.a = ((WeakReference)localObject3);
      }
      return (byte[])localObject1;
    }
    finally {}
  }
  
  protected abstract byte[] b();
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cfk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */