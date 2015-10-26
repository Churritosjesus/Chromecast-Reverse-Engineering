.class public final Lcjd;
.super Lcmm;


# instance fields
.field public a:[Lcjc;

.field public b:Lciz;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 0
    invoke-direct {p0}, Lcmm;-><init>()V

    .line 1000
    invoke-static {}, Lcjc;->b()[Lcjc;

    move-result-object v0

    iput-object v0, p0, Lcjd;->a:[Lcjc;

    iput-object v1, p0, Lcjd;->b:Lciz;

    const-string v0, ""

    iput-object v0, p0, Lcjd;->c:Ljava/lang/String;

    iput-object v1, p0, Lcjd;->m:Lcmo;

    const/4 v0, -0x1

    iput v0, p0, Lcjd;->n:I

    .line 0
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    invoke-super {p0}, Lcmm;->a()I

    move-result v1

    iget-object v0, p0, Lcjd;->a:[Lcjc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcjd;->a:[Lcjc;

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcjd;->a:[Lcjc;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcjd;->a:[Lcjc;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lcmk;->b(ILcms;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcjd;->b:Lciz;

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    iget-object v2, p0, Lcjd;->b:Lciz;

    invoke-static {v0, v2}, Lcmk;->b(ILcms;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_2
    iget-object v0, p0, Lcjd;->c:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x3

    iget-object v2, p0, Lcjd;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lcmk;->b(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_3
    return v1
.end method

.method public final synthetic a(Lcmj;)Lcms;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 0
    .line 2000
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcmj;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcjd;->a(Lcmj;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    const/16 v0, 0xa

    invoke-static {p1, v0}, Lcmu;->a(Lcmj;I)I

    move-result v2

    iget-object v0, p0, Lcjd;->a:[Lcjc;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcjc;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcjd;->a:[Lcjc;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcjc;

    invoke-direct {v3}, Lcjc;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcmj;->a(Lcms;)V

    invoke-virtual {p1}, Lcmj;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcjd;->a:[Lcjc;

    array-length v0, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcjc;

    invoke-direct {v3}, Lcjc;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    iput-object v2, p0, Lcjd;->a:[Lcjc;

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcjd;->b:Lciz;

    if-nez v0, :cond_4

    new-instance v0, Lciz;

    invoke-direct {v0}, Lciz;-><init>()V

    iput-object v0, p0, Lcjd;->b:Lciz;

    :cond_4
    iget-object v0, p0, Lcjd;->b:Lciz;

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcmj;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcjd;->c:Ljava/lang/String;

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method public final a(Lcmk;)V
    .locals 3

    iget-object v0, p0, Lcjd;->a:[Lcjc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcjd;->a:[Lcjc;

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcjd;->a:[Lcjc;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcjd;->a:[Lcjc;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Lcmk;->a(ILcms;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcjd;->b:Lciz;

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    iget-object v1, p0, Lcjd;->b:Lciz;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILcms;)V

    :cond_2
    iget-object v0, p0, Lcjd;->c:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x3

    iget-object v1, p0, Lcjd;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILjava/lang/String;)V

    :cond_3
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
    instance-of v1, p1, Lcjd;

    if-eqz v1, :cond_0

    check-cast p1, Lcjd;

    iget-object v1, p0, Lcjd;->a:[Lcjc;

    iget-object v2, p1, Lcjd;->a:[Lcjc;

    invoke-static {v1, v2}, Lcmq;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcjd;->b:Lciz;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcjd;->b:Lciz;

    if-nez v1, :cond_0

    :cond_2
    iget-object v1, p0, Lcjd;->c:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcjd;->c:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_3
    invoke-virtual {p0, p1}, Lcjd;->a(Lcmm;)Z

    move-result v0

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lcjd;->b:Lciz;

    iget-object v2, p1, Lcjd;->b:Lciz;

    invoke-virtual {v1, v2}, Lciz;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lcjd;->c:Ljava/lang/String;

    iget-object v2, p1, Lcjd;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcjd;->a:[Lcjc;

    invoke-static {v0}, Lcmq;->a([Ljava/lang/Object;)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcjd;->b:Lciz;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcjd;->c:Ljava/lang/String;

    if-nez v2, :cond_1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcjd;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcjd;->b:Lciz;

    invoke-virtual {v0}, Lciz;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcjd;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1
.end method
