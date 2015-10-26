	private final android.app.Activity a
	private final j b
	private final android.content.Intent c
	private final  d
	
	    public bym(android.app.Activity p2, android.content.Intent p3, int p4)
	    {
	        this.a = p2;
	        this.b = 0;
	        this.c = p3;
	        this.d = p4;
	        return;
	    }
	
	
	    public bym(j p2, android.content.Intent p3, int p4)
	    {
	        this.a = 0;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        return;
	    }
	
	
	    public final void onClick(android.content.DialogInterface p4, int p5)
	    {
	        try {
	            if ((this.c == null) || (this.b == null)) {
	                if (this.c == null) {
	                    p4.dismiss();
	                } else {
	                    this.a.startActivityForResult(this.c, this.d);
	                }
	            } else {
	                this.b.a(this.c, this.d);
	            }
	        } catch (android.app.Activity v0) {
	            android.util.Log.e("SettingsRedirect", "Can\'t redirect to app settings for Google Play services");
	        }
	        return;
	    }
	
