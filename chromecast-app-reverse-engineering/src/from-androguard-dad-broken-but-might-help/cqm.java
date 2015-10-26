	private static android.graphics.Bitmap c
	
	    public cqm(android.content.Context p2, com.google.android.gms.common.api.GoogleApiClient p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public static android.graphics.Bitmap a(android.content.Context p2)
	    {
	        if (cqm.c == null) {
	            cqm.c = android.graphics.BitmapFactory.decodeResource(p2.getResources(), a.hP);
	        }
	        return cqm.c;
	    }
	
	
	    protected final void a(cqq p3, android.graphics.Bitmap p4)
	    {
	        if (p4 != null) {
	            super.a(p3, p4);
	        } else {
	            p3.e.setImageBitmap(cqm.a(this.a));
	        }
	        return;
	    }
	
