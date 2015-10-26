	
	    public cpv()
	    {
	        return;
	    }
	
	
	    public bwj sendFeedback(com.google.android.gms.common.api.GoogleApiClient p5, String p6, int p7)
	    {
	        if (android.util.Log.isLoggable("PeopleClientCall", 3)) {
	            Object[] v1_2 = new Object[2];
	            v1_2[0] = p6;
	            v1_2[1] = Integer.valueOf(p7);
	            a.a("sendFeedback", v1_2);
	        }
	        return p5.b(new clk(this, p5, p6, p7));
	    }
	
	
	    public bwj sendFeedback(com.google.android.gms.common.api.GoogleApiClient p5, String[] p6, int p7)
	    {
	        if (android.util.Log.isLoggable("PeopleClientCall", 3)) {
	            cll v1_2 = new Object[2];
	            v1_2[0] = p6;
	            v1_2[1] = Integer.valueOf(p7);
	            a.a("sendFeedback", v1_2);
	        }
	        return p5.b(new cll(this, p5, android.text.TextUtils.join(csi.a, p6), p7));
	    }
	
