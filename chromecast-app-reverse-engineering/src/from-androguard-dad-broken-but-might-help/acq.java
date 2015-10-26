	final synthetic acp a
	private synthetic java.util.ArrayList b
	
	    acq(acp p1, java.util.ArrayList p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final void a(java.util.Map p7)
	    {
	        java.util.Iterator v2 = this.b.iterator();
	        while (v2.hasNext()) {
	            ada v0_3 = ((ada) v2.next());
	            if ((acx.a(v0_3.g().g)) && (this.a.a.getText().getSpanStart(v0_3) != -1)) {
	                acx v1_13 = acb.b(this.a.a, ((acx) p7.get(acb.a(v0_3.g().d).toLowerCase())));
	                if (v1_13 != null) {
	                    acb.e(this.a.a).post(new acr(this, v0_3, v1_13));
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a(java.util.Set p1)
	    {
	        return;
	    }
	
