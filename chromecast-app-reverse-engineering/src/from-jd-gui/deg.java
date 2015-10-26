import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

final class deg
  extends ddl
{
  private static final int[] b;
  private static final long serialVersionUID = 1L;
  private int c;
  
  static
  {
    int i = 1;
    ArrayList localArrayList = new ArrayList();
    int j = 1;
    for (;;)
    {
      int k = j;
      if (i <= 0) {
        break;
      }
      localArrayList.add(Integer.valueOf(i));
      j = i;
      i = k + i;
    }
    localArrayList.add(Integer.valueOf(Integer.MAX_VALUE));
    b = new int[localArrayList.size()];
    for (i = 0; i < b.length; i++) {
      b[i] = ((Integer)localArrayList.get(i)).intValue();
    }
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 + paramInt3 <= 0) {
      throw new NullPointerException();
    }
    if (paramInt2 >= 0) {
      throw new NullPointerException();
    }
    throw new NullPointerException();
  }
  
  public final ddm a()
  {
    return new dei(this);
  }
  
  public final int b()
  {
    return 0;
  }
  
  protected final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 + paramInt3 <= 0) {
      throw new NullPointerException();
    }
    if (paramInt1 >= 0) {
      throw new NullPointerException();
    }
    throw new NullPointerException();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof ddl)) {
        bool = false;
      } else if (((ddl)paramObject).b() != 0) {
        bool = false;
      }
    }
  }
  
  public final int hashCode()
  {
    int j = this.c;
    int i = j;
    if (j == 0)
    {
      j = a(0, 0, 0);
      i = j;
      if (j == 0) {
        i = 1;
      }
      this.c = i;
    }
    return i;
  }
  
  final Object writeReplace()
  {
    return new ddy(c());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\deg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */