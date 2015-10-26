	static final synthetic I a
	
	    static bap()
	    {
	        NoSuchFieldError v0_2 = new int[bat.values().length];
	        bap.a = v0_2;
	        try {
	            bap.a[bat.a.ordinal()] = 1;
	            try {
	                bap.a[bat.c.ordinal()] = 2;
	                try {
	                    bap.a[bat.b.ordinal()] = 3;
	                } catch (NoSuchFieldError v0) {
	                }
	                try {
	                    bap.a[bat.d.ordinal()] = 4;
	                } catch (NoSuchFieldError v0) {
	                }
	                try {
	                    bap.a[bat.e.ordinal()] = 5;
	                } catch (NoSuchFieldError v0) {
	                }
	                return;
	            } catch (NoSuchFieldError v0) {
	            }
	        } catch (NoSuchFieldError v0) {
	        }
	    }
	
