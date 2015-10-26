.class public final Ldcq;
.super Lddq;
.source "PG"

# interfaces
.implements Ldec;


# static fields
.field private static volatile d:Lded;

.field private static final e:Ldcq;

.field private static volatile f:Ldee;

.field private static final serialVersionUID:J


# instance fields
.field public a:Ljava/lang/String;

.field private b:I

.field private c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 2701
    const/4 v0, 0x0

    sput-object v0, Ldcq;->d:Lded;

    .line 2937
    new-instance v0, Ldcq;

    sget-object v1, Lddv;->c:Lddn;

    .line 2941
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ldcq;-><init>(Lddn;Lddp;)V

    sput-object v0, Ldcq;->e:Ldcq;

    .line 2942
    return-void
.end method

.method private constructor <init>(Lddn;Lddp;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 2523
    invoke-direct {p0}, Lddq;-><init>()V

    .line 2524
    const-string v0, ""

    iput-object v0, p0, Ldcq;->a:Ljava/lang/String;

    .line 2525
    const-string v0, ""

    iput-object v0, p0, Ldcq;->c:Ljava/lang/String;

    .line 2527
    invoke-static {}, Ldek;->b()Ldel;

    move-result-object v2

    .line 2529
    const/4 v0, 0x0

    .line 2530
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 2531
    :try_start_0
    invoke-virtual {p1}, Lddn;->a()I

    move-result v3

    .line 2532
    sparse-switch v3, :sswitch_data_0

    .line 3069
    invoke-virtual {v2, v3, p1}, Ldel;->a(ILddn;)Z

    move-result v3

    .line 2537
    if-nez v3, :cond_0

    move v0, v1

    .line 2539
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 2535
    goto :goto_0

    .line 2544
    :sswitch_1
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 2545
    iget v4, p0, Ldcq;->b:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Ldcq;->b:I

    .line 2546
    iput-object v3, p0, Ldcq;->a:Ljava/lang/String;
    :try_end_0
    .catch Lddx; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 2557
    :catch_0
    move-exception v0

    .line 2558
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 4029
    iput-object p0, v0, Lddx;->a:Ldea;

    .line 2558
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2564
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ldel;->a()Ldek;

    move-result-object v1

    iput-object v1, p0, Ldcq;->h:Ldek;

    throw v0

    .line 2550
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 2551
    iget v4, p0, Ldcq;->b:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Ldcq;->b:I

    .line 2552
    iput-object v3, p0, Ldcq;->c:Ljava/lang/String;
    :try_end_2
    .catch Lddx; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 2559
    :catch_1
    move-exception v0

    .line 2560
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lddx;

    .line 2562
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lddx;-><init>(Ljava/lang/String;)V

    .line 5029
    iput-object p0, v3, Lddx;->a:Ldea;

    .line 2562
    invoke-direct {v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2564
    :cond_1
    invoke-virtual {v2}, Ldel;->a()Ldek;

    move-result-object v0

    iput-object v0, p0, Ldcq;->h:Ldek;

    .line 2565
    return-void

    .line 2532
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method public static b()Ldcq;
    .locals 1

    .prologue
    .line 2945
    sget-object v0, Ldcq;->e:Ldcq;

    return-object v0
.end method

.method static synthetic c()Ldcq;
    .locals 1

    .prologue
    .line 2516
    sget-object v0, Ldcq;->e:Ldcq;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 2682
    iget v0, p0, Ldcq;->i:I

    .line 2683
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2696
    :goto_0
    return v0

    .line 2685
    :cond_0
    const/4 v0, 0x0

    .line 2686
    iget v1, p0, Ldcq;->b:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 6580
    iget-object v0, p0, Ldcq;->a:Ljava/lang/String;

    .line 2688
    invoke-static {v2, v0}, Lddo;->b(ILjava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 2690
    :cond_1
    iget v1, p0, Ldcq;->b:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 6631
    iget-object v1, p0, Ldcq;->c:Ljava/lang/String;

    .line 2692
    invoke-static {v3, v1}, Lddo;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 2694
    :cond_2
    iget-object v1, p0, Ldcq;->h:Ldek;

    invoke-virtual {v1}, Ldek;->c()I

    move-result v1

    add-int/2addr v0, v1

    .line 2695
    iput v0, p0, Ldcq;->i:I

    goto :goto_0
.end method

.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 2881
    sget-object v2, Ldcn;->a:[I

    add-int/lit8 v3, p1, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 2930
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 2883
    :pswitch_0
    new-instance p0, Ldcq;

    check-cast p2, Lddn;

    check-cast p3, Lddp;

    invoke-direct {p0, p2, p3}, Ldcq;-><init>(Lddn;Lddp;)V

    .line 2927
    :cond_0
    :goto_0
    return-object p0

    .line 2887
    :pswitch_1
    new-instance p0, Ldcq;

    sget-object v0, Lddv;->c:Lddn;

    .line 2890
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ldcq;-><init>(Lddn;Lddp;)V

    goto :goto_0

    .line 2893
    :pswitch_2
    sget-object p0, Ldcq;->e:Ldcq;

    goto :goto_0

    .line 2896
    :pswitch_3
    const/4 p0, 0x0

    goto :goto_0

    .line 2899
    :pswitch_4
    new-instance p0, Ldcr;

    .line 6773
    invoke-direct {p0}, Ldcr;-><init>()V

    goto :goto_0

    .line 6945
    :pswitch_5
    sget-object v2, Ldcq;->e:Ldcq;

    .line 2902
    if-eq p2, v2, :cond_0

    .line 2903
    check-cast p2, Ldcq;

    .line 7574
    iget v2, p2, Ldcq;->b:I

    and-int/lit8 v2, v2, 0x1

    if-ne v2, v0, :cond_3

    move v2, v0

    .line 2904
    :goto_1
    if-eqz v2, :cond_1

    .line 2905
    iget v2, p0, Ldcq;->b:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Ldcq;->b:I

    .line 2906
    iget-object v2, p2, Ldcq;->a:Ljava/lang/String;

    iput-object v2, p0, Ldcq;->a:Ljava/lang/String;

    .line 7625
    :cond_1
    iget v2, p2, Ldcq;->b:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_4

    .line 2909
    :goto_2
    if-eqz v0, :cond_2

    .line 2910
    iget v0, p0, Ldcq;->b:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ldcq;->b:I

    .line 2911
    iget-object v0, p2, Ldcq;->c:Ljava/lang/String;

    iput-object v0, p0, Ldcq;->c:Ljava/lang/String;

    .line 2914
    :cond_2
    iget-object v0, p2, Ldcq;->h:Ldek;

    invoke-virtual {p0, v0}, Ldcq;->a(Ldek;)V

    goto :goto_0

    :cond_3
    move v2, v1

    .line 7574
    goto :goto_1

    :cond_4
    move v0, v1

    .line 7625
    goto :goto_2

    .line 2918
    :pswitch_6
    sget-object p0, Ldcq;->e:Ldcq;

    goto :goto_0

    .line 2921
    :pswitch_7
    sget-object v0, Ldcq;->f:Ldee;

    if-nez v0, :cond_6

    const-class v1, Ldcq;

    monitor-enter v1

    .line 2922
    :try_start_0
    sget-object v0, Ldcq;->f:Ldee;

    if-nez v0, :cond_5

    .line 2923
    new-instance v0, Ldds;

    sget-object v2, Ldcq;->e:Ldcq;

    invoke-direct {v0, v2}, Ldds;-><init>(Lddq;)V

    sput-object v0, Ldcq;->f:Ldee;

    .line 2925
    :cond_5
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2927
    :cond_6
    sget-object p0, Ldcq;->f:Ldee;

    goto :goto_0

    .line 2925
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 2881
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
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 2672
    iget v0, p0, Ldcq;->b:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 5580
    iget-object v0, p0, Ldcq;->a:Ljava/lang/String;

    .line 2673
    invoke-virtual {p1, v1, v0}, Lddo;->a(ILjava/lang/String;)V

    .line 2675
    :cond_0
    iget v0, p0, Ldcq;->b:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 5631
    iget-object v0, p0, Ldcq;->c:Ljava/lang/String;

    .line 2676
    invoke-virtual {p1, v2, v0}, Lddo;->a(ILjava/lang/String;)V

    .line 2678
    :cond_1
    iget-object v0, p0, Ldcq;->h:Ldek;

    invoke-virtual {v0, p1}, Ldek;->a(Lddo;)V

    .line 2679
    return-void
.end method
