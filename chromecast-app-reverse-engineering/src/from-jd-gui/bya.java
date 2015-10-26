import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

public class bya
{
  private DataHolder a;
  private int b;
  private int c;
  
  public bya(DataHolder paramDataHolder, int paramInt)
  {
    this.a = ((DataHolder)a.c(paramDataHolder));
    if ((paramInt >= 0) && (paramInt < this.a.h)) {}
    for (boolean bool = true;; bool = false)
    {
      a.a(bool);
      this.b = paramInt;
      this.c = this.a.a(this.b);
      return;
    }
  }
  
  public final String a(String paramString)
  {
    DataHolder localDataHolder = this.a;
    int i = this.b;
    int j = this.c;
    if ((localDataHolder.c == null) || (!localDataHolder.c.containsKey(paramString))) {
      throw new IllegalArgumentException("No such column: " + paramString);
    }
    if (localDataHolder.b()) {
      throw new IllegalArgumentException("Buffer is closed.");
    }
    if ((i < 0) || (i >= localDataHolder.h)) {
      throw new CursorIndexOutOfBoundsException(i, localDataHolder.h);
    }
    return localDataHolder.d[j].getString(i, localDataHolder.c.getInt(paramString));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof bya))
    {
      paramObject = (bya)paramObject;
      bool1 = bool2;
      if (a.e(Integer.valueOf(((bya)paramObject).b), Integer.valueOf(this.b)))
      {
        bool1 = bool2;
        if (a.e(Integer.valueOf(((bya)paramObject).c), Integer.valueOf(this.c)))
        {
          bool1 = bool2;
          if (((bya)paramObject).a == this.a) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), this.a });
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */