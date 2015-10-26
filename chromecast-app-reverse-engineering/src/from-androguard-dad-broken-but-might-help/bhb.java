	final synthetic bha a
	private synthetic java.lang.String b
	private synthetic android.content.Context c
	
	    bhb(bha p1, String p2, android.content.Context p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        bha.a(this.a);
	        bha.a(this.a, com.google.android.apps.chromecast.app.SetupApplication.a().l());
	        bha.b(this.a).b();
	        if (bha.b(this.a).a(this.b, new bhc(this), 0)) {
	            android.widget.Toast v0_7 = this.c;
	            String v1_3 = this.c;
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = this.b;
	            android.widget.Toast.makeText(v0_7, v1_3.getString(b.df, v3_1), 0).show();
	        }
	        return;
	    }
	
