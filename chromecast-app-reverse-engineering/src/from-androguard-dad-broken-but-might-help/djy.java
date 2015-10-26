	private static final B a
	
	    static djy()
	    {
	        byte[] v0_1 = new byte[64];
	        v0_1 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
	        djy.a = v0_1;
	        return;
	    }
	
	
	    public static String a(byte[] p1)
	    {
	        return djy.a(p1, djy.a);
	    }
	
	
	    private static String a(byte[] p8, byte[] p9)
	    {
	        java.io.UnsupportedEncodingException v0_0 = 0;
	        byte[] v3 = new byte[(((p8.length + 2) << 2) / 3)];
	        String v4_0 = (p8.length - (p8.length % 3));
	        AssertionError v1_5 = 0;
	        while (v1_5 < v4_0) {
	            byte v2_25 = (v0_0 + 1);
	            v3[v0_0] = p9[((p8[v1_5] & 255) >> 2)];
	            java.io.UnsupportedEncodingException v0_4 = (v2_25 + 1);
	            v3[v2_25] = p9[(((p8[v1_5] & 3) << 4) | ((p8[(v1_5 + 1)] & 255) >> 4))];
	            int v5_13 = (v0_4 + 1);
	            v3[v0_4] = p9[(((p8[(v1_5 + 1)] & 15) << 2) | ((p8[(v1_5 + 2)] & 255) >> 6))];
	            byte v2_32 = (v5_13 + 1);
	            v3[v5_13] = p9[(p8[(v1_5 + 2)] & 63)];
	            v1_5 += 3;
	            v0_0 = v2_32;
	        }
	        switch ((p8.length % 3)) {
	            case 1:
	                AssertionError v1_10 = (v0_0 + 1);
	                v3[v0_0] = p9[((p8[v4_0] & 255) >> 2)];
	                java.io.UnsupportedEncodingException v0_2 = (v1_10 + 1);
	                v3[v1_10] = p9[((p8[v4_0] & 3) << 4)];
	                AssertionError v1_11 = (v0_2 + 1);
	                v3[v0_2] = 61;
	                v0_0 = (v1_11 + 1);
	                v3[v1_11] = 61;
	                break;
	            case 2:
	                AssertionError v1_8 = (v0_0 + 1);
	                v3[v0_0] = p9[((p8[v4_0] & 255) >> 2)];
	                java.io.UnsupportedEncodingException v0_1 = (v1_8 + 1);
	                v3[v1_8] = p9[(((p8[v4_0] & 3) << 4) | ((p8[(v4_0 + 1)] & 255) >> 4))];
	                AssertionError v1_9 = (v0_1 + 1);
	                v3[v0_1] = p9[((p8[(v4_0 + 1)] & 15) << 2)];
	                v0_0 = (v1_9 + 1);
	                v3[v1_9] = 61;
	                break;
	            default:
	                return new String(v3, 0, v0_0, "US-ASCII");
	        }
	        try {
	            return new String(v3, 0, v0_0, "US-ASCII");
	        } catch (java.io.UnsupportedEncodingException v0_3) {
	            throw new AssertionError(v0_3);
	        }
	    }
	
