	private synthetic axd a
	
	    axf(axd p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onSharedPreferenceChanged(android.content.SharedPreferences p3, String p4)
	    {
	        if ((p4.equals("hendrixDiscovered")) || ((p4.equals("nonhendrixDiscovered")) || (p4.equals("manualAudio")))) {
	            axd v0_6 = axd.a(p3);
	            if (this.a.i != v0_6) {
	                this.a.i = v0_6;
	                this.a.a();
	                this.a.b();
	            }
	        }
	        return;
	    }
	
