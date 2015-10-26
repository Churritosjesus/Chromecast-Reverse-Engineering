import android.content.res.Resources;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;

final class abv
  extends abw
{
  abv(String[] paramArrayOfString, Uri paramUri1, Uri paramUri2)
  {
    super(paramArrayOfString, paramUri1, paramUri2);
  }
  
  public final CharSequence a(Resources paramResources, int paramInt, CharSequence paramCharSequence)
  {
    return ContactsContract.CommonDataKinds.Email.getTypeLabel(paramResources, paramInt, paramCharSequence);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */