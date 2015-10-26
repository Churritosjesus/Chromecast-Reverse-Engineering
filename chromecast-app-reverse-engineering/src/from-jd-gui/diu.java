import java.util.zip.Inflater;

final class diu
  extends Inflater
{
  diu(dis paramdis) {}
  
  public final int inflate(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j = super.inflate(paramArrayOfByte, paramInt1, paramInt2);
    int i = j;
    if (j == 0)
    {
      i = j;
      if (needsDictionary())
      {
        setDictionary(diy.a);
        i = super.inflate(paramArrayOfByte, paramInt1, paramInt2);
      }
    }
    return i;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\diu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */