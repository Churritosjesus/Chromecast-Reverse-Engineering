	public static final android.os.Parcelable$Creator CREATOR
	public final java.lang.CharSequence a
	public final java.lang.CharSequence b
	public final android.graphics.Bitmap c
	public final android.net.Uri d
	private final java.lang.String e
	private final java.lang.CharSequence f
	private final android.os.Bundle g
	private java.lang.Object h
	
	    static cf()
	    {
	        cf.CREATOR = new cg();
	        return;
	    }
	
	
	    cf(android.os.Parcel p3)
	    {
	        this.e = p3.readString();
	        this.a = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p3));
	        this.b = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p3));
	        this.f = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p3));
	        this.c = ((android.graphics.Bitmap) p3.readParcelable(0));
	        this.d = ((android.net.Uri) p3.readParcelable(0));
	        this.g = p3.readBundle();
	        return;
	    }
	
	
	    cf(String p1, CharSequence p2, CharSequence p3, CharSequence p4, android.graphics.Bitmap p5, android.net.Uri p6, android.os.Bundle p7)
	    {
	        this.e = p1;
	        this.a = p2;
	        this.b = p3;
	        this.f = p4;
	        this.c = p5;
	        this.d = p6;
	        this.g = p7;
	        return;
	    }
	
	
	    public static cf a(Object p2)
	    {
	        if ((p2 != null) && (android.os.Build$VERSION.SDK_INT >= 21)) {
	            ch v1_2 = new ch();
	            v1_2.a = ((android.media.MediaDescription) p2).getMediaId();
	            v1_2.b = ((android.media.MediaDescription) p2).getTitle();
	            v1_2.c = ((android.media.MediaDescription) p2).getSubtitle();
	            v1_2.d = ((android.media.MediaDescription) p2).getDescription();
	            v1_2.e = ((android.media.MediaDescription) p2).getIconBitmap();
	            v1_2.f = ((android.media.MediaDescription) p2).getIconUri();
	            v1_2.g = ((android.media.MediaDescription) p2).getExtras();
	            cf v0_22 = v1_2.a();
	            v0_22.h = p2;
	        } else {
	            v0_22 = 0;
	        }
	        return v0_22;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder().append(this.a).append(", ").append(this.b).append(", ").append(this.f).toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p4, int p5)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 21) {
	            if ((this.h == null) && (android.os.Build$VERSION.SDK_INT >= 21)) {
	                android.media.MediaDescription$Builder v1_2 = new android.media.MediaDescription$Builder();
	                ((android.media.MediaDescription$Builder) v1_2).setMediaId(this.e);
	                ((android.media.MediaDescription$Builder) v1_2).setTitle(this.a);
	                ((android.media.MediaDescription$Builder) v1_2).setSubtitle(this.b);
	                ((android.media.MediaDescription$Builder) v1_2).setDescription(this.f);
	                ((android.media.MediaDescription$Builder) v1_2).setIconBitmap(this.c);
	                ((android.media.MediaDescription$Builder) v1_2).setIconUri(this.d);
	                ((android.media.MediaDescription$Builder) v1_2).setExtras(this.g);
	                this.h = ((android.media.MediaDescription$Builder) v1_2).build();
	                android.media.MediaDescription v0_18 = this.h;
	            } else {
	                v0_18 = this.h;
	            }
	            ((android.media.MediaDescription) v0_18).writeToParcel(p4, p5);
	        } else {
	            p4.writeString(this.e);
	            android.text.TextUtils.writeToParcel(this.a, p4, p5);
	            android.text.TextUtils.writeToParcel(this.b, p4, p5);
	            android.text.TextUtils.writeToParcel(this.f, p4, p5);
	            p4.writeParcelable(this.c, p5);
	            p4.writeParcelable(this.d, p5);
	            p4.writeBundle(this.g);
	        }
	        return;
	    }
	
