	
	    public final void a(int p6, android.os.Bundle p7, android.os.Bundle p8)
	    {
	        if (a.b(3)) {
	            new StringBuilder("Bundle callback: status=").append(p6).append("\nresolution=").append(p7).append("\nbundle=").append(p8).toString();
	            a.b(3);
	        }
	        if (p6 == 0) {
	            0.a(new bxl(p8.getString("account"), p8.getString("pagegaiaid"), p8.getInt("scope")));
	        } else {
	            if (a.b(5)) {
	                android.util.Log.w("PeopleClient", "Non-success data changed callback received.");
	            }
	        }
	        return;
	    }
	
