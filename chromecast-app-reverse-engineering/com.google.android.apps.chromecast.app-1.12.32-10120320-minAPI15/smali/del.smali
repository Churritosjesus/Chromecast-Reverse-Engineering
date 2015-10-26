.class public final Ldel;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field private a:I

.field private b:[I

.field private c:[Ljava/lang/Object;

.field private d:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    const/4 v0, 0x0

    iput v0, p0, Ldel;->a:I

    .line 212
    invoke-static {}, Ldek;->d()[I

    move-result-object v0

    iput-object v0, p0, Ldel;->b:[I

    .line 213
    invoke-static {}, Ldek;->e()[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ldel;->c:[Ljava/lang/Object;

    .line 220
    return-void
.end method

.method private a(ILjava/lang/Object;)V
    .locals 2

    .prologue
    .line 232
    .line 1243
    iget v0, p0, Ldel;->a:I

    iget-object v1, p0, Ldel;->b:[I

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 1244
    iget v0, p0, Ldel;->a:I

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    const/16 v0, 0x8

    .line 1245
    :goto_0
    iget v1, p0, Ldel;->a:I

    add-int/2addr v0, v1

    .line 1247
    iget-object v1, p0, Ldel;->b:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ldel;->b:[I

    .line 1248
    iget-object v1, p0, Ldel;->c:[Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ldel;->c:[Ljava/lang/Object;

    .line 234
    :cond_0
    iget-object v0, p0, Ldel;->b:[I

    iget v1, p0, Ldel;->a:I

    aput p1, v0, v1

    .line 235
    iget-object v0, p0, Ldel;->c:[Ljava/lang/Object;

    iget v1, p0, Ldel;->a:I

    aput-object p2, v0, v1

    .line 236
    iget v0, p0, Ldel;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ldel;->a:I

    .line 237
    return-void

    .line 1244
    :cond_1
    iget v0, p0, Ldel;->a:I

    shr-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private b()V
    .locals 2

    .prologue
    .line 226
    iget-boolean v0, p0, Ldel;->d:Z

    if-eqz v0, :cond_0

    .line 227
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not reuse UnknownFieldSetLite Builders."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 229
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Ldek;
    .locals 4

    .prologue
    .line 353
    iget-boolean v0, p0, Ldel;->d:Z

    if-eqz v0, :cond_0

    .line 354
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not reuse UnknownFieldSetLite Builders."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 357
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ldel;->d:Z

    .line 359
    iget v0, p0, Ldel;->a:I

    if-nez v0, :cond_1

    .line 360
    invoke-static {}, Ldek;->f()Ldek;

    move-result-object v0

    .line 363
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ldek;

    iget v1, p0, Ldel;->a:I

    iget-object v2, p0, Ldel;->b:[I

    iget-object v3, p0, Ldel;->c:[Ljava/lang/Object;

    .line 5019
    invoke-direct {v0, v1, v2, v3}, Ldek;-><init>(I[I[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final a(II)Ldel;
    .locals 4

    .prologue
    .line 300
    if-nez p1, :cond_0

    .line 301
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Zero is not a valid field number."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 303
    :cond_0
    invoke-direct {p0}, Ldel;->b()V

    .line 305
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lden;->a(II)I

    move-result v0

    int-to-long v2, p2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ldel;->a(ILjava/lang/Object;)V

    .line 307
    return-object p0
.end method

.method public final a(ILddn;)Z
    .locals 11

    .prologue
    const/16 v10, 0x8

    const/4 v4, 0x4

    const/4 v1, 0x1

    const-wide/16 v8, 0xff

    .line 262
    invoke-direct {p0}, Ldel;->b()V

    .line 264
    invoke-static {p1}, Lden;->b(I)I

    move-result v0

    .line 265
    invoke-static {p1}, Lden;->a(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 288
    invoke-static {}, Lddx;->f()Lddx;

    move-result-object v0

    throw v0

    .line 267
    :pswitch_0
    invoke-virtual {p2}, Lddn;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ldel;->a(ILjava/lang/Object;)V

    move v0, v1

    .line 286
    :goto_0
    return v0

    .line 1855
    :pswitch_1
    iget v0, p2, Lddn;->c:I

    .line 1858
    iget v2, p2, Lddn;->b:I

    sub-int/2addr v2, v0

    if-ge v2, v4, :cond_0

    .line 1859
    invoke-virtual {p2, v4}, Lddn;->b(I)V

    .line 1860
    iget v0, p2, Lddn;->c:I

    .line 1863
    :cond_0
    iget-object v2, p2, Lddn;->a:[B

    .line 1864
    add-int/lit8 v3, v0, 0x4

    iput v3, p2, Lddn;->c:I

    .line 1865
    aget-byte v3, v2, v0

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v4, v0, 0x1

    aget-byte v4, v2, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v3, v4

    add-int/lit8 v4, v0, 0x2

    aget-byte v4, v2, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v3, v4

    add-int/lit8 v0, v0, 0x3

    aget-byte v0, v2, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v3

    .line 270
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ldel;->a(ILjava/lang/Object;)V

    move v0, v1

    .line 271
    goto :goto_0

    .line 2873
    :pswitch_2
    iget v0, p2, Lddn;->c:I

    .line 2876
    iget v2, p2, Lddn;->b:I

    sub-int/2addr v2, v0

    if-ge v2, v10, :cond_1

    .line 2877
    invoke-virtual {p2, v10}, Lddn;->b(I)V

    .line 2878
    iget v0, p2, Lddn;->c:I

    .line 2881
    :cond_1
    iget-object v2, p2, Lddn;->a:[B

    .line 2882
    add-int/lit8 v3, v0, 0x8

    iput v3, p2, Lddn;->c:I

    .line 2883
    aget-byte v3, v2, v0

    int-to-long v4, v3

    and-long/2addr v4, v8

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, v2, v3

    int-to-long v6, v3

    and-long/2addr v6, v8

    shl-long/2addr v6, v10

    or-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, v2, v3

    int-to-long v6, v3

    and-long/2addr v6, v8

    const/16 v3, 0x10

    shl-long/2addr v6, v3

    or-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x3

    aget-byte v3, v2, v3

    int-to-long v6, v3

    and-long/2addr v6, v8

    const/16 v3, 0x18

    shl-long/2addr v6, v3

    or-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x4

    aget-byte v3, v2, v3

    int-to-long v6, v3

    and-long/2addr v6, v8

    const/16 v3, 0x20

    shl-long/2addr v6, v3

    or-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x5

    aget-byte v3, v2, v3

    int-to-long v6, v3

    and-long/2addr v6, v8

    const/16 v3, 0x28

    shl-long/2addr v6, v3

    or-long/2addr v4, v6

    add-int/lit8 v3, v0, 0x6

    aget-byte v3, v2, v3

    int-to-long v6, v3

    and-long/2addr v6, v8

    const/16 v3, 0x30

    shl-long/2addr v6, v3

    or-long/2addr v4, v6

    add-int/lit8 v0, v0, 0x7

    aget-byte v0, v2, v0

    int-to-long v2, v0

    and-long/2addr v2, v8

    const/16 v0, 0x38

    shl-long/2addr v2, v0

    or-long/2addr v2, v4

    .line 273
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ldel;->a(ILjava/lang/Object;)V

    move v0, v1

    .line 274
    goto/16 :goto_0

    .line 3570
    :pswitch_3
    invoke-virtual {p2}, Lddn;->d()I

    move-result v2

    .line 3571
    iget v0, p2, Lddn;->b:I

    iget v3, p2, Lddn;->c:I

    sub-int/2addr v0, v3

    if-gt v2, v0, :cond_2

    if-lez v2, :cond_2

    .line 3576
    iget-object v0, p2, Lddn;->a:[B

    iget v3, p2, Lddn;->c:I

    invoke-static {v0, v3, v2}, Lddl;->a([BII)Lddl;

    move-result-object v0

    .line 3577
    iget v3, p2, Lddn;->c:I

    add-int/2addr v2, v3

    iput v2, p2, Lddn;->c:I

    .line 276
    :goto_1
    invoke-direct {p0, p1, v0}, Ldel;->a(ILjava/lang/Object;)V

    move v0, v1

    .line 277
    goto/16 :goto_0

    .line 3579
    :cond_2
    if-nez v2, :cond_3

    .line 3580
    sget-object v0, Lddl;->a:Lddl;

    goto :goto_1

    .line 3583
    :cond_3
    new-instance v0, Lddy;

    invoke-virtual {p2, v2}, Lddn;->c(I)[B

    move-result-object v2

    invoke-direct {v0, v2}, Lddy;-><init>([B)V

    goto :goto_1

    .line 279
    :pswitch_4
    invoke-static {}, Ldek;->b()Ldel;

    move-result-object v2

    .line 4334
    :cond_4
    invoke-virtual {p2}, Lddn;->a()I

    move-result v3

    .line 4335
    if-eqz v3, :cond_5

    invoke-virtual {v2, v3, p2}, Ldel;->a(ILddn;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 282
    :cond_5
    invoke-static {v0, v4}, Lden;->a(II)I

    move-result v0

    .line 281
    invoke-virtual {p2, v0}, Lddn;->a(I)V

    .line 283
    invoke-virtual {v2}, Ldel;->a()Ldek;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ldel;->a(ILjava/lang/Object;)V

    move v0, v1

    .line 284
    goto/16 :goto_0

    .line 286
    :pswitch_5
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 265
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_1
    .end packed-switch
.end method
