.class public final Lddn;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:[B

.field b:I

.field c:I

.field private final d:Z

.field private e:I

.field private final f:Ljava/io/InputStream;

.field private g:I

.field private h:Z

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Ls;


# direct methods
.method private constructor <init>([BII)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 955
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 930
    iput-boolean v1, p0, Lddn;->h:Z

    .line 942
    const v0, 0x7fffffff

    iput v0, p0, Lddn;->j:I

    .line 946
    const/16 v0, 0x64

    iput v0, p0, Lddn;->l:I

    .line 949
    const/high16 v0, 0x4000000

    iput v0, p0, Lddn;->m:I

    .line 1122
    iput-object v2, p0, Lddn;->n:Ls;

    .line 956
    iput-object p1, p0, Lddn;->a:[B

    .line 957
    add-int v0, p2, p3

    iput v0, p0, Lddn;->b:I

    .line 958
    iput p2, p0, Lddn;->c:I

    .line 959
    neg-int v0, p2

    iput v0, p0, Lddn;->i:I

    .line 960
    iput-object v2, p0, Lddn;->f:Ljava/io/InputStream;

    .line 961
    iput-boolean v1, p0, Lddn;->d:Z

    .line 962
    return-void
.end method

.method public static a([BII)Lddn;
    .locals 2

    .prologue
    .line 45
    new-instance v0, Lddn;

    invoke-direct {v0, p0, p1, p2}, Lddn;-><init>([BII)V

    .line 52
    :try_start_0
    invoke-direct {v0, p2}, Lddn;->d(I)I
    :try_end_0
    .catch Lddx; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    return-object v0

    .line 53
    :catch_0
    move-exception v0

    .line 61
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private d(I)I
    .locals 2

    .prologue
    .line 1051
    if-gez p1, :cond_0

    .line 1052
    invoke-static {}, Lddx;->b()Lddx;

    move-result-object v0

    throw v0

    .line 1054
    :cond_0
    iget v0, p0, Lddn;->i:I

    iget v1, p0, Lddn;->c:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    .line 1055
    iget v1, p0, Lddn;->j:I

    .line 1056
    if-le v0, v1, :cond_1

    .line 1057
    invoke-static {}, Lddx;->a()Lddx;

    move-result-object v0

    throw v0

    .line 1059
    :cond_1
    iput v0, p0, Lddn;->j:I

    .line 1061
    invoke-direct {p0}, Lddn;->f()V

    .line 1063
    return v1
.end method

.method private e()J
    .locals 6

    .prologue
    .line 842
    const-wide/16 v2, 0x0

    .line 843
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x40

    if-ge v0, v1, :cond_2

    .line 3214
    iget v1, p0, Lddn;->c:I

    iget v4, p0, Lddn;->b:I

    if-ne v1, v4, :cond_0

    .line 3215
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lddn;->b(I)V

    .line 3217
    :cond_0
    iget-object v1, p0, Lddn;->a:[B

    iget v4, p0, Lddn;->c:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lddn;->c:I

    aget-byte v1, v1, v4

    .line 845
    and-int/lit8 v4, v1, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v0

    or-long/2addr v2, v4

    .line 846
    and-int/lit16 v1, v1, 0x80

    if-nez v1, :cond_1

    .line 847
    return-wide v2

    .line 843
    :cond_1
    add-int/lit8 v0, v0, 0x7

    goto :goto_0

    .line 850
    :cond_2
    invoke-static {}, Lddx;->c()Lddx;

    move-result-object v0

    throw v0
.end method

.method private e(I)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1161
    iget v0, p0, Lddn;->c:I

    add-int/2addr v0, p1

    iget v1, p0, Lddn;->b:I

    if-gt v0, v1, :cond_0

    .line 1162
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x4d

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "refillBuffer() called when "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes were already available in buffer"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1167
    :cond_0
    iget v0, p0, Lddn;->i:I

    iget v1, p0, Lddn;->c:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iget v1, p0, Lddn;->j:I

    if-le v0, v1, :cond_1

    .line 1204
    :cond_1
    return v2
.end method

.method private f()V
    .locals 2

    .prologue
    .line 1067
    iget v0, p0, Lddn;->b:I

    iget v1, p0, Lddn;->e:I

    add-int/2addr v0, v1

    iput v0, p0, Lddn;->b:I

    .line 1068
    iget v0, p0, Lddn;->i:I

    iget v1, p0, Lddn;->b:I

    add-int/2addr v0, v1

    .line 1069
    iget v1, p0, Lddn;->j:I

    if-le v0, v1, :cond_0

    .line 1071
    iget v1, p0, Lddn;->j:I

    sub-int/2addr v0, v1

    iput v0, p0, Lddn;->e:I

    .line 1072
    iget v0, p0, Lddn;->b:I

    iget v1, p0, Lddn;->e:I

    sub-int/2addr v0, v1

    iput v0, p0, Lddn;->b:I

    .line 1076
    :goto_0
    return-void

    .line 1074
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lddn;->e:I

    goto :goto_0
.end method

.method private f(I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1338
    iget v0, p0, Lddn;->b:I

    iget v1, p0, Lddn;->c:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_0

    if-ltz p1, :cond_0

    .line 1340
    iget v0, p0, Lddn;->c:I

    add-int/2addr v0, p1

    iput v0, p0, Lddn;->c:I

    .line 1344
    :goto_0
    return-void

    .line 4351
    :cond_0
    if-gez p1, :cond_1

    .line 4352
    invoke-static {}, Lddx;->b()Lddx;

    move-result-object v0

    throw v0

    .line 4355
    :cond_1
    iget v0, p0, Lddn;->i:I

    iget v1, p0, Lddn;->c:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iget v1, p0, Lddn;->j:I

    if-le v0, v1, :cond_2

    .line 4357
    iget v0, p0, Lddn;->j:I

    iget v1, p0, Lddn;->i:I

    sub-int/2addr v0, v1

    iget v1, p0, Lddn;->c:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lddn;->f(I)V

    .line 4359
    invoke-static {}, Lddx;->a()Lddx;

    move-result-object v0

    throw v0

    .line 4363
    :cond_2
    iget v0, p0, Lddn;->b:I

    iget v1, p0, Lddn;->c:I

    sub-int/2addr v0, v1

    .line 4364
    iget v1, p0, Lddn;->b:I

    iput v1, p0, Lddn;->c:I

    .line 4368
    invoke-virtual {p0, v3}, Lddn;->b(I)V

    .line 4369
    :goto_1
    sub-int v1, p1, v0

    iget v2, p0, Lddn;->b:I

    if-le v1, v2, :cond_3

    .line 4370
    iget v1, p0, Lddn;->b:I

    add-int/2addr v0, v1

    .line 4371
    iget v1, p0, Lddn;->b:I

    iput v1, p0, Lddn;->c:I

    .line 4372
    invoke-virtual {p0, v3}, Lddn;->b(I)V

    goto :goto_1

    .line 4375
    :cond_3
    sub-int v0, p1, v0

    iput v0, p0, Lddn;->c:I

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 121
    .line 2107
    iget v2, p0, Lddn;->c:I

    iget v3, p0, Lddn;->b:I

    if-ne v2, v3, :cond_0

    invoke-direct {p0, v1}, Lddn;->e(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 121
    :goto_0
    if-eqz v1, :cond_1

    .line 122
    iput v0, p0, Lddn;->g:I

    .line 132
    :goto_1
    return v0

    :cond_0
    move v1, v0

    .line 2107
    goto :goto_0

    .line 126
    :cond_1
    invoke-virtual {p0}, Lddn;->d()I

    move-result v0

    iput v0, p0, Lddn;->g:I

    .line 127
    iget v0, p0, Lddn;->g:I

    invoke-static {v0}, Lden;->b(I)I

    move-result v0

    if-nez v0, :cond_2

    .line 130
    invoke-static {}, Lddx;->d()Lddx;

    move-result-object v0

    throw v0

    .line 132
    :cond_2
    iget v0, p0, Lddn;->g:I

    goto :goto_1
.end method

.method public final a(Lddq;Lddp;)Lddq;
    .locals 3

    .prologue
    .line 536
    invoke-virtual {p0}, Lddn;->d()I

    move-result v0

    .line 537
    iget v1, p0, Lddn;->k:I

    iget v2, p0, Lddn;->l:I

    if-lt v1, v2, :cond_0

    .line 538
    invoke-static {}, Lddx;->g()Lddx;

    move-result-object v0

    throw v0

    .line 540
    :cond_0
    invoke-direct {p0, v0}, Lddn;->d(I)I

    move-result v0

    .line 541
    iget v1, p0, Lddn;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lddn;->k:I

    .line 542
    invoke-static {p1, p0, p2}, Lddq;->a(Lddq;Lddn;Lddp;)Lddq;

    move-result-object v1

    .line 543
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lddn;->a(I)V

    .line 544
    iget v2, p0, Lddn;->k:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lddn;->k:I

    .line 3084
    iput v0, p0, Lddn;->j:I

    .line 3085
    invoke-direct {p0}, Lddn;->f()V

    .line 546
    return-object v1
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 145
    iget v0, p0, Lddn;->g:I

    if-eq v0, p1, :cond_0

    .line 146
    invoke-static {}, Lddx;->e()Lddx;

    move-result-object v0

    throw v0

    .line 148
    :cond_0
    return-void
.end method

.method public final b()J
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    .line 335
    .line 2794
    iget v0, p0, Lddn;->c:I

    .line 2796
    iget v1, p0, Lddn;->b:I

    if-eq v1, v0, :cond_9

    .line 2800
    iget-object v4, p0, Lddn;->a:[B

    .line 2803
    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v4, v0

    if-ltz v0, :cond_0

    .line 2804
    iput v1, p0, Lddn;->c:I

    .line 2805
    int-to-long v0, v0

    .line 2834
    :goto_0
    return-wide v0

    .line 2806
    :cond_0
    iget v2, p0, Lddn;->b:I

    sub-int/2addr v2, v1

    const/16 v3, 0x9

    if-lt v2, v3, :cond_9

    .line 2808
    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v4, v1

    shl-int/lit8 v1, v1, 0x7

    xor-int/2addr v0, v1

    if-gez v0, :cond_2

    .line 2809
    xor-int/lit8 v0, v0, -0x80

    int-to-long v0, v0

    .line 2833
    :cond_1
    :goto_1
    iput v2, p0, Lddn;->c:I

    goto :goto_0

    .line 2810
    :cond_2
    add-int/lit8 v3, v2, 0x1

    aget-byte v1, v4, v2

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v0, v1

    if-ltz v0, :cond_3

    .line 2811
    xor-int/lit16 v0, v0, 0x3f80

    int-to-long v0, v0

    move v2, v3

    goto :goto_1

    .line 2812
    :cond_3
    add-int/lit8 v2, v3, 0x1

    aget-byte v1, v4, v3

    shl-int/lit8 v1, v1, 0x15

    xor-int/2addr v0, v1

    if-gez v0, :cond_4

    .line 2813
    const v1, -0x1fc080

    xor-int/2addr v0, v1

    int-to-long v0, v0

    goto :goto_1

    .line 2814
    :cond_4
    int-to-long v0, v0

    add-int/lit8 v3, v2, 0x1

    aget-byte v2, v4, v2

    int-to-long v6, v2

    const/16 v2, 0x1c

    shl-long/2addr v6, v2

    xor-long/2addr v0, v6

    cmp-long v2, v0, v8

    if-ltz v2, :cond_5

    .line 2815
    const-wide/32 v4, 0xfe03f80

    xor-long/2addr v0, v4

    move v2, v3

    goto :goto_1

    .line 2816
    :cond_5
    add-int/lit8 v2, v3, 0x1

    aget-byte v3, v4, v3

    int-to-long v6, v3

    const/16 v3, 0x23

    shl-long/2addr v6, v3

    xor-long/2addr v0, v6

    cmp-long v3, v0, v8

    if-gez v3, :cond_6

    .line 2817
    const-wide v4, -0x7f01fc080L

    xor-long/2addr v0, v4

    goto :goto_1

    .line 2818
    :cond_6
    add-int/lit8 v3, v2, 0x1

    aget-byte v2, v4, v2

    int-to-long v6, v2

    const/16 v2, 0x2a

    shl-long/2addr v6, v2

    xor-long/2addr v0, v6

    cmp-long v2, v0, v8

    if-ltz v2, :cond_7

    .line 2819
    const-wide v4, 0x3f80fe03f80L

    xor-long/2addr v0, v4

    move v2, v3

    goto :goto_1

    .line 2820
    :cond_7
    add-int/lit8 v2, v3, 0x1

    aget-byte v3, v4, v3

    int-to-long v6, v3

    const/16 v3, 0x31

    shl-long/2addr v6, v3

    xor-long/2addr v0, v6

    cmp-long v3, v0, v8

    if-gez v3, :cond_8

    .line 2821
    const-wide v4, -0x1fc07f01fc080L

    xor-long/2addr v0, v4

    goto :goto_1

    .line 2824
    :cond_8
    add-int/lit8 v3, v2, 0x1

    aget-byte v2, v4, v2

    int-to-long v6, v2

    const/16 v2, 0x38

    shl-long/2addr v6, v2

    xor-long/2addr v0, v6

    .line 2825
    const-wide v6, 0xfe03f80fe03f80L

    xor-long/2addr v0, v6

    .line 2827
    cmp-long v2, v0, v8

    if-gez v2, :cond_a

    .line 2828
    add-int/lit8 v2, v3, 0x1

    aget-byte v3, v4, v3

    int-to-long v4, v3

    cmp-long v3, v4, v8

    if-gez v3, :cond_1

    .line 2836
    :cond_9
    invoke-direct {p0}, Lddn;->e()J

    move-result-wide v0

    goto/16 :goto_0

    :cond_a
    move v2, v3

    goto/16 :goto_1
.end method

.method b(I)V
    .locals 1

    .prologue
    .line 1147
    invoke-direct {p0, p1}, Lddn;->e(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1148
    invoke-static {}, Lddx;->a()Lddx;

    move-result-object v0

    throw v0

    .line 1150
    :cond_0
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 5

    .prologue
    .line 364
    invoke-virtual {p0}, Lddn;->d()I

    move-result v1

    .line 365
    iget v0, p0, Lddn;->b:I

    iget v2, p0, Lddn;->c:I

    sub-int/2addr v0, v2

    if-gt v1, v0, :cond_0

    if-lez v1, :cond_0

    .line 368
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Lddn;->a:[B

    iget v3, p0, Lddn;->c:I

    sget-object v4, Lddv;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v2, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 369
    iget v2, p0, Lddn;->c:I

    add-int/2addr v1, v2

    iput v1, p0, Lddn;->c:I

    .line 375
    :goto_0
    return-object v0

    .line 371
    :cond_0
    if-nez v1, :cond_1

    .line 372
    const-string v0, ""

    goto :goto_0

    .line 375
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lddn;->c(I)[B

    move-result-object v1

    sget-object v2, Lddv;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_0
.end method

.method c(I)[B
    .locals 8

    .prologue
    const/16 v7, 0x1000

    const/4 v6, 0x0

    .line 1241
    if-gtz p1, :cond_1

    .line 1242
    if-nez p1, :cond_0

    .line 1243
    sget-object v0, Lddv;->b:[B

    .line 1327
    :goto_0
    return-object v0

    .line 1245
    :cond_0
    invoke-static {}, Lddx;->b()Lddx;

    move-result-object v0

    throw v0

    .line 1249
    :cond_1
    iget v0, p0, Lddn;->i:I

    iget v1, p0, Lddn;->c:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iget v1, p0, Lddn;->j:I

    if-le v0, v1, :cond_2

    .line 1251
    iget v0, p0, Lddn;->j:I

    iget v1, p0, Lddn;->i:I

    sub-int/2addr v0, v1

    iget v1, p0, Lddn;->c:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lddn;->f(I)V

    .line 1253
    invoke-static {}, Lddx;->a()Lddx;

    move-result-object v0

    throw v0

    .line 1256
    :cond_2
    if-ge p1, v7, :cond_4

    .line 1261
    new-array v0, p1, [B

    .line 1262
    iget v1, p0, Lddn;->b:I

    iget v2, p0, Lddn;->c:I

    sub-int/2addr v1, v2

    .line 1263
    iget-object v2, p0, Lddn;->a:[B

    iget v3, p0, Lddn;->c:I

    invoke-static {v2, v3, v0, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1264
    iget v2, p0, Lddn;->b:I

    iput v2, p0, Lddn;->c:I

    .line 1269
    sub-int v2, p1, v1

    .line 4133
    iget v3, p0, Lddn;->b:I

    iget v4, p0, Lddn;->c:I

    sub-int/2addr v3, v4

    if-ge v3, v2, :cond_3

    .line 4134
    invoke-virtual {p0, v2}, Lddn;->b(I)V

    .line 1270
    :cond_3
    iget-object v2, p0, Lddn;->a:[B

    sub-int v3, p1, v1

    invoke-static {v2, v6, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1271
    sub-int v1, p1, v1

    iput v1, p0, Lddn;->c:I

    goto :goto_0

    .line 1285
    :cond_4
    iget v1, p0, Lddn;->c:I

    .line 1286
    iget v3, p0, Lddn;->b:I

    .line 1289
    iget v0, p0, Lddn;->i:I

    iget v2, p0, Lddn;->b:I

    add-int/2addr v0, v2

    iput v0, p0, Lddn;->i:I

    .line 1290
    iput v6, p0, Lddn;->c:I

    .line 1291
    iput v6, p0, Lddn;->b:I

    .line 1294
    sub-int v0, v3, v1

    sub-int v0, p1, v0

    .line 1295
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1297
    :goto_1
    if-lez v0, :cond_6

    .line 1298
    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v2

    new-array v2, v2, [B

    .line 1300
    array-length v5, v2

    if-lez v5, :cond_5

    .line 1304
    invoke-static {}, Lddx;->a()Lddx;

    move-result-object v0

    throw v0

    .line 1309
    :cond_5
    array-length v5, v2

    sub-int/2addr v0, v5

    .line 1310
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1314
    :cond_6
    new-array v2, p1, [B

    .line 1317
    sub-int v0, v3, v1

    .line 1318
    iget-object v3, p0, Lddn;->a:[B

    invoke-static {v3, v1, v2, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1321
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 1322
    array-length v4, v0

    invoke-static {v0, v6, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1323
    array-length v0, v0

    add-int/2addr v0, v1

    move v1, v0

    .line 1324
    goto :goto_2

    :cond_7
    move-object v0, v2

    .line 1327
    goto/16 :goto_0
.end method

.method public final d()I
    .locals 5

    .prologue
    .line 668
    iget v0, p0, Lddn;->c:I

    .line 670
    iget v1, p0, Lddn;->b:I

    if-eq v1, v0, :cond_5

    .line 674
    iget-object v3, p0, Lddn;->a:[B

    .line 676
    add-int/lit8 v2, v0, 0x1

    aget-byte v0, v3, v0

    if-ltz v0, :cond_0

    .line 677
    iput v2, p0, Lddn;->c:I

    .line 703
    :goto_0
    return v0

    .line 679
    :cond_0
    iget v1, p0, Lddn;->b:I

    sub-int/2addr v1, v2

    const/16 v4, 0x9

    if-lt v1, v4, :cond_5

    .line 681
    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v3, v2

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v0, v2

    if-gez v0, :cond_2

    .line 682
    xor-int/lit8 v0, v0, -0x80

    .line 700
    :cond_1
    :goto_1
    iput v1, p0, Lddn;->c:I

    goto :goto_0

    .line 683
    :cond_2
    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v3, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v0, v1

    if-ltz v0, :cond_3

    .line 684
    xor-int/lit16 v0, v0, 0x3f80

    move v1, v2

    goto :goto_1

    .line 685
    :cond_3
    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v3, v2

    shl-int/lit8 v2, v2, 0x15

    xor-int/2addr v0, v2

    if-gez v0, :cond_4

    .line 686
    const v2, -0x1fc080

    xor-int/2addr v0, v2

    goto :goto_1

    .line 688
    :cond_4
    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v3, v1

    .line 689
    shl-int/lit8 v4, v1, 0x1c

    xor-int/2addr v0, v4

    .line 690
    const v4, 0xfe03f80

    xor-int/2addr v0, v4

    .line 691
    if-gez v1, :cond_6

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v3, v2

    if-gez v2, :cond_1

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v3, v1

    if-gez v1, :cond_6

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v3, v2

    if-gez v2, :cond_1

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v3, v1

    if-gez v1, :cond_6

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v3, v2

    if-gez v2, :cond_1

    .line 703
    :cond_5
    invoke-direct {p0}, Lddn;->e()J

    move-result-wide v0

    long-to-int v0, v0

    goto :goto_0

    :cond_6
    move v1, v2

    goto :goto_1
.end method
