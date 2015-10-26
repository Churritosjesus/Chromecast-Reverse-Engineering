	static final synthetic I a
	static final synthetic I b
	
	    static azz()
	    {
	        NoSuchFieldError v0_2 = new int[android.net.NetworkInfo$State.values().length];
	        azz.b = v0_2;
	        try {
	            azz.b[android.net.NetworkInfo$State.CONNECTED.ordinal()] = 1;
	            try {
	                azz.b[android.net.NetworkInfo$State.CONNECTING.ordinal()] = 2;
	            } catch (NoSuchFieldError v0) {
	            }
	            try {
	                azz.b[android.net.NetworkInfo$State.DISCONNECTED.ordinal()] = 3;
	            } catch (NoSuchFieldError v0) {
	            }
	            NoSuchFieldError v0_8 = new int[bfu.values().length];
	            azz.a = v0_8;
	            try {
	                azz.a[bfu.b.ordinal()] = 1;
	            } catch (NoSuchFieldError v0) {
	            }
	            try {
	                azz.a[bfu.c.ordinal()] = 2;
	                try {
	                    azz.a[bfu.f.ordinal()] = 3;
	                    try {
	                        azz.a[bfu.h.ordinal()] = 4;
	                    } catch (NoSuchFieldError v0) {
	                    }
	                    return;
	                } catch (NoSuchFieldError v0) {
	                }
	            } catch (NoSuchFieldError v0) {
	            }
	        } catch (NoSuchFieldError v0) {
	        }
	    }
	
