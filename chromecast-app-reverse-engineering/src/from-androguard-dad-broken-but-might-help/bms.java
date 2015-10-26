	final synthetic  a
	final synthetic com.google.android.apps.chromecast.app.widget.ReusableImageView b
	
	    public bms(com.google.android.apps.chromecast.app.widget.ReusableImageView p1, boolean p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void a(aef p4)
	    {
	        String v0_1;
	        Object[] v1 = new Object[1];
	        if (p4 != null) {
	            v0_1 = p4.getMessage();
	        } else {
	            v0_1 = "null";
	        }
	        v1[0] = v0_1;
	        return;
	    }
	
	
	    public final void a(aex p6, boolean p7)
	    {
	        if (android.text.TextUtils.equals(com.google.android.apps.chromecast.app.widget.ReusableImageView.a(this.b), p6.c)) {
	            Object[] v0_3 = p6.a;
	            if (v0_3 == null) {
	                Object[] v0_4 = new Object[1];
	                v0_4[0] = p6.c;
	            } else {
	                String v1_2 = new Object[2];
	                v1_2[0] = p6.c;
	                v1_2[1] = Boolean.valueOf(p7);
	                this.b.post(new bmt(this, p7, v0_3));
	            }
	        } else {
	            Object[] v0_5 = new Object[2];
	            v0_5[0] = p6.c;
	            v0_5[1] = com.google.android.apps.chromecast.app.widget.ReusableImageView.a(this.b);
	        }
	        return;
	    }
	
