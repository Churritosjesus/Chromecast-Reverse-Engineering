.class final Lcx;
.super Lco;
.source "PG"


# instance fields
.field private synthetic a:Lcu;


# direct methods
.method constructor <init>(Lcu;)V
    .locals 0

    .prologue
    .line 460
    iput-object p1, p0, Lcx;->a:Lcu;

    invoke-direct {p0}, Lco;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 469
    iget-object v0, p0, Lcx;->a:Lcu;

    invoke-static {v0}, Lcu;->a(Lcu;)Lcv;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcv;->a(ILjava/lang/Object;)V

    .line 470
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 494
    iget-object v0, p0, Lcx;->a:Lcu;

    invoke-static {v0}, Lcu;->a(Lcu;)Lcv;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1, p1}, Lcv;->a(ILjava/lang/Object;)V

    .line 495
    return-void
.end method

.method public final a(Lci;)V
    .locals 2

    .prologue
    .line 479
    iget-object v0, p0, Lcx;->a:Lcu;

    invoke-static {v0}, Lcu;->a(Lcu;)Lcv;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Lcv;->a(ILjava/lang/Object;)V

    .line 480
    return-void
.end method

.method public final a(Ldo;)V
    .locals 6

    .prologue
    .line 499
    const/4 v0, 0x0

    .line 500
    if-eqz p1, :cond_0

    .line 501
    new-instance v0, Ldb;

    iget v1, p1, Ldo;->a:I

    iget v2, p1, Ldo;->b:I

    iget v3, p1, Ldo;->c:I

    iget v4, p1, Ldo;->d:I

    iget v5, p1, Ldo;->e:I

    invoke-direct/range {v0 .. v5}, Ldb;-><init>(IIIII)V

    .line 504
    :cond_0
    iget-object v1, p0, Lcx;->a:Lcu;

    invoke-static {v1}, Lcu;->a(Lcu;)Lcv;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2, v0}, Lcv;->a(ILjava/lang/Object;)V

    .line 505
    return-void
.end method

.method public final a(Ldq;)V
    .locals 2

    .prologue
    .line 474
    iget-object v0, p0, Lcx;->a:Lcu;

    invoke-static {v0}, Lcu;->a(Lcu;)Lcv;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Lcv;->a(ILjava/lang/Object;)V

    .line 475
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 489
    iget-object v0, p0, Lcx;->a:Lcu;

    invoke-static {v0}, Lcu;->a(Lcu;)Lcv;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1, p1}, Lcv;->a(ILjava/lang/Object;)V

    .line 490
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 464
    iget-object v0, p0, Lcx;->a:Lcu;

    invoke-static {v0}, Lcu;->a(Lcu;)Lcv;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lcv;->a(ILjava/lang/Object;)V

    .line 465
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 2

    .prologue
    .line 484
    iget-object v0, p0, Lcx;->a:Lcu;

    invoke-static {v0}, Lcu;->a(Lcu;)Lcv;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p1}, Lcv;->a(ILjava/lang/Object;)V

    .line 485
    return-void
.end method
