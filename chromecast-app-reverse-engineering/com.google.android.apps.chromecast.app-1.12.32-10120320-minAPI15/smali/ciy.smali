.class public final Lciy;
.super Lcmm;


# static fields
.field private static volatile c:[Lciy;


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 0
    invoke-direct {p0}, Lcmm;-><init>()V

    .line 1000
    iput v0, p0, Lciy;->a:I

    iput v0, p0, Lciy;->b:I

    const/4 v0, 0x0

    iput-object v0, p0, Lciy;->m:Lcmo;

    const/4 v0, -0x1

    iput v0, p0, Lciy;->n:I

    .line 0
    return-void
.end method

.method public static b()[Lciy;
    .locals 2

    sget-object v0, Lciy;->c:[Lciy;

    if-nez v0, :cond_1

    sget-object v1, Lcmq;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lciy;->c:[Lciy;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lciy;

    sput-object v0, Lciy;->c:[Lciy;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lciy;->c:[Lciy;

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

    const/4 v1, 0x1

    iget v2, p0, Lciy;->a:I

    invoke-static {v1, v2}, Lcmk;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lciy;->b:I

    invoke-static {v1, v2}, Lcmk;->b(II)I

    move-result v1

    add-int/2addr v0, v1

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

    invoke-virtual {p0, p1, v0}, Lciy;->a(Lcmj;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    .line 3000
    :sswitch_1
    invoke-virtual {p1}, Lcmj;->e()I

    move-result v0

    .line 2000
    iput v0, p0, Lciy;->a:I

    goto :goto_0

    .line 4000
    :sswitch_2
    invoke-virtual {p1}, Lcmj;->e()I

    move-result v0

    .line 2000
    iput v0, p0, Lciy;->b:I

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method public final a(Lcmk;)V
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lciy;->a:I

    invoke-virtual {p1, v0, v1}, Lcmk;->a(II)V

    const/4 v0, 0x2

    iget v1, p0, Lciy;->b:I

    invoke-virtual {p1, v0, v1}, Lcmk;->a(II)V

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
    instance-of v1, p1, Lciy;

    if-eqz v1, :cond_0

    check-cast p1, Lciy;

    iget v1, p0, Lciy;->a:I

    iget v2, p1, Lciy;->a:I

    if-ne v1, v2, :cond_0

    iget v1, p0, Lciy;->b:I

    iget v2, p1, Lciy;->b:I

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, p1}, Lciy;->a(Lcmm;)Z

    move-result v0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lciy;->a:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lciy;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lciy;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
