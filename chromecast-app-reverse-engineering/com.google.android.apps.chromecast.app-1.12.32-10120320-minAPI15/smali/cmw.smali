.class public final Lcmw;
.super Lcmm;


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 0
    invoke-direct {p0}, Lcmm;-><init>()V

    .line 1000
    const/4 v0, 0x0

    iput v0, p0, Lcmw;->a:I

    const-string v0, ""

    iput-object v0, p0, Lcmw;->b:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcmw;->c:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcmw;->m:Lcmo;

    const/4 v0, -0x1

    iput v0, p0, Lcmw;->n:I

    .line 0
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 3

    invoke-super {p0}, Lcmm;->a()I

    move-result v0

    iget v1, p0, Lcmw;->a:I

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget v2, p0, Lcmw;->a:I

    invoke-static {v1, v2}, Lcmk;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcmw;->b:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    iget-object v2, p0, Lcmw;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lcmk;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcmw;->c:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x3

    iget-object v2, p0, Lcmw;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lcmk;->b(ILjava/lang/String;)I

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

    invoke-virtual {p0, p1, v0}, Lcmw;->a(Lcmj;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    .line 3000
    :sswitch_1
    invoke-virtual {p1}, Lcmj;->e()I

    move-result v0

    .line 2000
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iput v0, p0, Lcmw;->a:I

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcmj;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcmw;->b:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcmj;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcmw;->c:Ljava/lang/String;

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lcmk;)V
    .locals 2

    iget v0, p0, Lcmw;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget v1, p0, Lcmw;->a:I

    invoke-virtual {p1, v0, v1}, Lcmk;->a(II)V

    :cond_0
    iget-object v0, p0, Lcmw;->b:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p0, Lcmw;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILjava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcmw;->c:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p0, Lcmw;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILjava/lang/String;)V

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
    instance-of v1, p1, Lcmw;

    if-eqz v1, :cond_0

    check-cast p1, Lcmw;

    iget v1, p0, Lcmw;->a:I

    iget v2, p1, Lcmw;->a:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcmw;->b:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcmw;->b:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_2
    iget-object v1, p0, Lcmw;->c:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcmw;->c:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_3
    invoke-virtual {p0, p1}, Lcmw;->a(Lcmm;)Z

    move-result v0

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lcmw;->b:Ljava/lang/String;

    iget-object v2, p1, Lcmw;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lcmw;->c:Ljava/lang/String;

    iget-object v2, p1, Lcmw;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v1, 0x0

    iget v0, p0, Lcmw;->a:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcmw;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcmw;->c:Ljava/lang/String;

    if-nez v2, :cond_1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcmw;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcmw;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcmw;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1
.end method
