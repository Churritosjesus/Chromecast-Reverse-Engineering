import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;

final class abt
{
  public static final abw a;
  public static final abw b;
  
  static
  {
    Uri localUri2 = ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI;
    Uri localUri1 = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
    a = new abu(new String[] { "display_name", "data1", "data2", "data3", "contact_id", "_id", "photo_thumb_uri", "display_name_source", "lookup", "mimetype" }, localUri2, localUri1);
    localUri1 = ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI;
    localUri2 = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
    b = new abv(new String[] { "display_name", "data1", "data2", "data3", "contact_id", "_id", "photo_thumb_uri", "display_name_source", "lookup", "mimetype" }, localUri1, localUri2);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */