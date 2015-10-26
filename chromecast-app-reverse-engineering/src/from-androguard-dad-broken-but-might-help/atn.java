	private synthetic atf a
	
	    atn(atf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private varargs Void a()
	    {
	        atf v2 = this.a;
	        while (!v2.k.isEmpty()) {
	            Throwable v0_4 = ((atb) v2.k.get(0));
	            adv v1_1 = v2.b.getString("current_account_name", 0);
	            if (android.text.TextUtils.isEmpty(v1_1)) {
	                v1_1 = bls.b(v2.a);
	            }
	            if (!android.text.TextUtils.isEmpty(v1_1)) {
	                try {
	                    Long v4_0 = android.os.SystemClock.elapsedRealtime();
	                    adv v1_3 = v2.a(v2.a, v1_1, v0_4.g());
	                } catch (adv v1_4) {
	                    java.util.ArrayList v3_5 = String.valueOf(v1_4);
	                    new StringBuilder((String.valueOf(v3_5).length() + 28)).append("Could not get token (auth): ").append(v3_5);
	                    v0_4.b(new adf("no token", v1_4));
	                }
	                if (v1_3 == null) {
	                    return 0;
	                } else {
	                    java.util.ArrayList v3_9 = new Object[1];
	                    v3_9[0] = Long.valueOf((android.os.SystemClock.elapsedRealtime() - v4_0));
	                    v0_4.l = v1_3;
	                    v0_4.m = new ato(v2, v1_3);
	                    v2.l.a(v0_4);
	                }
	            } else {
	                v0_4.b(new adf("no account"));
	            }
	            try {
	                v2.k.remove(v0_4);
	            } catch (Throwable v0_5) {
	                throw v0_5;
	            }
	        }
	        return 0;
	    }
	
	
	    protected final synthetic Object doInBackground(Object[] p2)
	    {
	        return this.a();
	    }
	
