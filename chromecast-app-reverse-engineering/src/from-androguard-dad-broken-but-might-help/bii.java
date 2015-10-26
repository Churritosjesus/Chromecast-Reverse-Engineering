	final synthetic bhf a
	
	    bii(bhf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p10)
	    {
	        bhf.a(this.a).u = 0;
	        bhf.a(this.a).x();
	        bdu v2_0 = bhf.a(this.a).t();
	        bij v3_0 = this.a;
	        int v4_0 = this.a;
	        anf v5_0 = v4_0.a.iterator();
	        while (v5_0.hasNext()) {
	            com.google.android.apps.chromecast.app.DeviceSettingsActivity v0_8 = ((bfs) v5_0.next());
	            if (v0_8.a.equals(v4_0.q().y)) {
	            }
	            bhf.a(v3_0, bmi.a(v2_0, v0_8));
	            bhf.c(this.a).a(bhf.a(this.a).b, "networkSelectorFragment");
	            if (v2_0 == null) {
	                com.google.android.apps.chromecast.app.DeviceSettingsActivity v0_14 = bhf.a(this.a);
	                bdu v2_3 = bhf.a(this.a).p;
	                bij v3_5 = new bij(this);
	                if (!v0_14.t()) {
	                    v2_3.a(4096, 0, 0, new anf(v0_14, v2_3, v3_5));
	                } else {
	                    v3_5.a();
	                }
	            } else {
	                bhf.a(this.a).y();
	            }
	            return;
	        }
	        v0_8 = 0;
	    }
	
