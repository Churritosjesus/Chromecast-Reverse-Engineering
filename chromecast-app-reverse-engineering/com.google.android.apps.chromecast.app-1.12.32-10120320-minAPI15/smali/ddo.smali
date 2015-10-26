.class public final Lddo;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final e:Ljava/util/logging/Logger;


# instance fields
.field final a:[B

.field final b:I

.field c:I

.field d:I

.field private final f:Ljava/io/OutputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lddo;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lddo;->e:Ljava/util/logging/Logger;

    return-void
.end method

.method private constructor <init>([BII)V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lddo;->d:I

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lddo;->f:Ljava/io/OutputStream;

    .line 59
    iput-object p1, p0, Lddo;->a:[B

    .line 60
    iput p2, p0, Lddo;->c:I

    .line 61
    add-int v0, p2, p3

    iput v0, p0, Lddo;->b:I

    .line 62
    return-void
.end method

.method public static a(IJ)I
    .locals 3

    .prologue
    .line 641
    invoke-static {p0}, Lddo;->b(I)I

    move-result v0

    .line 5874
    invoke-static {p1, p2}, Lddo;->b(J)I

    move-result v1

    .line 641
    add-int/2addr v0, v1

    return v0
.end method

.method public static a(ILddl;)I
    .locals 3

    .prologue
    .line 734
    invoke-static {p0}, Lddo;->b(I)I

    move-result v0

    .line 5983
    invoke-virtual {p1}, Lddl;->b()I

    move-result v1

    invoke-static {v1}, Lddo;->d(I)I

    move-result v1

    .line 5984
    invoke-virtual {p1}, Lddl;->b()I

    move-result v2

    add-int/2addr v1, v2

    .line 734
    add-int/2addr v0, v1

    return v0
.end method

.method public static a([B)Lddo;
    .locals 3

    .prologue
    .line 96
    array-length v0, p0

    .line 2109
    new-instance v1, Lddo;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, Lddo;-><init>([BII)V

    .line 96
    return-object v1
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 457
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    .line 458
    invoke-static {v0}, Lddo;->d(I)I

    move-result v0

    .line 474
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1}, Lddo;->d(I)I

    move-result v1

    .line 475
    iget v2, p0, Lddo;->c:I

    .line 478
    if-ne v1, v0, :cond_0

    .line 479
    add-int v0, v2, v1

    :try_start_0
    iput v0, p0, Lddo;->c:I

    .line 480
    iget-object v0, p0, Lddo;->a:[B

    iget v3, p0, Lddo;->c:I

    iget v4, p0, Lddo;->b:I

    iget v5, p0, Lddo;->c:I

    sub-int/2addr v4, v5

    invoke-static {p1, v0, v3, v4}, La;->a(Ljava/lang/CharSequence;[BII)I

    move-result v3

    .line 483
    iput v2, p0, Lddo;->c:I

    .line 484
    sub-int v0, v3, v2

    sub-int/2addr v0, v1

    .line 485
    invoke-virtual {p0, v0}, Lddo;->c(I)V

    .line 486
    iput v3, p0, Lddo;->c:I
    :try_end_0
    .catch Ldem; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 500
    :goto_0
    iget v1, p0, Lddo;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lddo;->d:I

    .line 502
    return-void

    .line 488
    :cond_0
    :try_start_1
    invoke-static {p1}, La;->a(Ljava/lang/CharSequence;)I

    move-result v0

    .line 489
    invoke-virtual {p0, v0}, Lddo;->c(I)V

    .line 490
    iget-object v1, p0, Lddo;->a:[B

    iget v3, p0, Lddo;->c:I

    iget v4, p0, Lddo;->b:I

    iget v5, p0, Lddo;->c:I

    sub-int/2addr v4, v5

    invoke-static {p1, v1, v3, v4}, La;->a(Ljava/lang/CharSequence;[BII)I

    move-result v1

    iput v1, p0, Lddo;->c:I
    :try_end_1
    .catch Ldem; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 492
    :catch_0
    move-exception v0

    .line 495
    iput v2, p0, Lddo;->c:I

    .line 496
    throw v0

    .line 497
    :catch_1
    move-exception v0

    .line 498
    new-instance v1, Lcml;

    invoke-direct {v1, v0}, Lcml;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static b(I)I
    .locals 1

    .prologue
    .line 1291
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lden;->a(II)I

    move-result v0

    invoke-static {v0}, Lddo;->d(I)I

    move-result v0

    return v0
.end method

.method public static b(II)I
    .locals 1

    .prologue
    .line 675
    invoke-static {p0}, Lddo;->b(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public static b(IJ)I
    .locals 3

    .prologue
    .line 649
    const/4 v0, 0x4

    invoke-static {v0}, Lddo;->b(I)I

    move-result v0

    .line 5882
    invoke-static {p1, p2}, Lddo;->b(J)I

    move-result v1

    .line 649
    add-int/2addr v0, v1

    return v0
.end method

.method public static b(ILdea;)I
    .locals 3

    .prologue
    .line 725
    invoke-static {p0}, Lddo;->b(I)I

    move-result v0

    .line 5965
    invoke-interface {p1}, Ldea;->a()I

    move-result v1

    .line 5966
    invoke-static {v1}, Lddo;->d(I)I

    move-result v2

    add-int/2addr v1, v2

    .line 725
    add-int/2addr v0, v1

    return v0
.end method

.method public static b(ILjava/lang/String;)I
    .locals 2

    .prologue
    .line 693
    invoke-static {p0}, Lddo;->b(I)I

    move-result v0

    invoke-static {p1}, Lddo;->b(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private static b(J)I
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 1338
    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 1347
    :goto_0
    return v0

    .line 1339
    :cond_0
    const-wide/16 v0, -0x4000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    .line 1340
    :cond_1
    const-wide/32 v0, -0x200000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    .line 1341
    :cond_2
    const-wide/32 v0, -0x10000000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    .line 1342
    :cond_3
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    const/4 v0, 0x5

    goto :goto_0

    .line 1343
    :cond_4
    const-wide v0, -0x40000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    const/4 v0, 0x6

    goto :goto_0

    .line 1344
    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    const/4 v0, 0x7

    goto :goto_0

    .line 1345
    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    const/16 v0, 0x8

    goto :goto_0

    .line 1346
    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_8

    const/16 v0, 0x9

    goto :goto_0

    .line 1347
    :cond_8
    const/16 v0, 0xa

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 929
    :try_start_0
    invoke-static {p0}, La;->a(Ljava/lang/CharSequence;)I
    :try_end_0
    .catch Ldem; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 936
    :goto_0
    invoke-static {v0}, Lddo;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0

    .line 932
    :catch_0
    move-exception v0

    sget-object v0, Lddv;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 933
    array-length v0, v0

    goto :goto_0
.end method

.method public static c(II)I
    .locals 2

    .prologue
    .line 778
    invoke-static {p0}, Lddo;->b(I)I

    move-result v1

    .line 6890
    if-ltz p1, :cond_0

    .line 6891
    invoke-static {p1}, Lddo;->d(I)I

    move-result v0

    .line 778
    :goto_0
    add-int/2addr v0, v1

    return v0

    .line 6894
    :cond_0
    const/16 v0, 0xa

    goto :goto_0
.end method

.method public static c(IJ)I
    .locals 1

    .prologue
    .line 666
    invoke-static {p0}, Lddo;->b(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method private static d(I)I
    .locals 1

    .prologue
    .line 1316
    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 1320
    :goto_0
    return v0

    .line 1317
    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    .line 1318
    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    .line 1319
    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr v0, p0

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    .line 1320
    :cond_3
    const/4 v0, 0x5

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1101
    .line 7085
    iget v0, p0, Lddo;->b:I

    iget v1, p0, Lddo;->c:I

    sub-int/2addr v0, v1

    .line 1101
    if-eqz v0, :cond_0

    .line 1102
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1105
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 4

    .prologue
    .line 1148
    int-to-byte v0, p1

    .line 7138
    iget v1, p0, Lddo;->c:I

    iget v2, p0, Lddo;->b:I

    if-ne v1, v2, :cond_0

    .line 8060
    new-instance v0, Lcml;

    invoke-direct {v0}, Lcml;-><init>()V

    throw v0

    .line 7142
    :cond_0
    iget-object v1, p0, Lddo;->a:[B

    iget v2, p0, Lddo;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lddo;->c:I

    aput-byte v0, v1, v2

    .line 7143
    iget v0, p0, Lddo;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lddo;->d:I

    .line 1149
    return-void
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 317
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lddo;->d(II)V

    .line 5399
    if-ltz p2, :cond_0

    .line 5400
    invoke-virtual {p0, p2}, Lddo;->c(I)V

    :goto_0
    return-void

    .line 5403
    :cond_0
    int-to-long v0, p2

    invoke-virtual {p0, v0, v1}, Lddo;->a(J)V

    goto :goto_0
.end method

.method public final a(ILdea;)V
    .locals 1

    .prologue
    .line 247
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lddo;->d(II)V

    .line 4534
    invoke-interface {p2}, Ldea;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lddo;->c(I)V

    .line 4535
    invoke-interface {p2, p0}, Ldea;->a(Lddo;)V

    .line 249
    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 205
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lddo;->d(II)V

    .line 2426
    :try_start_0
    invoke-direct {p0, p2}, Lddo;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ldem; {:try_start_0 .. :try_end_0} :catch_0

    .line 2431
    :goto_0
    return-void

    .line 2427
    :catch_0
    move-exception v0

    .line 2428
    sget-object v1, Lddo;->e:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2440
    sget-object v0, Lddv;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 2441
    array-length v1, v0

    invoke-virtual {p0, v1}, Lddo;->c(I)V

    .line 3158
    array-length v1, v0

    .line 3219
    iget v2, p0, Lddo;->b:I

    iget v3, p0, Lddo;->c:I

    sub-int/2addr v2, v3

    if-lt v2, v1, :cond_0

    .line 3221
    iget-object v2, p0, Lddo;->a:[B

    iget v3, p0, Lddo;->c:I

    invoke-static {v0, v5, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3222
    iget v0, p0, Lddo;->c:I

    add-int/2addr v0, v1

    iput v0, p0, Lddo;->c:I

    .line 3246
    iget v0, p0, Lddo;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lddo;->d:I

    goto :goto_0

    .line 3227
    :cond_0
    iget v2, p0, Lddo;->b:I

    iget v3, p0, Lddo;->c:I

    sub-int/2addr v2, v3

    .line 3228
    iget-object v3, p0, Lddo;->a:[B

    iget v4, p0, Lddo;->c:I

    invoke-static {v0, v5, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3229
    add-int/lit8 v0, v2, 0x0

    .line 3230
    sub-int v0, v1, v2

    .line 3231
    iget v0, p0, Lddo;->b:I

    iput v0, p0, Lddo;->c:I

    .line 3232
    iget v0, p0, Lddo;->d:I

    add-int/2addr v0, v2

    iput v0, p0, Lddo;->d:I

    .line 4060
    new-instance v0, Lcml;

    invoke-direct {v0}, Lcml;-><init>()V

    throw v0
.end method

.method public final a(J)V
    .locals 5

    .prologue
    .line 1326
    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1327
    long-to-int v0, p1

    invoke-virtual {p0, v0}, Lddo;->a(I)V

    .line 1328
    return-void

    .line 1330
    :cond_0
    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lddo;->a(I)V

    .line 1331
    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public final c(I)V
    .locals 1

    .prologue
    .line 1300
    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    .line 1301
    invoke-virtual {p0, p1}, Lddo;->a(I)V

    .line 1302
    return-void

    .line 1304
    :cond_0
    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lddo;->a(I)V

    .line 1305
    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method

.method public final d(II)V
    .locals 1

    .prologue
    .line 1286
    invoke-static {p1, p2}, Lden;->a(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lddo;->c(I)V

    .line 1287
    return-void
.end method
