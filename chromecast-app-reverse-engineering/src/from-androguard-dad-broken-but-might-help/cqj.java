	
	    public cqj(android.content.Context p2, com.google.android.gms.common.api.GoogleApiClient p3)
	    {
	        this(p2, p3, 1);
	        return;
	    }
	
	
	    public static android.graphics.Bitmap a(android.content.Context p2)
	    {
	        return a.a(android.graphics.BitmapFactory.decodeResource(p2.getResources(), a.hQ));
	    }
	
	
	    static synthetic void a(cqj p7, com.google.android.gms.common.api.Status p8, android.os.ParcelFileDescriptor p9, cqq p10, int p11)
	    {
	        p7.a(p8, p9, -1, -1, 0, p10);
	        return;
	    }
	
	
	    public final void a(android.widget.ImageView p7, String p8, String p9, int p10)
	    {
	        this.a(new cqk(this, p7, p8, p9, p10));
	        return;
	    }
	
	
	    protected final void a(cqq p3, android.graphics.Bitmap p4)
	    {
	        if (p4 != null) {
	            super.a(p3, p4);
	        } else {
	            p3.e.setImageBitmap(cqj.a(this.a));
	        }
	        return;
	    }
	
