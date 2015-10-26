import android.content.res.Resources;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Phone;

final class abu
  extends abw
{
  abu(String[] paramArrayOfString, Uri paramUri1, Uri paramUri2)
  {
    super(paramArrayOfString, paramUri1, paramUri2);
  }
  
  public final CharSequence a(Resources paramResources, int paramInt, CharSequence paramCharSequence)
  {
    return ContactsContract.CommonDataKinds.Phone.getTypeLabel(paramResources, paramInt, paramCharSequence);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */