import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class bqo
{
  int a;
  ByteArrayOutputStream b = new ByteArrayOutputStream();
  
  public bqo(bqn parambqn) {}
  
  public final boolean a(bsi parambsi)
  {
    a.c(parambsi);
    boolean bool;
    if (this.a + 1 > brz.g()) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      Object localObject = this.c.a(parambsi, false);
      if (localObject == null)
      {
        this.c.d.a().a(parambsi, "Error formatting hit");
        bool = true;
      }
      else
      {
        localObject = ((String)localObject).getBytes();
        int j = localObject.length;
        if (j > brz.c())
        {
          this.c.d.a().a(parambsi, "Hit size exceeds the maximum size limit");
          bool = true;
        }
        else
        {
          int i = j;
          if (this.b.size() > 0) {
            i = j + 1;
          }
          if (this.b.size() + i > ((Integer)bqd.t.a()).intValue()) {
            bool = false;
          } else {
            try
            {
              if (this.b.size() > 0) {
                this.b.write(bqn.c());
              }
              this.b.write((byte[])localObject);
              this.a += 1;
              bool = true;
            }
            catch (IOException parambsi)
            {
              this.c.e("Failed to write payload when batching hits", parambsi);
              bool = true;
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */