	static final synthetic I a
	static final synthetic I b
	
	    static bgq()
	    {
	        NoSuchFieldError v0_2 = new int[blh.a().length];
	        bgq.b = v0_2;
	        try {
	            bgq.b[(blh.b - 1)] = 1;
	            try {
	                bgq.b[(blh.c - 1)] = 2;
	                try {
	                    bgq.b[(blh.a - 1)] = 3;
	                } catch (NoSuchFieldError v0) {
	                }
	                NoSuchFieldError v0_8 = new int[blg.values().length];
	                bgq.a = v0_8;
	                try {
	                    bgq.a[blg.c.ordinal()] = 1;
	                } catch (NoSuchFieldError v0) {
	                }
	                try {
	                    bgq.a[blg.b.ordinal()] = 2;
	                } catch (NoSuchFieldError v0) {
	                }
	                try {
	                    bgq.a[blg.a.ordinal()] = 3;
	                } catch (NoSuchFieldError v0) {
	                }
	                return;
	            } catch (NoSuchFieldError v0) {
	            }
	        } catch (NoSuchFieldError v0) {
	        }
	    }
	
