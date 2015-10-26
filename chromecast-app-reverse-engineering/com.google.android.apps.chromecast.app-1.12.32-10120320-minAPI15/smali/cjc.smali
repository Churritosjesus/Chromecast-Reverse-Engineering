.class public final Lcjc;
.super Lcmm;


# static fields
.field private static volatile c:[Lcjc;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcix;

.field private d:Lcje;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 0
    invoke-direct {p0}, Lcmm;-><init>()V

    .line 1000
    const-string v0, ""

    iput-object v0, p0, Lcjc;->a:Ljava/lang/String;

    iput-object v1, p0, Lcjc;->d:Lcje;

    iput-object v1, p0, Lcjc;->b:Lcix;

    iput-object v1, p0, Lcjc;->m:Lcmo;

    const/4 v0, -0x1

    iput v0, p0, Lcjc;->n:I

    .line 0
    return-void
.end method

.method public static b()[Lcjc;
    .locals 2

    sget-object v0, Lcjc;->c:[Lcjc;

    if-nez v0, :cond_1

    sget-object v1, Lcmq;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcjc;->c:[Lcjc;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lcjc;

    sput-object v0, Lcjc;->c:[Lcjc;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcjc;->c:[Lcjc;

    return-object v0

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

    invoke-super {p0}, Lcmm;->a()I

    move-result v0

    iget-object v1, p0, Lcjc;->a:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iget-object v2, p0, Lcjc;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lcmk;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcjc;->d:Lcje;

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    iget-object v2, p0, Lcjc;->d:Lcje;

    invoke-static {v1, v2}, Lcmk;->b(ILcms;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcjc;->b:Lcix;

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    iget-object v2, p0, Lcjc;->b:Lcix;

    invoke-static {v1, v2}, Lcmk;->b(ILcms;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public final synthetic a(Lcmj;)Lcms;
    .locals 1

    .prologue
    .line 0
    .line 2000
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcmj;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcjc;->a(Lcmj;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcmj;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcjc;->a:Ljava/lang/String;

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcjc;->d:Lcje;

    if-nez v0, :cond_1

    new-instance v0, Lcje;

    invoke-direct {v0}, Lcje;-><init>()V

    iput-object v0, p0, Lcjc;->d:Lcje;

    :cond_1
    iget-object v0, p0, Lcjc;->d:Lcje;

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lcjc;->b:Lcix;

    if-nez v0, :cond_2

    new-instance v0, Lcix;

    invoke-direct {v0}, Lcix;-><init>()V

    iput-object v0, p0, Lcjc;->b:Lcix;

    :cond_2
    iget-object v0, p0, Lcjc;->b:Lcix;

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method public final a(Lcmk;)V
    .locals 2

    iget-object v0, p0, Lcjc;->a:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p0, Lcjc;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcjc;->d:Lcje;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p0, Lcjc;->d:Lcje;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILcms;)V

    :cond_1
    iget-object v0, p0, Lcjc;->b:Lcix;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p0, Lcjc;->b:Lcix;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILcms;)V

    :cond_2
    invoke-super {p0, p1}, Lcmm;->a(Lcmk;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lcjc;

    if-eqz v1, :cond_0

    check-cast p1, Lcjc;

    iget-object v1, p0, Lcjc;->a:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcjc;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_2
    iget-object v1, p0, Lcjc;->d:Lcje;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcjc;->d:Lcje;

    if-nez v1, :cond_0

    :cond_3
    iget-object v1, p0, Lcjc;->b:Lcix;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcjc;->b:Lcix;

    if-nez v1, :cond_0

    :cond_4
    invoke-virtual {p0, p1}, Lcjc;->a(Lcmm;)Z

    move-result v0

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lcjc;->a:Ljava/lang/String;

    iget-object v2, p1, Lcjc;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_6
    iget-object v1, p0, Lcjc;->d:Lcje;

    iget-object v2, p1, Lcjc;->d:Lcje;

    invoke-virtual {v1, v2}, Lcje;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_7
    iget-object v1, p0, Lcjc;->b:Lcix;

    iget-object v2, p1, Lcjc;->b:Lcix;

    invoke-virtual {v1, v2}, Lcix;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcjc;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcjc;->d:Lcje;

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcjc;->b:Lcix;

    if-nez v2, :cond_2

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcjc;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcjc;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcjc;->d:Lcje;

    invoke-virtual {v0}, Lcje;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcjc;->b:Lcix;

    invoke-virtual {v1}, Lcix;->hashCode()I

    move-result v1

    goto :goto_2
.end method
