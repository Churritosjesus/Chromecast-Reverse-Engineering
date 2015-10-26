	static final synthetic I a
	
	    static cvt()
	    {
	        NoSuchFieldError v0_2 = new int[cvu.a().length];
	        cvt.a = v0_2;
	        try {
	            cvt.a[(cvu.b - 1)] = 1;
	            try {
	                cvt.a[(cvu.c - 1)] = 2;
	                try {
	                    cvt.a[(cvu.a - 1)] = 3;
	                } catch (NoSuchFieldError v0) {
	                }
	                return;
	            } catch (NoSuchFieldError v0) {
	            }
	        } catch (NoSuchFieldError v0) {
	        }
	    }
	
