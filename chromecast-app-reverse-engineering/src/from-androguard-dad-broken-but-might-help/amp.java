	static final synthetic I a
	
	    static amp()
	    {
	        NoSuchFieldError v0_2 = new int[android.net.NetworkInfo$State.values().length];
	        amp.a = v0_2;
	        try {
	            amp.a[android.net.NetworkInfo$State.CONNECTED.ordinal()] = 1;
	            try {
	                amp.a[android.net.NetworkInfo$State.CONNECTING.ordinal()] = 2;
	            } catch (NoSuchFieldError v0) {
	            }
	            return;
	        } catch (NoSuchFieldError v0) {
	        }
	    }
	
