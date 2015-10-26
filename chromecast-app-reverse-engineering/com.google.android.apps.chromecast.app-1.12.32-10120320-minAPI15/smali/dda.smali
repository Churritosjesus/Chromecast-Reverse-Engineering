.class public final Ldda;
.super Lder;
.source "PG"


# static fields
.field private static volatile e:[Ldda;


# instance fields
.field public a:Ljava/lang/Long;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Ljava/lang/String;

.field private f:Lddb;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 780
    invoke-direct {p0}, Lder;-><init>()V

    .line 781
    iput-object v1, p0, Ldda;->a:Ljava/lang/Long;

    .line 782
    iput-object v1, p0, Ldda;->b:Ljava/lang/String;

    .line 783
    const/high16 v0, -0x80000000

    iput v0, p0, Ldda;->c:I

    .line 784
    iput-object v1, p0, Ldda;->f:Lddb;

    .line 785
    iput-object v1, p0, Ldda;->d:Ljava/lang/String;

    .line 786
    iput-object v1, p0, Ldda;->i:Ldes;

    .line 787
    const/4 v0, -0x1

    iput v0, p0, Ldda;->t:I

    .line 788
    return-void
.end method

.method public static b()[Ldda;
    .locals 2

    .prologue
    .line 754
    sget-object v0, Ldda;->e:[Ldda;

    if-nez v0, :cond_1

    .line 755
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 757
    :try_start_0
    sget-object v0, Ldda;->e:[Ldda;

    if-nez v0, :cond_0

    .line 758
    const/4 v0, 0x0

    new-array v0, v0, [Ldda;

    sput-object v0, Ldda;->e:[Ldda;

    .line 760
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 762
    :cond_1
    sget-object v0, Ldda;->e:[Ldda;

    return-object v0

    .line 760
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final a()I
    .locals 3

    .prologue
    .line 813
    invoke-super {p0}, Lder;->a()I

    move-result v0

    .line 814
    iget-object v1, p0, Ldda;->a:Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 815
    iget-object v1, p0, Ldda;->a:Ljava/lang/Long;

    .line 816
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1602
    const/4 v1, 0x1

    invoke-static {v1}, Ldep;->b(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x8

    .line 816
    add-int/2addr v0, v1

    .line 818
    :cond_0
    iget-object v1, p0, Ldda;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 819
    const/4 v1, 0x2

    iget-object v2, p0, Ldda;->b:Ljava/lang/String;

    .line 820
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 822
    :cond_1
    iget v1, p0, Ldda;->c:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_2

    .line 823
    const/4 v1, 0x3

    iget v2, p0, Ldda;->c:I

    .line 824
    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 826
    :cond_2
    iget-object v1, p0, Ldda;->f:Lddb;

    if-eqz v1, :cond_3

    .line 827
    const/4 v1, 0x4

    iget-object v2, p0, Ldda;->f:Lddb;

    .line 828
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 830
    :cond_3
    iget-object v1, p0, Ldda;->d:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 831
    const/4 v1, 0x5

    iget-object v2, p0, Ldda;->d:Ljava/lang/String;

    .line 832
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 834
    :cond_4
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 2

    .prologue
    .line 645
    .line 1842
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1843
    sparse-switch v0, :sswitch_data_0

    .line 1847
    invoke-super {p0, p1, v0}, Lder;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1848
    :sswitch_0
    return-object p0

    .line 2174
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->g()J

    move-result-wide v0

    .line 1853
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldda;->a:Ljava/lang/Long;

    goto :goto_0

    .line 1857
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldda;->b:Ljava/lang/String;

    goto :goto_0

    .line 3169
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1862
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1867
    :pswitch_0
    iput v0, p0, Ldda;->c:I

    goto :goto_0

    .line 1873
    :sswitch_4
    iget-object v0, p0, Ldda;->f:Lddb;

    if-nez v0, :cond_1

    .line 1874
    new-instance v0, Lddb;

    invoke-direct {v0}, Lddb;-><init>()V

    iput-object v0, p0, Ldda;->f:Lddb;

    .line 1876
    :cond_1
    iget-object v0, p0, Ldda;->f:Lddb;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1880
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldda;->d:Ljava/lang/String;

    goto :goto_0

    .line 1843
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x9 -> :sswitch_1
        0x12 -> :sswitch_2
        0x18 -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
    .end sparse-switch

    .line 1862
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 793
    iget-object v0, p0, Ldda;->a:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 794
    iget-object v0, p0, Ldda;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 1130
    invoke-virtual {p1, v2, v2}, Ldep;->c(II)V

    .line 1282
    invoke-virtual {p1, v0, v1}, Ldep;->a(J)V

    .line 796
    :cond_0
    iget-object v0, p0, Ldda;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 797
    const/4 v0, 0x2

    iget-object v1, p0, Ldda;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 799
    :cond_1
    iget v0, p0, Ldda;->c:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    .line 800
    const/4 v0, 0x3

    iget v1, p0, Ldda;->c:I

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 802
    :cond_2
    iget-object v0, p0, Ldda;->f:Lddb;

    if-eqz v0, :cond_3

    .line 803
    const/4 v0, 0x4

    iget-object v1, p0, Ldda;->f:Lddb;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 805
    :cond_3
    iget-object v0, p0, Ldda;->d:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 806
    const/4 v0, 0x5

    iget-object v1, p0, Ldda;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 808
    :cond_4
    invoke-super {p0, p1}, Lder;->a(Ldep;)V

    .line 809
    return-void
.end method
