	static final synthetic I a
	
	    static bfj()
	    {
	        NoSuchFieldError v0_2 = new int[bfk.a().length];
	        bfj.a = v0_2;
	        try {
	            bfj.a[(bfk.b - 1)] = 1;
	            try {
	                bfj.a[(bfk.c - 1)] = 2;
	                try {
	                    bfj.a[(bfk.d - 1)] = 3;
	                } catch (NoSuchFieldError v0) {
	                }
	                try {
	                    bfj.a[(bfk.e - 1)] = 4;
	                    try {
	                        bfj.a[(bfk.a - 1)] = 5;
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
	
