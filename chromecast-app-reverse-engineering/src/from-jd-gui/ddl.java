import java.io.Serializable;

public abstract class ddl
  implements Serializable, Iterable
{
  public static final ddl a = new ddy(new byte[0]);
  
  public static ddl a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new ddy(arrayOfByte);
  }
  
  protected abstract int a(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract ddm a();
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < 0) {
      throw new IndexOutOfBoundsException(30 + "Source offset < 0: " + paramInt1);
    }
    if (paramInt2 < 0) {
      throw new IndexOutOfBoundsException(30 + "Target offset < 0: " + paramInt2);
    }
    if (paramInt3 < 0) {
      throw new IndexOutOfBoundsException(23 + "Length < 0: " + paramInt3);
    }
    if (paramInt1 + paramInt3 > b()) {
      throw new IndexOutOfBoundsException(34 + "Source end offset < 0: " + (paramInt1 + paramInt3));
    }
    if (paramInt2 + paramInt3 > paramArrayOfByte.length) {
      throw new IndexOutOfBoundsException(34 + "Target end offset < 0: " + (paramInt2 + paramInt3));
    }
    if (paramInt3 > 0) {
      b(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public abstract int b();
  
  protected abstract void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public final byte[] c()
  {
    int i = b();
    byte[] arrayOfByte;
    if (i == 0) {
      arrayOfByte = ddv.b;
    }
    for (;;)
    {
      return arrayOfByte;
      arrayOfByte = new byte[i];
      b(arrayOfByte, 0, 0, i);
    }
  }
  
  public String toString()
  {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()) });
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */