	
	    public cpt()
	    {
	        return;
	    }
	
	
	    public bwj a(com.google.android.gms.common.api.GoogleApiClient p2, String p3, String p4)
	    {
	        return this.b(p2, p3, p4);
	    }
	
	
	    public bwj a(com.google.android.gms.common.api.GoogleApiClient p8, String p9, String p10, int p11, int p12)
	    {
	        if (android.util.Log.isLoggable("PeopleClientCall", 3)) {
	            cpt v1_1 = new Object[4];
	            v1_1[0] = p9;
	            v1_1[1] = p10;
	            v1_1[2] = Integer.valueOf(p11);
	            v1_1[3] = Integer.valueOf(1);
	            a.a("loadOwnerAvatar", v1_1);
	        }
	        return p8.a(new clg(this, p8, p9, p10, p11, 1));
	    }
	
	
	    public bwj b(com.google.android.gms.common.api.GoogleApiClient p4, String p5, String p6)
	    {
	        if (android.util.Log.isLoggable("PeopleClientCall", 3)) {
	            Object[] v1_2 = new Object[2];
	            v1_2[0] = p5;
	            v1_2[1] = p6;
	            a.a("loadOwnerCoverPhoto", v1_2);
	        }
	        return p4.a(new clh(this, p4, p5, p6));
	    }
	
