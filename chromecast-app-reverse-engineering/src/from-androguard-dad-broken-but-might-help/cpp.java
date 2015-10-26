	
	    public cpp()
	    {
	        return;
	    }
	
	
	    public bwj a(com.google.android.gms.common.api.GoogleApiClient p4, cpq p5)
	    {
	        if (android.util.Log.isLoggable("PeopleClientCall", 3)) {
	            Object[] v1_2 = new Object[1];
	            v1_2[0] = p5;
	            a.a("loadOwners", v1_2);
	        }
	        return p4.a(new cle(this, p4, p5));
	    }
	
