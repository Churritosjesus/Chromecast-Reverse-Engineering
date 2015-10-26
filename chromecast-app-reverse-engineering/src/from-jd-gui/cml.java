import java.io.IOException;

public class cml
  extends IOException
{
  private static final long serialVersionUID = -6947486886997889499L;
  
  public cml()
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.");
  }
  
  cml(int paramInt1, int paramInt2)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + paramInt1 + " limit " + paramInt2 + ").");
  }
  
  public cml(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */