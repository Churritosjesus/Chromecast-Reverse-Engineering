	final java.lang.String a
	final  b
	  c
	  d
	  e
	  f
	 C g
	
	    public djs(javax.security.auth.x500.X500Principal p2)
	    {
	        this.a = p2.getName("RFC2253");
	        this.b = this.a.length();
	        return;
	    }
	
	
	    private int a(int p9)
	    {
	        if ((p9 + 1) < this.b) {
	            IllegalStateException v0_5;
	            IllegalStateException v0_2 = this.g[p9];
	            if ((v0_2 < 48) || (v0_2 > 57)) {
	                if ((v0_2 < 97) || (v0_2 > 102)) {
	                    if ((v0_2 < 65) || (v0_2 > 70)) {
	                        throw new IllegalStateException(new StringBuilder("Malformed DN: ").append(this.a).toString());
	                    } else {
	                        v0_5 = (v0_2 - 55);
	                    }
	                } else {
	                    v0_5 = (v0_2 - 87);
	                }
	            } else {
	                v0_5 = (v0_2 - 48);
	            }
	            int v1_12;
	            int v1_7 = this.g[(p9 + 1)];
	            if ((v1_7 < 48) || (v1_7 > 57)) {
	                if ((v1_7 < 97) || (v1_7 > 102)) {
	                    if ((v1_7 < 65) || (v1_7 > 70)) {
	                        throw new IllegalStateException(new StringBuilder("Malformed DN: ").append(this.a).toString());
	                    } else {
	                        v1_12 = (v1_7 - 55);
	                    }
	                } else {
	                    v1_12 = (v1_7 - 87);
	                }
	            } else {
	                v1_12 = (v1_7 - 48);
	            }
	            return ((v0_5 << 4) + v1_12);
	        } else {
	            throw new IllegalStateException(new StringBuilder("Malformed DN: ").append(this.a).toString());
	        }
	    }
	
	
	    private char e()
	    {
	        int v0_5;
	        int v1_0 = this.a(this.c);
	        this.c = (this.c + 1);
	        if (v1_0 >= 128) {
	            if ((v1_0 < 192) || (v1_0 > 247)) {
	                v0_5 = 63;
	            } else {
	                int v0_8;
	                int v1_1;
	                if (v1_0 > 223) {
	                    if (v1_0 > 239) {
	                        v0_8 = 3;
	                        v1_1 = (v1_0 & 7);
	                    } else {
	                        v0_8 = 2;
	                        v1_1 = (v1_0 & 15);
	                    }
	                } else {
	                    v0_8 = 1;
	                    v1_1 = (v1_0 & 31);
	                }
	                int v3_1 = v1_1;
	                int v1_2 = 0;
	                while (v1_2 < v0_8) {
	                    this.c = (this.c + 1);
	                    if ((this.c != this.b) && (this.g[this.c] == 92)) {
	                        this.c = (this.c + 1);
	                        int v4_8 = this.a(this.c);
	                        this.c = (this.c + 1);
	                        if ((v4_8 & 192) == 128) {
	                            v3_1 = ((v3_1 << 6) + (v4_8 & 63));
	                            v1_2++;
	                        } else {
	                            v0_5 = 63;
	                        }
	                    } else {
	                        v0_5 = 63;
	                    }
	                }
	                v0_5 = ((char) v3_1);
	            }
	        } else {
	            v0_5 = ((char) v1_0);
	        }
	        return v0_5;
	    }
	
	
	    String a()
	    {
	        while ((this.c < this.b) && (this.g[this.c] == 32)) {
	            this.c = (this.c + 1);
	        }
	        int v0_48;
	        if (this.c != this.b) {
	            this.d = this.c;
	            this.c = (this.c + 1);
	            while ((this.c < this.b) && ((this.g[this.c] != 61) && (this.g[this.c] != 32))) {
	                this.c = (this.c + 1);
	            }
	            if (this.c < this.b) {
	                this.e = this.c;
	                if (this.g[this.c] == 32) {
	                    while ((this.c < this.b) && ((this.g[this.c] != 61) && (this.g[this.c] == 32))) {
	                        this.c = (this.c + 1);
	                    }
	                    if ((this.g[this.c] != 61) || (this.c == this.b)) {
	                        throw new IllegalStateException(new StringBuilder("Unexpected end of DN: ").append(this.a).toString());
	                    }
	                }
	                do {
	                    this.c = (this.c + 1);
	                } while((this.c < this.b) && (this.g[this.c] == 32));
	                if ((((this.e - this.d) > 4) && ((this.g[(this.d + 3)] == 46) && ((this.g[this.d] == 79) || (this.g[this.d] == 111)))) && (((this.g[(this.d + 1)] == 73) || (this.g[(this.d + 1)] == 105)) && ((this.g[(this.d + 2)] == 68) || (this.g[(this.d + 2)] == 100)))) {
	                    this.d = (this.d + 4);
	                }
	                v0_48 = new String(this.g, this.d, (this.e - this.d));
	            } else {
	                throw new IllegalStateException(new StringBuilder("Unexpected end of DN: ").append(this.a).toString());
	            }
	        } else {
	            v0_48 = 0;
	        }
	        return v0_48;
	    }
	
	
	    String b()
	    {
	        if ((this.c + 4) < this.b) {
	            this.d = this.c;
	            this.c = (this.c + 1);
	            while ((this.c != this.b) && ((this.g[this.c] != 43) && ((this.g[this.c] != 44) && (this.g[this.c] != 59)))) {
	                if (this.g[this.c] != 32) {
	                    if ((this.g[this.c] >= 65) && (this.g[this.c] <= 70)) {
	                        int v0_18 = this.g;
	                        int v1_13 = this.c;
	                        v0_18[v1_13] = ((char) (v0_18[v1_13] + 32));
	                    }
	                    this.c = (this.c + 1);
	                } else {
	                    this.e = this.c;
	                    this.c = (this.c + 1);
	                    while ((this.c < this.b) && (this.g[this.c] == 32)) {
	                        this.c = (this.c + 1);
	                    }
	                }
	                char v2_3 = (this.e - this.d);
	                if ((v2_3 >= 5) && ((v2_3 & 1) != 0)) {
	                    int v3_1 = new byte[(v2_3 / 2)];
	                    int v1_17 = 0;
	                    int v0_35 = (this.d + 1);
	                    while (v1_17 < v3_1.length) {
	                        v3_1[v1_17] = ((byte) this.a(v0_35));
	                        v0_35 += 2;
	                        v1_17++;
	                    }
	                    return new String(this.g, this.d, v2_3);
	                } else {
	                    throw new IllegalStateException(new StringBuilder("Unexpected end of DN: ").append(this.a).toString());
	                }
	            }
	            this.e = this.c;
	        } else {
	            throw new IllegalStateException(new StringBuilder("Unexpected end of DN: ").append(this.a).toString());
	        }
	    }
	
	
	    String c()
	    {
	        this.d = this.c;
	        this.e = this.c;
	        while (this.c < this.b) {
	            switch (this.g[this.c]) {
	                case 32:
	                    this.f = this.e;
	                    this.c = (this.c + 1);
	                    char v0_13 = this.g;
	                    int v1_4 = this.e;
	                    this.e = (v1_4 + 1);
	                    v0_13[v1_4] = 32;
	                    while ((this.c < this.b) && (this.g[this.c] == 32)) {
	                        char v0_25 = this.g;
	                        int v1_15 = this.e;
	                        this.e = (v1_15 + 1);
	                        v0_25[v1_15] = 32;
	                        this.c = (this.c + 1);
	                    }
	                    if ((this.c == this.b) || ((this.g[this.c] == 44) || ((this.g[this.c] == 43) || (this.g[this.c] == 59)))) {
	                        char v0_9 = new String(this.g, this.d, (this.f - this.d));
	                    }
	                    return v0_9;
	                case 43:
	                case 44:
	                case 59:
	                    v0_9 = new String(this.g, this.d, (this.e - this.d));
	                    return v0_9;
	                case 92:
	                    char v0_5 = this.g;
	                    int v1_2 = this.e;
	                    this.e = (v1_2 + 1);
	                    v0_5[v1_2] = this.d();
	                    this.c = (this.c + 1);
	                    break;
	                default:
	                    char v0_28 = this.g;
	                    int v1_16 = this.e;
	                    this.e = (v1_16 + 1);
	                    v0_28[v1_16] = this.g[this.c];
	                    this.c = (this.c + 1);
	            }
	        }
	        v0_9 = new String(this.g, this.d, (this.e - this.d));
	        return v0_9;
	    }
	
	
	    char d()
	    {
	        this.c = (this.c + 1);
	        if (this.c != this.b) {
	            char v0_6;
	            switch (this.g[this.c]) {
	                case 32:
	                case 34:
	                case 35:
	                case 37:
	                case 42:
	                case 43:
	                case 44:
	                case 59:
	                case 60:
	                case 61:
	                case 62:
	                case 92:
	                case 95:
	                    v0_6 = this.g[this.c];
	                    break;
	                default:
	                    v0_6 = this.e();
	            }
	            return v0_6;
	        } else {
	            throw new IllegalStateException(new StringBuilder("Unexpected end of DN: ").append(this.a).toString());
	        }
	    }
	
