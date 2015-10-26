.class public final Ldcs;
.super Lddq;
.source "PG"

# interfaces
.implements Ldec;


# static fields
.field private static volatile g:Lded;

.field private static final j:Ldcs;

.field private static volatile k:Ldee;

.field private static final serialVersionUID:J


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:J

.field private f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 525
    const/4 v0, 0x0

    sput-object v0, Ldcs;->g:Lded;

    .line 895
    new-instance v0, Ldcs;

    sget-object v1, Lddv;->c:Lddn;

    .line 899
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ldcs;-><init>(Lddn;Lddp;)V

    sput-object v0, Ldcs;->j:Ldcs;

    .line 900
    return-void
.end method

.method private constructor <init>(Lddn;Lddp;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 175
    invoke-direct {p0}, Lddq;-><init>()V

    .line 176
    const-string v0, ""

    iput-object v0, p0, Ldcs;->b:Ljava/lang/String;

    .line 177
    const-string v0, ""

    iput-object v0, p0, Ldcs;->c:Ljava/lang/String;

    .line 178
    const-string v0, ""

    iput-object v0, p0, Ldcs;->d:Ljava/lang/String;

    .line 179
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Ldcs;->e:J

    .line 180
    const-string v0, ""

    iput-object v0, p0, Ldcs;->f:Ljava/lang/String;

    .line 182
    invoke-static {}, Ldek;->b()Ldel;

    move-result-object v2

    .line 184
    const/4 v0, 0x0

    .line 185
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 186
    :try_start_0
    invoke-virtual {p1}, Lddn;->a()I

    move-result v3

    .line 187
    sparse-switch v3, :sswitch_data_0

    .line 1069
    invoke-virtual {v2, v3, p1}, Ldel;->a(ILddn;)Z

    move-result v3

    .line 192
    if-nez v3, :cond_0

    move v0, v1

    .line 194
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 190
    goto :goto_0

    .line 199
    :sswitch_1
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 200
    iget v4, p0, Ldcs;->a:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Ldcs;->a:I

    .line 201
    iput-object v3, p0, Ldcs;->b:Ljava/lang/String;
    :try_end_0
    .catch Lddx; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 229
    :catch_0
    move-exception v0

    .line 230
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 2029
    iput-object p0, v0, Lddx;->a:Ldea;

    .line 230
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ldel;->a()Ldek;

    move-result-object v1

    iput-object v1, p0, Ldcs;->h:Ldek;

    throw v0

    .line 205
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 206
    iget v4, p0, Ldcs;->a:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Ldcs;->a:I

    .line 207
    iput-object v3, p0, Ldcs;->c:Ljava/lang/String;
    :try_end_2
    .catch Lddx; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 231
    :catch_1
    move-exception v0

    .line 232
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lddx;

    .line 234
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lddx;-><init>(Ljava/lang/String;)V

    .line 3029
    iput-object p0, v3, Lddx;->a:Ldea;

    .line 234
    invoke-direct {v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 211
    :sswitch_3
    :try_start_4
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 212
    iget v4, p0, Ldcs;->a:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Ldcs;->a:I

    .line 213
    iput-object v3, p0, Ldcs;->d:Ljava/lang/String;

    goto :goto_0

    .line 217
    :sswitch_4
    iget v3, p0, Ldcs;->a:I

    or-int/lit8 v3, v3, 0x8

    iput v3, p0, Ldcs;->a:I

    .line 218
    invoke-virtual {p1}, Lddn;->b()J

    move-result-wide v4

    iput-wide v4, p0, Ldcs;->e:J

    goto :goto_0

    .line 222
    :sswitch_5
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 223
    iget v4, p0, Ldcs;->a:I

    or-int/lit8 v4, v4, 0x10

    iput v4, p0, Ldcs;->a:I

    .line 224
    iput-object v3, p0, Ldcs;->f:Ljava/lang/String;
    :try_end_4
    .catch Lddx; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 236
    :cond_1
    invoke-virtual {v2}, Ldel;->a()Ldek;

    move-result-object v0

    iput-object v0, p0, Ldcs;->h:Ldek;

    .line 237
    return-void

    .line 187
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
        0x2a -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic a(Ldcs;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 168
    .line 7266
    if-nez p1, :cond_0

    .line 7267
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 7269
    :cond_0
    iget v0, p0, Ldcs;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ldcs;->a:I

    .line 7270
    iput-object p1, p0, Ldcs;->b:Ljava/lang/String;

    .line 168
    return-void
.end method

.method public static b()Ldct;
    .locals 1

    .prologue
    .line 588
    sget-object v0, Ldcs;->j:Ldcs;

    invoke-virtual {v0}, Ldcs;->i()Lddr;

    move-result-object v0

    check-cast v0, Ldct;

    return-object v0
.end method

.method static synthetic b(Ldcs;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 168
    .line 7368
    if-nez p1, :cond_0

    .line 7369
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 7371
    :cond_0
    iget v0, p0, Ldcs;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ldcs;->a:I

    .line 7372
    iput-object p1, p0, Ldcs;->d:Ljava/lang/String;

    .line 168
    return-void
.end method

.method static synthetic c()Ldcs;
    .locals 1

    .prologue
    .line 168
    sget-object v0, Ldcs;->j:Ldcs;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    const/4 v4, 0x4

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 494
    iget v0, p0, Ldcs;->i:I

    .line 495
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 520
    :goto_0
    return v0

    .line 497
    :cond_0
    const/4 v0, 0x0

    .line 498
    iget v1, p0, Ldcs;->a:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 5252
    iget-object v0, p0, Ldcs;->b:Ljava/lang/String;

    .line 500
    invoke-static {v2, v0}, Lddo;->b(ILjava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 502
    :cond_1
    iget v1, p0, Ldcs;->a:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 5303
    iget-object v1, p0, Ldcs;->c:Ljava/lang/String;

    .line 504
    invoke-static {v3, v1}, Lddo;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 506
    :cond_2
    iget v1, p0, Ldcs;->a:I

    and-int/lit8 v1, v1, 0x4

    if-ne v1, v4, :cond_3

    .line 507
    const/4 v1, 0x3

    .line 5354
    iget-object v2, p0, Ldcs;->d:Ljava/lang/String;

    .line 508
    invoke-static {v1, v2}, Lddo;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 510
    :cond_3
    iget v1, p0, Ldcs;->a:I

    and-int/lit8 v1, v1, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_4

    .line 511
    iget-wide v2, p0, Ldcs;->e:J

    .line 512
    invoke-static {v4, v2, v3}, Lddo;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 514
    :cond_4
    iget v1, p0, Ldcs;->a:I

    and-int/lit8 v1, v1, 0x10

    const/16 v2, 0x10

    if-ne v1, v2, :cond_5

    .line 515
    const/4 v1, 0x5

    .line 5434
    iget-object v2, p0, Ldcs;->f:Ljava/lang/String;

    .line 516
    invoke-static {v1, v2}, Lddo;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 518
    :cond_5
    iget-object v1, p0, Ldcs;->h:Ldek;

    invoke-virtual {v1}, Ldek;->c()I

    move-result v1

    add-int/2addr v0, v1

    .line 519
    iput v0, p0, Ldcs;->i:I

    goto :goto_0
.end method

.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 826
    sget-object v2, Ldcn;->a:[I

    add-int/lit8 v3, p1, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 888
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 828
    :pswitch_0
    new-instance p0, Ldcs;

    check-cast p2, Lddn;

    check-cast p3, Lddp;

    invoke-direct {p0, p2, p3}, Ldcs;-><init>(Lddn;Lddp;)V

    .line 885
    :cond_0
    :goto_0
    return-object p0

    .line 832
    :pswitch_1
    new-instance p0, Ldcs;

    sget-object v0, Lddv;->c:Lddn;

    .line 835
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ldcs;-><init>(Lddn;Lddp;)V

    goto :goto_0

    .line 838
    :pswitch_2
    sget-object p0, Ldcs;->j:Ldcs;

    goto :goto_0

    .line 841
    :pswitch_3
    const/4 p0, 0x0

    goto :goto_0

    .line 844
    :pswitch_4
    new-instance p0, Ldct;

    .line 5597
    invoke-direct {p0}, Ldct;-><init>()V

    goto :goto_0

    .line 5903
    :pswitch_5
    sget-object v2, Ldcs;->j:Ldcs;

    .line 847
    if-eq p2, v2, :cond_0

    .line 848
    check-cast p2, Ldcs;

    .line 6246
    iget v2, p2, Ldcs;->a:I

    and-int/lit8 v2, v2, 0x1

    if-ne v2, v0, :cond_6

    move v2, v0

    .line 849
    :goto_1
    if-eqz v2, :cond_1

    .line 850
    iget v2, p0, Ldcs;->a:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Ldcs;->a:I

    .line 851
    iget-object v2, p2, Ldcs;->b:Ljava/lang/String;

    iput-object v2, p0, Ldcs;->b:Ljava/lang/String;

    .line 6297
    :cond_1
    iget v2, p2, Ldcs;->a:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_7

    move v2, v0

    .line 854
    :goto_2
    if-eqz v2, :cond_2

    .line 855
    iget v2, p0, Ldcs;->a:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Ldcs;->a:I

    .line 856
    iget-object v2, p2, Ldcs;->c:Ljava/lang/String;

    iput-object v2, p0, Ldcs;->c:Ljava/lang/String;

    .line 6348
    :cond_2
    iget v2, p2, Ldcs;->a:I

    and-int/lit8 v2, v2, 0x4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_8

    move v2, v0

    .line 859
    :goto_3
    if-eqz v2, :cond_3

    .line 860
    iget v2, p0, Ldcs;->a:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Ldcs;->a:I

    .line 861
    iget-object v2, p2, Ldcs;->d:Ljava/lang/String;

    iput-object v2, p0, Ldcs;->d:Ljava/lang/String;

    .line 6399
    :cond_3
    iget v2, p2, Ldcs;->a:I

    and-int/lit8 v2, v2, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_9

    move v2, v0

    .line 864
    :goto_4
    if-eqz v2, :cond_4

    .line 6405
    iget-wide v2, p2, Ldcs;->e:J

    .line 6411
    iget v4, p0, Ldcs;->a:I

    or-int/lit8 v4, v4, 0x8

    iput v4, p0, Ldcs;->a:I

    .line 6412
    iput-wide v2, p0, Ldcs;->e:J

    .line 6428
    :cond_4
    iget v2, p2, Ldcs;->a:I

    and-int/lit8 v2, v2, 0x10

    const/16 v3, 0x10

    if-ne v2, v3, :cond_a

    .line 867
    :goto_5
    if-eqz v0, :cond_5

    .line 868
    iget v0, p0, Ldcs;->a:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Ldcs;->a:I

    .line 869
    iget-object v0, p2, Ldcs;->f:Ljava/lang/String;

    iput-object v0, p0, Ldcs;->f:Ljava/lang/String;

    .line 872
    :cond_5
    iget-object v0, p2, Ldcs;->h:Ldek;

    invoke-virtual {p0, v0}, Ldcs;->a(Ldek;)V

    goto/16 :goto_0

    :cond_6
    move v2, v1

    .line 6246
    goto :goto_1

    :cond_7
    move v2, v1

    .line 6297
    goto :goto_2

    :cond_8
    move v2, v1

    .line 6348
    goto :goto_3

    :cond_9
    move v2, v1

    .line 6399
    goto :goto_4

    :cond_a
    move v0, v1

    .line 6428
    goto :goto_5

    .line 876
    :pswitch_6
    sget-object p0, Ldcs;->j:Ldcs;

    goto/16 :goto_0

    .line 879
    :pswitch_7
    sget-object v0, Ldcs;->k:Ldee;

    if-nez v0, :cond_c

    const-class v1, Ldcs;

    monitor-enter v1

    .line 880
    :try_start_0
    sget-object v0, Ldcs;->k:Ldee;

    if-nez v0, :cond_b

    .line 881
    new-instance v0, Ldds;

    sget-object v2, Ldcs;->j:Ldcs;

    invoke-direct {v0, v2}, Ldds;-><init>(Lddq;)V

    sput-object v0, Ldcs;->k:Ldee;

    .line 883
    :cond_b
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 885
    :cond_c
    sget-object p0, Ldcs;->k:Ldee;

    goto/16 :goto_0

    .line 883
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 826
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public final a(Lddo;)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 475
    iget v0, p0, Ldcs;->a:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 3252
    iget-object v0, p0, Ldcs;->b:Ljava/lang/String;

    .line 476
    invoke-virtual {p1, v1, v0}, Lddo;->a(ILjava/lang/String;)V

    .line 478
    :cond_0
    iget v0, p0, Ldcs;->a:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 3303
    iget-object v0, p0, Ldcs;->c:Ljava/lang/String;

    .line 479
    invoke-virtual {p1, v2, v0}, Lddo;->a(ILjava/lang/String;)V

    .line 481
    :cond_1
    iget v0, p0, Ldcs;->a:I

    and-int/lit8 v0, v0, 0x4

    if-ne v0, v3, :cond_2

    .line 482
    const/4 v0, 0x3

    .line 3354
    iget-object v1, p0, Ldcs;->d:Ljava/lang/String;

    .line 482
    invoke-virtual {p1, v0, v1}, Lddo;->a(ILjava/lang/String;)V

    .line 484
    :cond_2
    iget v0, p0, Ldcs;->a:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 485
    iget-wide v0, p0, Ldcs;->e:J

    .line 4170
    const/4 v2, 0x0

    invoke-virtual {p1, v3, v2}, Lddo;->d(II)V

    .line 4394
    invoke-virtual {p1, v0, v1}, Lddo;->a(J)V

    .line 487
    :cond_3
    iget v0, p0, Ldcs;->a:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 488
    const/4 v0, 0x5

    .line 4434
    iget-object v1, p0, Ldcs;->f:Ljava/lang/String;

    .line 488
    invoke-virtual {p1, v0, v1}, Lddo;->a(ILjava/lang/String;)V

    .line 490
    :cond_4
    iget-object v0, p0, Ldcs;->h:Ldek;

    invoke-virtual {v0, p1}, Ldek;->a(Lddo;)V

    .line 491
    return-void
.end method
