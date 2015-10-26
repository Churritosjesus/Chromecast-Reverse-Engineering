	
	    public crx(com.google.android.gms.common.data.DataHolder p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public final String a()
	    {
	        return this.a("account_name");
	    }
	
	
	    public final String b()
	    {
	        String v0_1 = this.a("display_name");
	        if (android.text.TextUtils.isEmpty(v0_1)) {
	            v0_1 = this.a("account_name");
	        }
	        return v0_1;
	    }
	
	
	    public final String c()
	    {
	        return crz.a.a(this.a("avatar"));
	    }
	
	
	    public final String d()
	    {
	        return this.a("page_gaia_id");
	    }
	
	
	    public final String e()
	    {
	        return crz.a.a(this.a("cover_photo_url"));
	    }
	
