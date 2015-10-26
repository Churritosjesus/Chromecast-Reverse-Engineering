	final synthetic com.google.android.libraries.view.pagingindicator.PagingIndicator a
	
	    public czy(com.google.android.libraries.view.pagingindicator.PagingIndicator p11, int p12, int p13, int p14, dah p15)
	    {
	        float v4;
	        dab v0_0 = 0;
	        this.a = p11;
	        this(p11, p15);
	        this.setDuration(com.google.android.libraries.view.pagingindicator.PagingIndicator.d(p11));
	        this.setInterpolator(com.google.android.libraries.view.pagingindicator.PagingIndicator.e(p11));
	        if (p13 <= p12) {
	            v4 = (com.google.android.libraries.view.pagingindicator.PagingIndicator.f(p11)[p13] - com.google.android.libraries.view.pagingindicator.PagingIndicator.g(p11));
	        } else {
	            v4 = (Math.min(com.google.android.libraries.view.pagingindicator.PagingIndicator.f(p11)[p12], com.google.android.libraries.view.pagingindicator.PagingIndicator.b(p11)) - com.google.android.libraries.view.pagingindicator.PagingIndicator.g(p11));
	        }
	        float v5;
	        czy v1_8 = (com.google.android.libraries.view.pagingindicator.PagingIndicator.f(p11)[p13] - com.google.android.libraries.view.pagingindicator.PagingIndicator.g(p11));
	        if (p13 <= p12) {
	            v5 = (Math.max(com.google.android.libraries.view.pagingindicator.PagingIndicator.f(p11)[p12], com.google.android.libraries.view.pagingindicator.PagingIndicator.b(p11)) + com.google.android.libraries.view.pagingindicator.PagingIndicator.g(p11));
	        } else {
	            v5 = (com.google.android.libraries.view.pagingindicator.PagingIndicator.f(p11)[p13] + com.google.android.libraries.view.pagingindicator.PagingIndicator.g(p11));
	        }
	        com.google.android.libraries.view.pagingindicator.PagingIndicator v2_12 = (com.google.android.libraries.view.pagingindicator.PagingIndicator.f(p11)[p13] + com.google.android.libraries.view.pagingindicator.PagingIndicator.g(p11));
	        int[] v3_4 = new dac[p14];
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.a(p11, v3_4);
	        int[] v3_5 = new int[p14];
	        if (v4 == v1_8) {
	            czy v1_9 = new float[2];
	            v1_9[0] = v5;
	            v1_9[1] = v2_12;
	            this.setFloatValues(v1_9);
	            while (v0_0 < p14) {
	                com.google.android.libraries.view.pagingindicator.PagingIndicator.h(p11)[v0_0] = new dac(p11, (p12 - v0_0), new czx(p11, com.google.android.libraries.view.pagingindicator.PagingIndicator.f(p11)[(p12 - v0_0)]));
	                v3_5[v0_0] = (p12 - v0_0);
	                v0_0++;
	            }
	            this.addUpdateListener(new daa(this, p11));
	        } else {
	            com.google.android.libraries.view.pagingindicator.PagingIndicator v2_15 = new float[2];
	            v2_15[0] = v4;
	            v2_15[1] = v1_8;
	            this.setFloatValues(v2_15);
	            while (v0_0 < p14) {
	                com.google.android.libraries.view.pagingindicator.PagingIndicator.h(p11)[v0_0] = new dac(p11, (p12 + v0_0), new dag(p11, com.google.android.libraries.view.pagingindicator.PagingIndicator.f(p11)[(p12 + v0_0)]));
	                v3_5[v0_0] = (p12 + v0_0);
	                v0_0++;
	            }
	            this.addUpdateListener(new czz(this, p11));
	        }
	        this.addListener(new dab(this, p11, v3_5, v4, v5));
	        return;
	    }
	
