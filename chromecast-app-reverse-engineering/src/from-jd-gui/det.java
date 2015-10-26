import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class det
  implements Cloneable
{
  List a = new ArrayList();
  private dh b;
  private Object c;
  
  private byte[] c()
  {
    byte[] arrayOfByte = new byte[a()];
    a(dep.a(arrayOfByte, 0, arrayOfByte.length));
    return arrayOfByte;
  }
  
  final int a()
  {
    int j;
    if (this.c != null)
    {
      j = this.b.a(this.c);
      return j;
    }
    Iterator localIterator = this.a.iterator();
    dex localdex;
    for (int i = 0;; i = localdex.b.length + (j + 0) + i)
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
      localdex = (dex)localIterator.next();
      j = dep.d(localdex.a);
    }
  }
  
  final void a(dep paramdep)
  {
    if (this.c != null) {
      this.b.a(this.c, paramdep);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (dex)localIterator.next();
        paramdep.c(((dex)localObject).a);
        localObject = ((dex)localObject).b;
        int i = localObject.length;
        if (paramdep.a.remaining() < i) {
          break label93;
        }
        paramdep.a.put((byte[])localObject, 0, i);
      }
    }
    label93:
    throw new deq(paramdep.a.position(), paramdep.a.limit());
  }
  
  public final det b()
  {
    int i = 0;
    det localdet = new det();
    for (;;)
    {
      try
      {
        localdet.b = this.b;
        if (this.a == null)
        {
          localdet.a = null;
          if (this.c != null)
          {
            if ((this.c instanceof dew)) {
              localdet.c = ((dew)this.c).c();
            }
          }
          else {
            return localdet;
          }
        }
        else
        {
          localdet.a.addAll(this.a);
          continue;
        }
        if (!(this.c instanceof byte[])) {
          break label118;
        }
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new AssertionError(localCloneNotSupportedException);
      }
      localCloneNotSupportedException.c = ((byte[])this.c).clone();
      continue;
      label118:
      Object localObject1;
      Object localObject2;
      if ((this.c instanceof byte[][]))
      {
        localObject1 = (byte[][])this.c;
        localObject2 = new byte[localObject1.length][];
        localCloneNotSupportedException.c = localObject2;
        for (i = 0; i < localObject1.length; i++) {
          localObject2[i] = ((byte[])localObject1[i].clone());
        }
      }
      else if ((this.c instanceof boolean[]))
      {
        localCloneNotSupportedException.c = ((boolean[])this.c).clone();
      }
      else if ((this.c instanceof int[]))
      {
        localCloneNotSupportedException.c = ((int[])this.c).clone();
      }
      else if ((this.c instanceof long[]))
      {
        localCloneNotSupportedException.c = ((long[])this.c).clone();
      }
      else if ((this.c instanceof float[]))
      {
        localCloneNotSupportedException.c = ((float[])this.c).clone();
      }
      else if ((this.c instanceof double[]))
      {
        localCloneNotSupportedException.c = ((double[])this.c).clone();
      }
      else if ((this.c instanceof dew[]))
      {
        localObject2 = (dew[])this.c;
        localObject1 = new dew[localObject2.length];
        localCloneNotSupportedException.c = localObject1;
        while (i < localObject2.length)
        {
          localObject1[i] = localObject2[i].c();
          i++;
        }
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (!(paramObject instanceof det)) {
        continue;
      }
      paramObject = (det)paramObject;
      if ((this.c != null) && (((det)paramObject).c != null))
      {
        bool1 = bool2;
        if (this.b != ((det)paramObject).b) {
          continue;
        }
        throw new NullPointerException();
      }
      if ((this.a != null) && (((det)paramObject).a != null))
      {
        bool1 = this.a.equals(((det)paramObject).a);
        continue;
      }
      try
      {
        bool1 = Arrays.equals(c(), ((det)paramObject).c());
      }
      catch (IOException paramObject)
      {
        throw new IllegalStateException((Throwable)paramObject);
      }
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(c());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\det.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */