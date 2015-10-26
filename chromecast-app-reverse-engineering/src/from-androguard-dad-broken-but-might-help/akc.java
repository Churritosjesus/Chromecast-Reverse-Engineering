	private synthetic android.os.Bundle a
	private synthetic akl b
	private synthetic aka c
	
	    akc(aka p1, android.os.Bundle p2, akl p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void a(afq p5)
	    {
	        this.c.b.b(akn.a(this.c.b.f, "Caught exception", p5.getMessage()));
	        return;
	    }
	
	
	    public final void a(org.json.JSONObject p5)
	    {
	        try {
	            this.a.putString("com.facebook.platform.extra.USER_ID", p5.getString("id"));
	            this.c.b(this.b, this.a);
	        } catch (akn v0_3) {
	            this.c.b.b(akn.a(this.c.b.f, "Caught exception", v0_3.getMessage()));
	        }
	        return;
	    }
	
