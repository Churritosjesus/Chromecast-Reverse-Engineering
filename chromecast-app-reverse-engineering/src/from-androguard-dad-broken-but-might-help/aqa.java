	private synthetic apu a
	
	    aqa(apu p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(String p5, String p6)
	    {
	        if (!p6.equals("ERROR")) {
	            apu.e(this.a);
	            apu v0_3 = new Object[1];
	            v0_3[0] = p6;
	            apu.a(this.a, 0);
	            try {
	                apu.b(this.a, new org.json.JSONObject(p6).getString("code"));
	            } catch (apu v0) {
	                apu.e(this.a);
	                apu v0_9 = new Object[1];
	                v0_9[0] = p6;
	                apu.c(this.a);
	            }
	        } else {
	            apu.e(this.a);
	            apu.c(this.a);
	        }
	        return;
	    }
	
