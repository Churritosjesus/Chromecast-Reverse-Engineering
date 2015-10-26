.class public final Lclv;
.super Lcmm;


# instance fields
.field public a:J

.field public b:Lciz;

.field public c:Lcjd;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 0
    invoke-direct {p0}, Lcmm;-><init>()V

    .line 1000
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lclv;->a:J

    iput-object v2, p0, Lclv;->b:Lciz;

    iput-object v2, p0, Lclv;->c:Lcjd;

    iput-object v2, p0, Lclv;->m:Lcmo;

    const/4 v0, -0x1

    iput v0, p0, Lclv;->n:I

    .line 0
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    invoke-super {p0}, Lcmm;->a()I

    move-result v0

    const/4 v1, 0x1

    iget-wide v2, p0, Lclv;->a:J

    invoke-static {v1, v2, v3}, Lcmk;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lclv;->b:Lciz;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    iget-object v2, p0, Lclv;->b:Lciz;

    invoke-static {v1, v2}, Lcmk;->b(ILcms;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lclv;->c:Lcjd;

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    iget-object v2, p0, Lclv;->c:Lcjd;

    invoke-static {v1, v2}, Lcmk;->b(ILcms;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public final synthetic a(Lcmj;)Lcms;
    .locals 2

    .prologue
    .line 0
    .line 2000
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcmj;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lclv;->a(Lcmj;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    .line 3000
    :sswitch_1
    invoke-virtual {p1}, Lcmj;->f()J

    move-result-wide v0

    .line 2000
    iput-wide v0, p0, Lclv;->a:J

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lclv;->b:Lciz;

    if-nez v0, :cond_1

    new-instance v0, Lciz;

    invoke-direct {v0}, Lciz;-><init>()V

    iput-object v0, p0, Lclv;->b:Lciz;

    :cond_1
    iget-object v0, p0, Lclv;->b:Lciz;

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lclv;->c:Lcjd;

    if-nez v0, :cond_2

    new-instance v0, Lcjd;

    invoke-direct {v0}, Lcjd;-><init>()V

    iput-object v0, p0, Lclv;->c:Lcjd;

    :cond_2
    iget-object v0, p0, Lclv;->c:Lcjd;

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method public final a(Lcmk;)V
    .locals 4

    const/4 v0, 0x1

    iget-wide v2, p0, Lclv;->a:J

    invoke-virtual {p1, v0, v2, v3}, Lcmk;->a(IJ)V

    iget-object v0, p0, Lclv;->b:Lciz;

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iget-object v1, p0, Lclv;->b:Lciz;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILcms;)V

    :cond_0
    iget-object v0, p0, Lclv;->c:Lcjd;

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    iget-object v1, p0, Lclv;->c:Lcjd;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILcms;)V

    :cond_1
    invoke-super {p0, p1}, Lcmm;->a(Lcmk;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lclv;

    if-eqz v1, :cond_0

    check-cast p1, Lclv;

    iget-wide v2, p0, Lclv;->a:J

    iget-wide v4, p1, Lclv;->a:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    iget-object v1, p0, Lclv;->b:Lciz;

    if-nez v1, :cond_4

    iget-object v1, p1, Lclv;->b:Lciz;

    if-nez v1, :cond_0

    :cond_2
    iget-object v1, p0, Lclv;->c:Lcjd;

    if-nez v1, :cond_5

    iget-object v1, p1, Lclv;->c:Lcjd;

    if-nez v1, :cond_0

    :cond_3
    invoke-virtual {p0, p1}, Lclv;->a(Lcmm;)Z

    move-result v0

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lclv;->b:Lciz;

    iget-object v2, p1, Lclv;->b:Lciz;

    invoke-virtual {v1, v2}, Lciz;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lclv;->c:Lcjd;

    iget-object v2, p1, Lclv;->c:Lcjd;

    invoke-virtual {v1, v2}, Lcjd;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 6

    const/4 v1, 0x0

    iget-wide v2, p0, Lclv;->a:J

    iget-wide v4, p0, Lclv;->a:J

    const/16 v0, 0x20

    ushr-long/2addr v4, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lclv;->b:Lciz;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lclv;->c:Lcjd;

    if-nez v2, :cond_1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lclv;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lclv;->b:Lciz;

    invoke-virtual {v0}, Lciz;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lclv;->c:Lcjd;

    invoke-virtual {v1}, Lcjd;->hashCode()I

    move-result v1

    goto :goto_1
.end method
