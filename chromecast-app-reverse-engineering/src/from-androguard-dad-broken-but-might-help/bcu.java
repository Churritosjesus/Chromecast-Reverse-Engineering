	private aea n
	
	    public bcu(String p5, String p6, aea p7, adz p8)
	    {
	        aec v0_5;
	        int v2_0 = String.valueOf(blf.y(com.google.android.apps.chromecast.app.SetupApplication.a()));
	        aec v0_3 = String.valueOf("/chromecast/offers/_/offers/redeem");
	        if (v0_3.length() == 0) {
	            v0_5 = new String(v2_0);
	        } else {
	            v0_5 = v2_0.concat(v0_3);
	        }
	        aec v0_7 = android.net.Uri.parse(v0_5).buildUpon();
	        v0_7.appendQueryParameter("offerId", p6);
	        if (!android.text.TextUtils.isEmpty(p5)) {
	            v0_7.appendQueryParameter("code", p5);
	        }
	        this("BrowseContent", v0_7.build().toString(), p8);
	        this.i = new aec(blf.x(com.google.android.apps.chromecast.app.SetupApplication.a().getApplicationContext()), 1, 1065353216);
	        this.n = p7;
	        return;
	    }
	
	
	    public final synthetic void a(Object p5)
	    {
	        try {
	            this.n.a(((ddf) dew.a(new ddf(), ((byte[]) p5))));
	        } catch (String v0_4) {
	            String v0_6 = String.valueOf(v0_4.getMessage());
	            if (v0_6.length() == 0) {
	                String v0_8 = new String("Couldn\'t parse RedemptionResponse: ");
	            } else {
	                v0_8 = "Couldn\'t parse RedemptionResponse: ".concat(v0_6);
	            }
	            android.util.Log.w("RedeemOfferRequest", v0_8);
	        }
	        return;
	    }
	
	
	    public final String g()
	    {
	        return 0;
	    }
	
	
	    public final String h()
	    {
	        return 0;
	    }
	
