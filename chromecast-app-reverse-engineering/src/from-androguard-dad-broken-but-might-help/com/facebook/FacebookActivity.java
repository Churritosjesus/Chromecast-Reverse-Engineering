	private static java.lang.String e
	private static java.lang.String f
	private j g
	
	    static FacebookActivity()
	    {
	        com.facebook.FacebookActivity.e = "PassThrough";
	        com.facebook.FacebookActivity.f = "SingleFragment";
	        return;
	    }
	
	
	    public FacebookActivity()
	    {
	        return;
	    }
	
	
	    public void onConfigurationChanged(android.content.res.Configuration p2)
	    {
	        super.onConfigurationChanged(p2);
	        if (this.g != null) {
	            this.g.onConfigurationChanged(p2);
	        }
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p5)
	    {
	        super.onCreate(p5);
	        this.setContentView(a.cY);
	        af v1_0 = this.getIntent();
	        if (!com.facebook.FacebookActivity.e.equals(v1_0.getAction())) {
	            int v2_1 = this.b;
	            akq v0_4 = v2_1.a(com.facebook.FacebookActivity.f);
	            if (v0_4 == null) {
	                if (!"FacebookDialogFragment".equals(v1_0.getAction())) {
	                    v0_4 = new akq();
	                    v0_4.c(1);
	                    v2_1.a().a(a.cW, v0_4, com.facebook.FacebookActivity.f).b();
	                } else {
	                    v0_4 = new ain();
	                    v0_4.c(1);
	                    v0_4.a(v2_1, com.facebook.FacebookActivity.f);
	                }
	            }
	            this.g = v0_4;
	        } else {
	            akq v0_9 = this.getIntent();
	            this.setResult(0, aix.a(v0_9, 0, aix.a(aix.a(v0_9))));
	            this.finish();
	        }
	        return;
	    }
	
