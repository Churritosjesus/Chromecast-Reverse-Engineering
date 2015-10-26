.class public final Ldcw;
.super Lddq;
.source "PG"

# interfaces
.implements Ldec;


# static fields
.field private static volatile f:Lded;

.field private static final g:Ldcw;

.field private static volatile j:Ldee;

.field private static final serialVersionUID:J


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 3315
    const/4 v0, 0x0

    sput-object v0, Ldcw;->f:Lded;

    .line 3634
    new-instance v0, Ldcw;

    sget-object v1, Lddv;->c:Lddn;

    .line 3638
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ldcw;-><init>(Lddn;Lddp;)V

    sput-object v0, Ldcw;->g:Ldcw;

    .line 3639
    return-void
.end method

.method private constructor <init>(Lddn;Lddp;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 3020
    invoke-direct {p0}, Lddq;-><init>()V

    .line 3021
    const-string v0, ""

    iput-object v0, p0, Ldcw;->a:Ljava/lang/String;

    .line 3022
    const-string v0, ""

    iput-object v0, p0, Ldcw;->b:Ljava/lang/String;

    .line 3023
    const-string v0, ""

    iput-object v0, p0, Ldcw;->d:Ljava/lang/String;

    .line 3024
    const/4 v0, 0x2

    iput v0, p0, Ldcw;->e:I

    .line 3026
    invoke-static {}, Ldek;->b()Ldel;

    move-result-object v2

    .line 3028
    const/4 v0, 0x0

    .line 3029
    :cond_0
    :goto_0
    if-nez v0, :cond_2

    .line 3030
    :try_start_0
    invoke-virtual {p1}, Lddn;->a()I

    move-result v3

    .line 3031
    sparse-switch v3, :sswitch_data_0

    .line 4069
    invoke-virtual {v2, v3, p1}, Ldel;->a(ILddn;)Z

    move-result v3

    .line 3036
    if-nez v3, :cond_0

    move v0, v1

    .line 3038
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 3034
    goto :goto_0

    .line 3043
    :sswitch_1
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 3044
    iget v4, p0, Ldcw;->c:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Ldcw;->c:I

    .line 3045
    iput-object v3, p0, Ldcw;->a:Ljava/lang/String;
    :try_end_0
    .catch Lddx; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 3073
    :catch_0
    move-exception v0

    .line 3074
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 5029
    iput-object p0, v0, Lddx;->a:Ldea;

    .line 3074
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3080
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ldel;->a()Ldek;

    move-result-object v1

    iput-object v1, p0, Ldcw;->h:Ldek;

    throw v0

    .line 3049
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 3050
    iget v4, p0, Ldcw;->c:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Ldcw;->c:I

    .line 3051
    iput-object v3, p0, Ldcw;->b:Ljava/lang/String;
    :try_end_2
    .catch Lddx; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 3075
    :catch_1
    move-exception v0

    .line 3076
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lddx;

    .line 3078
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lddx;-><init>(Ljava/lang/String;)V

    .line 6029
    iput-object p0, v3, Lddx;->a:Ldea;

    .line 3078
    invoke-direct {v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 3055
    :sswitch_3
    :try_start_4
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 3056
    iget v4, p0, Ldcw;->c:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Ldcw;->c:I

    .line 3057
    iput-object v3, p0, Ldcw;->d:Ljava/lang/String;

    goto :goto_0

    .line 4636
    :sswitch_4
    invoke-virtual {p1}, Lddn;->d()I

    move-result v3

    .line 3062
    invoke-static {v3}, Ldco;->a(I)Ldco;

    move-result-object v4

    .line 3063
    if-nez v4, :cond_1

    .line 3064
    const/4 v4, 0x4

    invoke-virtual {v2, v4, v3}, Ldel;->a(II)Ldel;

    goto :goto_0

    .line 3066
    :cond_1
    iget v4, p0, Ldcw;->c:I

    or-int/lit8 v4, v4, 0x8

    iput v4, p0, Ldcw;->c:I

    .line 3067
    iput v3, p0, Ldcw;->e:I
    :try_end_4
    .catch Lddx; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 3080
    :cond_2
    invoke-virtual {v2}, Ldel;->a()Ldek;

    move-result-object v0

    iput-object v0, p0, Ldcw;->h:Ldek;

    .line 3081
    return-void

    .line 3031
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
    .end sparse-switch
.end method

.method public static c()Ldcw;
    .locals 1

    .prologue
    .line 3642
    sget-object v0, Ldcw;->g:Ldcw;

    return-object v0
.end method

.method static synthetic d()Ldcw;
    .locals 1

    .prologue
    .line 3013
    sget-object v0, Ldcw;->g:Ldcw;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    const/4 v4, 0x4

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 3288
    iget v0, p0, Ldcw;->i:I

    .line 3289
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 3310
    :goto_0
    return v0

    .line 3291
    :cond_0
    const/4 v0, 0x0

    .line 3292
    iget v1, p0, Ldcw;->c:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 7096
    iget-object v0, p0, Ldcw;->a:Ljava/lang/String;

    .line 3294
    invoke-static {v2, v0}, Lddo;->b(ILjava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 3296
    :cond_1
    iget v1, p0, Ldcw;->c:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 7147
    iget-object v1, p0, Ldcw;->b:Ljava/lang/String;

    .line 3298
    invoke-static {v3, v1}, Lddo;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 3300
    :cond_2
    iget v1, p0, Ldcw;->c:I

    and-int/lit8 v1, v1, 0x4

    if-ne v1, v4, :cond_3

    .line 3301
    const/4 v1, 0x3

    .line 7198
    iget-object v2, p0, Ldcw;->d:Ljava/lang/String;

    .line 3302
    invoke-static {v1, v2}, Lddo;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 3304
    :cond_3
    iget v1, p0, Ldcw;->c:I

    and-int/lit8 v1, v1, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_4

    .line 3305
    iget v1, p0, Ldcw;->e:I

    .line 3306
    invoke-static {v4, v1}, Lddo;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 3308
    :cond_4
    iget-object v1, p0, Ldcw;->h:Ldek;

    invoke-virtual {v1}, Ldek;->c()I

    move-result v1

    add-int/2addr v0, v1

    .line 3309
    iput v0, p0, Ldcw;->i:I

    goto :goto_0
.end method

.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 3570
    sget-object v2, Ldcn;->a:[I

    add-int/lit8 v3, p1, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 3627
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 3572
    :pswitch_0
    new-instance p0, Ldcw;

    check-cast p2, Lddn;

    check-cast p3, Lddp;

    invoke-direct {p0, p2, p3}, Ldcw;-><init>(Lddn;Lddp;)V

    .line 3624
    :cond_0
    :goto_0
    return-object p0

    .line 3576
    :pswitch_1
    new-instance p0, Ldcw;

    sget-object v0, Lddv;->c:Lddn;

    .line 3579
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ldcw;-><init>(Lddn;Lddp;)V

    goto :goto_0

    .line 3582
    :pswitch_2
    sget-object p0, Ldcw;->g:Ldcw;

    goto :goto_0

    .line 3585
    :pswitch_3
    const/4 p0, 0x0

    goto :goto_0

    .line 3588
    :pswitch_4
    new-instance p0, Ldcx;

    .line 7387
    invoke-direct {p0}, Ldcx;-><init>()V

    goto :goto_0

    .line 7642
    :pswitch_5
    sget-object v2, Ldcw;->g:Ldcw;

    .line 3591
    if-eq p2, v2, :cond_0

    .line 3592
    check-cast p2, Ldcw;

    .line 8090
    iget v2, p2, Ldcw;->c:I

    and-int/lit8 v2, v2, 0x1

    if-ne v2, v0, :cond_4

    move v2, v0

    .line 3593
    :goto_1
    if-eqz v2, :cond_1

    .line 3594
    iget v2, p0, Ldcw;->c:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Ldcw;->c:I

    .line 3595
    iget-object v2, p2, Ldcw;->a:Ljava/lang/String;

    iput-object v2, p0, Ldcw;->a:Ljava/lang/String;

    .line 8141
    :cond_1
    iget v2, p2, Ldcw;->c:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    move v2, v0

    .line 3598
    :goto_2
    if-eqz v2, :cond_2

    .line 3599
    iget v2, p0, Ldcw;->c:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Ldcw;->c:I

    .line 3600
    iget-object v2, p2, Ldcw;->b:Ljava/lang/String;

    iput-object v2, p0, Ldcw;->b:Ljava/lang/String;

    .line 8192
    :cond_2
    iget v2, p2, Ldcw;->c:I

    and-int/lit8 v2, v2, 0x4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_6

    move v2, v0

    .line 3603
    :goto_3
    if-eqz v2, :cond_3

    .line 3604
    iget v2, p0, Ldcw;->c:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Ldcw;->c:I

    .line 3605
    iget-object v2, p2, Ldcw;->d:Ljava/lang/String;

    iput-object v2, p0, Ldcw;->d:Ljava/lang/String;

    .line 8243
    :cond_3
    iget v2, p2, Ldcw;->c:I

    and-int/lit8 v2, v2, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_7

    .line 3608
    :goto_4
    if-eqz v0, :cond_9

    .line 3609
    invoke-virtual {p2}, Ldcw;->b()Ldco;

    move-result-object v0

    .line 8256
    if-nez v0, :cond_8

    .line 8257
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_4
    move v2, v1

    .line 8090
    goto :goto_1

    :cond_5
    move v2, v1

    .line 8141
    goto :goto_2

    :cond_6
    move v2, v1

    .line 8192
    goto :goto_3

    :cond_7
    move v0, v1

    .line 8243
    goto :goto_4

    .line 8259
    :cond_8
    iget v1, p0, Ldcw;->c:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Ldcw;->c:I

    .line 9061
    iget v0, v0, Ldco;->d:I

    .line 8260
    iput v0, p0, Ldcw;->e:I

    .line 3611
    :cond_9
    iget-object v0, p2, Ldcw;->h:Ldek;

    invoke-virtual {p0, v0}, Ldcw;->a(Ldek;)V

    goto/16 :goto_0

    .line 3615
    :pswitch_6
    sget-object p0, Ldcw;->g:Ldcw;

    goto/16 :goto_0

    .line 3618
    :pswitch_7
    sget-object v0, Ldcw;->j:Ldee;

    if-nez v0, :cond_b

    const-class v1, Ldcw;

    monitor-enter v1

    .line 3619
    :try_start_0
    sget-object v0, Ldcw;->j:Ldee;

    if-nez v0, :cond_a

    .line 3620
    new-instance v0, Ldds;

    sget-object v2, Ldcw;->g:Ldcw;

    invoke-direct {v0, v2}, Ldds;-><init>(Lddq;)V

    sput-object v0, Ldcw;->j:Ldee;

    .line 3622
    :cond_a
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3624
    :cond_b
    sget-object p0, Ldcw;->j:Ldee;

    goto/16 :goto_0

    .line 3622
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 3570
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

    .line 3272
    iget v0, p0, Ldcw;->c:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 6096
    iget-object v0, p0, Ldcw;->a:Ljava/lang/String;

    .line 3273
    invoke-virtual {p1, v1, v0}, Lddo;->a(ILjava/lang/String;)V

    .line 3275
    :cond_0
    iget v0, p0, Ldcw;->c:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 6147
    iget-object v0, p0, Ldcw;->b:Ljava/lang/String;

    .line 3276
    invoke-virtual {p1, v2, v0}, Lddo;->a(ILjava/lang/String;)V

    .line 3278
    :cond_1
    iget v0, p0, Ldcw;->c:I

    and-int/lit8 v0, v0, 0x4

    if-ne v0, v3, :cond_2

    .line 3279
    const/4 v0, 0x3

    .line 6198
    iget-object v1, p0, Ldcw;->d:Ljava/lang/String;

    .line 3279
    invoke-virtual {p1, v0, v1}, Lddo;->a(ILjava/lang/String;)V

    .line 3281
    :cond_2
    iget v0, p0, Ldcw;->c:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 3282
    iget v0, p0, Ldcw;->e:I

    invoke-virtual {p1, v3, v0}, Lddo;->a(II)V

    .line 3284
    :cond_3
    iget-object v0, p0, Ldcw;->h:Ldek;

    invoke-virtual {v0, p1}, Ldek;->a(Lddo;)V

    .line 3285
    return-void
.end method

.method public final b()Ldco;
    .locals 1

    .prologue
    .line 3249
    iget v0, p0, Ldcw;->e:I

    invoke-static {v0}, Ldco;->a(I)Ldco;

    move-result-object v0

    .line 3250
    if-nez v0, :cond_0

    sget-object v0, Ldco;->b:Ldco;

    :cond_0
    return-object v0
.end method
